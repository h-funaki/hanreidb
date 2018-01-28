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
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of ([区分値]判決種別)CLS_JUDGEMENT_TYPE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     JUDGEMENT_TYPE_CODE
 *
 * [column]
 *     JUDGEMENT_TYPE_CODE, JUDGEMENT_TYPE_NAME, JUDGEMENT_TYPE_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String judgementTypeCode = entity.getJudgementTypeCode();
 * String judgementTypeName = entity.getJudgementTypeName();
 * String judgementTypeAlias = entity.getJudgementTypeAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setJudgementTypeCode(judgementTypeCode);
 * entity.setJudgementTypeName(judgementTypeName);
 * entity.setJudgementTypeAlias(judgementTypeAlias);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsClsJudgementType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} */
    protected String _judgementTypeCode;

    /** (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _judgementTypeName;

    /** (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} */
    protected String _judgementTypeAlias;

    /** (説明)DESCRIPTION: {NotNull, TEXT(65535)} */
    protected String _description;

    /** (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} */
    protected Integer _displayOrder;

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
        return "CLS_JUDGEMENT_TYPE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_judgementTypeCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (順番): UQ, NotNull, INT UNSIGNED(10). (NotNull)
     */
    public void uniqueByDisplayOrder(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param judgementTypeAlias (判決種別別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByJudgementTypeAlias(String judgementTypeAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("judgementTypeAlias");
        setJudgementTypeAlias(judgementTypeAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param judgementTypeName (判決種別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByJudgementTypeName(String judgementTypeName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("judgementTypeName");
        setJudgementTypeName(judgementTypeName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of judgementTypeCode as the classification of JudgementType. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.JudgementType getJudgementTypeCodeAsJudgementType() {
        return CDef.JudgementType.codeOf(getJudgementTypeCode());
    }

    /**
     * Set the value of judgementTypeCode as the classification of JudgementType. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setJudgementTypeCodeAsJudgementType(CDef.JudgementType cdef) {
        setJudgementTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of judgementTypeCode as 判決 (JUDGEMENT). <br>
     * 判決: 判決
     */
    public void setJudgementTypeCode_判決() {
        setJudgementTypeCodeAsJudgementType(CDef.JudgementType.判決);
    }

    /**
     * Set the value of judgementTypeCode as 決定 (DECISION). <br>
     * 決定: 決定
     */
    public void setJudgementTypeCode_決定() {
        setJudgementTypeCodeAsJudgementType(CDef.JudgementType.決定);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of judgementTypeCode 判決? <br>
     * 判決: 判決
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementTypeCode判決() {
        CDef.JudgementType cdef = getJudgementTypeCodeAsJudgementType();
        return cdef != null ? cdef.equals(CDef.JudgementType.判決) : false;
    }

    /**
     * Is the value of judgementTypeCode 決定? <br>
     * 決定: 決定
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isJudgementTypeCode決定() {
        CDef.JudgementType cdef = getJudgementTypeCodeAsJudgementType();
        return cdef != null ? cdef.equals(CDef.JudgementType.決定) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by JUDGEMENT_TYPE_CODE, named 'judgementList'.
     * @param judgementList The entity list of referrer property 'judgementList'. (NullAllowed)
     */
    public void setJudgementList(List<Judgement> judgementList) {
        _judgementList = judgementList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsClsJudgementType) {
            BsClsJudgementType other = (BsClsJudgementType)obj;
            if (!xSV(_judgementTypeCode, other._judgementTypeCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _judgementTypeCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_judgementList != null) { for (Judgement et : _judgementList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_judgementTypeCode));
        sb.append(dm).append(xfND(_judgementTypeName));
        sb.append(dm).append(xfND(_judgementTypeAlias));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
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
        if (_judgementList != null && !_judgementList.isEmpty())
        { sb.append(dm).append("judgementList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsJudgementType clone() {
        return (ClsJudgementType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
     * @return The value of the column 'JUDGEMENT_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementTypeCode() {
        checkSpecifiedProperty("judgementTypeCode");
        return convertEmptyToNull(_judgementTypeCode);
    }

    /**
     * [set] (判決種別コード)JUDGEMENT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=JudgementType} <br>
     * @param judgementTypeCode The value of the column 'JUDGEMENT_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementTypeCode(String judgementTypeCode) {
        registerModifiedProperty("judgementTypeCode");
        _judgementTypeCode = judgementTypeCode;
    }

    /**
     * [get] (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'JUDGEMENT_TYPE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementTypeName() {
        checkSpecifiedProperty("judgementTypeName");
        return convertEmptyToNull(_judgementTypeName);
    }

    /**
     * [set] (判決種別名)JUDGEMENT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @param judgementTypeName The value of the column 'JUDGEMENT_TYPE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementTypeName(String judgementTypeName) {
        registerModifiedProperty("judgementTypeName");
        _judgementTypeName = judgementTypeName;
    }

    /**
     * [get] (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'JUDGEMENT_TYPE_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getJudgementTypeAlias() {
        checkSpecifiedProperty("judgementTypeAlias");
        return convertEmptyToNull(_judgementTypeAlias);
    }

    /**
     * [set] (判決種別別名)JUDGEMENT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @param judgementTypeAlias The value of the column 'JUDGEMENT_TYPE_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setJudgementTypeAlias(String judgementTypeAlias) {
        registerModifiedProperty("judgementTypeAlias");
        _judgementTypeAlias = judgementTypeAlias;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
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
