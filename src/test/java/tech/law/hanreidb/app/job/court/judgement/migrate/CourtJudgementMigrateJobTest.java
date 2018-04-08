package tech.law.hanreidb.app.job.court.judgement.migrate;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newImmutableList;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.job.mock.MockJobRuntime;

import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.allcommon.CDef.Bench;
import tech.law.hanreidb.dbflute.allcommon.CDef.Era;
import tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Court;
import tech.law.hanreidb.dbflute.exentity.CourtJudgement;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.dbflute.exentity.JudgementReportRel;
import tech.law.hanreidb.unit.NxJobTestCase;

public class CourtJudgementMigrateJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CaseMarkBhv caseMarkBhv;
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に実行されること() throws Exception {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = mockRuntime(job);
        job.run(runtime);

        // ## Assert ##
        showEndTitleRoll(runtime); // end-title-rollの中身を目視するため
        assertPlannedSuccess(runtime); // 計画通りの成功であることをアサート
    }

    // -----------------------------------------------------
    //                                            原審PKの取得
    //                                            ----------
    public void test_原審PKの取得() throws Exception {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        Judgement judgement = new Judgement();
        judgement.setJudgementId(1L);
        String originalCaseNumber = "平成12(行ケ)239";
        judgement.setCaseNumberEraCode_平成();
        judgement.setCaseNumberYear(12);
        judgement.setCaseMarkId(29);
        judgement.setCaseNumberSerialNumber(239);
        String courtName = "東京高等裁判所";
        judgement.setCourtId(job.selectCourtOpt(courtName).get().getCourtId());

        // ## Act ##
        Long originalPk = job.selectOriginalJudgementId(originalCaseNumber, courtName);

        // ## Assert ##
        softly.then(originalPk).as("").isEqualTo(1L);
    }

    // -----------------------------------------------------
    //                                            裁判所名取得
    //                                            ----------
    public void test_裁判所名の取得() throws Exception { // e.g. 最高裁判所第二小法廷, 千葉地方裁判所
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);

        // ## Act ##
        OptionalEntity<Court> courtOpt1 = job.selectCourtOpt("最高裁判所第二小法廷");
        OptionalEntity<Court> courtOpt2 = job.selectCourtOpt("千葉地方裁判所 　刑事第2部");
        OptionalEntity<Court> courtOpt3 = job.selectCourtOpt("大分地方裁判所 　中津支部");
        OptionalEntity<Court> courtOpt4 = job.selectCourtOpt("裁判所");

        // ## Assert ##

        softly.then(courtOpt1.isPresent()).as("").isTrue();
        softly.then(courtOpt2.isPresent()).as("").isTrue();
        softly.then(courtOpt3.isPresent()).as("").isTrue();
        softly.then(courtOpt4.isPresent()).as("").isFalse();
    }

    // -----------------------------------------------------
    //                                              法廷の取得
    //                                              --------
    public void test_法廷の取得() throws Exception { // e.g. 最高裁判所第二小法廷
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        String courtName1 = "最高裁判所大法廷";
        String courtName2 = "最高裁判所第一小法廷";
        String courtName3 = "最高裁判所第二小法廷";
        String courtName4 = "最高裁判所第三小法廷";

        // ## Act ##
        Bench bench1 = job.extractBench(courtName1);
        Bench bench2 = job.extractBench(courtName2);
        Bench bench3 = job.extractBench(courtName3);
        Bench bench4 = job.extractBench(courtName4);

        // ## Assert ##
        softly.then(bench1).as("").isEqualTo(CDef.Bench.大法廷);
        softly.then(bench2).as("").isEqualTo(CDef.Bench.第一小法廷);
        softly.then(bench3).as("").isEqualTo(CDef.Bench.第二小法廷);
        softly.then(bench4).as("").isEqualTo(CDef.Bench.第三小法廷);
    }

    // -----------------------------------------------------
    //                                              和暦の変換
    //                                              --------
    public void test_和暦の変換() throws Exception {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        String japaneseDate1 = "平成10年10月18日";
        String japaneseDate2 = "昭和64年1月1日";

        // ## Act ##
        LocalDate localDate1 = job.convertToWesternLocalDate(japaneseDate1);
        LocalDate localDate2 = job.convertToWesternLocalDate(japaneseDate2);

        // ## Assert ##
        softly.then(localDate1).as("").isEqualTo(LocalDate.of(1998, 10, 18));
        softly.then(localDate2).as("").isEqualTo(LocalDate.of(1989, 1, 1));
    }

    // -----------------------------------------------------
    //                                         事件番号のパース
    //                                         -------------
    public void test_事件番号正規表現() {
        // ## Assert ##
        softly.then("平成16(ネ)3324".matches(CourtJudgementMigrateJob.CASE_NUMBER_PATTERN)).isTrue();
        softly.then("平成17特(わ)3838".matches(CourtJudgementMigrateJob.CASE_NUMBER_PATTERN)).isTrue();
        softly.then("昭和16(ネ)3324等".matches(CourtJudgementMigrateJob.CASE_NUMBER_PATTERN)).isTrue();
        softly.then("平成17特(わ)3838等".matches(CourtJudgementMigrateJob.CASE_NUMBER_PATTERN)).isTrue();
        softly.then("平成17特(わ)新3838等".matches(CourtJudgementMigrateJob.CASE_NUMBER_PATTERN)).isTrue();
    }

    public void test_事件番号のパース() {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        ImmutableList<String> list = newImmutableList("平成15(ネ)123", "平成15(行コ)123等", "平成15特(わ)123", "平成15(を)新123");

        // ## Act ##
        for (String caseNumber : list) {
            softly.then(job.isPatternOfCaseNumber(caseNumber)).as("").isTrue();
            Era era = job.extractEra(caseNumber);
            Integer year = job.extractYear(caseNumber);
            Integer caseMarkId = job.extractCaseMarkId(caseNumber);
            Integer serialNumber = job.extractSerialNumber(caseNumber);
            caseMarkBhv.selectByPK(caseMarkId).alwaysPresent(caseMark -> {
                softly.then(newImmutableList("ネ", "行コ", "特わ", "を新")).as("").contains(caseMark.getCaseMarkName());
            });

            // ## Assert ##
            softly.then(era).as("").isEqualTo(CDef.Era.平成);
            softly.then(year).as("").isEqualTo(15);
            softly.then(serialNumber).as("").isEqualTo(123);
        }
    }

    // -----------------------------------------------------
    //                                                 判例集
    //                                                 -----
    public void test_判例集のパース() {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);

        // ## Act ##
        job.parseReport(new JudgementReportRel(), "集民　第28号407頁");
        job.parseReport(new JudgementReportRel(), "第62巻4号1頁");
    }

    public void test_判例集正規表現() {
        softly.then("集民　第28号407頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isTrue();
        softly.then("集民 第28号407頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isTrue();
        softly.then("民集　第70巻2号470頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isTrue();
        softly.then("第70巻2号470頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isFalse();
        softly.then("民集　2号470頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isFalse();
        softly.then("民集第700012号123頁".matches(CourtJudgementMigrateJob.REPORT_PATTERN)).isFalse();
    }

    // -----------------------------------------------------
    //                                       Public Code 採番
    //                                       ---------------
    public void test_PublicCode採番() {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);

        // ## Act ##
        String publicCode = job.makeNextPublicCode();

        // ## Assert ##
        log(publicCode);
    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
    // -----------------------------------------------------
    //                                         事件番号のパース
    //                                         -------------
    public void test_事件番号のパースに失敗() {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        //        String caseNumber1 = "平?15(ネ)1504";
        //        String caseNumber2 = " 平成(行コ)14";
        //        String caseNumber3 = " (行コ)14";
        //        String caseNumber4 = " 平成16()14";
        //        String caseNumber5 = " 平成16(行コ)14等";

        // ## Act ##
    }

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    private Judgement prepareJudgement(String publicCode) {
        Judgement judgement = new Judgement();
        judgement.setJudgementPublicCode(publicCode);
        judgement.setCaseNumberEraCode_平成();
        judgement.setCaseNumberYear(25);
        judgement.setCaseMarkId(1);
        judgement.setCaseNumberSerialNumber(123);
        judgement.setCourtId(1);
        judgementBhv.insert(judgement);
        return judgement;
    }

    private CourtJudgement createCourtJudgement() {
        CourtJudgement courtJudgement = new CourtJudgement();
        courtJudgement.setCaseNumber("CASE_NUMBER");
        courtJudgement.setSourceOriginalId(1);
        return courtJudgement;
    }

    // ===================================================================================
    //                                                                                Mock
    //                                                                                ====
    //===================================================================================
    //                                                                       Small Helper
    //                                                                       ============
    // NxBatchRecorderを取得する
    //    private JobRecorder getRecorder(MockJobRuntime runtime) {
    //        return (JobRecorder) runtime.getEndTitleRollMap().get("recorder");
    //    }
}
