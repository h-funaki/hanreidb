package tech.law.hanreidb.app.web.judgement.list;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.JudgementPart;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.allcommon.CDef.JudgementResult;
import tech.law.hanreidb.dbflute.allcommon.CDef.JudgementType;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class JudgementListActionTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に検索されること_条件なし() throws Exception {
        // ## Arrange ##
        JudgementListAction action = new JudgementListAction();
        inject(action);

        // ## Act ##
        List<JudgementPart> judgementList = action.index(new JudgementListBody()).getJsonResult().judgement_list;

        // ## Assert ##
        assertHasAnyElement(judgementList);
    }

    public void test_正常に検索されること_条件あり() throws Exception { // TODO h-funaki 指定する条件ごとにテストをわける (2018/02/04)
        // ## Arrange ##
        JudgementListAction action = new JudgementListAction();
        inject(action);

        Judgement entity = new Judgement();
        CDef.Bench bench = CDef.Bench.大法廷;
        Integer caseMarkId = 1;
        CDef.Era era = CDef.Era.平成;
        String caseName = "けっこう大変な事件";
        Integer caseNumberSerialNumber = 1;
        Integer caseNumberYear = 20;
        Integer courtId = 2;
        LocalDate judgementDate = LocalDate.of(2000, 1, 1);
        //        Integer judgementReportsGo = 3;
        //        Integer judgementReportsKo = 4;
        JudgementResult judgementResult = CDef.JudgementResult.却下;
        String judgementPublicCode = "TEST_CODE";
        JudgementType judgementType = CDef.JudgementType.判決;
        Integer precedentReportsKan = 5;
        Integer precedentReportsGo = 6;
        Integer precedentReportsKo = 7;
        //String sentence = "色々あって却下";
        entity.setBenchCodeAsBench(bench);
        entity.setCaseMarkId(caseMarkId);
        entity.setCaseNumberEraCodeAsEra(era);
        entity.setCaseName(caseName);
        entity.setCaseNumberYear(caseNumberYear);
        entity.setCaseNumberSerialNumber(caseNumberSerialNumber);
        entity.setCourtId(courtId);
        entity.setJudgementDate(judgementDate);
        //        entity.setJudgementReportsGo(judgementReportsGo);
        //        entity.setJudgementReportsKo(judgementReportsKo);
        entity.setJudgementResultCodeAsJudgementResult(judgementResult);
        entity.setJudgementPublicCode(judgementPublicCode);
        entity.setJudgementTypeCodeAsJudgementType(judgementType);
        //        entity.setPrecedentReportsKan(precedentReportsKan);
        //        entity.setPrecedentReportsGo(precedentReportsGo);
        //        entity.setPrecedentReportsKo(precedentReportsKo);
        //entity.setSentence(sentence);
        judgementBhv.insert(entity);

        JudgementListBody body = new JudgementListBody();
        //        body.bench = bench;
        body.case_mark_id = caseMarkId;
        body.case_name = caseName;
        body.case_number_era = era;
        body.case_number_serial_number = caseNumberSerialNumber;
        body.case_number_year = caseNumberYear;
        //        body.court_id = courtId;
        body.judgement_date_from = judgementDate.minusDays(1L);
        body.judgement_date_to = judgementDate.plusDays(1L);
        //        body.judgement_result = judgementResult;
        //        body.judgement_type = judgementType;
        body.report_go = precedentReportsGo;
        body.report_kan = precedentReportsKan;
        body.report_ko = precedentReportsKo;
        //        body.report_id = 
        // TODO h-funaki sentence condition (2018/02/10)

        // ## Act ##
        List<JudgementPart> judgementList = action.index(body).getJsonResult().judgement_list;

        // ## Assert ##
        assertHasAnyElement(judgementList);
        judgementList.forEach(judgement -> {
            assertEquals(bench.code(), judgement.bench_code);
            assertEquals(caseMarkId, judgement.case_mark_id);
            assertEquals(caseName, judgement.case_name);
            assertEquals(era.code(), judgement.case_number_era_code);
            assertEquals(caseNumberSerialNumber, judgement.case_number_serial_number);
            assertEquals(caseNumberYear, judgement.case_number_year);
            assertEquals(courtId, judgement.court_id);
            assertTrue(judgement.judgement_date.isAfter(body.judgement_date_from));
            assertTrue(judgement.judgement_date.isBefore(body.judgement_date_to));
            //            assertEquals(judgementReportsGo, judgement.judgement_reports_go);
            //            assertEquals(judgementReportsKo, judgement.judgement_reports_ko);
            assertEquals(judgementResult.code(), judgement.judgement_result_code);
            assertEquals(judgementType.code(), judgement.judgement_type_code);
            //            assertEquals(precedentReportsGo, judgement.precedent_reports_go);
            //            assertEquals(precedentReportsKan, judgement.precedent_reports_kan);
            //            assertEquals(precedentReportsKo, judgement.precedent_reports_ko);
        });
    }
}
