/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import java.util.Set;

import javax.annotation.Resource;

import org.dbflute.hook.CallbackContext;
import org.dbflute.utflute.core.binding.BoundResult;
import org.dbflute.utflute.lastadi.ContainerTestCase;
import org.dbflute.util.DfCollectionUtil;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;
import tech.law.hanreidb.unit.plugin.TestPlugin;
import tech.law.hanreidb.unit.plugin.TestPluginAgent;

/**
 * RemoteApiのUnitTestのスーパークラス。
 * @author awane
 */
public abstract class NxRemoteApiTestCase extends ContainerTestCase {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // このクラスの特徴ざっくり:
    // o TransactionStage@requiresNew() が自動的に required() に (まるごとTransactionのために)
    // o MySQL の Integer.MIN_VALUE のデフォルト設定を無効に (まるごとTransactionのために)
    // o その他、Jobのテストに最適化 (mockRuntime()がある、逆にMockRequestは存在しない、など)
    // _/_/_/_/_/_/_/_/_/_/

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private RequestManager requestManager;

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
    //                                                                               Mock
    //                                                                              ======
    protected String derivedResopnsePath(Class<?> responseClass) {
        return derivedResopnsePath(responseClass, "", ".json");
    }

    protected String derivedResopnsePath(Class<?> responseClass, String pathPart) {
        return derivedResopnsePath(responseClass, "_", pathPart);
    }

    protected String derivedResopnsePath(Class<?> responseClass, String separator, String pathPart) {
        return responseClass.getName().replace(".", "/") + separator + pathPart;
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    public RequestManager getRequestManager() {
        return requestManager;
    }

    @Override
    public BoundResult inject(Object bean) {
        return super.inject(bean);
    }
}
