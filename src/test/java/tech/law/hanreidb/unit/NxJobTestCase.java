/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.dbflute.bhv.core.BehaviorCommandHook;
import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.hook.CallbackContext;
import org.dbflute.utflute.lastadi.ContainerTestCase;
import org.dbflute.util.DfCollectionUtil;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.jta.stage.BegunTx;
import org.lastaflute.db.jta.stage.BegunTxContext;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.mock.MockJobRuntime;
import org.lastaflute.job.subsidiary.InitialCronOpCall;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.ResponseResultBuilder;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.NxResponseStatus;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;
import tech.law.hanreidb.app.base.web.version.SystemApplicationVersion;
import tech.law.hanreidb.unit.plugin.TestPlugin;
import tech.law.hanreidb.unit.plugin.TestPluginAgent;

/**
 * JobのUnitTestのスーパークラス。
 *
 * <p>【重要】このクラスを継承した場合は、Job の中での TransactionStage の requiresNew() が、
 * 自動的に required() として変換され、テストケースの Transaction を引き継ぐようになる。
 * つまり "まるごとTransaction" になるので、テストデータの調整などをしたり、Jobの中で Commit したりしても、すべて Rollback される。
 *
 * <p>そうすると本来は、MySQL の Integer.MIN_VALUE のDBアクセス制限に引っかかってしまってテストができないのだが、
 * さらに 自動的に Integer.MIN_VALUE を無効化している。
 * よくわかってない人は <a href="http://dbflute.seasar.org/ja/manual/reference/dbway/mysql/index.html#cursorselect">カーソル検索でのメモリ対策 | DBFlute</a>
 * をしっかり読むこと。</p>
 *
 * <p>ちなみに、しばらくWebの方を継承してテストを書いていたが、やはりちょっと調整などがしづらいので専用のを作ることに。
 * unext-common は LastaJob を必須としていないので躊躇していたというのもあり。
 * だがすでに他にcompileOnlyたくさんあるので、テストだし混乱することも少ないだろうからもういいかと。</p>
 *
 * <p>WebのTestCaseと実装はとてもよく似ている。AssertJやTestPluginのための実装がほぼコピーされている。
 * UTFluteのスーパークラスが二股に分かれているので仕方がない。たいしたコード量じゃないからまあいいだろうと。</p>
 * @author jflute
 */
public abstract class NxJobTestCase extends ContainerTestCase {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // このクラスの特徴ざっくり:
    // o TransactionStage@requiresNew() が自動的に required() に (まるごとTransactionのために)
    // o MySQL の Integer.MIN_VALUE のデフォルト設定を無効に (まるごとTransactionのために)
    // o その他、Jobのテストに最適化 (mockRuntime()がある、逆にMockRequestは存在しない、など)
    // _/_/_/_/_/_/_/_/_/_/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TimeManager timeManager;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 使い方は、XxxAssertJ をご覧あれー */
    protected NxSoftly softly; // AssertJ object developer uses directly

    // 何かの緊急時のために念のため protected で公開しておく
    protected final TestPluginAgent testPluginAgent = new TestPluginAgent();
    protected Set<TestPlugin> testPluginSet;

    // ===================================================================================
    //                                                                    setUp / tearDown
    //                                                                    ================
    @Override
    public void setUp() throws Exception {
        super.setUp();
        softly = new NxSoftly();
        setUpTestPlugin(); // インスタンス準備という感じの全体setUp (名前変えたいけどもう無理)
        testPluginAgent.setUpBatchly(testPluginSet); // 個々のTestPluginのsetUp

        // Jobの場合は頻繁に requiresNew() を使うため by jflute (2017/05/28)
        // Webでもそうしちゃってもいいかなというのはあるが、既存コードで仕方なくコミットしているものがあるかもなので、
        // いったんはバッチだけ。(あんまり暗黙過ぎて意識しないと混乱しやすいので、頻繁に使うJobならではかなとも思う)
        if (!isSuppressAutomaticChangingToRequired()) {
            changeRequiresNewToRequired(); // まるごとTransactionにする (テストケースのTransactionを引き継ぐ)

            // まるごとTransactionだと、selectCursor()がInteger.MIN_VALUEのDBアクセス制限に引っかかってしまうため by jflute (2017/05/28)
            arrangeSuppressingMinValueFetch(); // MySQLのInteger.MIN_VALUEフェッチをやめる
        }
    }

