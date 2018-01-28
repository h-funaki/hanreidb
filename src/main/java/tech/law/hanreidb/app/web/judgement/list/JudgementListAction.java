package tech.law.hanreidb.app.web.judgement.list;

import static tech.law.hanreidb.app.base.StaticImportUtil.ifNotNull;
import static tech.law.hanreidb.app.base.StaticImportUtil.toImmutable;

import javax.annotation.Resource;

import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.JudgementPart;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Judgement;

/**
 * @author jflute
 */
@AllowAnyoneAccess
public class JudgementListAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    //@Resource
    //private HanreidbLoginAssist loginAssist;
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                            =======
    @Execute
    public JsonResponse<JudgementListContentResult> index() {
        return asJson(mappingToContent(selectJudgementList()));
    }

    private ImmutableList<Judgement> selectJudgementList() {
        return toImmutable(judgementBhv.selectList(cb -> {
            cb.specify().columnBenchCode();
            cb.specify().columnCaseMarkId();
            cb.specify().columnCaseName();
            cb.specify().columnCaseNumberEraCode();
            cb.specify().columnCaseNumberSerialNumber();
            cb.specify().columnCaseNumberYear();
            cb.specify().columnCourtId();
            cb.specify().columnJudgementDate();
            cb.specify().columnJudgementId();
            cb.specify().columnJudgementPublicCode();
            cb.specify().columnJudgementReportsGo();
            cb.specify().columnJudgementReportsKo();
            cb.specify().columnJudgementResultCode();
            cb.specify().columnJudgementTypeCode();
            cb.specify().columnOriginalJudgementId();
            cb.specify().columnPrecedentReportsGo();
            cb.specify().columnPrecedentReportsKan();
            cb.specify().columnPrecedentReportsKo();

            cb.setupSelect_CaseMark();
            cb.specify().specifyCaseMark().columnCaseMarkAlias();
            cb.specify().specifyCaseMark().columnCourtTypeCode();
            cb.specify().specifyCaseMark().columnCaseCategoryCode();

            cb.setupSelect_Court();
            cb.specify().specifyCourt().columnCourtName();
            cb.specify().specifyCourt().columnCourtAlias();

            cb.addOrderBy_PK_Asc();
        }));
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private JudgementListContentResult mappingToContent(ImmutableList<Judgement> judgementList) {
        JudgementListContentResult judgementListContentResult = new JudgementListContentResult();
        judgementListContentResult.judgement_list = judgementList.collect(this::mappingToPart).castToList();
        return judgementListContentResult;
    }

    private JudgementPart mappingToPart(Judgement judgement) {
        JudgementPart judgementPart = new JudgementPart();
        ifNotNull(judgement.getBenchCodeAsBench()).ifPresent(value -> {
            judgementPart.bench_code = value.code();
            judgementPart.bench_alias = value.alias();
        });
        judgementPart.case_name = judgement.getCaseName();
        judgementPart.case_mark_alias = judgement.getCaseMark().get().getCaseMarkAlias();
        judgementPart.case_mark_id = judgement.getCaseMarkId();
        judgementPart.case_number_era_code = judgement.getCaseNumberEraCodeAsEra().code();
        judgementPart.case_number_era_alias = judgement.getCaseNumberEraCodeAsEra().alias();
        judgementPart.case_number_serial_number = judgement.getCaseNumberSerialNumber();
        judgementPart.case_number_year = judgement.getCaseNumberYear();
        judgementPart.court_id = judgement.getCourtId();
        judgementPart.court_name = judgement.getCourt().get().getCourtName();
        judgementPart.court_alias = judgement.getCourt().get().getCourtAlias();
        judgementPart.judgement_date = judgement.getJudgementDate();
        judgementPart.judgement_id = judgement.getJudgementId();
        judgementPart.judgement_public_code = judgement.getJudgementPublicCode();
        judgementPart.judgement_reports_go = judgement.getJudgementReportsGo();
        judgementPart.judgement_reports_ko = judgement.getJudgementReportsKo();
        ifNotNull(judgement.getJudgementResultCodeAsJudgementResult()).ifPresent(value -> {
            judgementPart.judgement_result_alias = value.alias();
            judgementPart.judgement_result_code = value.code();
        });
        ifNotNull(judgement.getJudgementTypeCodeAsJudgementType()).ifPresent(value -> {
            judgementPart.judgement_type_alias = value.alias();
            judgementPart.judgement_type_code = value.code();
        });
        judgementPart.original_judgement_id = judgement.getJudgementId();
        judgementPart.precedent_reports_go = judgement.getPrecedentReportsGo();
        judgementPart.precedent_reports_kan = judgement.getPrecedentReportsKan();
        judgementPart.precedent_reports_ko = judgement.getPrecedentReportsKo();
        return judgementPart;
    }
}