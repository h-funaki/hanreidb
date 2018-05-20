package tech.law.hanreidb.app.job.court.judgement.set;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

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

import edu.emory.mathcs.backport.java.util.Arrays;
import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.app.logic.FormatLogic;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

public class CourtJudgementSetJob implements LaJob {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementSetJob.class);

    public static final String BASE_URL = "http://www.courts.go.jp/app/hanrei_jp/";

    public static final String BEGIN_ID = "begin_id";

    public static final String END_ID = "end_id";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CourtJudgementSetJobAssist assist;
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private HanreidbEnv env;
    @Resource
    private FileLogic fileLogic;
    @Resource
    private FormatLogic formatLogic;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public void run(LaJobRuntime runtime) {
        JobRecorder recorder = new JobRecorder();

        runtime.showEndTitleRoll(data -> {
            data.register("recorder", recorder);
        });

        Integer beginId = null;
        if (runtime.getParameterMap().get(BEGIN_ID) != null) { // 引数があればそれを使う
            beginId = ((Double) runtime.getParameterMap().get(BEGIN_ID)).intValue();
        } else {
            beginId = selectMaxSourceOriginalId() + 1;
        }

        Integer endId = null;
        if (runtime.getParameterMap().get(END_ID) != null) { // 引数があればそれを使う
            endId = ((Double) runtime.getParameterMap().get(END_ID)).intValue(); // なぜかObject => Doubleになる
        } else {
            endId = beginId + 1000; // as default
        }

        List<Integer> targetIdList = getTargetIdList(beginId, endId);
        logger.info("begin id:{}, end id:{}, planCount:{}", beginId, endId, targetIdList.size());

        recorder.planBatch(targetIdList.size());

        for (Integer targetId : targetIdList) {
            recorder.asProcessed();
            logger.info("target id:{}", targetId);
            HashMap<Integer, String> contentMap = new HashMap<>();
            contentMap.put(CourtJudgementSetJobAssist.SOURCE_ORIGINAL_ID, targetId.toString());
            try {
                processHanrei2(targetId, contentMap);
                processHanrei3(targetId, contentMap);
                processHanrei4(targetId, contentMap);
                processHanrei5(targetId, contentMap);
                processHanrei7(targetId, contentMap);
                transactionStage.requiresNew(tx -> {
                    assist.insert(contentMap);
                });
                recorder.asSuccess();
            } catch (IndexOutOfBoundsException | JobBusinessSkipException | EntityAlreadyExistsException ex) {
                logger.info("skip target id {}", targetId);
                recorder.asBusinessSkip(recordMessage(targetId, ex.getMessage()));
                // recordMessage(targetId, ex.getMessage() + "\n" + assist.recordEntityDetail(contentMap)));
            } catch (Exception exception) {
                logger.info("error target id {}", targetId);
                recorder.asError(recordMessage(targetId, exception.getMessage()));
                //recorder.asError(recordMessage(targetId, exception.getMessage() + "\n" + assist.recordEntityDetail(contentMap)));
            } finally {
                targetId += 1;
            }
        }
        fileLogic.outputRecorder(recorder, getClass().getSimpleName(), beginId, endId);
    }

    protected List<Integer> getTargetIdList(Integer beginId, Integer endId) {
        //存在するHTMLファイルのみを対象にする
        File htmlDir = new File(env.getCourtHtmlPath());
        @SuppressWarnings("unchecked")
        List<String> htmlList = Arrays.asList(htmlDir.list());

        List<Integer> targetIdList = newArrayList();
        for (Integer targetId = beginId; targetId <= endId; targetId++) { // e.g. 100_3.html, 100-7.htmlfileName
            boolean containsHtml2 = htmlList.contains(targetId.toString().concat("_").concat("2.html"));
            boolean containsHtml3 = htmlList.contains(targetId.toString().concat("_").concat("3.html"));
            boolean containsHtml4 = htmlList.contains(targetId.toString().concat("_").concat("4.html"));
            boolean containsHtml5 = htmlList.contains(targetId.toString().concat("_").concat("5.html"));
            boolean containsHtml7 = htmlList.contains(targetId.toString().concat("_").concat("7.html"));
            if (containsHtml2 && containsHtml3 && containsHtml4 && containsHtml5 && containsHtml7) {
                targetIdList.add(targetId);
            } else {
                logger.info("htmlファイルなし。targetId:{}", targetId);
            }
        }
        return targetIdList;
    }

    public void processHanrei2(Integer targetId, HashMap<Integer, String> contentMap)
            throws IOException, IndexOutOfBoundsException, JobBusinessSkipException {
        Document document = getHtmlDocument(targetId, 2);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        ifNotBlank(contentElements.get(0).text()).ifPresent(value -> {
            contentMap.put(CourtJudgementSetJobAssist.CASE_NUMBER, formatLogic.trimPrefixSpaces(value));
        }).orElse(() -> {
            throw new JobBusinessSkipException("事件番号が空白");
        });
        contentMap.put(CourtJudgementSetJobAssist.CASE_NAME, formatLogic.trimPrefixSpaces(contentElements.get(1).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_DATE, formatLogic.trimPrefixSpaces(contentElements.get(2).text()));
        contentMap.put(CourtJudgementSetJobAssist.COURT_NAME, formatLogic.trimPrefixSpaces(contentElements.get(3).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_TYPE, formatLogic.trimPrefixSpaces(contentElements.get(4).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_RESULT, formatLogic.trimPrefixSpaces(contentElements.get(5).text()));
        contentMap.put(CourtJudgementSetJobAssist.PRECEDENT_REPORTS, formatLogic.trimPrefixSpaces(contentElements.get(6).text()));
        contentMap.put(CourtJudgementSetJobAssist.ORIGINAL_COURT_NAME, formatLogic.trimPrefixSpaces(contentElements.get(7).text()));
        contentMap.put(CourtJudgementSetJobAssist.ORIGINAL_CASE_NUMBER, formatLogic.trimPrefixSpaces(contentElements.get(8).text()));
        contentMap.put(CourtJudgementSetJobAssist.ORIGINAL_JUDGEMENT_DATE, formatLogic.trimPrefixSpaces(contentElements.get(9).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_CONTENT, formatLogic.trimPrefixSpaces(contentElements.get(10).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_SUMMARY, formatLogic.trimPrefixSpaces(contentElements.get(11).text()));
        contentMap.put(CourtJudgementSetJobAssist.LAW, formatLogic.trimPrefixSpaces(contentElements.get(12).text()));
        contentMap.put(CourtJudgementSetJobAssist.TEXT_URL, formatLogic.trimPrefixSpaces(contentElements.get(13).child(1).attr("href")));
    }

    private void processHanrei3(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(targetId, 3);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtJudgementSetJobAssist.HIGH_COURT_REPORTS, formatLogic.trimPrefixSpaces(contentElements.get(5).text()));
    }

    private void processHanrei4(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(targetId, 4);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtJudgementSetJobAssist.ORIGINAL_JUDGEMENT_RESULT, formatLogic.trimPrefixSpaces(contentElements.get(7).text()));
        contentMap.put(CourtJudgementSetJobAssist.JUDGEMENT_CONTENT_SUMMARY, formatLogic.trimPrefixSpaces(contentElements.get(8).text()));
    }

    private void processHanrei5(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(targetId, 5);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtJudgementSetJobAssist.CASE_CATEGORY, formatLogic.trimPrefixSpaces(contentElements.get(4).text()));
    }

    private void processHanrei7(Integer targetId, HashMap<Integer, String> contentMap) throws IOException, IndexOutOfBoundsException {
        Document document = getHtmlDocument(targetId, 7);
        Elements contentElements = document.getElementsByAttributeValueStarting("class", "list5");
        contentMap.put(CourtJudgementSetJobAssist.RIGHT_TYPE, formatLogic.trimPrefixSpaces(contentElements.get(4).text()));
        contentMap.put(CourtJudgementSetJobAssist.LAWSUIT_TYPE, formatLogic.trimPrefixSpaces(contentElements.get(5).text()));
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    protected Document getHtmlDocument(Integer targetId, Integer detail) throws IOException {
        File file = new File(makeTargetUrl(targetId, detail));
        if (!file.exists()) {
            throw new JobBusinessSkipException("HTMLファイルが存在しない:" + file.getName());
        }
        return Jsoup.parse(file, "UTF-8");
    }

    private String makeTargetUrl(Integer targetId, Integer detail) {
        return env.getCourtHtmlPath().concat(targetId.toString()) + "_" + detail.toString() + ".html";
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

    private String recordMessage(Integer id, String message) {
        return String.format("id:\"%s\" message:\"%s\"", id, message);
    }
}