    @Override
    protected void postTest() {
        softly.assertAll();
        super.postTest();
    }

    @Override
    public void tearDown() throws Exception {
        CallbackContext.clearBehaviorCommandHookOnThread();
        testPluginAgent.tearDownBatchly(testPluginSet);
        super.tearDown();
    }

    // ===================================================================================
    //                                                                             Plug-in
    //                                                                             =======
    protected void setUpTestPlugin() { // サブクラスでオーバーライドされて、その中で addUpTestPlugin() される想定
        testPluginSet = DfCollectionUtil.newLinkedHashSet(); // 初期化順序などを登録順に
    }

    protected <TP extends TestPlugin> void addUpTestPlugin(TP testPlugin) {
        testPluginSet.add(testPlugin);
    }

    @SuppressWarnings("unchecked")
    protected <TP extends TestPlugin> TP findTestPlugin(Class<TP> testPluginClass) {
        return (TP) testPluginAgent.findTestPlugin(testPluginSet, testPluginClass);
    }

    // ===================================================================================
    //                                                                Changing to Required
    //                                                                ====================
    protected boolean isSuppressAutomaticChangingToRequired() {
        return false;
    }

    protected void arrangeSuppressingMinValueFetch() {
        CallbackContext.setBehaviorCommandHookOnThread(new BehaviorCommandHook() {
            @Override
            public void hookBefore(BehaviorCommandMeta meta) {
                if (meta.isConditionBean() && meta.isSelectCursor()) {
                    suppressMinValueFetch(meta.getConditionBean()); // まるごとTransactionでテストするため
                }
            }

            public void hookFinally(BehaviorCommandMeta meta, RuntimeException cause) {
            }
        });
    }

    protected void suppressMinValueFetch(ConditionBean cb) { // MySQLのInteger.MIN_VALUEフェッチを抑制
        if (cb == null) {
            throw new IllegalArgumentException("The argument 'cb' should not be null.");
        }
        cb.configure(conf -> conf.fetchSize(99999)); // MySQLだと、MIN_VALUE以外何を入れても一括フェッチになるのでダミー値
    }

    // ===================================================================================
    //                                                                     LastaJob Helper
    //                                                                     ===============
    /**
     * Prepare mock of job runtime.
     * @param job The execution job on the runtime. (NotNull)
     * @return The mock instance of job runtime for the job. (NotNull)
     */
    protected MockJobRuntime mockRuntime(LaJob job) {
        if (job == null) {
            throw new IllegalArgumentException("The argument 'job' should not be null.");
        }
        return MockJobRuntime.of(job.getClass());
    }

    /**
     * Prepare mock of job runtime.
     * @param job The execution job on the runtime. (NotNull)
     * @param opLambda The callback for option of initial cron. (NotNull)
     * @return The mock instance of job runtime for the job. (NotNull)
     */
    protected MockJobRuntime mockRuntime(LaJob job, InitialCronOpCall opLambda) {
        if (job == null) {
            throw new IllegalArgumentException("The argument 'job' should not be null.");
        }
        if (opLambda == null) {
            throw new IllegalArgumentException("The argument 'opLambda' should not be null.");
        }
        return MockJobRuntime.of(job.getClass(), opLambda);
    }

