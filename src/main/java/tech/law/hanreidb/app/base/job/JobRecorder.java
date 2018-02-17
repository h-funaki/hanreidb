/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.job;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.dbflute.optional.OptionalThing;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.core.exception.system.NxSystemException;
import tech.law.hanreidb.app.base.util.MyAssertUtil;

/**
 * Jobのバッチ処理(複数件の一括処理)を記録していくオブジェクト。<br>
 * エラー続行型のバッチにおける、成功件数やエラー情報などを記録してEndTitleRollに出力することを想定。<br>
 * 最初に登録しておいて、途中で落ちても途中までの情報が EndTitleRoll で表示されるようにする。
 * <pre>
 * public void run(LaJobRuntime runtime) {
 *     NxBatchRecorder recorder = new NxBatchRecorder();
 *     runtime.showEndTitleRoll(data -&gt; {
 *         data.register("recorder", recorder); // 名前はなんでもいいけど、だいたい recorder を慣習に
 *     }
 *     recorder.planBatch(sakuhinBhv.selectCount(cb -&gt; arrangeJobTargetCB(cb)));
 *     sakuhinBhv.selectCursor(cb -&gt; {
 *         ...
 *         arrangeJobTargetCB(cb);
 *         ...
 *     }, sakuhin -&gt; {
 *         recorder.asProcessed(); // 処理したってマークだよん
 *         try {
 *             processSakuhin(sakuhin); // ここで、BusinessSkip例外とか予期せぬ例外があがるかも
 *             recorder.asSuccess(); // 成功したってマークだよん
 *         } catch (JobBusinessSkipException continued) { // 単なる制御用の例外なので特に情報を引き継いだりしない
 *             recorder.asBusinessSkip(continued.getMessage()); // ログ出力も含む
 *         } catch (RuntimeException e) {
 *             recorder.asError("sakuhinPublicCode=" + sakuhin.getSakuhinPublicCode(), e); // ログ出力や同じ例外チェックも含む
 *         }
 *     }
 * }
 * private void arrangeJobTargetCB(SakuhinCB cb) { // plan件数検索と実データ検索で同じ条件にするために
 *     ...
 * }
 * </pre>
 * @author awane
 * @author jflute
 */
public class JobRecorder {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** 個別エラーのためのロガー */
    private static final Logger errorsLogger = LoggerFactory.getLogger("batch.recording.errors");

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 計画された処理対象件数。(NullAllowed: before planning) */
    protected Integer plannedCount; // should be set only once

    /** 実際に処理されている件数。 */
    protected final Counter processedCounter = new Counter();

    /** 処理された中での正常件数。 */
    protected final Counter successCounter = new Counter();

    /** 処理は継続したけど業務的にスキップしたリスト。 */
    protected final List<BatchBusinessSkipPart> businessSkips = new ArrayList<>();

    /** 処理は継続したけど記録されたエラーのリスト。 */
    protected final List<BatchErrorPart> errors = new ArrayList<>();

    /** 最近連続で続いているエラーのリスト。正常処理が来たらクリアされる。内部チェックのために利用。 */
    protected final LinkedList<BatchErrorPart> recentlyContinuingErrorList = new LinkedList<>(); // よく削除されるので

    /**
     * @author awnae
     */
    public static class BatchBusinessSkipPart { // titleしかないが将来のためにPartに by awane (2017/05/10)

        protected final String skipTitle; // not null

        /**
         * @param skipTitle スキップタイトル (NotNull)
         */
        public BatchBusinessSkipPart(String skipTitle) {
            MyAssertUtil.assertNotNull("skipTitle", skipTitle);
            this.skipTitle = skipTitle;
        }

        /**
         * スキップタイトルを戻す。
         * @return スキップタイトル (NotNull)
         */
        public String getSkipTitle() {
            return skipTitle;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(skipTitle);
            return sb.toString();
        }
    }

    /**
     * @author jflute
     */
    public static class BatchErrorPart {

        protected final String errorTitle; // not null
        protected final Throwable cause; // null allowed

        /**
         * @param errorTitle エラータイトル (NotNull)
         * @param cause 原因 (NullAllowed)
         */
        public BatchErrorPart(String errorTitle, Throwable cause) {
            MyAssertUtil.assertNotNull("errorTitle", errorTitle);
            this.errorTitle = errorTitle;
            this.cause = cause;
        }

