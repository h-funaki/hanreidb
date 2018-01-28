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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import tech.law.hanreidb.dbflute.allcommon.EntityDefinedCommonColumn;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (取得元)SOURCE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     SOURCE_ID
 *
 * [column]
 *     SOURCE_ID, SOURCE_NAME, SOURCE_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOURCE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT_SOURCE_REL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementSourceRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer sourceId = entity.getSourceId();
 * String sourceName = entity.getSourceName();
 * String sourceAlias = entity.getSourceAlias();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setSourceId(sourceId);
 * entity.setSourceName(sourceName);
 * entity.setSourceAlias(sourceAlias);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSource extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _sourceId;

    /** (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} */
    protected String _sourceName;

    /** (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} */
    protected String _sourceAlias;

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
        return "SOURCE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_sourceId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param sourceAlias (取得元別名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBySourceAlias(String sourceAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("sourceAlias");
        setSourceAlias(sourceAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param sourceName (取得元名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBySourceName(String sourceName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("sourceName");
        setSourceName(sourceName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelList'. */
    protected List<JudgementSourceRel> _judgementSourceRelList;

    /**
     * [get] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelList'.
     * @return The entity list of referrer property 'judgementSourceRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<JudgementSourceRel> getJudgementSourceRelList() {
        if (_judgementSourceRelList == null) { _judgementSourceRelList = newReferrerList(); }
        return _judgementSourceRelList;
    }

    /**
     * [set] (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelList'.
     * @param judgementSourceRelList The entity list of referrer property 'judgementSourceRelList'. (NullAllowed)
     */
    public void setJudgementSourceRelList(List<JudgementSourceRel> judgementSourceRelList) {
        _judgementSourceRelList = judgementSourceRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSource) {
            BsSource other = (BsSource)obj;
            if (!xSV(_sourceId, other._sourceId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _sourceId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgementSourceRelList != null) { for (JudgementSourceRel et : _judgementSourceRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementSourceRelList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_sourceId));
        sb.append(dm).append(xfND(_sourceName));
        sb.append(dm).append(xfND(_sourceAlias));
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
        if (_judgementSourceRelList != null && !_judgementSourceRelList.isEmpty())
        { sb.append(dm).append("judgementSourceRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Source clone() {
        return (Source)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'SOURCE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSourceId() {
        checkSpecifiedProperty("sourceId");
        return _sourceId;
    }

    /**
     * [set] (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param sourceId The value of the column 'SOURCE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSourceId(Integer sourceId) {
        registerModifiedProperty("sourceId");
        _sourceId = sourceId;
    }

    /**
     * [get] (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'SOURCE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceName() {
        checkSpecifiedProperty("sourceName");
        return convertEmptyToNull(_sourceName);
    }

    /**
     * [set] (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @param sourceName The value of the column 'SOURCE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setSourceName(String sourceName) {
        registerModifiedProperty("sourceName");
        _sourceName = sourceName;
    }

    /**
     * [get] (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'SOURCE_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getSourceAlias() {
        checkSpecifiedProperty("sourceAlias");
        return convertEmptyToNull(_sourceAlias);
    }

    /**
     * [set] (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @param sourceAlias The value of the column 'SOURCE_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setSourceAlias(String sourceAlias) {
        registerModifiedProperty("sourceAlias");
        _sourceAlias = sourceAlias;
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
