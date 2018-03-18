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
 * The entity of ([区分値]裁判所種別)CLS_COURT_TYPE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     COURT_TYPE_CODE
 *
 * [column]
 *     COURT_TYPE_CODE, COURT_TYPE_NAME, COURT_TYPE_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     CASE_MARK, COURT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     caseMarkList, courtList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String courtTypeCode = entity.getCourtTypeCode();
 * String courtTypeName = entity.getCourtTypeName();
 * String courtTypeAlias = entity.getCourtTypeAlias();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setCourtTypeCode(courtTypeCode);
 * entity.setCourtTypeName(courtTypeName);
 * entity.setCourtTypeAlias(courtTypeAlias);
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
public abstract class BsClsCourtType extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} */
    protected String _courtTypeCode;

    /** (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _courtTypeName;

    /** (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} */
    protected String _courtTypeAlias;

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
        return "CLS_COURT_TYPE";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_courtTypeCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param courtTypeAlias (裁判所種別別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByCourtTypeAlias(String courtTypeAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("courtTypeAlias");
        setCourtTypeAlias(courtTypeAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param courtTypeName (裁判所種別名): UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueByCourtTypeName(String courtTypeName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("courtTypeName");
        setCourtTypeName(courtTypeName);
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

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CourtType getCourtTypeCodeAsCourtType() {
        return CDef.CourtType.codeOf(getCourtTypeCode());
    }

    /**
     * Set the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCourtTypeCodeAsCourtType(CDef.CourtType cdef) {
        setCourtTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of courtTypeCode as 最高裁判所 (SUPREME). <br>
     * 最高裁判所: 最高裁判所
     */
    public void setCourtTypeCode_最高裁判所() {
        setCourtTypeCodeAsCourtType(CDef.CourtType.最高裁判所);
    }

    /**
     * Set the value of courtTypeCode as 高等裁判所 (HIGH). <br>
     * 高等裁判所: 高等裁判所
     */
    public void setCourtTypeCode_高等裁判所() {
        setCourtTypeCodeAsCourtType(CDef.CourtType.高等裁判所);
    }

    /**
     * Set the value of courtTypeCode as 地方裁判所 (DISTRICT). <br>
     * 地方裁判所: 地方裁判所
     */
    public void setCourtTypeCode_地方裁判所() {
        setCourtTypeCodeAsCourtType(CDef.CourtType.地方裁判所);
    }

    /**
     * Set the value of courtTypeCode as 簡易裁判所 (SUMMARY). <br>
     * 簡易裁判所: 簡易裁判所
     */
    public void setCourtTypeCode_簡易裁判所() {
        setCourtTypeCodeAsCourtType(CDef.CourtType.簡易裁判所);
    }

    /**
     * Set the value of courtTypeCode as 家庭裁判所 (DOMESTIC). <br>
     * 家庭裁判所: 家庭裁判所
     */
    public void setCourtTypeCode_家庭裁判所() {
        setCourtTypeCodeAsCourtType(CDef.CourtType.家庭裁判所);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of courtTypeCode 最高裁判所? <br>
     * 最高裁判所: 最高裁判所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCourtTypeCode最高裁判所() {
        CDef.CourtType cdef = getCourtTypeCodeAsCourtType();
        return cdef != null ? cdef.equals(CDef.CourtType.最高裁判所) : false;
    }

    /**
     * Is the value of courtTypeCode 高等裁判所? <br>
     * 高等裁判所: 高等裁判所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCourtTypeCode高等裁判所() {
        CDef.CourtType cdef = getCourtTypeCodeAsCourtType();
        return cdef != null ? cdef.equals(CDef.CourtType.高等裁判所) : false;
    }

    /**
     * Is the value of courtTypeCode 地方裁判所? <br>
     * 地方裁判所: 地方裁判所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCourtTypeCode地方裁判所() {
        CDef.CourtType cdef = getCourtTypeCodeAsCourtType();
        return cdef != null ? cdef.equals(CDef.CourtType.地方裁判所) : false;
    }

    /**
     * Is the value of courtTypeCode 簡易裁判所? <br>
     * 簡易裁判所: 簡易裁判所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCourtTypeCode簡易裁判所() {
        CDef.CourtType cdef = getCourtTypeCodeAsCourtType();
        return cdef != null ? cdef.equals(CDef.CourtType.簡易裁判所) : false;
    }

    /**
     * Is the value of courtTypeCode 家庭裁判所? <br>
     * 家庭裁判所: 家庭裁判所
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCourtTypeCode家庭裁判所() {
        CDef.CourtType cdef = getCourtTypeCodeAsCourtType();
        return cdef != null ? cdef.equals(CDef.CourtType.家庭裁判所) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkList'. */
    protected List<CaseMark> _caseMarkList;

    /**
     * [get] (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkList'.
     * @return The entity list of referrer property 'caseMarkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<CaseMark> getCaseMarkList() {
        if (_caseMarkList == null) { _caseMarkList = newReferrerList(); }
        return _caseMarkList;
    }

    /**
     * [set] (事件符号)CASE_MARK by COURT_TYPE_CODE, named 'caseMarkList'.
     * @param caseMarkList The entity list of referrer property 'caseMarkList'. (NullAllowed)
     */
    public void setCaseMarkList(List<CaseMark> caseMarkList) {
        _caseMarkList = caseMarkList;
    }

    /** (裁判所)COURT by COURT_TYPE_CODE, named 'courtList'. */
    protected List<Court> _courtList;

    /**
     * [get] (裁判所)COURT by COURT_TYPE_CODE, named 'courtList'.
     * @return The entity list of referrer property 'courtList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Court> getCourtList() {
        if (_courtList == null) { _courtList = newReferrerList(); }
        return _courtList;
    }

    /**
     * [set] (裁判所)COURT by COURT_TYPE_CODE, named 'courtList'.
     * @param courtList The entity list of referrer property 'courtList'. (NullAllowed)
     */
    public void setCourtList(List<Court> courtList) {
        _courtList = courtList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsClsCourtType) {
            BsClsCourtType other = (BsClsCourtType)obj;
            if (!xSV(_courtTypeCode, other._courtTypeCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _courtTypeCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_caseMarkList != null) { for (CaseMark et : _caseMarkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "caseMarkList")); } } }
        if (_courtList != null) { for (Court et : _courtList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "courtList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_courtTypeCode));
        sb.append(dm).append(xfND(_courtTypeName));
        sb.append(dm).append(xfND(_courtTypeAlias));
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
        if (_caseMarkList != null && !_caseMarkList.isEmpty())
        { sb.append(dm).append("caseMarkList"); }
        if (_courtList != null && !_courtList.isEmpty())
        { sb.append(dm).append("courtList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public ClsCourtType clone() {
        return (ClsCourtType)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * 裁判所種別コード e.g. SUPREME
     * @return The value of the column 'COURT_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtTypeCode() {
        checkSpecifiedProperty("courtTypeCode");
        return convertEmptyToNull(_courtTypeCode);
    }

    /**
     * [set] (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType} <br>
     * 裁判所種別コード e.g. SUPREME
     * @param courtTypeCode The value of the column 'COURT_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCourtTypeCode(String courtTypeCode) {
        registerModifiedProperty("courtTypeCode");
        _courtTypeCode = courtTypeCode;
    }

    /**
     * [get] (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * 裁判所種別名 e.g. 最高裁判所
     * @return The value of the column 'COURT_TYPE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtTypeName() {
        checkSpecifiedProperty("courtTypeName");
        return convertEmptyToNull(_courtTypeName);
    }

    /**
     * [set] (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * 裁判所種別名 e.g. 最高裁判所
     * @param courtTypeName The value of the column 'COURT_TYPE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCourtTypeName(String courtTypeName) {
        registerModifiedProperty("courtTypeName");
        _courtTypeName = courtTypeName;
    }

    /**
     * [get] (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * 裁判所種別別名 e.g. 最高裁判所
     * @return The value of the column 'COURT_TYPE_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtTypeAlias() {
        checkSpecifiedProperty("courtTypeAlias");
        return convertEmptyToNull(_courtTypeAlias);
    }

    /**
     * [set] (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * 裁判所種別別名 e.g. 最高裁判所
     * @param courtTypeAlias The value of the column 'COURT_TYPE_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setCourtTypeAlias(String courtTypeAlias) {
        registerModifiedProperty("courtTypeAlias");
        _courtTypeAlias = courtTypeAlias;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明 e.g. これこれするときのなになにです。
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * 説明 e.g. これこれするときのなになにです。
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番 e.g. 1
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)} <br>
     * 順番 e.g. 1
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
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
