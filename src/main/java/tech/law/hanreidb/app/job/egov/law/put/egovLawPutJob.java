package tech.law.hanreidb.app.job.egov.law.put;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exentity.CourtJudgement;

/**
 * @author h-funaki
 *
 */
public class egovLawPutJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(egovLawPutJob.class);

    private static final String LAW_LIST_URL = "http://elaws.e-gov.go.jp/api/1/lawlists/1";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private CourtJudgementBhv courtJudgementBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        List<CourtJudgement> targetList = null;
        logger.info("法令行対象件数:{}", targetList.size());

        recorder.planBatch(targetList.size());

        for (CourtJudgement courtJudgement : targetList) {
            Long pk = courtJudgement.getCourtJudgementId();
            Integer sourceOriginalId = courtJudgement.getSourceOriginalId();
            logger.info("target court id:{}", sourceOriginalId);
            try {
                transactionStage.requiresNew(tx -> {
                    //processMigrate(courtJudgement);
                });
                recorder.asSuccess();
            } catch (JobBusinessSkipException skip) {
                logger.info("business skip court_original_id {}", sourceOriginalId);
                recorder.asBusinessSkip(recordMessage(pk, sourceOriginalId, skip.getMessage()));
                transactionStage.requiresNew(tx -> {
                    courtJudgement.setMemo(skip.getMessage()); // 備考欄にメモ
                    courtJudgementBhv.updateNonstrict(courtJudgement);
                });
            } catch (Exception error) {
                logger.info("error court_original_id {}", sourceOriginalId);
                recorder.asError(recordMessage(pk, sourceOriginalId, error.getMessage()));
                transactionStage.requiresNew(tx -> {
                    courtJudgement.setMemo(error.getMessage()); // 備考欄にメモ
                    courtJudgementBhv.updateNonstrict(courtJudgement);
                });
            }
        }
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Long pk, Integer sourceOriginalId, String message) {
        return String.format("court judgement id:\"%s\", source original id:\"%s\", message:\"%s\"", pk, sourceOriginalId, message);
    }

    // -----------------------------------------------------
    //                                              
    //                                              --------

}
