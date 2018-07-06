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
import tech.law.hanreidb.dbflute.exentity.Court;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.dbflute.exentity.JudgementSourceRel;
import tech.law.hanreidb.mylasta.direction.HanreidbConfig;

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
    @Resource
    private HanreidbConfig config;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<JudgementGetContentResult> index(String judgementPublicCode) {
        return asJson(mappingToContent(judgementBhv.selectJudgement(judgementPublicCode)));
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
        judgement.getJudgementSelf().ifPresent(self -> {
            content.original_judgement_public_code = judgementBhv.selectJudgementPublicCode(self.getJudgementId());
            content.original_judgement_case_mark_part = convertToCaseMarkPart(self);
        });

        judgementBhv.selectAppealJudgementPublicCode(judgement.getJudgementPublicCode()).ifPresent(appeal -> {
            content.appeal_judgement_public_code = appeal.getJudgementPublicCode();
            content.appeal_judgement_case_mark_part = convertToCaseMarkPart(appeal);
        });

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
                // TODO あとで綺麗にする
                content.sentence = rel.getJudgementSourceSentence();
                String judgementSourceId = String.format("%06d", Integer.parseInt(rel.getJudgementSourceId()));
                content.court_file_url =
                        config.getCourtFileBaseUrl().concat(judgementSourceId.substring(3)).concat("/").concat(judgementSourceId).concat(
                                "_hanrei.pdf");
                content.court_web_url = getCourtWebUrl(judgement.getCourt().get(), judgementSourceId);
                break;
            } // 裁判所裁判例以外は無視する。(追加次第優先順位を検討する必要があるため。)
        }
        content.version_no = judgement.getVersionNo();

        // 事件番号part
        content.case_mark_part = convertToCaseMarkPart(judgement);

        return content;
    }

    private String getCourtWebUrl(Court court, String judgementSourceId) {
        if (court.isCourtTypeCode最高裁判所()) {
            return getCourtWebUrl(judgementSourceId, "2");
        } else if (court.isCourtTypeCode高等裁判所()) {
            return getCourtWebUrl(judgementSourceId, "3");
        } else if (court.isCourtTypeCode高等裁判所()) {
            return getCourtWebUrl(judgementSourceId, "4");
        } else {
            return null;
        }
    }

    private String getCourtWebUrl(String judgementSourceId, String detail) {
        return config.getCourtWebBaseUrl().concat("detail").concat(detail).concat("?id=").concat(judgementSourceId);
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