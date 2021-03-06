package tech.law.hanreidb.app.web.master.list;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import java.util.List;

import javax.annotation.Resource;

import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.master.list.MasterListContentResult.LabelValuePart;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtBhv;
import tech.law.hanreidb.dbflute.exbhv.LawCategoryBhv;
import tech.law.hanreidb.dbflute.exbhv.LawTypeBhv;
import tech.law.hanreidb.dbflute.exbhv.ReportBhv;
import tech.law.hanreidb.dbflute.exentity.CaseMark;
import tech.law.hanreidb.dbflute.exentity.Court;
import tech.law.hanreidb.dbflute.exentity.LawCategory;
import tech.law.hanreidb.dbflute.exentity.LawType;
import tech.law.hanreidb.dbflute.exentity.Report;

/**
 * @author h-funaki
 */
@AllowAnyoneAccess
public class MasterListAction extends HanreidbBaseAction {

    //private static final Logger logger = Logger.getLogger(MasterListAction.class.getName());

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CaseMarkBhv caseMarkBhv;
    @Resource
    private CourtBhv courtBhv;
    @Resource
    private ReportBhv reportBhv;
    @Resource
    private LawTypeBhv lawTypeBhv;
    @Resource
    private LawCategoryBhv lawCategoryBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<MasterListContentResult> index() {
        MasterListContentResult result = mappingToContent(//
                toImmutable(CDef.Era.listAll()), //
                toImmutable(CDef.Bench.listAll()), //
                toImmutable(CDef.JudgementResult.listAll()), //
                toImmutable(CDef.JudgementType.listAll()), //
                toImmutable(CDef.CaseCategory.listAll()), //
                toImmutable(CDef.CourtType.listAll()), //
                toImmutable(selectCourtList()), //
                toImmutable(selectCaseMarkList()), //
                toImmutable(selectReportlist()), //
                toImmutable(selectLawTypelist()), //
                toImmutable(selectLawCategorylist()));
        return asJson(result);
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private List<Court> selectCourtList() {
        return courtBhv.selectList(cb -> {
            cb.specify().columnCourtId();
            cb.specify().columnCourtName();
        });
    }

    private List<CaseMark> selectCaseMarkList() {
        return caseMarkBhv.selectList(cb -> {
            cb.specify().columnCaseMarkId();
            cb.specify().columnCaseMarkAlias();
        });
    }

    private List<Report> selectReportlist() {
        return reportBhv.selectList(cb -> {
            cb.specify().columnReportId();
            cb.specify().columnReportAlias();
        });
    }

    private List<LawType> selectLawTypelist() {
        return lawTypeBhv.selectList(cb -> {
            cb.specify().columnLawTypeCode();
            cb.specify().columnLawTypeAlias();
            cb.query().addOrderBy_DisplayOrder_Asc();
        });
    }

    private List<LawCategory> selectLawCategorylist() {
        return lawCategoryBhv.selectList(cb -> {
            cb.specify().columnLawCategoryId();
            cb.specify().columnLawCategoryAlias();
            cb.query().addOrderBy_LawCategoryId_Asc();
        });
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private MasterListContentResult mappingToContent(//
            ImmutableList<CDef.Era> eraList, //
            ImmutableList<CDef.Bench> benchList, //
            ImmutableList<CDef.JudgementResult> judgementResultList, //
            ImmutableList<CDef.JudgementType> judgementTypeList, //
            ImmutableList<CDef.CaseCategory> minkeiList, //
            ImmutableList<CDef.CourtType> courtTypeList, //
            ImmutableList<Court> courtList, //
            ImmutableList<CaseMark> caseMarkList, //
            ImmutableList<Report> reportList, //
            ImmutableList<LawType> lawTypeList, //
            ImmutableList<LawCategory> lawCategoryList) {
        // TODO h-funaki なぜかImmutableではjsonにはいらない (2017/12/17)
        MasterListContentResult content = new MasterListContentResult();
        content.era_list = eraList.collect(this::convertToLabelValuePart).castToList();
        content.bench_list = benchList.collect(this::convertToLabelValuePart).castToList();
        content.judgement_result_list = judgementResultList.collect(this::convertToLabelValuePart).castToList();
        content.judgement_type_list = judgementTypeList.collect(this::convertToLabelValuePart).castToList();
        content.case_category_list = minkeiList.collect(this::convertToLabelValuePart).castToList();
        content.court_type_list = courtTypeList.collect(this::convertToLabelValuePart).castToList();
        content.court_list = courtList.collect(this::convertToLabelValuePart).castToList();
        content.case_mark_list = caseMarkList.collect(this::convertToLabelValuePart).castToList();
        content.report_list = reportList.collect(this::convertToLabelValuePart).castToList();
        content.law_type_list = lawTypeList.collect(this::convertToLabelValuePart).castToList();
        content.law_category_list = lawCategoryList.collect(this::convertToLabelValuePart).castToList();
        return content;
    }

    private LabelValuePart convertToLabelValuePart(Court entity) {
        LabelValuePart part = new LabelValuePart();
        part.label = entity.getCourtName();
        part.value = entity.getCourtId().toString();
        return part;
    }

    private LabelValuePart convertToLabelValuePart(CaseMark entity) {
        LabelValuePart part = new LabelValuePart();
        part.label = entity.getCaseMarkAlias();
        part.value = entity.getCaseMarkId().toString();
        return part;
    }

    private LabelValuePart convertToLabelValuePart(Report entity) {
        LabelValuePart part = new LabelValuePart();
        part.label = entity.getReportAlias();
        part.value = entity.getReportId().toString();
        return part;
    }

    private LabelValuePart convertToLabelValuePart(LawType entity) {
        LabelValuePart part = new LabelValuePart();
        part.label = entity.getLawTypeAlias();
        part.value = entity.getLawTypeCode();
        return part;
    }

    private LabelValuePart convertToLabelValuePart(LawCategory entity) {
        LabelValuePart part = new LabelValuePart();
        part.label = entity.getLawCategoryAlias();
        part.value = entity.getLawCategoryId().toString();
        return part;
    }

    private LabelValuePart convertToLabelValuePart(CDef cdef) {
        LabelValuePart part = new LabelValuePart();
        part.label = cdef.alias();
        part.value = cdef.code();
        return part;
    }
}
