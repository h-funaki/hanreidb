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
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The entity of (裁判所)COURT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     COURT_ID
 *
 * [column]
 *     COURT_ID, COURT_NAME, COURT_ALIAS, COURT_TYPE_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_COURT_TYPE
 *
 * [referrer table]
 *     JUDGEMENT
 *
 * [foreign property]
 *     clsCourtType
 *
 * [referrer property]
 *     judgementList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer courtId = entity.getCourtId();
 * String courtName = entity.getCourtName();
 * String courtAlias = entity.getCourtAlias();
 * String courtTypeCode = entity.getCourtTypeCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setCourtId(courtId);
 * entity.setCourtName(courtName);
 * entity.setCourtAlias(courtAlias);
 * entity.setCourtTypeCode(courtTypeCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCourt extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _courtId;

    /** (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)} */
    protected String _courtName;

    /** (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)} */
    protected String _courtAlias;

    /** (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} */
    protected String _courtTypeCode;

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
        return "COURT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_courtId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param courtAlias (裁判所別名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueByCourtAlias(String courtAlias) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("courtAlias");
        setCourtAlias(courtAlias);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param courtName (裁判所名): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueByCourtName(String courtName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("courtName");
        setCourtName(courtName);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CourtType getCourtTypeCodeAsCourtType() {
        return CDef.CourtType.codeOf(getCourtTypeCode());
    }

    /**
     * Set the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
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
    /** ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'. */
    protected OptionalEntity<ClsCourtType> _clsCourtType;

    /**
     * [get] ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsCourtType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsCourtType> getClsCourtType() {
        if (_clsCourtType == null) { _clsCourtType = OptionalEntity.relationEmpty(this, "clsCourtType"); }
        return _clsCourtType;
    }

    /**
     * [set] ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'.
     * @param clsCourtType The entity of foreign property 'clsCourtType'. (NullAllowed)
     */
    public void setClsCourtType(OptionalEntity<ClsCourtType> clsCourtType) {
        _clsCourtType = clsCourtType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (判決)JUDGEMENT by COURT_ID, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by COURT_ID, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by COURT_ID, named 'judgementList'.
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
        if (obj instanceof BsCourt) {
            BsCourt other = (BsCourt)obj;
            if (!xSV(_courtId, other._courtId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _courtId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_clsCourtType != null && _clsCourtType.isPresent())
        { sb.append(li).append(xbRDS(_clsCourtType, "clsCourtType")); }
        if (_judgementList != null) { for (Judgement et : _judgementList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "judgementList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_courtId));
        sb.append(dm).append(xfND(_courtName));
        sb.append(dm).append(xfND(_courtAlias));
        sb.append(dm).append(xfND(_courtTypeCode));
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
        if (_clsCourtType != null && _clsCourtType.isPresent())
        { sb.append(dm).append("clsCourtType"); }
        if (_judgementList != null && !_judgementList.isEmpty())
        { sb.append(dm).append("judgementList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Court clone() {
        return (Court)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'COURT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCourtId() {
        checkSpecifiedProperty("courtId");
        return _courtId;
    }

    /**
     * [set] (裁判所ID)COURT_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param courtId The value of the column 'COURT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCourtId(Integer courtId) {
        registerModifiedProperty("courtId");
        _courtId = courtId;
    }

    /**
     * [get] (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'COURT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtName() {
        checkSpecifiedProperty("courtName");
        return convertEmptyToNull(_courtName);
    }

    /**
     * [set] (裁判所名)COURT_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * @param courtName The value of the column 'COURT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCourtName(String courtName) {
        registerModifiedProperty("courtName");
        _courtName = courtName;
    }

    /**
     * [get] (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'COURT_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtAlias() {
        checkSpecifiedProperty("courtAlias");
        return convertEmptyToNull(_courtAlias);
    }

    /**
     * [set] (裁判所別名)COURT_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * @param courtAlias The value of the column 'COURT_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setCourtAlias(String courtAlias) {
        registerModifiedProperty("courtAlias");
        _courtAlias = courtAlias;
    }

    /**
     * [get] (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @return The value of the column 'COURT_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCourtTypeCode() {
        checkSpecifiedProperty("courtTypeCode");
        return convertEmptyToNull(_courtTypeCode);
    }

    /**
     * [set] (裁判所種別コード)COURT_TYPE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param courtTypeCode The value of the column 'COURT_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCourtTypeCode(String courtTypeCode) {
        registerModifiedProperty("courtTypeCode");
        _courtTypeCode = courtTypeCode;
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
