package tech.law.hanreidb.app.web.law.get;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.law.get.LawGetContentResult.LawCategoryPart;
import tech.law.hanreidb.app.web.law.get.LawGetContentResult.SourcePart;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exentity.ClsSource;
import tech.law.hanreidb.dbflute.exentity.Law;
import tech.law.hanreidb.dbflute.exentity.LawCategory;
import tech.law.hanreidb.dbflute.exentity.LawCategoryRel;
import tech.law.hanreidb.dbflute.exentity.LawContent;
import tech.law.hanreidb.dbflute.exentity.LawHistory;
import tech.law.hanreidb.dbflute.exentity.LawSourceRel;
import tech.law.hanreidb.dbflute.exentity.LawType;

/**
 * @author h-funaki
 */
@AllowAnyoneAccess
public class LawGetAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(LawGetAction.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawBhv lawBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LawGetContentResult> index(String law_public_code) {
        return asJson(mappingToContent(selectLaw(law_public_code)));
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private Law selectLaw(String law_public_code) {
        Law law = lawBhv.selectEntityWithDeletedCheck(cb -> {
            cb.setupSelect_LawType();
            cb.query().setLawPublicCode_Equal(law_public_code);
        });
        lawBhv.load(law, lawLoader -> {
            lawLoader.loadLawAlias(aliasCB -> {});
            lawLoader.loadLawCategoryRel(categoryRelCB -> {
                categoryRelCB.setupSelect_LawCategory();
            });
            lawLoader.loadLawHistoryByLawId(historyCB -> {
                historyCB.setupSelect_LawContentAsOne();
            });
            lawLoader.loadLawSourceRel(sourceRelCB -> {
                sourceRelCB.setupSelect_ClsSource();
            });
        });
        return law;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private LawGetContentResult mappingToContent(Law law) {
        LawGetContentResult content = new LawGetContentResult();
        content.law_public_code = law.getLawPublicCode();
        content.law_name = law.getLawName();
        content.law_number = law.getLawNumber();
        content.promulgation_date = law.getPromulgationDate();
        content.effective_date = law.getEffectiveDate();
        content.law_alias_list = law.getLawAliasListAsStringList();

        LawType lawType = law.getLawType().get();
        content.law_type_code = lawType.getLawTypeCode();
        content.law_type_alias = lawType.getLawTypeAlias();

        List<SourcePart> sourcePartList = newArrayList();
        for (LawSourceRel rel : law.getLawSourceRelList()) {
            SourcePart sourcePart = new SourcePart();
            ClsSource clsSource = rel.getClsSource().get();
            sourcePart.source_code = clsSource.getSourceCode();
            sourcePart.source_alias = clsSource.getSourceAlias();
        }
        content.source_part_list = sourcePartList;

        List<LawCategoryPart> lawCategoryPartList = newArrayList();
        for (LawCategoryRel rel : law.getLawCategoryRelList()) {
            LawCategory lawCategory = rel.getLawCategory().get();
            LawCategoryPart categoryPart = new LawCategoryPart();
            categoryPart.law_category_id = lawCategory.getLawCategoryId();
            categoryPart.law_category_alias = lawCategory.getLawCategoryAlias();
            lawCategoryPartList.add(categoryPart);
        }
        content.law_category_part_list = lawCategoryPartList;

        LawHistory lawHistory = law.getLawHistoryByLawIdList().get(0);
        content.law_amend_version = lawHistory.getLawAmendVersion();
        content.latest_version_flg = lawHistory.getLatestVersionFlg();

        LawContent lawContent = lawHistory.getLawContentAsOne().get();
        content.law_content_view_xml = lawContent.getLawContentViewXml();

        return content;
    }
}
