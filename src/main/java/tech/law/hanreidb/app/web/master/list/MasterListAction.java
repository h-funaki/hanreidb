package tech.law.hanreidb.app.web.master.list;

import static tech.law.hanreidb.app.base.util.StaticImportUtil.toImmutable;

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
import tech.law.hanreidb.dbflute.exentity.CaseMark;
import tech.law.hanreidb.dbflute.exentity.Court;

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
                toImmutable(selectCaseMarkList())//
        );
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
            ImmutableList<CaseMark> caseMarkList) {
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

    private LabelValuePart convertToLabelValuePart(CDef cdef) {
        LabelValuePart part = new LabelValuePart();
        part.label = cdef.alias();
        part.value = cdef.code();
        return part;
    }
}
