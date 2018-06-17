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
import tech.law.hanreidb.remote.egov.RemoteEgovBhv;

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
    @Resource
    private RemoteEgovBhv remoteEgovBhv;

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
            sourcePartList.add(sourcePart);
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

        LawHistory lawHistory = law.getLawHistoryByLawIdList().get(0); // 50件法令履歴がないので、ないやつはそもそも一覧で返さないようにする。
        content.law_amend_version = lawHistory.getLawAmendVersion();
        content.latest_version_flg = lawHistory.getLatestVersionFlg();

        LawContent lawContent = lawHistory.getLawContentAsOne().get();

        content.law_content_view_xml = toXml(lawContent.getLawContentViewXml());

        return content;
    }

    public String toXml(String rawXml) {
        String viewXml = rawXml.replaceFirst("<LawTitle>.*</LawTitle>", "") // 法令名 e.g. 牧野法
                .replaceFirst("<TOCLabel>目次</TOCLabel>", "") // "目次"
                .replaceAll("(<TOCChapter[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<a href=\"#chapter$2\">$1$2$3") // 目次のリンク(開始タグ)
                .replaceAll("</TOCChapter>", "</TOCChapter></a>") // 目次のリンク(終了タグ)
                .replaceAll("</ArticleRange>", "</ArticleRange><br>") // 目次の条文範囲ごとの改行
                .replaceFirst("<TOCSupplProvision>", "<h5><TOCSupplProvision><a>") // 附則のリンク(開始タグ)
                .replaceFirst("</TOCSupplProvision>", "</a></TOCSupplProvision></h5><br>") // 附則のリンク(終了タグ)
                .replaceAll("<ArticleRange>", "<h5><ArticleRange>")
                .replaceAll("</ArticleRange>", "</ArticleRange></h5>")
                // ここからメイン
                .replaceFirst("<MainProvision>>", "<MainProvision><br><br>") // 目次とメインの間
                .replaceFirst("</TOC>", "</TOC><br>") //
                .replaceAll("</ArticleCaption>", "</ArticleCaption><br>") //
                .replaceAll("</Sentence>", "</Sentence><br>")
                .replaceAll("</Chapter>", "</Chapter><br><br>") // 章の終わり
                .replaceAll("<ChapterTitle>", "<h5><ChapterTitle>") // 
                .replaceAll("</ChapterTitle>", "</ChapterTitle></h5>") // 
                .replaceFirst("</MainProvision>>", "</MainProvision><br><br>") // メインと附則の間
                .replaceAll("(<Chapter[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "$1$2\" id=\"chapter$2$3") // e.g. " id=chapter2"
                // ここから附則
                .replaceAll("<SupplProvisionLabel>附　則</SupplProvisionLabel>", "<br><SupplProvisionLabel><h5>附　則</h5></SupplProvisionLabel>") // "附則"
        ;
        logger.debug(viewXml);
        return viewXml;
    }
}
