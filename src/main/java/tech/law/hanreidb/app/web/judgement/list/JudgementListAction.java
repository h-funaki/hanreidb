package tech.law.hanreidb.app.web.judgement.list;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotEmpty;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotNull;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import javax.annotation.Resource;

import org.dbflute.cbean.result.PagingResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.JudgementPart;
import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.PagingPart;
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
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(JudgementListAction.class);

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
        return asJson(mappingToContent(selectJudgementPage(body)));
    }

    private PagingResultBean<Judgement> selectJudgementPage(JudgementListBody body) {
        logger.info(body.toString());
        PagingResultBean<Judgement> page = judgementBhv.selectPage(cb -> {
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

            cb.setupSelect_CaseMark();
            cb.specify().specifyCaseMark().columnCaseMarkAlias();
            cb.specify().specifyCaseMark().columnCourtTypeCode();
            cb.specify().specifyCaseMark().columnCaseCategoryCode();

            cb.setupSelect_Court();
            cb.specify().specifyCourt().columnCourtName();
            cb.specify().specifyCourt().columnCourtAlias();

            conditionBean(body, cb);

            cb.paging(30, body.page_number);

            cb.addOrderBy_PK_Asc();
        });
        judgementBhv.load(page, judgementLoader -> {
            judgementLoader.loadJudgementReportRel(relCB -> {
                relCB.specify().columnReportId();
                relCB.specify().columnReportGo();
                relCB.specify().columnReportKan();
                relCB.specify().columnReportKo();

                relCB.setupSelect_Report();
                relCB.specify().specifyReport().columnReportName();
                relCB.specify().specifyReport().columnReportAlias();
            });
        });
        return page;
    }

    private void conditionBean(JudgementListBody body, JudgementCB cb) {
        ifNotEmpty(body.bench_list).ifPresent(cdefList -> {
            cb.query().setBenchCode_InScope_AsBench(cdefList);
        });
        ifNotNull(body.case_mark_id).ifPresent(value -> {
            cb.query().setCaseMarkId_Equal(value);
        });
        ifNotBlank(body.case_name).ifPresent(value -> {
            cb.query().setCaseName_LikeSearch(value, op -> op.splitBySpaceContainsDoubleByte().likeContain());
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
        ifNotEmpty(body.court_id_list).ifPresent(list -> {
            cb.query().setCourtId_InScope(list);
        });
        if (body.judgement_date_from != null || body.judgement_date_to != null) {
            cb.query().setJudgementDate_FromTo(body.judgement_date_from, body.judgement_date_to, op -> op.allowOneSide());
        }
        ifNotEmpty(body.judgement_result_list).ifPresent(cdefList -> {
            cb.query().setJudgementResultCode_InScope_AsJudgementResult(cdefList);
        });
        ifNotEmpty(body.judgement_type_list).ifPresent(cdefList -> {
            cb.query().setJudgementTypeCode_InScope_AsJudgementType(cdefList);
        });
        ifNotEmpty(body.case_category_list).ifPresent(cdefList -> {
            cb.query().queryCaseMark().setCaseCategoryCode_InScope_AsCaseCategory(cdefList);
        });
        ifNotNull(body.report_id).ifPresent(value -> {
            cb.query().existsJudgementReportRel(reportRelCB -> {
                reportRelCB.query().setReportId_Equal(value);
            });
        });
        ifNotNull(body.report_kan).ifPresent(value -> {
            cb.query().existsJudgementReportRel(reportRelCB -> {
                reportRelCB.query().setReportKan_Equal(value);
            });
        });
        ifNotNull(body.report_ko).ifPresent(value -> {
            cb.query().existsJudgementReportRel(reportRelCB -> {
                reportRelCB.query().setReportKo_Equal(value);
            });
        });
        ifNotNull(body.report_go).ifPresent(value -> {
            cb.query().existsJudgementReportRel(reportRelCB -> {
                reportRelCB.query().setReportGo_Equal(value);
            });
        });
        ifNotBlank(body.search_word).ifPresent(value -> {
            cb.query().existsJudgementSourceRel(sourceRelCB -> {
                sourceRelCB.query().setJudgementSourceSentence_LikeSearch(value, op -> op.splitBySpaceContainsDoubleByte().likeContain());
            });
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private JudgementListContentResult mappingToContent(PagingResultBean<Judgement> page) {
        JudgementListContentResult result = new JudgementListContentResult();
        result.judgement_list = toImmutable(page).collect(this::convertToJudgementPart).castToList();
        result.paging_part = createPagingPart(page);
        return result;
    }

    private JudgementPart convertToJudgementPart(Judgement judgement) {
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
        judgementPart.original_judgement_public_code = judgementBhv.selectJudgementPublicCode(judgement.getJudgementId());

        judgementPart.report_part_list = toImmutable(judgement.getJudgementReportRelList()).collect(this::convertToReportPart).castToList();
        return judgementPart;
    }

    private PagingPart createPagingPart(PagingResultBean<Judgement> page) {
        PagingPart pagingPart = new PagingPart();
        pagingPart.all_record_count = page.getAllRecordCount();
        pagingPart.exists_next_page = page.existsNextPage();
        pagingPart.exists_previous_page = page.existsPreviousPage();
        pagingPart.all_page_count = page.getAllPageCount();
        pagingPart.current_page_number = page.getCurrentPageNumber();
        pagingPart.current_page_size = page.getPageSize();
        if (page.existsNextPage()) {
            pagingPart.next_page_number = page.getNextPageNumber();
        }
        if (page.existsPreviousPage()) {
            pagingPart.previous_page_number = page.getPreviousPageNumber();
        }
        return pagingPart;
    }

    private ReportPart convertToReportPart(JudgementReportRel rel) {
        ReportPart part = new ReportPart();
        part.report_id = rel.getReportId();
        part.report_name = rel.getReport().get().getReportName();
        part.report_alias = rel.getReport().get().getReportAlias();
        part.report_go = rel.getReportGo();
        part.report_kan = rel.getReportKan();
        part.report_ko = rel.getReportKo();
        return part;
    }
}