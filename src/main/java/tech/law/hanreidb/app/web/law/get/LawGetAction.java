package tech.law.hanreidb.app.web.law.get;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.logic.FileLogic;
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
    @Resource
    private FileLogic fileLogic;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LawGetContentResult> index(String law_public_code) throws IOException {
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
    private LawGetContentResult mappingToContent(Law law) throws IOException {
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

        //        content.law_content_view_xml =
        //                toXml(fileLogic.readAll("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/law/content/raw_xml_2.xml"));
        LawContent lawContent = lawHistory.getLawContentAsOne().get();
        content.law_content_view_xml = toXml(lawContent.getLawContentViewXml());
        return content;
    }

    public String toXml(String rawXml) {
        String viewXml = rawXml.substring(rawXml.indexOf("<LawBody>"), rawXml.indexOf("</LawBody>") + 10) // LawBodyを取り出す。 
                // -----------------------------------------------------
                //                                                   目次
                //                                                   ---
                // タイトル
                .replaceFirst("<LawTitle>.*</LawTitle>", "") // 法令名 e.g. 牧野法
                // 制定文
                .replaceAll("<EnactStatement>", "<br><EnactStatement>") //
                // 目次
                .replaceFirst("<TOCLabel>目次</TOCLabel>", "") // "目次"
                // 編
                .replaceAll("(<TOCPart[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2$3<a href=\"#part$2\">") // 目次の編(開始タグ)
                .replaceAll("<PartTitle>", "<PartTitle>") // 目次の編(終了タグ)
                .replaceAll("</PartTitle>", "</PartTitle></a>") // 目次の編(終了タグ)
                // 章
                .replaceAll("(<TOCChapter[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br><a href=\"#chapter$2\">$1$2$3") // 目次の章(開始タグ)
                .replaceAll("</TOCChapter>", "</TOCChapter></a>") // 目次の章(終了タグ)
                // 節
                .replaceAll("(<TOCSection[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br><a href=\"#section$2\">$1$2$3") // 目次の節(開始タグ)
                .replaceAll("</TOCSection>", "</TOCSection></a>") // 目次の節(終了タグ)
                // 款
                .replaceAll("(<TOCSubsection[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br><a href=\"#subsection$2\">$1$2$3") // 目次の款(開始タグ)
                .replaceAll("</TOCSubsection>", "</TOCSubsection></a>") // 目次の款(終了タグ)
                // 目
                .replaceAll("(<TOCDivision[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br><a href=\"#division$2\">$1$2$3") // 目次の目(開始タグ)
                .replaceAll("</TOCDivision>", "</TOCDivision></a>") // 目次の目(終了タグ)
                // 
                .replaceFirst("<TOCSupplProvision>", "<br><TOCSupplProvision><a>") // 附則のリンク(開始タグ)
                .replaceFirst("</TOCSupplProvision>", "</a></TOCSupplProvision>") // 附則のリンク(終了タグ)
                // -----------------------------------------------------
                //                                                 メイン
                //                                                 -----
                .replaceFirst("<TOC>", "<div class=\"ui center aligned grid\"><div class=\"twelve wide column\"><TOC>") //
                .replaceFirst("</TOC>", "</TOC></div></div>") //
                .replaceAll("", "") //
                .replaceAll("<ArticleCaption>", "<br><ArticleCaption>") //
                .replaceAll("<ArticleTitle>", "<br><ArticleTitle>") //
                //.replaceAll("<Article([ >])", "<br><Article$1") //
                .replaceAll("<ParagraphNum(/?)", "<br><ParagraphNum$1")
                .replaceAll("(<Part[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2\" id=\"part$2$3") // e.g. " id=part2"
                .replaceAll("(<Chapter[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2\" id=\"chapter$2$3") // e.g. " id=chapter2"
                .replaceAll("(<Section[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2\" id=\"section$2$3") // e.g. " id=section2"
                .replaceAll("(<Subsection[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2\" id=\"subsection$2$3") // e.g. " id=subsection2"
                .replaceAll("(<Division[\"= a-zA-Z0-9]* Num=\")(\\d+)(\">)", "<br>$1$2\" id=\"division$2$3") // e.g. " id=division2"
                // メインと附則の間
                .replaceAll("(<Item Num=\"\\d+\">)", "<br>$1") //
                .replaceAll("(<Subitem1 Num=\"\\d+\">)", "<br>$1") //
                .replaceFirst("</MainProvision>>", "</MainProvision><br><br>")
                // -----------------------------------------------------
                //                                                   附則
                //                                                   ---       
                .replaceAll("<SupplProvisionLabel>附　則</SupplProvisionLabel>", "<br><SupplProvisionLabel>附　則</SupplProvisionLabel>") // "附則"
                // -----------------------------------------------------
                //                                               テーブル
                //                                               -------
                .replaceAll("<Table>", "<br><table class=\"ui fixed single line celled table\">")
                .replaceAll("<TableRow>", "<tr>")
                .replaceAll("</TableRow>", "</tr>")
                .replaceAll("<TableColumn>", "<td>")
                .replaceAll("</TableColumn>", "</td>")
                // -----------------------------------------------------
                //                                                   全体
                //                                                   ---
                .replaceAll("<br>\n( *)([</a-zA-Z0-9>]*)<br>", "<br>\n$1$2");

        logger.debug(viewXml);
        return viewXml;
    }
}
