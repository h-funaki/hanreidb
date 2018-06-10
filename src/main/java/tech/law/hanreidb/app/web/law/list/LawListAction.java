package tech.law.hanreidb.app.web.law.list;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotEmpty;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import java.util.List;

import javax.annotation.Resource;

import org.dbflute.cbean.result.PagingResultBean;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.web.base.paging.PagingPart;
import tech.law.hanreidb.app.web.law.list.LawListContentResult.LawPart;
import tech.law.hanreidb.app.web.law.list.LawListContentResult.LawPart.LawCategoryPart;
import tech.law.hanreidb.app.web.law.list.LawListContentResult.LawPart.SourcePart;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exentity.ClsSource;
import tech.law.hanreidb.dbflute.exentity.Law;
import tech.law.hanreidb.dbflute.exentity.LawCategory;
import tech.law.hanreidb.dbflute.exentity.LawCategoryRel;
import tech.law.hanreidb.dbflute.exentity.LawSourceRel;

/**
 * @author h-funaki
 */
@AllowAnyoneAccess
public class LawListAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(LawListAction.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawBhv lawBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LawListContentResult> index(LawListBody body) {
        return asJson(mappingToContent(selectLawPage(body)));
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private PagingResultBean<Law> selectLawPage(LawListBody body) {
        PagingResultBean<Law> page = lawBhv.selectPage(cb -> {
            cb.setupSelect_LawType();
            cb.specify().everyColumn();
            ifNotBlank(body.law_name).ifPresent(value -> {
                cb.orScopeQuery(orCB -> {
                    orCB.query().setLawName_LikeSearch(value, op -> op.likeContain());
                    orCB.query().setLawNumber_LikeSearch(value, op -> op.likeContain());
                    orCB.query().existsLawAlias(aliasCB -> {
                        aliasCB.query().setLawAlias_LikeSearch(value, op -> op.likeContain());
                    });
                });
            });
            ifNotBlank(body.law_content).ifPresent(value -> {
                cb.query().existsLawHistoryByLawId(historyCB -> {
                    historyCB.query().queryLawContentAsOne().setLawContentSearchText_LikeSearch(value, op -> op.likeContain());
                });
            });
            ifNotEmpty(body.law_category_id_list).ifPresent(list -> {
                cb.query().existsLawCategoryRel(categoryRelCB -> {
                    categoryRelCB.query().setLawCategoryId_InScope(list);
                });
            });
            cb.query().existsLawHistoryByLawId(historyCB -> {});
            cb.paging(body.page_size, body.page_number);
        });
        lawBhv.load(page, lawLoader -> {
            lawLoader.loadLawAlias(aliasCB -> {
                //aliasCB.specify().everyColumn();
            });
            lawLoader.loadLawCategoryRel(categoryRelCB -> {
                //categoryRelCB.specify().everyColumn();
                categoryRelCB.setupSelect_LawCategory();
                //categoryRelCB.specify().everyColumn();
            });
            lawLoader.loadLawSourceRel(sourceRelCB -> {
                //sourceRelCB.specify().everyColumn();
                sourceRelCB.setupSelect_ClsSource();
                //sourceRelCB.specify().everyColumn();
            });
        });
        return page;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private LawListContentResult mappingToContent(PagingResultBean<Law> lawPage) {
        LawListContentResult content = new LawListContentResult();
        content.law_part_list = toImmutable(lawPage).collect(this::convertToLaw).castToList();
        content.paging_part = new PagingPart(lawPage);
        return content;
    }

    private LawPart convertToLaw(Law law) {
        LawPart part = new LawPart();
        part.law_type_code = law.getLawTypeCode();
        part.law_type_alias = law.getLawType().get().getLawTypeAlias();
        part.law_public_code = law.getLawPublicCode();
        part.law_name = law.getLawName();
        part.law_number = law.getLawNumber();
        part.promulgation_date = law.getPromulgationDate();
        part.effective_date = law.getEffectiveDate();

        part.law_alias_list = law.getLawAliasListAsStringList();

        List<SourcePart> sourcePartList = newArrayList();
        for (LawSourceRel rel : law.getLawSourceRelList()) {
            SourcePart sourcePart = new SourcePart();
            ClsSource clsSource = rel.getClsSource().get();
            sourcePart.source_code = clsSource.getSourceCode();
            sourcePart.source_alias = clsSource.getSourceAlias();
        }
        part.source_part_list = sourcePartList;

        List<LawCategoryPart> lawCategoryPartList = newArrayList();
        for (LawCategoryRel rel : law.getLawCategoryRelList()) {
            LawCategory lawCategory = rel.getLawCategory().get();
            LawCategoryPart categoryPart = new LawCategoryPart();
            categoryPart.law_category_id = lawCategory.getLawCategoryId();
            categoryPart.law_category_alias = lawCategory.getLawCategoryAlias();
            lawCategoryPartList.add(categoryPart);
        }
        part.law_category_part_list = lawCategoryPartList;

        return part;
    }
}