    // ===================================================================================
    //                                                                         Show Helper
    //                                                                         ===========
    protected void showEndTitleRoll(MockJobRuntime runtime) { // developer can use
        if (runtime == null) {
            throw new IllegalArgumentException("The argument 'runtime' should not be null.");
        }
        Map<String, Object> rollMap = runtime.getEndTitleRollMap();
        StringBuilder sb = new StringBuilder();
        sb.append(ln()).append("[EndTitleRoll]");
        rollMap.forEach((key, value) -> {
            sb.append(ln()).append(" ").append(key).append(" = ").append(value);
        });
        log(sb.toString());
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                               Success
    //                                               -------
    /**
     * 計画通りの成功であることをアサート。<br>
     * 計画件数が0ではなく、処理件数や成功件数が計画件数と同じであることをチェック。
     * <pre>
     * // ## Assert ##
     * showEndTitleRoll(runtime); // end-title-rollの中身を目視するため
     * assertPlannedSuccess(runtime); // 計画通りの成功であることをアサート
     * </pre>
     * @param runtime MockのJobの実行オブジェクト (NotNull)
     */
    protected void assertPlannedSuccess(MockJobRuntime runtime) { // developer can use
        if (runtime == null) {
            throw new IllegalArgumentException("The argument 'runtime' should not be null.");
        }
        Map<String, Object> rollMap = runtime.getEndTitleRollMap();
        JobRecorder recorder = (JobRecorder) rollMap.get("recorder");
        if (recorder == null) {
            throw new IllegalStateException("Not found the recorder in the end-title-roll map: " + rollMap.keySet());
        }
        recorder.getPlannedCount().alwaysPresent(plannedCount -> {
            softly.then(plannedCount).as("計画件数は0ではない").isNotZero();
            softly.then(recorder.getProcessedCount()).as("処理件数は計画件数と同じ").isEqualTo(plannedCount);
            softly.then(recorder.getSuccessCount()).as("成功件数は計画件数と同じ").isEqualTo(plannedCount);
        });
        softly.then(recorder.getErrors()).as("エラーはない").isEmpty();
    }

    // -----------------------------------------------------
    //                                           Transaction
    //                                           -----------
    /**
     * いま現在、Transaction が requiresNew() で開始されていることをアサート。<br>
     * デフォルトでは、そもそも requiresNew() が requires() に変換されているので、<br>
     * restoreChangingRequiresNewToRequired()を組み合わせて使うこと。
     * <pre>
     * // ## Arrange ##
     * restoreChangingRequiresNewToRequired(); // requiresNew()を復活させて...
     * SmallDbJob job = new SmallDbJob() {
     *     protected void updateSakuhin(Sakuhin sakuhin, String detarame) { // Transaction確認のため、そして、何も処理しない
     *         assertTranasctionRequiresNew(); // ここはrequiresNew()の中だよね
     *         markHere("updateSakuhin");
     *     }
     * }
     * inject(job);
     * MockJobRuntime runtime = mockRuntime(job);
     *
     * // ## Act ##
     * job.run(runtime);
     *
     * // ## Assert ##
     * assertMarked("updateSakuhin");
     * </pre>
     */
    protected void assertTranasctionRequiresNew() { // developer can use
        BegunTx<?> tx = BegunTxContext.getBegunTxOnThread();
        assertNotNull(tx);
        assertTrue(tx.isRequiresNew());
        assertFalse(tx.isRollbackOnly());
    }

    // ===================================================================================
    //                                                                  Remote API Support
    //                                                                  ==================
    protected <CONTENT extends ContentResult> WholeResult<CONTENT> toRemoteWholeSuccess(CONTENT content) {
        final ApplicationVersion appVersion = SystemApplicationVersion.UNKNOWN;
        final NxResponseStatus status = NxResponseStatus.SUCCESS;
        final ResponseResultBuilder builder = createResponseResultBuilder();
        final MetaResultPart resultPart = builder.createResultPart(appVersion, status, null, null);
        return builder.createWholeResult(resultPart, content);
    }

    protected ResponseResultBuilder createResponseResultBuilder() {
        return new ResponseResultBuilder(timeManager);
    }
}
