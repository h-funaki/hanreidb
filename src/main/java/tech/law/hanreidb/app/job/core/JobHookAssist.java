package tech.law.hanreidb.app.job.core;

/*
 * Copyright(c) u-next.
 */

import org.dbflute.optional.OptionalThing;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;

/**
 * @author jflute
 */
public class JobHookAssist {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(JobHookAssist.class);

    // ===================================================================================
    //                                                                     Recorded Errors
    //                                                                     ===============
    /**
     * Recorderで記録されたerrorsがあれば、ERRORレベルのログを出力する。(エラー通知のログ)
     * 
     * <p>一件処理のエラーは続行されて EndTitleRoll に内訳が出力されるが、それはあくまでINFOレベルである。
     * エラーが記録されるときにそれぞれの詳細がERRORレベルのログに出力されるが、専用のログファイル(*S)を想定している。
     * なので、最後に通常のERRORレベルのログで通知しておく。</p>
     * 
     * <p>*S: 専用のログファイルを用意する理由としては、一つのJobで出力するエラー件数があまりに多いと、
     * 同時に動いていた他のJobの単発の重要なエラーが埋もれてしまう可能性があるため。</p>
     * @param runtime The runtime object of running job. (NotNull)
     * @param cause The exception thrown by running job. (NotNull, EmptyAllowed)
     */
    public void handleRecordedErrors(LaJobRuntime runtime, OptionalThing<Throwable> cause) {
        if (cause.isPresent()) {
            return; // そもそも例外が発生しているなら、ERRORログはLastaJobの中で出力されるので
        }
        runtime.getEndTitleRoll().ifPresent(roll -> {
            roll.getDataMap().values().forEach(data -> {
                if (data instanceof JobRecorder) {
                    final JobRecorder recorder = (JobRecorder) data;
                    if (!recorder.getErrors().isEmpty()) {
                        final String msg = "#{} recorded errors => {}"; // 通知的な役割なので、内容はがっつりじゃなくてもOK
                        final String hash = JobRecorder.generateMappingHash(recorder); // "個別エラーのログ" とマッピングできるように
                        logger.error(msg, hash, recorder); // まあ、EndTitleRollで出してるのと一緒
                    }
                }
            });
        });
    }
}
