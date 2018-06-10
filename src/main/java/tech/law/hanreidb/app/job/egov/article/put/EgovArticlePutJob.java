package tech.law.hanreidb.app.job.egov.article.put;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.dbflute.exbhv.ArticleBhv;
import tech.law.hanreidb.dbflute.exbhv.ArticleContentBhv;
import tech.law.hanreidb.dbflute.exbhv.LawContentBhv;
import tech.law.hanreidb.dbflute.exbhv.LawTocBhv;
import tech.law.hanreidb.dbflute.exentity.Article;
import tech.law.hanreidb.dbflute.exentity.LawContent;

/**
 * @author h-funaki
 *
 */
public class EgovArticlePutJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(EgovArticlePutJob.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private LawContentBhv lawContentBhv;
    @Resource
    private LawTocBhv lawTocBhv;
    @Resource
    private ArticleBhv articleBhv;
    @Resource
    private ArticleContentBhv articleContentBhv;
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

        List<LawContent> contentList = lawContentBhv.selectList(cb -> {
            cb.specify().columnLawContentId();
            cb.query().queryLawHistory().notExistsArticle(articleCB -> {});
        });
        logger.info("法令内容取得予定件数:{}", contentList.size());

        recorder.planBatch(contentList.size());

        //        for (Law law : lawList) {
        //            Integer lawId = law.getLawId();
        //            String lawNumber = law.getLawNumber();
        //            logger.info("target law id:{} law number:{}", lawId, lawNumber);
        //            try {
        //                transactionStage.requiresNew(tx -> {
        //                    processGetEgovLawDataXml(lawId, lawNumber);
        //                });
        //                recorder.asSuccess();
        //            } catch (HanreidbSystemException responseError) {
        //                recorder.asError(recordMessage(lawId, lawNumber, responseError.getMessage()));
        //            } catch (Exception error) {
        //                logger.info("error law_id {}", lawId);
        //                recorder.asError(recordMessage(lawId, lawNumber, error.getMessage()));
        //            }
        //        }
        fileLogic.outputRecorder(recorder, getClass().getSimpleName());
    }

    public void processGetEgovLawDataXml(Integer lawId, String lawNumber) {
    }

    // ===================================================================================
    //                                                                              Insert
    //                                                                              ======
    private void insertArticle(Integer lawHistoryId, Long lawTocId, String articleElement) {
        Article article = new Article();
        article.setLawHistoryId(lawHistoryId);
        article.setLawTocId(lawTocId);
        articleBhv.insert(article);
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private String recordMessage(Integer pk, String lawNumber, String message) {
        return String.format("law id:\"%s\", law number:\"%s\", message:\"%s\"", pk, lawNumber, message);
    }
}
