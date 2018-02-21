package tech.law.hanreidb.app.job.court.scrape;

import java.util.HashMap;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exentity.CourtJudgement;

public class CourtScrapeJobAssist {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final Integer CASE_NUMBER = 1;
    public static final Integer CASE_NAME = 2;
    public static final Integer JUDGEMENT_DATE = 3;
    public static final Integer COURT_NAME = 4;
    public static final Integer JUDGEMENT_TYPE = 5;
    public static final Integer JUDGEMENT_RESULT = 6;
    public static final Integer PRECEDENT_REPORTS = 7;
    public static final Integer ORIGINAL_COURT_NAME = 8;
    public static final Integer ORIGINAL_CASE_NUMBER = 9;
    public static final Integer ORIGINAL_JUDGEMENT_DATE = 10;
    public static final Integer ORIGINAL_JUDGEMENT_RESULT = 11;
    public static final Integer JUDGEMENT_CONTENT = 12;
    public static final Integer JUDGEMENT_SUMMARY = 13;
    public static final Integer LAW = 14;
    public static final Integer TEXT_URL = 15;
    public static final Integer HIGH_COURT_REPORTS = 16;
    public static final Integer JUDGEMENT_CONTENT_SUMMARY = 17;
    public static final Integer RIGHT_TYPE = 18;
    public static final Integer LAWSUIT_TYPE = 19;
    public static final Integer CASE_CATEGORY = 20;
    public static final Integer SOURCE_ORIGINAL_ID = 21;

    private static final Logger logger = LoggerFactory.getLogger(CourtScrapeJob.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CourtJudgementBhv courtJudgementBhv;

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    protected void insert(HashMap<Integer, String> map) {
        CourtJudgement entity = new CourtJudgement();
        entity.setCaseCategory(map.get(CASE_CATEGORY));
        entity.setCaseName(map.get(CASE_NAME));
        entity.setCaseNumber(map.get(CASE_NUMBER));
        entity.setCourtName(map.get(COURT_NAME));
        entity.setHighCourtReports(map.get(HIGH_COURT_REPORTS));
        entity.setJudgementContent(map.get(JUDGEMENT_CONTENT));
        entity.setJudgementContentSummary(map.get(JUDGEMENT_CONTENT_SUMMARY));
        entity.setJudgementDate(map.get(JUDGEMENT_DATE));
        entity.setJudgementResult(map.get(JUDGEMENT_RESULT));
        entity.setJudgementSummary(map.get(JUDGEMENT_SUMMARY));
        entity.setJudgementType(map.get(JUDGEMENT_TYPE));
        entity.setLaw(map.get(LAW));
        entity.setLawsuitType(map.get(LAWSUIT_TYPE));
        entity.setOriginalCaseNumber(map.get(ORIGINAL_CASE_NUMBER));
        entity.setOriginalCourtName(map.get(ORIGINAL_COURT_NAME));
        entity.setOriginalJudgementDate(map.get(ORIGINAL_JUDGEMENT_DATE));
        entity.setOriginalJudgementResult(map.get(ORIGINAL_JUDGEMENT_RESULT));
        entity.setPrecedentReports(map.get(PRECEDENT_REPORTS));
        entity.setRightType(map.get(RIGHT_TYPE));
        entity.setTextUrl(map.get(TEXT_URL));
        entity.setSourceOriginalId(Integer.parseInt(map.get(SOURCE_ORIGINAL_ID))); // NotNull
        courtJudgementBhv.insertOrUpdateNonstrict(entity);
        logger.debug("事件番号:{}\n事件名:{}\n裁判年月日:{}\n裁判所名:{}\n裁判種別:{}\n" + //
                "結果:{}\n判例集:{}\n原審裁判所名:{}\n原審裁判年月日:{}\n" + //
                "原審結果:{}\n判示事項:{}\n裁判要旨:{}\n参照法条:{}\n" + //
                "URL:{}\n高裁判例集:{}\n判示事項の要旨:{}\n権利種別:{}\n" + //
                "訴訟類型:{}\n事件分野:{}\n取得元ID:{}", //
                map.get(CASE_NUMBER), map.get(CASE_NAME), map.get(JUDGEMENT_DATE), map.get(COURT_NAME), map.get(JUDGEMENT_TYPE), //
                map.get(JUDGEMENT_RESULT), map.get(PRECEDENT_REPORTS), map.get(ORIGINAL_COURT_NAME), map.get(ORIGINAL_JUDGEMENT_DATE), //
                map.get(ORIGINAL_JUDGEMENT_RESULT), map.get(JUDGEMENT_CONTENT), map.get(JUDGEMENT_SUMMARY), map.get(LAW), //
                map.get(TEXT_URL), map.get(HIGH_COURT_REPORTS), map.get(JUDGEMENT_CONTENT_SUMMARY), map.get(RIGHT_TYPE), //
                map.get(LAWSUIT_TYPE), map.get(CASE_CATEGORY), map.get(SOURCE_ORIGINAL_ID));
    }
}
