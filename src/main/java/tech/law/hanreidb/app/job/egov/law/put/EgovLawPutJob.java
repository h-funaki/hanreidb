package tech.law.hanreidb.app.job.egov.law.put;

import java.util.List;

import javax.annotation.Resource;

import org.dbflute.remoteapi.exception.RemoteApiHttpClientErrorException;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.logic.XmlLogic;
import tech.law.hanreidb.dbflute.exbhv.ArticleBhv;
import tech.law.hanreidb.dbflute.exbhv.ArticleContentBhv;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exbhv.LawContentBhv;
import tech.law.hanreidb.dbflute.exbhv.LawHistoryBhv;
import tech.law.hanreidb.dbflute.exbhv.LawTocBhv;
import tech.law.hanreidb.dbflute.exentity.Law;
import tech.law.hanreidb.dbflute.exentity.LawContent;
import tech.law.hanreidb.dbflute.exentity.LawHistory;
import tech.law.hanreidb.mylasta.direction.HanreidbConfig;
import tech.law.hanreidb.remote.egov.RemoteEgovBhv;

/**
 * @author h-funaki
 *
 */
public class EgovLawPutJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(EgovLawPutJob.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private LawBhv lawBhv;
    @Resource
    private HanreidbConfig config;
    @Resource
    private RemoteEgovBhv remoteEgovBhv;
    @Resource
    private LawHistoryBhv lawHistoryBhv;
    @Resource
    private LawContentBhv lawContentBhv;
    @Resource
    private LawTocBhv lawTocBhv;
    @Resource
    private ArticleBhv articleBhv;
    @Resource
    private ArticleContentBhv articleContentBhv;
    @Resource
    private XmlLogic xmlLogic;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        List<Law> lawList = lawBhv.selectList(cb -> {
            cb.specify().columnLawId();
            cb.specify().columnLawNumber();
        });
        logger.info("法令内容取得予定件数:{}", lawList.size());

        recorder.planBatch(lawList.size());

        for (Law law : lawList) {
            Integer lawId = law.getLawId();
            String lawNumber = law.getLawNumber();
            logger.info("target law id:{} law number:{}", lawId, lawNumber);
            try {
                transactionStage.requiresNew(tx -> {
                    processGetEgovLawDataXml(lawId, lawNumber);
                });
                recorder.asSuccess();
            } catch (HanreidbSystemException responseError) {
                recorder.asError(recordMessage(lawId, lawNumber, responseError.getMessage()));
            } catch (Exception error) {
                logger.info("error law_id {}", lawId);
                recorder.asError(recordMessage(lawId, lawNumber, error.getMessage()));
            }
        }
    }

    public void processGetEgovLawDataXml(Integer lawId, String lawNumber) {
        String xmlResponse = "";
        try {
            xmlResponse = remoteEgovBhv.requestRemoteLawDataXml("明治八年太政官布告第五十四号");
        } catch (RemoteApiHttpClientErrorException e) {
            throw new HanreidbSystemException("エラーレスポンス");
        }

        LawHistory lawHistory = insertLawHistory(lawId);
        insertLawContent(lawHistory.getLawHistoryId(), xmlResponse);
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    private LawHistory insertLawHistory(Integer lawId) {
        LawHistory entity = new LawHistory();
        entity.setLawId(lawId);
        entity.setLatestVersionFlg_True();
        entity.setLawAmendVersion(1);
        lawHistoryBhv.insert(entity);
        return entity;
    }

    private void insertLawContent(Integer lawHistoryId, String xmlResponse) {
        LawContent entity = new LawContent();
        entity.setLawHistoryId(lawHistoryId);
        entity.setLawContentRawXml(xmlResponse);
        entity.setLawContentSearchText(xmlResponse);
        entity.setLawContentViewXml(xmlResponse);
        lawContentBhv.insert(entity);
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Integer pk, String lawNumber, String message) {
        return String.format("law id:\"%s\", law number:\"%s\", message:\"%s\"", pk, lawNumber, message);
    }
}