        /**
         * エラータイトルを戻す。
         * @return エラータイトル (NotNull)
         */
        public String getErrorTitle() {
            return errorTitle;
        }

        /**
         * 原因の例外を戻す。
         * @return 原因の例外のOptional (NotNull, EmptyAllowed)
         */
        public OptionalThing<Throwable> getCause() {
            return OptionalThing.ofNullable(cause, () -> {
                throw new IllegalStateException("Not found the cause for the error message: " + errorTitle);
            });
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(errorTitle);
            if (cause != null) {
                sb.append(" :: ");
                final String message = cause.getMessage();
                if (message != null && message.contains("\n")) {
                    sb.append("\n");
                }
                sb.append(message);
            }
            return sb.toString();
        }
    }

    // ===================================================================================
    //                                                                           Recording
    //                                                                           =========
    // e.g. 使い方のイメージこんなん:
    //  @Override
    //  public void run(LaJobRuntime runtime) {
    //      NxBatchRecorder recorder = new NxBatchRecorder();
    //      runtime.showEndTitleRoll(data -> {
    //          data.register("recorder", recorder);
    //      });
    //      recorder.planBatch(sakuhinBhv.selectCount(cb -> arrangeJobTargetCB(cb)));
    //
    //      sakuhinBhv.selectCursor(cb -> {
    //          cb.specify().columnSakuhinPublicCode();
    //          arrangeJobTargetCB(cb);
    //          cb.addOrderBy_PK_Asc();
    //      }, sakuhin -> {
    //          recorder.asProcessed();
    //          try {
    //              boolean result = processSakuhin(sakuhin);
    //              if (result) {
    //                  recorder.asBusinessSkip("job excluded record. sakuhinPublicCode=" + sakuhin.getSakuhinPublicCode());
    //                  return;
    //              }
    //          } catch (RuntimeException e) {
    //              recorder.asError("sakuhinPublicCode=" + sakuhin.getSakuhinPublicCode(), e);
    //              return;
    //          }
    //          recorder.asSuccess();
    //      });
    //  }
    // -----------------------------------------------------
    //                                                 Plan
    //                                                ------
    /**
     * 想定されるバッチ処理件数を登録する。<br>
     * 途中で落ちたときに、何件くらい処理するつもりだったのか、残り何件だったのか、を知るために。<br>
     * ちなみに、スーパー厳密には実際の処理件数と同じになるとは限らないが、制御で使うわけじゃないので誤差は許容。
     * @param plannedCount 想定されるバッチ処理件数。
     */
    public void planBatch(int plannedCount) {
        if (plannedCount < 0) {
            throw new IllegalArgumentException("The argument 'plannedCount' should not be minus: " + plannedCount);
        }
        if (this.plannedCount != null) {
            throw new IllegalStateException("Already planned: existing=" + this.plannedCount + ", your=" + plannedCount);
        }
        this.plannedCount = plannedCount;
    }

    // -----------------------------------------------------
    //                                             Processed
    //                                             ---------
    /**
     * 一件処理がされたことを記録する。<br>
     * 処理が中断されても、処理自体はされたと考える。つまり、処理が始まったらすぐに呼ぶ想定。
     */
    public void asProcessed() {
        processedCounter.increment();
    }

    // -----------------------------------------------------
    //                                               Success
    //                                               -------
    /**
     * 一件処理の成功を記録する。
     */
    public void asSuccess() {
        successCounter.increment();
        recentlyContinuingErrorList.clear();
    }

    /**
     * 複数件の成功を記録する。一件ずつ asSuccess() しづらいときなどに使う。
     * @param successCount 成功件数
     */
    public void asSuccess(int successCount) {
        successCounter.add(successCount);
        recentlyContinuingErrorList.clear();
    }

    // -----------------------------------------------------
    //                                         Business Skip
    //                                         -------------
    /**
     * 一件処理の業務的スキップを設定する。<br>
     * 主に、検索から実行までの間のすれ違いによって処理対象じゃなくなった場合などに使う。
     *
     * <p>例えば、selectCursor()した瞬間は検索対象だったが、その直後に画面などの別プロセスがデータを更新して、
     * 実際の更新処理を行うときには処理対象ではないということもあり得る。そのときにこのメソッドで記録する。
     * 特別なことがなければ、呼び出し側で自分でログ出力する必要はない。</p>
     *
     * <p>別にエラーリカバリが必要な状況ではないので(業務的には正常であるので)、単なる通知として扱う。
     * もし、エラーリカバリが必要だとすれば、それはそもそも asBusinessSkip() ではなく asError() である。</p>
     * @param skipTitle 業務的スキップのタイトル、デバッグできる情報も入れてね。(NotNull, NotEmpty)
     */
    public void asBusinessSkip(String skipTitle) {
        if (skipTitle == null || skipTitle.isEmpty()) {
            throw new IllegalArgumentException("The argument 'skipTitle' should not be null or empty: " + skipTitle);
        }
        final BatchBusinessSkipPart businessSkipPart = createBatchBusinessSkip(skipTitle);
        businessSkips.add(businessSkipPart);
    }

