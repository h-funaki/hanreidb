package tech.law.hanreidb.app.job.court.scrape;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;

import org.dbflute.exception.EntityAlreadyExistsException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;

public class CourtScrapeJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtScrapeJob.class);

    public static final String BASE_URL = "http://www.courts.go.jp/app/hanrei_jp/";

    public static final String BEGIN_ID = "begin_id";

    public static final String END_ID = "end_id";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CourtScrapeJobAssist assist;
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private TransactionStage transactionStage;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        Integer beginId = selectMaxSourceOriginalId() + 1;
        if (runtime.getParameterMap().get(BEGIN_ID) != null) { // 引数があればそれを使う
            beginId = ((Double) runtime.getParameterMap().get(BEGIN_ID)).intValue();
        }

        Integer endId = 50; // 99999;
        if (runtime.getParameterMap().get(END_ID) != null) { // 引数があればそれを使う
            endId = ((Double) runtime.getParameterMap().get(END_ID)).intValue(); // なぜかObject => Doubleになる
        }

        logger.info("begin id:{}, end id:{}", beginId, endId);

        recorder.planBatch(endId - beginId + 1);

        while (beginId <= endId) {
            recorder.asProcessed();
            logger.info("target id:{}", beginId);
            HashMap<Integer, String> contentMap = new HashMap<>();
            contentMap.put(CourtScrapeJobAssist.SOURCE_ORIGINAL_ID, beginId.toString());
            try {
                processHanrei2(beginId, contentMap);
                processHanrei3(beginId, contentMap);
                processHanrei4(beginId, contentMap);
                processHanrei5(beginId, contentMap);
                processHanrei7(beginId, contentMap);
                transactionStage.requiresNew(tx -> {
                    assist.insert(contentMap);
                });
                recorder.asSuccess();
            } catch (IOException | IndexOutOfBoundsException | JobBusinessSkipException | EntityAlreadyExistsException ex) {
                logger.info("skip target id {}", beginId);
                recorder.asBusinessSkip(recordMessage(beginId, ex.getMessage()));
            } catch (Exception exception) {
                logger.info("error target id {}", beginId);
                recorder.asError(recordMessage(beginId, exception.getMessage()));
            } finally {
                beginId += 1;
            }
        }
    }

    public void processHanrei2(Integer targetId, HashMap<Integer, String> contentMap)
            throws IOException, IndexOutOfBoundsException, JobBusinessSkipException {
        Document document = getHtmlDocument(2, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        ifNotBlank(contentElements.get(0).text()).ifPresent(value -> {
            contentMap.put(CourtScrapeJobAssist.CASE_NUMBER, value);
        }).orElse(() -> {
            throw new JobBusinessSkipException(recordMessage(targetId, "事件番号が空白"));
        });
        contentMap.put(CourtScrapeJobAssist.CASE_NAME, trimSpaces(contentElements.get(1).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_DATE, trimSpaces(contentElements.get(2).text()));
        contentMap.put(CourtScrapeJobAssist.COURT_NAME, trimSpaces(contentElements.get(3).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_TYPE, trimSpaces(contentElements.get(4).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_RESULT, trimSpaces(contentElements.get(5).text()));
        contentMap.put(CourtScrapeJobAssist.PRECEDENT_REPORTS, trimSpaces(contentElements.get(6).text()));
        contentMap.put(CourtScrapeJobAssist.ORIGINAL_COURT_NAME, trimSpaces(contentElements.get(7).text()));
        contentMap.put(CourtScrapeJobAssist.ORIGINAL_CASE_NUMBER, trimSpaces(contentElements.get(8).text()));
        contentMap.put(CourtScrapeJobAssist.ORIGINAL_JUDGEMENT_DATE, trimSpaces(contentElements.get(9).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_CONTENT, trimSpaces(contentElements.get(10).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_SUMMARY, trimSpaces(contentElements.get(11).text()));
        contentMap.put(CourtScrapeJobAssist.LAW, trimSpaces(contentElements.get(12).text()));
        contentMap.put(CourtScrapeJobAssist.TEXT_URL, trimSpaces(contentElements.get(13).child(1).attr("href")));
    }

    private void processHanrei3(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(3, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtScrapeJobAssist.HIGH_COURT_REPORTS, trimSpaces(contentElements.get(5).text()));
    }

    private void processHanrei4(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(4, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtScrapeJobAssist.ORIGINAL_JUDGEMENT_RESULT, trimSpaces(contentElements.get(7).text()));
        contentMap.put(CourtScrapeJobAssist.JUDGEMENT_CONTENT_SUMMARY, trimSpaces(contentElements.get(8).text()));
    }

    private void processHanrei5(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(5, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtScrapeJobAssist.CASE_CATEGORY, trimSpaces(contentElements.get(4).text()));
    }

    private void processHanrei7(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(7, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtScrapeJobAssist.RIGHT_TYPE, trimSpaces(contentElements.get(4).text()));
        contentMap.put(CourtScrapeJobAssist.LAWSUIT_TYPE, trimSpaces(contentElements.get(5).text()));
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    protected Document getHtmlDocument(Integer detail, Integer targetId) throws IOException {
        return Jsoup.connect(makeTargetUrl(detail, targetId)).get();
    }

    private String makeTargetUrl(Integer detail, Integer id) {
        return BASE_URL.concat("detail").concat(detail.toString()).concat("?id=").concat(id.toString());
    }

    private Integer selectMaxSourceOriginalId() {
        return courtJudgementBhv.selectEntity(cb -> {
            cb.specify().columnSourceOriginalId();
            cb.query().addOrderBy_SourceOriginalId_Desc();
            cb.fetchFirst(1);
        }).map(entity -> {
            return entity.getSourceOriginalId();
        }).orElse(0);
    }

    private String trimSpaces(String string) {
        while (string.startsWith(" ")) {
            string.replaceFirst(" ", "");
        }
        while (string.startsWith("　")) {
            string.replaceFirst("　", "");
        }
        return string;
    }

    private String recordMessage(Integer id, String message) {
        return String.format("id:\"%s\", message:\"%s\"", id, message);
    }

    //    private void logElements(Elements contentElements) {
    //        contentElements.forEach(aa -> {
    //            logger.debug("{}", aa.text());
    //        });
    //    }
}
