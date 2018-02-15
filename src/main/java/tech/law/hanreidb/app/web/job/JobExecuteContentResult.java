package tech.law.hanreidb.app.web.job;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.lastaflute.core.util.Lato;
import org.lastaflute.job.LaJobHistory;
import org.lastaflute.job.subsidiary.ExecResultType;
import org.lastaflute.web.validation.Required;

public class JobExecuteContentResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** JOBをユニークに特定するコード。AllJobSchedulerにて定義されている。 */
    @Required
    public final String job_unique;

    /** JOBクラスのFQCN。e.g. org.docksidestage.app.job.SeaJob */
    @Required
    public final String job_type_fqcn;

    /** Jobが仕組み的に起動した時間。排他制御前の時間なので、この後に待ちに入る可能性あり。 */
    @Required
    public final LocalDateTime activation_time;

    /** 業務的な開始時間。Jobクラスの業務コードが実行されたとき。 (NullAllowed: 排他制御で引っかかって終わったなど) */
    public final LocalDateTime begin_time; // null if e.g. duplicate execution

    /** 業務的な終了時間。Jobクラスの業務コードのすべてが終わったとき。 (NullAllowed: そもそも開始されてないとき) */
    public final LocalDateTime end_time; // me too

    /** Jobで設定した end-title-roll を文字列として保持したマップ。 */
    @NotNull
    public final Map<String, String> end_title_roll;

    /** Jobの実行結果のタイプ。成功？ or 排他制御で引っかかった？ or エラーになった？ (NotNull) */
    @Required
    public final ExecResultTypePart exec_result_type;

    /**
     * @author jflute
     */
    public enum ExecResultTypePart { // フレームワークに依存しないようにするための詰め替えクラス

        /** 成功 */
        SUCCESS, // no cause
        /** 二重起動で静かに実行をやめた */
        QUIT_BY_CONCURRENT, // no execution as quit
        /** 二重起動でエラーとして実行をやめた */
        ERROR_BY_CONCURRENT, // no execution as error
        /** アプリの中でエラーが発生して中断 */
        CAUSED_BY_APPLICATION, // exception thrown by application
        /** フレームワークの中でエラーが発生して中断 */
        CAUSED_BY_FRAMEWORK, // exception thrown by framework
        /** よくわからない状態。例えば、LastaJob側でタイプが増えたとか */
        UNKNOWN;

        /**
         * @param nativeType LastaJobのネイティヴ型 (NotNull)
         * @return 対応する定義 (NotNull)
         */
        public static ExecResultTypePart of(ExecResultType nativeType) {
            final ExecResultTypePart part;
            if (ExecResultType.SUCCESS.equals(nativeType)) {
                part = SUCCESS;
            } else if (ExecResultType.QUIT_BY_CONCURRENT.equals(nativeType)) {
                part = QUIT_BY_CONCURRENT;
            } else if (ExecResultType.ERROR_BY_CONCURRENT.equals(nativeType)) {
                part = ERROR_BY_CONCURRENT;
            } else if (ExecResultType.CAUSED_BY_APPLICATION.equals(nativeType)) {
                part = CAUSED_BY_APPLICATION;
            } else if (ExecResultType.CAUSED_BY_FRAMEWORK.equals(nativeType)) {
                part = CAUSED_BY_FRAMEWORK;
            } else { // no way!
                part = UNKNOWN;
            }
            return part;
        }
    }

    /** エラーかどうか。Jobの実行結果のタイプのFacade項目。 */
    @Required
    public final Boolean error_ending;

    /** エラーメッセージ、スタックトレース含む。 (NullAllowed) */
    public final String error_message;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // done awane 他のActionとフローを合わせるならAction側でマッピングさせたほうがいいかも。JOBだけ特別もあり。 (2017/04/05)
    // まあ、ここだけ特別でOK。特殊なクラスではあるので、LastaFluteのExampleと合わせるということで by jflute
    /**
     * ジョブ実行結果を作成する。
     * @param history JOB履歴 (NotNull)
     */
    public JobExecuteContentResult(LaJobHistory history) {
        this.job_unique = history.getJobUnique().get().value(); // always present in this action
        this.job_type_fqcn = history.getJobTypeFqcn();
        this.activation_time = history.getActivationTime();
        this.begin_time = history.getBeginTime().orElse(null);
        this.end_time = history.getEndTime().orElse(null);
        this.end_title_roll = history.getEndTitleRollSnapshotMap();
        this.exec_result_type = ExecResultTypePart.of(history.getExecResultType());
        this.error_ending = history.getExecResultType().isErrorResult(); // facade
        this.error_message = history.getCause().map(cause -> buildExceptionStackTrace(cause)).orElse(null);
    }

    private String buildExceptionStackTrace(Throwable cause) {
        final StringBuilder sb = new StringBuilder();
        final ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
        PrintStream ps = null;
        try {
            ps = new PrintStream(out);
            cause.printStackTrace(ps);
            final String encoding = "UTF-8";
            try {
                sb.append(out.toString(encoding));
            } catch (UnsupportedEncodingException continued) {
                sb.append(out.toString()); // retry without encoding
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return sb.toString();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return Lato.string(this);
    }
}