    protected BatchBusinessSkipPart createBatchBusinessSkip(String skipTitle) {
        return new BatchBusinessSkipPart(skipTitle);
    }

    // -----------------------------------------------------
    //                                   (Continuable) Error
    //                                   -------------------
    /**
     * 処理を継続できる一件処理のエラーを設定する。(きっかけとなる例外なしのケース)
     * @param errorTitle エラーのタイトル、デバッグできる情報も入れてね。(NotNull, NotEmpty)
     */
    public void asError(String errorTitle) {
        if (errorTitle == null || errorTitle.isEmpty()) {
            throw new IllegalArgumentException("The argument 'errorTitle' should not be null or empty: " + errorTitle);
        }
        final BatchErrorPart error = createBatchError(errorTitle, null);
        errors.add(error);
        saveRecentlyContinuingError(error);
    }

    /**
     * 処理を継続できる一件処理のエラーを設定する。(きっかけとなる例外があるケース) <br>
     * ログ出力に関する処理もこの中でされるので、呼び出し側で logger.error() などする必要はない。<br>
     * また、同じ例外が連続で続いた場合(回数はコードを参照)、続行不可能ということでシステム例外が発生する。
     * @param errorTitle エラーのタイトル、デバッグできる情報も入れてね。(NotNull, NotEmpty)
     * @param cause 原因となる例外 (NotNull)
     * @throws JobSameErrorContinueException 同じ例外が連続で続いたとき(回数はコードを参照)
     */
    public void asError(String errorTitle, Throwable cause) {
        if (errorTitle == null || errorTitle.isEmpty()) {
            throw new IllegalArgumentException("The argument 'errorTitle' should not be null or empty: " + errorTitle);
        }
        if (cause == null) {
            throw new IllegalArgumentException("The argument 'cause' should not be null.");
        }
        logErrorDetail(errorTitle, cause);
        checkSameExceptionContinue(cause);
        final BatchErrorPart error = createBatchError(errorTitle, cause);
        errors.add(error);
        saveRecentlyContinuingError(error);
    }

    protected void logErrorDetail(String errorTitle, Throwable cause) {
        // そうそう、一件ずつのエラーの詳細はどこかに残しておかないとね。
        // まあでも、通常のエラーログに出まくるとつらいから、専用のログファイルに出そう。
        // でもって、将来ERRORでメール飛ぶようになると飛びすぎるし、ここは通知よりも記録なので、続行エラーということでWARN。
        // ちなみに、通知的なERRORログは別途 hookFinally() にて処理される想定なので、ここで気にする必要はない。
        // これ最後、"エラー通知のログ" と "個別エラーのログ" をマッピングできるようにハッシュを埋め込んでおく。
        errorsLogger.warn("#{} {}", generateMappingHash(this), errorTitle, cause);
    }

    /**
     * エラーログ同士のマッピングをするためのハッシュを生成する。<br>
     * メインのエラーログと継続エラーのログを分ける想定なので、そこのマッピングのために。
     * @param recorder レコーダー自身のインスタンス、staticだから引数でもらってる (NotNull)
     * @return 生成されたハッシュ文字列 (NotNull)
     */
    public static String generateMappingHash(JobRecorder recorder) { // AllJobSchedulerでも使えるように
        return Integer.toHexString(recorder.hashCode());
    }

    protected BatchErrorPart createBatchError(String errorTitle, Throwable cause) {
        return new BatchErrorPart(errorTitle, cause);
    }

