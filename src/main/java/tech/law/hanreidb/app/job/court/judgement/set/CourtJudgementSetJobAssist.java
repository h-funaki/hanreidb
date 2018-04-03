package tech.law.hanreidb.app.job.court.judgement.set;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isBlank;

import java.util.HashMap;

import javax.annotation.Resource;

import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.EntityDuplicatedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.job.exception.JobBusinessSkipException;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exentity.CourtJudgement;

public class CourtJudgementSetJobAssist {

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
    public static final Integer SENTENCE = 22;

    private static final Logger logger = LoggerFactory.getLogger(CourtJudgementSetJob.class);

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
        try {
            courtJudgementBhv.insertOrUpdateNonstrict(entity);
        } catch (EntityDuplicatedException continued) {
            throw new JobBusinessSkipException("裁判所判決エンティティが重複。");
        } catch (EntityAlreadyExistsException continued) {
            throw new JobBusinessSkipException("裁判所判決エンティティがすでに存在。");
        } catch (Exception continued) {
            if (isBlank(map.get(CASE_NUMBER))) {
                throw new JobBusinessSkipException("事件番号が空白。");
            } else {
                throw new JobBusinessSkipException("裁判所判決エンティティの挿入に失敗。" + continued.getMessage());
            }
        }
    }

    protected void infoLogAllFields(HashMap<Integer, String> map) {
        logger.info(recordEntityDetail(map));
    }

    protected String recordEntityDetail(HashMap<Integer, String> map) {
        return String.format("事件番号:\"%s\"\n事件名:\"%s\"\n裁判年月日:\"%s\"\n裁判所名:\"%s\"\n裁判種別:\"%s\"\n" + //
                "結果:\"%s\"\n判例集:\"%s\"\n原審裁判所名:\"%s\"\n原審裁判年月日:\"%s\"\n" + //
                "原審結果:\"%s\"\nURL:\"%s\"\n高裁判例集:\"%s\"\n権利種別:\"%s\"\n" + //
                "訴訟類型:\"%s\"\n事件分野:\"%s\"\n取得元ID:\"%s\"", //
                map.get(CASE_NUMBER), map.get(CASE_NAME), map.get(JUDGEMENT_DATE), map.get(COURT_NAME), map.get(JUDGEMENT_TYPE), //
                map.get(JUDGEMENT_RESULT), map.get(PRECEDENT_REPORTS), map.get(ORIGINAL_COURT_NAME), map.get(ORIGINAL_JUDGEMENT_DATE), //
                map.get(ORIGINAL_JUDGEMENT_RESULT), map.get(TEXT_URL), map.get(HIGH_COURT_REPORTS), map.get(RIGHT_TYPE), //
                map.get(LAWSUIT_TYPE), map.get(CASE_CATEGORY), map.get(SOURCE_ORIGINAL_ID));
    }

    public void insertMemo() {
        // TODO Auto-generated method stub

    }
}
