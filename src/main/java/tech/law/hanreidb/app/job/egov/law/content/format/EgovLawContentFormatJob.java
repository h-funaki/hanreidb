package tech.law.hanreidb.app.job.egov.law.content.format;

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
import tech.law.hanreidb.remote.egov.RemoteEgovBhv;

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
    @Resource
    private RemoteEgovBhv remoteEgovBhv;

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
        // fileLogic.outputRecorder(recorder, getClass().getSimpleName());
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
        return rawXml.substring(rawXml.indexOf("<LawBody>", 1), rawXml.indexOf("</Law>", 1) - 1); // LawBodyを取り出す
    }

    protected String toSearchText(String rawXml) {
        return rawXml.replaceAll("<[a-zA-Z \"=0-9]++>", "") // e.g. <message aaa="24">
                .replaceAll("</[a-zA-Z]++>", "") // e.g. </message>
                .replaceAll("<[a-zA-Z]++/>", "") //　e.g. <message />
                .replaceAll("\\s", ""); // 改行とか、空白行とか不要な文字を削除
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Integer pk, String message) {
        return String.format("law id:\"%s\", message:\"%s\"", pk, message);
    }
}
