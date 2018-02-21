package tech.law.hanreidb.app.web.judgement.list;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotNull;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.JudgementPart;
import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.ReportPart;
import tech.law.hanreidb.dbflute.cbean.JudgementCB;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.dbflute.exentity.JudgementReportRel;

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
    //                                                                             =======
    @Execute
    public JsonResponse<JudgementListContentResult> index(JudgementListBody body) {
        return asJson(mappingToContent(selectJudgementList(body)));
    }

    private ImmutableList<Judgement> selectJudgementList(JudgementListBody body) {
        ListResultBean<Judgement> list = judgementBhv.selectList(cb -> {
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
            cb.specify().columnJudgementResultCode();
            cb.specify().columnJudgementTypeCode();
            cb.specify().columnOriginalJudgementId();
            cb.specify().columnSentence();

            cb.setupSelect_CaseMark();
            cb.specify().specifyCaseMark().columnCaseMarkAlias();
            cb.specify().specifyCaseMark().columnCourtTypeCode();
            cb.specify().specifyCaseMark().columnCaseCategoryCode();

            cb.setupSelect_Court();
            cb.specify().specifyCourt().columnCourtName();
            cb.specify().specifyCourt().columnCourtAlias();

            conditionBean(body, cb);

            cb.addOrderBy_PK_Asc();
        });
        judgementBhv.load(list, judgementLoader -> {
            judgementLoader.loadJudgementReportRel(relCB -> {
                relCB.specify().columnReportGo();
                relCB.specify().columnReportKan();
                relCB.specify().columnReportKo();

                relCB.setupSelect_Report();
                relCB.specify().specifyReport().columnReportName();
                relCB.specify().specifyReport().columnReportAlias();
            });
        });
        return toImmutable(list);
    }

    private void conditionBean(JudgementListBody body, JudgementCB cb) {
        ifNotNull(body.bench).ifPresent(value -> {
            cb.query().setBenchCode_Equal_AsBench(value);
        });
        ifNotNull(body.case_mark_id).ifPresent(value -> {
            cb.query().setCaseMarkId_Equal(value);
        });
        ifNotNull(body.case_name).ifPresent(value -> {
            cb.query().setCaseName_LikeSearch(value, op -> op.likeContain());
        });
        ifNotNull(body.case_number_era).ifPresent(value -> {
            cb.query().setCaseNumberEraCode_Equal_AsEra(value);
        });
        ifNotNull(body.case_number_serial_number).ifPresent(value -> {
            cb.query().setCaseNumberSerialNumber_Equal(value);
        });
        ifNotNull(body.case_number_year).ifPresent(value -> {
            cb.query().setCaseNumberYear_Equal(value);
        });
        ifNotNull(body.court_id).ifPresent(value -> {
            cb.query().setCourtId_Equal(value);
        });
        if (body.judgement_date_from != null || body.judgement_date_to != null) {
            cb.query().setJudgementDate_FromTo(body.judgement_date_from, body.judgement_date_to, op -> op.allowOneSide());

        }
        ifNotNull(body.judgement_public_code).ifPresent(value -> {
            cb.query().setJudgementPublicCode_Equal(value);
        });
        ifNotNull(body.judgement_result).ifPresent(value -> {
            cb.query().setJudgementResultCode_Equal_AsJudgementResult(value);
        });
        ifNotNull(body.judgement_type).ifPresent(value -> {
            cb.query().setJudgementTypeCode_Equal_AsJudgementType(value);
        });

        // TODO report_condition
        //        ifNotNull(body.judgement_reports_go).ifPresent(value -> {
        //            cb.query().setJudgementReportsGo_Equal(value);
        //        });
        //        ifNotNull(body.judgement_reports_ko).ifPresent(value -> {
        //            cb.query().setJudgementReportsKo_Equal(value);
        //        });
        //        ifNotNull(body.precedent_reports_go).ifPresent(value -> {
        //            cb.query().setPrecedentReportsGo_Equal(value);
        //        });
        //        ifNotNull(body.precedent_reports_kan).ifPresent(value -> {
        //            cb.query().setPrecedentReportsKan_Equal(value);
        //        });
        //        ifNotNull(body.precedent_reports_ko).ifPresent(value -> {
        //            cb.query().setPrecedentReportsKo_Equal(value);
        //        });
        // TODO sentence condition
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
        ifNotNull(judgement.getJudgementResultCodeAsJudgementResult()).ifPresent(value -> {
            judgementPart.judgement_result_alias = value.alias();
            judgementPart.judgement_result_code = value.code();
        });
        ifNotNull(judgement.getJudgementTypeCodeAsJudgementType()).ifPresent(value -> {
            judgementPart.judgement_type_alias = value.alias();
            judgementPart.judgement_type_code = value.code();
        });
        judgementPart.original_judgement_id = judgement.getJudgementId();

        judgementPart.report_part_list = toImmutable(judgement.getJudgementReportRelList()).collect(this::convertToReportPart).castToList();
        judgementPart.sentence = judgement.getSentence();
        return judgementPart;
    }

    private ReportPart convertToReportPart(JudgementReportRel rel) {
        ReportPart part = new ReportPart();
        part.report_name = rel.getReport().get().getReportName();
        part.report_alias = rel.getReport().get().getReportAlias();
        part.report_go = rel.getReportGo();
        part.report_kan = rel.getReportKan();
        part.report_ko = rel.getReportKo();
        return part;
    }
}