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
 * The entity of (判決条文リレーション)JUDGEMENT_ARTICLE_REL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     JUDGEMENT_ARTICLE_REL_ID
 *
 * [column]
 *     JUDGEMENT_ARTICLE_REL_ID, JUDGEMENT_ID, ARTICLE_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_ARTICLE_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     ARTICLE, JUDGEMENT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     article, judgement
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long judgementArticleRelId = entity.getJudgementArticleRelId();
 * Long judgementId = entity.getJudgementId();
 * Long articleId = entity.getArticleId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setJudgementArticleRelId(judgementArticleRelId);
 * entity.setJudgementId(judgementId);
 * entity.setArticleId(articleId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJudgementArticleRel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _judgementArticleRelId;

    /** (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} */
    protected Long _judgementId;

    /** (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE} */
    protected Long _articleId;

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
        return "JUDGEMENT_ARTICLE_REL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementArticleRelId == null) { return false; }
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

    /** (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'. */
    protected OptionalEntity<Judgement> _judgement;

    /**
     * [get] (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'judgement'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Judgement> getJudgement() {
        if (_judgement == null) { _judgement = OptionalEntity.relationEmpty(this, "judgement"); }
        return _judgement;
    }

    /**
     * [set] (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @param judgement The entity of foreign property 'judgement'. (NullAllowed)
     */
    public void setJudgement(OptionalEntity<Judgement> judgement) {
        _judgement = judgement;
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
        if (obj instanceof BsJudgementArticleRel) {
            BsJudgementArticleRel other = (BsJudgementArticleRel)obj;
            if (!xSV(_judgementArticleRelId, other._judgementArticleRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementArticleRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_article != null && _article.isPresent())
        { sb.append(li).append(xbRDS(_article, "article")); }
        if (_judgement != null && _judgement.isPresent())
        { sb.append(li).append(xbRDS(_judgement, "judgement")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementArticleRelId));
        sb.append(dm).append(xfND(_judgementId));
        sb.append(dm).append(xfND(_articleId));
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
        if (_article != null && _article.isPresent())
        { sb.append(dm).append("article"); }
        if (_judgement != null && _judgement.isPresent())
        { sb.append(dm).append("judgement"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public JudgementArticleRel clone() {
        return (JudgementArticleRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'JUDGEMENT_ARTICLE_REL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementArticleRelId() {
        checkSpecifiedProperty("judgementArticleRelId");
        return _judgementArticleRelId;
    }

    /**
     * [set] (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param judgementArticleRelId The value of the column 'JUDGEMENT_ARTICLE_REL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementArticleRelId(Long judgementArticleRelId) {
        registerModifiedProperty("judgementArticleRelId");
        _judgementArticleRelId = judgementArticleRelId;
    }

    /**
     * [get] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * 判決ID e.g. 1
     * @return The value of the column 'JUDGEMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementId() {
        checkSpecifiedProperty("judgementId");
        return _judgementId;
    }

    /**
     * [set] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * 判決ID e.g. 1
     * @param judgementId The value of the column 'JUDGEMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementId(Long judgementId) {
        registerModifiedProperty("judgementId");
        _judgementId = judgementId;
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
