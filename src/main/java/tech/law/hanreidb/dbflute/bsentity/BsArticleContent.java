/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package tech.law.hanreidb.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (条文内容)ARTICLE_CONTENT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ARTICLE_CONTENT_ID
 *
 * [column]
 *     ARTICLE_CONTENT_ID, ARTICLE_ID, ARTICLE_CONTENT_RAW_XML, ARTICLE_CONTENT_VIEW_XML
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARTICLE_CONTENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ARTICLE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     article
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long articleContentId = entity.getArticleContentId();
 * Long articleId = entity.getArticleId();
 * String articleContentRawXml = entity.getArticleContentRawXml();
 * String articleContentViewXml = entity.getArticleContentViewXml();
 * entity.setArticleContentId(articleContentId);
 * entity.setArticleId(articleId);
 * entity.setArticleContentRawXml(articleContentRawXml);
 * entity.setArticleContentViewXml(articleContentViewXml);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsArticleContent extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _articleContentId;

    /** (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE} */
    protected Long _articleId;

    /** (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)} */
    protected String _articleContentRawXml;

    /** (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} */
    protected String _articleContentViewXml;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ARTICLE_CONTENT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_articleContentId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (条文)ARTICLE by my ARTICLE_ID, named 'article'. */
    protected OptionalEntity<Article> _article;

    /**
     * [get] (条文)ARTICLE by my ARTICLE_ID, named 'article'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'article'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Article> getArticle() {
        if (_article == null) { _article = OptionalEntity.relationEmpty(this, "article"); }
        return _article;
    }

    /**
     * [set] (条文)ARTICLE by my ARTICLE_ID, named 'article'.
     * @param article The entity of foreign property 'article'. (NullAllowed)
     */
    public void setArticle(OptionalEntity<Article> article) {
        _article = article;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsArticleContent) {
            BsArticleContent other = (BsArticleContent)obj;
            if (!xSV(_articleContentId, other._articleContentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _articleContentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_article != null && _article.isPresent())
        { sb.append(li).append(xbRDS(_article, "article")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_articleContentId));
        sb.append(dm).append(xfND(_articleId));
        sb.append(dm).append(xfND(_articleContentRawXml));
        sb.append(dm).append(xfND(_articleContentViewXml));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_article != null && _article.isPresent())
        { sb.append(dm).append("article"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ArticleContent clone() {
        return (ArticleContent)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ARTICLE_CONTENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getArticleContentId() {
        checkSpecifiedProperty("articleContentId");
        return _articleContentId;
    }

    /**
     * [set] (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param articleContentId The value of the column 'ARTICLE_CONTENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArticleContentId(Long articleContentId) {
        registerModifiedProperty("articleContentId");
        _articleContentId = articleContentId;
    }

    /**
     * [get] (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE} <br>
     * @return The value of the column 'ARTICLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getArticleId() {
        checkSpecifiedProperty("articleId");
        return _articleId;
    }

    /**
     * [set] (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE} <br>
     * @param articleId The value of the column 'ARTICLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArticleId(Long articleId) {
        registerModifiedProperty("articleId");
        _articleId = articleId;
    }

    /**
     * [get] (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'ARTICLE_CONTENT_RAW_XML'. (basically NotNull if selected: for the constraint)
     */
    public String getArticleContentRawXml() {
        checkSpecifiedProperty("articleContentRawXml");
        return convertEmptyToNull(_articleContentRawXml);
    }

    /**
     * [set] (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * @param articleContentRawXml The value of the column 'ARTICLE_CONTENT_RAW_XML'. (basically NotNull if update: for the constraint)
     */
    public void setArticleContentRawXml(String articleContentRawXml) {
        registerModifiedProperty("articleContentRawXml");
        _articleContentRawXml = articleContentRawXml;
    }

    /**
     * [get] (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'ARTICLE_CONTENT_VIEW_XML'. (basically NotNull if selected: for the constraint)
     */
    public String getArticleContentViewXml() {
        checkSpecifiedProperty("articleContentViewXml");
        return convertEmptyToNull(_articleContentViewXml);
    }

    /**
     * [set] (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * @param articleContentViewXml The value of the column 'ARTICLE_CONTENT_VIEW_XML'. (basically NotNull if update: for the constraint)
     */
    public void setArticleContentViewXml(String articleContentViewXml) {
        registerModifiedProperty("articleContentViewXml");
        _articleContentViewXml = articleContentViewXml;
    }
}
