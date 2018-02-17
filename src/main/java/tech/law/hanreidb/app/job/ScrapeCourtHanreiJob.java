package tech.law.hanreidb.app.job;

import java.io.IOException;
import java.util.HashMap;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.LaJobRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.dbflute.exbhv.CourtScrapeResultBhv;

public class ScrapeCourtHanreiJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(ScrapeCourtHanreiJob.class);

    public static final String BASE_URL = "http://www.courts.go.jp/app/hanrei_jp/";

    public static final String BEGIN_ID = "begin_id";

    public static final String END_ID = "end_id";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private ScrapeCourtHanreiJobAssist assist;
    @Resource
    private CourtScrapeResultBhv courtScrapeResultBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();
        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        Integer beginId = selectMaxSourceOriginalId() + 1;
        //        if (runtime.getParameterMap().get(BEGIN_ID) != null) { // 引数があればそれを使う
        //            beginId = (Integer) runtime.getParameterMap().get(BEGIN_ID);
        //        }

        Integer endId = 1; // 99999;
        //        if (runtime.getParameterMap().get(BEGIN_ID) != null) { // 引数があればそれを使う
        //            endId = (Integer) runtime.getParameterMap().get(END_ID);
        //        }

        recorder.planBatch(endId - beginId + 1);

        while (beginId <= endId) {
            recorder.asProcessed();
            HashMap<Integer, String> contentMap = new HashMap<>();
            contentMap.put(ScrapeCourtHanreiJobAssist.SOURCE_ORIGINAL_ID, beginId.toString());
            try {
                processHanrei2(beginId, contentMap);
                processHanrei3(beginId, contentMap);
                processHanrei4(beginId, contentMap);
                processHanrei5(beginId, contentMap);
                processHanrei7(beginId, contentMap);
                assist.insert(contentMap);
                recorder.asSuccess();
            } catch (IOException | IndexOutOfBoundsException ex) {
                recorder.asBusinessSkip(recordMessage(beginId, ex.getMessage()));
            } catch (Exception exception) {
                recorder.asError(recordMessage(beginId, exception.getMessage()));
            } finally {
                beginId += 1;
            }
        }
    }

    public void processHanrei2(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(2, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(ScrapeCourtHanreiJobAssist.CASE_NUMBER, contentElements.get(0).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.CASE_NAME, contentElements.get(1).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_DATE, contentElements.get(2).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.COURT_NAME, contentElements.get(3).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_TYPE, contentElements.get(4).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_RESULT, contentElements.get(5).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.PRECEDENT_REPORTS, contentElements.get(6).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.ORIGINAL_COURT_NAME, contentElements.get(7).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.ORIGINAL_CASE_NUMBER, contentElements.get(8).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.ORIGINAL_JUDGEMENT_DATE, contentElements.get(9).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_CONTENT, contentElements.get(10).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_SUMMARY, contentElements.get(11).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.LAW, contentElements.get(12).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.TEXT_URL, contentElements.get(13).child(1).attr("href"));
    }

    private void processHanrei3(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(3, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(ScrapeCourtHanreiJobAssist.HIGH_COURT_REPORTS, contentElements.get(5).text());
    }

    private void processHanrei4(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(4, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(ScrapeCourtHanreiJobAssist.ORIGINAL_JUDGEMENT_RESULT, contentElements.get(7).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.JUDGEMENT_CONTENT_SUMMARY, contentElements.get(8).text());
    }

    private void processHanrei5(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(5, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(ScrapeCourtHanreiJobAssist.CASE_CATEGORY, contentElements.get(4).text());
    }

    private void processHanrei7(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(7, targetId);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(ScrapeCourtHanreiJobAssist.RIGHT_TYPE, contentElements.get(4).text());
        contentMap.put(ScrapeCourtHanreiJobAssist.LAWSUIT_TYPE, contentElements.get(5).text());
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
        return courtScrapeResultBhv.selectEntity(cb -> {
            cb.specify().columnSourceOriginalId();
            cb.query().addOrderBy_SourceOriginalId_Desc();
            cb.fetchFirst(1);
        }).map(entity -> {
            return entity.getSourceOriginalId();
        }).orElse(0);
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
