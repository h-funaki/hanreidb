package tech.law.hanreidb.app.web.judgement.get;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.judgement.get.JudgementGetContentResult.CaseMarkPart;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.dbflute.exentity.JudgementSourceRel;

/**
 * @author h-funaki
 */
@AllowAnyoneAccess
public class JudgementGetAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<JudgementGetContentResult> index(String judgementPublicCode) {
        return asJson(mappingToContent(selectJudgement(judgementPublicCode)));
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private Judgement selectJudgement(String judgementPublicCode) {
        Judgement judgement = judgementBhv.selectEntityWithDeletedCheck(cb -> {
            cb.acceptUniqueOf(judgementPublicCode);
            cb.setupSelect_CaseMark();

            cb.setupSelect_CaseMark().withClsCaseCategory();

            cb.setupSelect_CaseMark().withClsCourtType();

            cb.setupSelect_Court();

            cb.setupSelect_ClsJudgementResult();

            cb.setupSelect_ClsJudgementType();

            cb.setupSelect_ClsBench();
        });
        judgementBhv.load(judgement, baseLoader -> {
            baseLoader.loadJudgementReportRel(reportRelCB -> {
                reportRelCB.setupSelect_Report();
            });
            baseLoader.loadJudgementSourceRel(sourceRelCB -> {
                sourceRelCB.setupSelect_ClsSource();
            });
        });
        return judgement;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private JudgementGetContentResult mappingToContent(Judgement judgement) {
        JudgementGetContentResult content = new JudgementGetContentResult();
        content.judgement_id = judgement.getJudgementId();
        content.judgement_public_code = judgement.getJudgementPublicCode();
        content.case_name = judgement.getCaseName();
        content.judgement_date = judgement.getJudgementDate();
        content.original_judgement_id = judgement.getOriginalJudgementId();
        content.court_id = judgement.getCourtId();
        content.court_name = judgement.getCourt().get().getCourtName();
        ifNotNull(judgement.getBenchCodeAsBench()).ifPresent(bench -> {
            content.bench_code = bench.code();
            content.bench_alias = bench.alias();
        });
        ifNotNull(judgement.getJudgementResultCodeAsJudgementResult()).ifPresent(result -> {
            content.judgement_result_code = result.code();
            content.judgement_result_alias = result.alias();
        });
        ifNotNull(judgement.getJudgementTypeCodeAsJudgementType()).ifPresent(type -> {
            content.judgement_type_code = type.code();
            content.judgement_type_alias = type.alias();
        });
        // 判決文
        List<JudgementSourceRel> sourceRelList = judgement.getJudgementSourceRelList();
        for (JudgementSourceRel rel : sourceRelList) {
            if (rel.isSourceCode裁判所裁判例()) {
                content.sentence = rel.getJudgementSourceSentence();
                break;
            } // 裁判所裁判例以外は無視する。(追加次第優先順位を検討する必要がるため。)
        }
        content.version_no = judgement.getVersionNo();

        // 事件番号part
        content.case_mark_part = convertToCaseMarkPart(judgement);

        return content;
    }

    // ===================================================================================
    //                                                                             Convert
    //                                                                             =======
    private CaseMarkPart convertToCaseMarkPart(Judgement judgement) {
        CaseMarkPart part = new CaseMarkPart();
        part.case_number_era_code = judgement.getCaseNumberEraCode();
        part.case_number_era_alias = judgement.getCaseNumberEraCodeAsEra().alias();
        part.case_number_year = judgement.getCaseNumberYear();
        part.case_mark_id = judgement.getCaseMarkId();
        part.case_mark_alias = judgement.getCaseMark().get().getCaseMarkAlias();
        part.case_number_serial_number = judgement.getCaseNumberSerialNumber();
        return part;
    }

}