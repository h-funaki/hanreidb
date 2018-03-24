package tech.law.hanreidb.app.job.court.judgement.migrate;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.lastaflute.job.mock.MockJobRuntime;

import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.allcommon.CDef.Bench;
import tech.law.hanreidb.dbflute.allcommon.CDef.Era;
import tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Court;
import tech.law.hanreidb.dbflute.exentity.Judgement;
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
        judgementBhv.updateNonstrict(judgement);

        // ## Act ##
        Long originalPk = job.selectOriginalJudgementId(originalCaseNumber);

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
        String courtName1 = "最高裁判所第二小法廷";
        String courtName2 = "千葉地方裁判所";
        String courtName3 = "裁判所";

        // ## Act ##
        OptionalEntity<Court> courtOpt1 = job.selectCourtOpt(courtName1);
        OptionalEntity<Court> courtOpt2 = job.selectCourtOpt(courtName2);
        OptionalEntity<Court> courtOpt3 = job.selectCourtOpt(courtName3);

        // ## Assert ##

        softly.then(courtOpt1.isPresent()).as("").isTrue();
        softly.then(courtOpt2.isPresent()).as("").isTrue();
        softly.then(courtOpt3.isPresent()).as("").isFalse();
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
    public void test_事件番号のパース() {
        // ## Arrange ##
        CourtJudgementMigrateJob job = new CourtJudgementMigrateJob();
        inject(job);
        String caseNumber1 = "平成15(ネ)1504";
        String caseNumber2 = "平成16(行コ)14";

        // ## Act ##
        Era era1 = job.extractEra(caseNumber1);
        Integer year1 = job.extractYear(caseNumber1);
        Integer caseMarkId1 = job.extractCaseMarkId(caseNumber1);
        Integer serialNumber1 = job.extractSerialNumber(caseNumber1);

        Era era2 = job.extractEra(caseNumber2);
        Integer year2 = job.extractYear(caseNumber2);
        Integer caseMarkId2 = job.extractCaseMarkId(caseNumber2);
        Integer serialNumber2 = job.extractSerialNumber(caseNumber2);

        // ## Assert ##
        String caseMarkName1 = caseMarkBhv.selectByPK(caseMarkId1).get().getCaseMarkName();
        String caseMarkName2 = caseMarkBhv.selectByPK(caseMarkId2).get().getCaseMarkName();

        softly.then(era1).as("").isEqualTo(CDef.Era.平成);
        softly.then(year1).as("").isEqualTo(15);
        softly.then(caseMarkName1).as("").isEqualTo("ネ");
        softly.then(serialNumber1).as("").isEqualTo(1504);

        softly.then(era2).as("").isEqualTo(CDef.Era.平成);
        softly.then(year2).as("").isEqualTo(16);
        softly.then(caseMarkName2).as("").isEqualTo("行コ");
        softly.then(serialNumber2).as("").isEqualTo(14);
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
