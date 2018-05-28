package tech.law.hanreidb.app.job.egov.law.put;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;

/**
 * @author h-funaki
 *
 */
public class egovLawPutJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(egovLawPutJob.class);

    private static final String BASE_URL = "http://elaws.e-gov.go.jp/api/1/lawdata/";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private LawBhv lawBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        List<String> lawNumberList = lawBhv.selectList(cb -> {
            cb.specify().columnLawNumber();
        }).extractColumnList(entity -> {
            return entity.getLawNumber();
        });
        logger.info("法令内容取得予定件数:{}", lawNumberList.size());

        recorder.planBatch(lawNumberList.size());

        for (String lawNumber : lawNumberList) {
            logger.info("target law number:{}", lawNumber);
            try {
                transactionStage.requiresNew(tx -> {
                    //processMigrate(courtJudgement);
                });
                recorder.asSuccess();
            }
            //            catch (JobBusinessSkipException skip) {
            //                logger.info("business skip court_original_id {}", lawNumber);
            //                recorder.asBusinessSkip(recordMessage(pk, sourceOriginalId, skip.getMessage()));
            //                transactionStage.requiresNew(tx -> {
            //                    courtJudgement.setMemo(skip.getMessage()); // 備考欄にメモ
            //                    courtJudgementBhv.updateNonstrict(courtJudgement);
            //                });
            //            }
            catch (Exception error) {
                logger.info("error court_original_id {}", lawNumber);
                // recorder.asError(recordMessage(pk, sourceOriginalId, error.getMessage()));
                // transactionStage.requiresNew(tx -> {
                //      courtJudgement.setMemo(error.getMessage()); // 備考欄にメモ
                //     courtJudgementBhv.updateNonstrict(courtJudgement);
                // });
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
