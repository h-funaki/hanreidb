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
 * The entity of (判決取得元リレーション)JUDGEMENT_SOURCE_REL as TABLE. <br>
 * <pre>
 * [primary-key]
 *     JUDGEMENT_SOURCE_REL_ID
 *
 * [column]
 *     JUDGEMENT_SOURCE_REL_ID, JUDGEMENT_ID, SOURCE_ID, SOURCE_JUDGEMENT_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_SOURCE_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     JUDGEMENT, SOURCE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     judgement, source
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long judgementSourceRelId = entity.getJudgementSourceRelId();
 * Long judgementId = entity.getJudgementId();
 * Integer sourceId = entity.getSourceId();
 * String sourceJudgementId = entity.getSourceJudgementId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setJudgementSourceRelId(judgementSourceRelId);
 * entity.setJudgementId(judgementId);
 * entity.setSourceId(sourceId);
 * entity.setSourceJudgementId(sourceJudgementId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsJudgementSourceRel extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _judgementSourceRelId;

    /** (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} */
    protected Long _judgementId;

    /** (取得元ID)SOURCE_ID: {IX, NotNull, INT UNSIGNED(10), FK to SOURCE} */
    protected Integer _sourceId;

    /** (取得元判決ID)SOURCE_JUDGEMENT_ID: {NotNull, VARCHAR(100)} */
    protected String _sourceJudgementId;

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
        return "JUDGEMENT_SOURCE_REL";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementSourceRelId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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

    /** (取得元)SOURCE by my SOURCE_ID, named 'source'. */
    protected OptionalEntity<Source> _source;

    /**
     * [get] (取得元)SOURCE by my SOURCE_ID, named 'source'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'source'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Source> getSource() {
        if (_source == null) { _source = OptionalEntity.relationEmpty(this, "source"); }
        return _source;
    }

    /**
     * [set] (取得元)SOURCE by my SOURCE_ID, named 'source'.
     * @param source The entity of foreign property 'source'. (NullAllowed)
     */
    public void setSource(OptionalEntity<Source> source) {
        _source = source;
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
        if (obj instanceof BsJudgementSourceRel) {
            BsJudgementSourceRel other = (BsJudgementSourceRel)obj;
            if (!xSV(_judgementSourceRelId, other._judgementSourceRelId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementSourceRelId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgement != null && _judgement.isPresent())
        { sb.append(li).append(xbRDS(_judgement, "judgement")); }
        if (_source != null && _source.isPresent())
        { sb.append(li).append(xbRDS(_source, "source")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementSourceRelId));
        sb.append(dm).append(xfND(_judgementId));
        sb.append(dm).append(xfND(_sourceId));
        sb.append(dm).append(xfND(_sourceJudgementId));
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
        if (_judgement != null && _judgement.isPresent())
        { sb.append(dm).append("judgement"); }
        if (_source != null && _source.isPresent())
        { sb.append(dm).append("source"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public JudgementSourceRel clone() {
        return (JudgementSourceRel)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @return The value of the column 'JUDGEMENT_SOURCE_REL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementSourceRelId() {
        checkSpecifiedProperty("judgementSourceRelId");
        return _judgementSourceRelId;
    }

    /**
     * [set] (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @param judgementSourceRelId The value of the column 'JUDGEMENT_SOURCE_REL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementSourceRelId(Long judgementSourceRelId) {
        registerModifiedProperty("judgementSourceRelId");
        _judgementSourceRelId = judgementSourceRelId;
    }

    /**
     * [get] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * @return The value of the column 'JUDGEMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getJudgementId() {
        checkSpecifiedProperty("judgementId");
        return _judgementId;
    }

    /**
     * [set] (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT} <br>
     * @param judgementId The value of the column 'JUDGEMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementId(Long judgementId) {
        registerModifiedProperty("judgementId");
        _judgementId = judgementId;
    }

    /**
     * [get] (取得元ID)SOURCE_ID: {IX, NotNull, INT UNSIGNED(10), FK to SOURCE} <br>
     * @return The value of the column 'SOURCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSourceId() {
        checkSpecifiedProperty("sourceId");
        return _sourceId;
    }

    /**
     * [set] (取得元ID)SOURCE_ID: {IX, NotNull, INT UNSIGNED(10), FK to SOURCE} <br>
     * @param sourceId The value of the column 'SOURCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSourceId(Integer sourceId) {
        registerModifiedProperty("sourceId");
        _sourceId = sourceId;
    }

    /**
     * [get] (取得元判決ID)SOURCE_JUDGEMENT_ID: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'SOURCE_JUDGEMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceJudgementId() {
        checkSpecifiedProperty("sourceJudgementId");
        return convertEmptyToNull(_sourceJudgementId);
    }

    /**
     * [set] (取得元判決ID)SOURCE_JUDGEMENT_ID: {NotNull, VARCHAR(100)} <br>
     * @param sourceJudgementId The value of the column 'SOURCE_JUDGEMENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSourceJudgementId(String sourceJudgementId) {
        registerModifiedProperty("sourceJudgementId");
        _sourceJudgementId = sourceJudgementId;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが登録された日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを登録したユーザー
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * レコードが(最後に)更新された日時
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)} <br>
     * レコードを(最後に)更新したユーザー
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]} <br>
     * バージョン番号
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
