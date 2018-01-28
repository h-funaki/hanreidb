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
 * The entity of ([区分値]元号)CLS_ERA as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ERA_CODE
 *
 * [column]
 *     ERA_CODE, ERA_NAME, ERA_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 * String eraCode = entity.getEraCode();
 * String eraName = entity.getEraName();
 * String eraAlias = entity.getEraAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setEraCode(eraCode);
 * entity.setEraName(eraName);
 * entity.setEraAlias(eraAlias);
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
public abstract class BsClsEra extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (元号コード)ERA_CODE: {PK, NotNull, VARCHAR(10), classification=Era} */
    protected String _eraCode;

    /** (元号名)ERA_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _eraName;

    /** (元号別名)ERA_ALIAS: {UQ, NotNull, VARCHAR(10)} */
    protected String _eraAlias;

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
        return "CLS_ERA";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_eraCode == null) { return false; }
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
     * @param eraAlias (元号別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByEraAlias(String eraAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("eraAlias");
        setEraAlias(eraAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param eraName (元号名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByEraName(String eraName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("eraName");
        setEraName(eraName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of eraCode as the classification of Era. <br>
     * (元号コード)ERA_CODE: {PK, NotNull, VARCHAR(10), classification=Era} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Era getEraCodeAsEra() {
        return CDef.Era.codeOf(getEraCode());
    }

    /**
     * Set the value of eraCode as the classification of Era. <br>
     * (元号コード)ERA_CODE: {PK, NotNull, VARCHAR(10), classification=Era} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEraCodeAsEra(CDef.Era cdef) {
        setEraCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of eraCode as 明治 (MEIJI). <br>
     * 明治: 明治時代
     */
    public void setEraCode_明治() {
        setEraCodeAsEra(CDef.Era.明治);
    }

    /**
     * Set the value of eraCode as 大正 (TAISHO). <br>
     * 大正: 大正時代
     */
    public void setEraCode_大正() {
        setEraCodeAsEra(CDef.Era.大正);
    }

    /**
     * Set the value of eraCode as 昭和 (SHOWA). <br>
     * 昭和: 昭和時代
     */
    public void setEraCode_昭和() {
        setEraCodeAsEra(CDef.Era.昭和);
    }

    /**
     * Set the value of eraCode as 平成 (HEISEI). <br>
     * 平成: 平成時代
     */
    public void setEraCode_平成() {
        setEraCodeAsEra(CDef.Era.平成);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of eraCode 明治? <br>
     * 明治: 明治時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEraCode明治() {
        CDef.Era cdef = getEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.明治) : false;
    }

    /**
     * Is the value of eraCode 大正? <br>
     * 大正: 大正時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEraCode大正() {
        CDef.Era cdef = getEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.大正) : false;
    }

    /**
     * Is the value of eraCode 昭和? <br>
     * 昭和: 昭和時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEraCode昭和() {
        CDef.Era cdef = getEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.昭和) : false;
    }

    /**
     * Is the value of eraCode 平成? <br>
     * 平成: 平成時代
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEraCode平成() {
        CDef.Era cdef = getEraCodeAsEra();
        return cdef != null ? cdef.equals(CDef.Era.平成) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by CASE_NUMBER_ERA_CODE, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by CASE_NUMBER_ERA_CODE, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by CASE_NUMBER_ERA_CODE, named 'judgementList'.
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
        if (obj instanceof BsClsEra) {
            BsClsEra other = (BsClsEra)obj;
            if (!xSV(_eraCode, other._eraCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eraCode);
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
        sb.append(dm).append(xfND(_eraCode));
        sb.append(dm).append(xfND(_eraName));
        sb.append(dm).append(xfND(_eraAlias));
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
    public ClsEra clone() {
        return (ClsEra)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (元号コード)ERA_CODE: {PK, NotNull, VARCHAR(10), classification=Era} <br>
     * @return The value of the column 'ERA_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getEraCode() {
        checkSpecifiedProperty("eraCode");
        return convertEmptyToNull(_eraCode);
    }

    /**
     * [set] (元号コード)ERA_CODE: {PK, NotNull, VARCHAR(10), classification=Era} <br>
     * @param eraCode The value of the column 'ERA_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setEraCode(String eraCode) {
        registerModifiedProperty("eraCode");
        _eraCode = eraCode;
    }

    /**
     * [get] (元号名)ERA_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'ERA_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getEraName() {
        checkSpecifiedProperty("eraName");
        return convertEmptyToNull(_eraName);
    }

    /**
     * [set] (元号名)ERA_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @param eraName The value of the column 'ERA_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setEraName(String eraName) {
        registerModifiedProperty("eraName");
        _eraName = eraName;
    }

    /**
     * [get] (元号別名)ERA_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'ERA_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getEraAlias() {
        checkSpecifiedProperty("eraAlias");
        return convertEmptyToNull(_eraAlias);
    }

    /**
     * [set] (元号別名)ERA_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * @param eraAlias The value of the column 'ERA_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setEraAlias(String eraAlias) {
        registerModifiedProperty("eraAlias");
        _eraAlias = eraAlias;
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