    // ===================================================================================
    //                                                                 Same Error Continue
    //                                                                 ===================
    protected void checkSameExceptionContinue(Throwable currentCause) {
        final int sameErrorLimit = getSameErrorLimit();
        if (recentlyContinuingErrorList.isEmpty() || recentlyContinuingErrorList.size() < sameErrorLimit) {
            return;
        }
        // recentlyContinuingErrorList が制限数以上なのでチェックする
        boolean same = false;
        for (BatchErrorPart error : recentlyContinuingErrorList) {
            final OptionalThing<Throwable> optPreviousCause = error.getCause();
            if (optPreviousCause.isPresent()) {
                final Throwable previousCause = optPreviousCause.get();
                if (isSameException(currentCause, previousCause)) {
                    same = true;
                } else { // limit内に違う例外のケース
                    same = false;
                    break;
                }
            } else { // limit内に例外がないケース
                same = false;
                break;
            }
        }
        if (same) {
            final String debugMsg = "Recently same error continues " + sameErrorLimit + " times.";
            throw new JobSameErrorContinueException(debugMsg, currentCause);
        }
    }

    /**
     * 連続した同じエラーを許容する数を取得する。<br>
     * Jobで変更したかったら、このメソッドをオーバーライドしてね。
     * @return 連続した同じエラーを許容する数、10なら連続10回までは許容する
     */
    protected int getSameErrorLimit() {
        return 10; // as default
    }

    protected boolean isSameException(Throwable cause, Throwable previousCause) {
        // メッセージが若干ランダム的な値が入ってて変わる可能性があるので判定要素には含めず、例外の型だけで判定する。
        return cause.getClass().equals(previousCause.getClass());
    }

    /**
     * 同じエラーが続いたときの例外。
     * @author jflute
     */
    public static class JobSameErrorContinueException extends NxSystemException {

        private static final long serialVersionUID = 1L;

        /**
         * @param debugMsg デバッグメッセージ (NullAllowed: でも null はやめてね)
         * @param cause 原因 (NullAllowed)
         */
        public JobSameErrorContinueException(String debugMsg, Throwable cause) {
            super(debugMsg, cause);
        }
    }

    // ===================================================================================
    //                                                           Recently Continuing Error
    //                                                           =========================
    protected void saveRecentlyContinuingError(BatchErrorPart error) {
        recentlyContinuingErrorList.add(error);
        if (getRecentlyContinuingErrorLimit() < recentlyContinuingErrorList.size()) {
            recentlyContinuingErrorList.removeLast();
        }
    }

    protected int getRecentlyContinuingErrorLimit() {
        return getSameErrorLimit(); // same-errorの分だけ保存しておく (少なくともそれ以上である必要がある)
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("count:{planned=").append(plannedCount);
        sb.append(", processed=").append(processedCounter);
        sb.append(", success=").append(successCounter);
        sb.append(", businessSkip=").append(businessSkips.size());
        sb.append(", error=").append(errors.size());
        sb.append("}");
        if (!businessSkips.isEmpty()) {
            sb.append("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
            sb.append("\n[businessSkips]");
            for (BatchBusinessSkipPart businessSkip : businessSkips) {
                sb.append("\n o ").append(businessSkip);
            }
            sb.append("\n_/_/_/_/_/_/_/_/_/_/");
        }
        if (!errors.isEmpty()) {
            sb.append("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/");
            sb.append("\n[errors]");
            for (BatchErrorPart error : errors) {
                sb.append("\n o ").append(error);
            }
            sb.append("\n_/_/_/_/_/_/_/_/_/_/");
        }
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * 計画件数を戻す。
     * @return 計画件数 (NotNull, EmptyAllowed: まだ planning されてないとき)
     */
    public OptionalThing<Integer> getPlannedCount() {
        return OptionalThing.ofNullable(plannedCount, () -> {
            throw new IllegalStateException("Not found the planned count.");
        });
    }

    /**
     * 処理した件数を戻す。
     * @return 処理した件数
     */
    public int getProcessedCount() {
        return processedCounter.getCount();
    }

    /**
     * 成功件数を戻す。
     * @return 成功件数
     */
    public int getSuccessCount() {
        return successCounter.getCount();
    }

    /**
     * 業務的スキップリストを戻す。
     * @return 読み取り専用業務的スキップリスト (NotNull, EmptyAllowed)
     */
    public ImmutableList<BatchBusinessSkipPart> getBusinessSkips() {
        return toImmutable(businessSkips);
    }

    /**
     * エラーリストを戻す。
     * @return 読み取り専用エラーリスト (NotNull, EmptyAllowed)
     */
    public ImmutableList<BatchErrorPart> getErrors() {
        return toImmutable(errors);
    }
}
