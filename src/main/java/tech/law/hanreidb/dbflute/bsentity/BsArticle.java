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
import tech.law.hanreidb.dbflute.allcommon.EntityDefinedCommonColumn;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (条文)ARTICLE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ARTICLE_ID
 *
 * [column]
 *     ARTICLE_ID, LAW_TOC_ID, LAW_HISTORY_ID, ARTICLE_NUMBER, ARTICLE_CAPTION, ARTICLE_TITLE, ARTICLE_DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARTICLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY, LAW_TOC
 *
 * [referrer table]
 *     ARTICLE_CONTENT, JUDGEMENT_ARTICLE_REL
 *
 * [foreign property]
 *     lawHistory, lawToc
 *
 * [referrer property]
 *     articleContentList, judgementArticleRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long articleId = entity.getArticleId();
 * Long lawTocId = entity.getLawTocId();
 * Integer lawHistoryId = entity.getLawHistoryId();
 * String articleNumber = entity.getArticleNumber();
 * String articleCaption = entity.getArticleCaption();
 * String articleTitle = entity.getArticleTitle();
 * Integer articleDisplayOrder = entity.getArticleDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setArticleId(articleId);
 * entity.setLawTocId(lawTocId);
 * entity.setLawHistoryId(lawHistoryId);
 * entity.setArticleNumber(articleNumber);
 * entity.setArticleCaption(articleCaption);
 * entity.setArticleTitle(articleTitle);
 * entity.setArticleDisplayOrder(articleDisplayOrder);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsArticle extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _articleId;

    /** (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC} */
    protected Long _lawTocId;

    /** (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} */
    protected Integer _lawHistoryId;

    /** (条文番号)ARTICLE_NUMBER: {VARCHAR(20)} */
    protected String _articleNumber;

    /** (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)} */
    protected String _articleCaption;

    /** (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)} */
    protected String _articleTitle;

    /** (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)} */
    protected Integer _articleDisplayOrder;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected String _registerUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected String _updateUser;

    /** (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ARTICLE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_articleId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'. */
    protected OptionalEntity<LawHistory> _lawHistory;

    /**
     * [get] (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawHistory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LawHistory> getLawHistory() {
        if (_lawHistory == null) { _lawHistory = OptionalEntity.relationEmpty(this, "lawHistory"); }
        return _lawHistory;
    }

    /**
     * [set] (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @param lawHistory The entity of foreign property 'lawHistory'. (NullAllowed)
     */
    public void setLawHistory(OptionalEntity<LawHistory> lawHistory) {
        _lawHistory = lawHistory;
    }

    /** (法令目次)LAW_TOC by my LAW_TOC_ID, named 'lawToc'. */
    protected OptionalEntity<LawToc> _lawToc;

    /**
     * [get] (法令目次)LAW_TOC by my LAW_TOC_ID, named 'lawToc'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawToc'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LawToc> getLawToc() {
        if (_lawToc == null) { _lawToc = OptionalEntity.relationEmpty(this, "lawToc"); }
        return _lawToc;
    }

    /**
     * [set] (法令目次)LAW_TOC by my LAW_TOC_ID, named 'lawToc'.
     * @param lawToc The entity of foreign property 'lawToc'. (NullAllowed)
     */
    public void setLawToc(OptionalEntity<LawToc> lawToc) {
        _lawToc = lawToc;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentList'. */
    protected List<ArticleContent> _articleContentList;

    /**
     * [get] (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentList'.
     * @return The entity list of referrer property 'articleContentList'. (NotNull: even if no loading, returns empty list)
     */
    public List<ArticleContent> getArticleContentList() {
        if (_articleContentList == null) { _articleContentList = newReferrerList(); }
        return _articleContentList;
    }

    /**
     * [set] (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentList'.
     * @param articleContentList The entity list of referrer property 'articleContentList'. (NullAllowed)
     */
    public void setArticleContentList(List<ArticleContent> articleContentList) {
        _articleContentList = articleContentList;
    }

    /** (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelList'. */
    protected List<JudgementArticleRel> _judgementArticleRelList;

    /**
     * [get] (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelList'.
     * @return The entity list of referrer property 'judgementArticleRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementArticleRel> getJudgementArticleRelList() {
        if (_judgementArticleRelList == null) { _judgementArticleRelList = newReferrerList(); }
        return _judgementArticleRelList;
    }

    /**
     * [set] (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelList'.
     * @param judgementArticleRelList The entity list of referrer property 'judgementArticleRelList'. (NullAllowed)
     */
    public void setJudgementArticleRelList(List<JudgementArticleRel> judgementArticleRelList) {
        _judgementArticleRelList = judgementArticleRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsArticle) {
            BsArticle other = (BsArticle)obj;
            if (!xSV(_articleId, other._articleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _articleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawHistory != null && _lawHistory.isPresent())
        { sb.append(li).append(xbRDS(_lawHistory, "lawHistory")); }
        if (_lawToc != null && _lawToc.isPresent())
        { sb.append(li).append(xbRDS(_lawToc, "lawToc")); }
        if (_articleContentList != null) { for (ArticleContent et : _articleContentList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "articleContentList")); } } }
        if (_judgementArticleRelList != null) { for (JudgementArticleRel et : _judgementArticleRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementArticleRelList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_articleId));
        sb.append(dm).append(xfND(_lawTocId));
        sb.append(dm).append(xfND(_lawHistoryId));
        sb.append(dm).append(xfND(_articleNumber));
        sb.append(dm).append(xfND(_articleCaption));
        sb.append(dm).append(xfND(_articleTitle));
        sb.append(dm).append(xfND(_articleDisplayOrder));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_lawHistory != null && _lawHistory.isPresent())
        { sb.append(dm).append("lawHistory"); }
        if (_lawToc != null && _lawToc.isPresent())
        { sb.append(dm).append("lawToc"); }
        if (_articleContentList != null && !_articleContentList.isEmpty())
        { sb.append(dm).append("articleContentList"); }
        if (_judgementArticleRelList != null && !_judgementArticleRelList.isEmpty())
        { sb.append(dm).append("judgementArticleRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Article clone() {
        return (Article)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ARTICLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getArticleId() {
        checkSpecifiedProperty("articleId");
        return _articleId;
    }

    /**
     * [set] (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param articleId The value of the column 'ARTICLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setArticleId(Long articleId) {
        registerModifiedProperty("articleId");
        _articleId = articleId;
    }

    /**
     * [get] (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC} <br>
     * @return The value of the column 'LAW_TOC_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getLawTocId() {
        checkSpecifiedProperty("lawTocId");
        return _lawTocId;
    }

    /**
     * [set] (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC} <br>
     * @param lawTocId The value of the column 'LAW_TOC_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawTocId(Long lawTocId) {
        registerModifiedProperty("lawTocId");
        _lawTocId = lawTocId;
    }

    /**
     * [get] (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @return The value of the column 'LAW_HISTORY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawHistoryId() {
        checkSpecifiedProperty("lawHistoryId");
        return _lawHistoryId;
    }

    /**
     * [set] (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY} <br>
     * @param lawHistoryId The value of the column 'LAW_HISTORY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawHistoryId(Integer lawHistoryId) {
        registerModifiedProperty("lawHistoryId");
        _lawHistoryId = lawHistoryId;
    }

    /**
     * [get] (条文番号)ARTICLE_NUMBER: {VARCHAR(20)} <br>
     * @return The value of the column 'ARTICLE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticleNumber() {
        checkSpecifiedProperty("articleNumber");
        return convertEmptyToNull(_articleNumber);
    }

    /**
     * [set] (条文番号)ARTICLE_NUMBER: {VARCHAR(20)} <br>
     * @param articleNumber The value of the column 'ARTICLE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticleNumber(String articleNumber) {
        registerModifiedProperty("articleNumber");
        _articleNumber = articleNumber;
    }

    /**
     * [get] (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)} <br>
     * @return The value of the column 'ARTICLE_CAPTION'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticleCaption() {
        checkSpecifiedProperty("articleCaption");
        return convertEmptyToNull(_articleCaption);
    }

    /**
     * [set] (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)} <br>
     * @param articleCaption The value of the column 'ARTICLE_CAPTION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticleCaption(String articleCaption) {
        registerModifiedProperty("articleCaption");
        _articleCaption = articleCaption;
    }

    /**
     * [get] (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)} <br>
     * @return The value of the column 'ARTICLE_TITLE'. (NullAllowed even if selected: for no constraint)
     */
    public String getArticleTitle() {
        checkSpecifiedProperty("articleTitle");
        return convertEmptyToNull(_articleTitle);
    }

    /**
     * [set] (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)} <br>
     * @param articleTitle The value of the column 'ARTICLE_TITLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setArticleTitle(String articleTitle) {
        registerModifiedProperty("articleTitle");
        _articleTitle = articleTitle;
    }

    /**
     * [get] (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @return The value of the column 'ARTICLE_DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getArticleDisplayOrder() {
        checkSpecifiedProperty("articleDisplayOrder");
        return _articleDisplayOrder;
    }

    /**
     * [set] (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @param articleDisplayOrder The value of the column 'ARTICLE_DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setArticleDisplayOrder(Integer articleDisplayOrder) {
        registerModifiedProperty("articleDisplayOrder");
        _articleDisplayOrder = articleDisplayOrder;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時 e.g. 2018-01-02T12:34:56
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時 e.g. 2018-01-02T12:34:56
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー e.g. funa
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー e.g. funa
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時 e.g. 2018-01-02T12:34:56
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時 e.g. 2018-01-02T12:34:56
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー e.g. funa
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー e.g. funa
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号 e.g. 0
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号 e.g. 0
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
