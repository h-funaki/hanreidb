package tech.law.hanreidb.app.job.egov.law.content.format;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.dbflute.exbhv.LawContentBhv;
import tech.law.hanreidb.dbflute.exentity.LawContent;

/**
 * @author h-funaki
 *
 */
public class EgovLawContentFormatJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(EgovLawContentFormatJob.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private LawContentBhv lawContentBhv;
    @Resource
    private FileLogic fileLogic;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        int count = lawContentBhv.selectCount(cb -> {
            cb.specify().columnLawContentId();
        });
        logger.info("法令内容取得予定件数:{}", count);
        recorder.planBatch(count);

        List<LawContent> contentList = lawContentBhv.selectList(cb -> {
            cb.specify().columnLawContentId();
        });

        lawContentBhv.selectCursor(cb -> {
            cb.specify().columnLawContentId();
            cb.specify().columnLawContentRawXml();
        }, content -> {
            Integer lawContentId = content.getLawContentId();
            logger.info("target law content id:{}", lawContentId);
            try {
                transactionStage.requiresNew(tx -> {
                    String rawXml = content.getLawContentRawXml();
                    processFormatLawContent(lawContentId, rawXml);
                    rawXml = null; // メモリを食うので破棄する
                });
                recorder.asSuccess();
            } catch (HanreidbSystemException responseError) {
                recorder.asError(recordMessage(lawContentId, responseError.getMessage()));
            } catch (Exception error) {
                logger.info("error law_id {}", lawContentId);
                recorder.asError(recordMessage(lawContentId, error.getMessage()));
            }
        });
        fileLogic.outputRecorder(recorder, getClass().getSimpleName());
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private void processFormatLawContent(Integer lawContentId, String rawXml) {
        LawContent entity = new LawContent();
        entity.setLawContentId(lawContentId);
        entity.setLawContentSearchText(toSearchText(rawXml));
        entity.setLawContentViewXml(toViewXml(rawXml));
        lawContentBhv.updateNonstrict(entity);
        entity = null; // メモリを食うので明示的に破棄する
    }

    protected String toViewXml(String rawXml) {
        // TODO Auto-generated method stub
        return null;
    }

    protected String toSearchText(String rawXml) {
        String searchText = "";
        searchText =
                rawXml.replaceAll("<[a-zA-Z \"=0-9]++>", "").replaceAll("</[a-zA-Z]++>", "").replaceAll("<[a-zA-Z]++/>", "").replaceAll(
                        "\\s", "");
        return searchText;
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Integer pk, String message) {
        return String.format("law id:\"%s\", message:\"%s\"", pk, message);
    }
}
