/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.job.exception;

/**
 * Jobで業務的スキップをしたときの例外クラス。<br>
 * この例外のメッセージは、asBusinessSkip() で使われることを想定。<br>
 * というか、asBusinessSkip() を呼び出し側で行うために投げる例外と言って過言ではない。
 * <pre>
 * try {
 *     processSakuhin(sakuhin); // ここで、BusinessSkip例外とか予期せぬ例外があがるかも
 *     recorder.asSuccess(); // 成功したってマークだよん (こいつが例外なげることは基本ない)
 * } catch (JobBusinessSkipException continued) { // 単なる制御用の例外なので特に情報を引き継いだりしない
 *     recorder.asBusinessSkip(continued.getMessage()); // ログ出力も含む
 * } catch (RuntimeException continued) { // NullPointerもSQL例外もあり得る
 *     recorder.asError("sakuhinPublicCode=" + sakuhin.getSakuhinPublicCode(), continued); // ログ出力や同じ例外チェックも含む
 * }
 * ...
 * int updatedCount = sakuhinBhv.queryUpdate(sakuhin, cb -> { // ☆後述のtipsコメントを参照
 *     cb.query().setSakuhinId_Equal(sakuhin.getSakuhinId()); // ほらっ、PK忘れずに！
 *     arrangeJobTargetCB(cb); // 加えて、業務状態をチェックする条件
 * });
 * if (updatedCount == 0) { // ないじゃん！すれ違いで処理対象じゃなくなっちゃったー
 *     throw new JobBusinessSkipException("sakuhinPublicCode=" + sakuhin.getSakuhinPublicCode()); // asBusinessSkip()想定
 * }
 * ...
 * </pre>
 * @author jflute
 */
public class JobBusinessSkipException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JobBusinessSkipException(String msg) {
        super(msg);
    }

    // 一応、ネストした例外で使われることを想定していないので、causeを受け取るコンストラクタはない by jflute (2017/05/10)
    // 必要になったら作ってもOKだが、そのときは asBusinessSkip() も例外を受け取るようにしないと意味がないかも。
}
