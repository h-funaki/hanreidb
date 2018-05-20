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
 * The entity of (法令)LAW as TABLE. <br>
 * 通称は以下のサイトから手動で取得。http://elaws.e-gov.go.jp/search/elawsSearch/elaws_search/lsg0100/search
 * <pre>
 * [primary-key]
 *     LAW_ID
 *
 * [column]
 *     LAW_ID, LAW_TYPE_CODE, LAW_PUBLIC_CODE, LAW_NAME, LAW_NUMBER, PROMULGATION_DATE, EFFECTIVE_DATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_TYPE
 *
 * [referrer table]
 *     LAW_ALIAS, LAW_CATEGORY_REL, LAW_HISTORY, LAW_SOURCE_REL, SOURCE_LAW_CATEGORY_REL
 *
 * [foreign property]
 *     lawType
 *
 * [referrer property]
 *     lawAliasList, lawCategoryRelList, lawHistoryByAmendLawIdList, lawHistoryByLawIdList, lawSourceRelList, sourceLawCategoryRelList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer lawId = entity.getLawId();
 * String lawTypeCode = entity.getLawTypeCode();
 * String lawPublicCode = entity.getLawPublicCode();
 * String lawName = entity.getLawName();
 * String lawNumber = entity.getLawNumber();
 * java.time.LocalDate promulgationDate = entity.getPromulgationDate();
 * java.time.LocalDate effectiveDate = entity.getEffectiveDate();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setLawId(lawId);
 * entity.setLawTypeCode(lawTypeCode);
 * entity.setLawPublicCode(lawPublicCode);
 * entity.setLawName(lawName);
 * entity.setLawNumber(lawNumber);
 * entity.setPromulgationDate(promulgationDate);
 * entity.setEffectiveDate(effectiveDate);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLaw extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _lawId;

    /** (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE} */
    protected String _lawTypeCode;

    /** (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)} */
    protected String _lawPublicCode;

    /** (法令名)LAW_NAME: {NotNull, TEXT(65535)} */
    protected String _lawName;

    /** (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)} */
    protected String _lawNumber;

    /** (公布日)PROMULGATION_DATE: {DATE(10)} */
    protected java.time.LocalDate _promulgationDate;

    /** (施行日)EFFECTIVE_DATE: {DATE(10)} */
    protected java.time.LocalDate _effectiveDate;

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
        return "LAW";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_lawId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawNumber (法令番号): UQ, NotNull, VARCHAR(200). (NotNull)
     */
    public void uniqueByLawNumber(String lawNumber) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawNumber");
        setLawNumber(lawNumber);
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param lawPublicCode (法令公開コード): UQ, NotNull, VARCHAR(12). (NotNull)
     */
    public void uniqueByLawPublicCode(String lawPublicCode) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("lawPublicCode");
        setLawPublicCode(lawPublicCode);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (法令種別)LAW_TYPE by my LAW_TYPE_CODE, named 'lawType'. */
    protected OptionalEntity<LawType> _lawType;

    /**
     * [get] (法令種別)LAW_TYPE by my LAW_TYPE_CODE, named 'lawType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'lawType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<LawType> getLawType() {
        if (_lawType == null) { _lawType = OptionalEntity.relationEmpty(this, "lawType"); }
        return _lawType;
    }

    /**
     * [set] (法令種別)LAW_TYPE by my LAW_TYPE_CODE, named 'lawType'.
     * @param lawType The entity of foreign property 'lawType'. (NullAllowed)
     */
    public void setLawType(OptionalEntity<LawType> lawType) {
        _lawType = lawType;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'. */
    protected List<LawAlias> _lawAliasList;

    /**
     * [get] (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * @return The entity list of referrer property 'lawAliasList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawAlias> getLawAliasList() {
        if (_lawAliasList == null) { _lawAliasList = newReferrerList(); }
        return _lawAliasList;
    }

    /**
     * [set] (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * @param lawAliasList The entity list of referrer property 'lawAliasList'. (NullAllowed)
     */
    public void setLawAliasList(List<LawAlias> lawAliasList) {
        _lawAliasList = lawAliasList;
    }

    /** (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'. */
    protected List<LawCategoryRel> _lawCategoryRelList;

    /**
     * [get] (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * @return The entity list of referrer property 'lawCategoryRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawCategoryRel> getLawCategoryRelList() {
        if (_lawCategoryRelList == null) { _lawCategoryRelList = newReferrerList(); }
        return _lawCategoryRelList;
    }

    /**
     * [set] (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * @param lawCategoryRelList The entity list of referrer property 'lawCategoryRelList'. (NullAllowed)
     */
    public void setLawCategoryRelList(List<LawCategoryRel> lawCategoryRelList) {
        _lawCategoryRelList = lawCategoryRelList;
    }

    /** (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'. */
    protected List<LawHistory> _lawHistoryByAmendLawIdList;

    /**
     * [get] (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * @return The entity list of referrer property 'lawHistoryByAmendLawIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawHistory> getLawHistoryByAmendLawIdList() {
        if (_lawHistoryByAmendLawIdList == null) { _lawHistoryByAmendLawIdList = newReferrerList(); }
        return _lawHistoryByAmendLawIdList;
    }

    /**
     * [set] (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * @param lawHistoryByAmendLawIdList The entity list of referrer property 'lawHistoryByAmendLawIdList'. (NullAllowed)
     */
    public void setLawHistoryByAmendLawIdList(List<LawHistory> lawHistoryByAmendLawIdList) {
        _lawHistoryByAmendLawIdList = lawHistoryByAmendLawIdList;
    }

    /** (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'. */
    protected List<LawHistory> _lawHistoryByLawIdList;

    /**
     * [get] (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * @return The entity list of referrer property 'lawHistoryByLawIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawHistory> getLawHistoryByLawIdList() {
        if (_lawHistoryByLawIdList == null) { _lawHistoryByLawIdList = newReferrerList(); }
        return _lawHistoryByLawIdList;
    }

    /**
     * [set] (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * @param lawHistoryByLawIdList The entity list of referrer property 'lawHistoryByLawIdList'. (NullAllowed)
     */
    public void setLawHistoryByLawIdList(List<LawHistory> lawHistoryByLawIdList) {
        _lawHistoryByLawIdList = lawHistoryByLawIdList;
    }

    /** (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'. */
    protected List<LawSourceRel> _lawSourceRelList;

    /**
     * [get] (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * @return The entity list of referrer property 'lawSourceRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<LawSourceRel> getLawSourceRelList() {
        if (_lawSourceRelList == null) { _lawSourceRelList = newReferrerList(); }
        return _lawSourceRelList;
    }

    /**
     * [set] (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * @param lawSourceRelList The entity list of referrer property 'lawSourceRelList'. (NullAllowed)
     */
    public void setLawSourceRelList(List<LawSourceRel> lawSourceRelList) {
        _lawSourceRelList = lawSourceRelList;
    }

    /** (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'. */
    protected List<SourceLawCategoryRel> _sourceLawCategoryRelList;

    /**
     * [get] (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * @return The entity list of referrer property 'sourceLawCategoryRelList'. (NotNull: even if no loading, returns empty list)
     */
    public List<SourceLawCategoryRel> getSourceLawCategoryRelList() {
        if (_sourceLawCategoryRelList == null) { _sourceLawCategoryRelList = newReferrerList(); }
        return _sourceLawCategoryRelList;
    }

    /**
     * [set] (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * @param sourceLawCategoryRelList The entity list of referrer property 'sourceLawCategoryRelList'. (NullAllowed)
     */
    public void setSourceLawCategoryRelList(List<SourceLawCategoryRel> sourceLawCategoryRelList) {
        _sourceLawCategoryRelList = sourceLawCategoryRelList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLaw) {
            BsLaw other = (BsLaw)obj;
            if (!xSV(_lawId, other._lawId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _lawId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_lawType != null && _lawType.isPresent())
        { sb.append(li).append(xbRDS(_lawType, "lawType")); }
        if (_lawAliasList != null) { for (LawAlias et : _lawAliasList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawAliasList")); } } }
        if (_lawCategoryRelList != null) { for (LawCategoryRel et : _lawCategoryRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawCategoryRelList")); } } }
        if (_lawHistoryByAmendLawIdList != null) { for (LawHistory et : _lawHistoryByAmendLawIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawHistoryByAmendLawIdList")); } } }
        if (_lawHistoryByLawIdList != null) { for (LawHistory et : _lawHistoryByLawIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawHistoryByLawIdList")); } } }
        if (_lawSourceRelList != null) { for (LawSourceRel et : _lawSourceRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "lawSourceRelList")); } } }
        if (_sourceLawCategoryRelList != null) { for (SourceLawCategoryRel et : _sourceLawCategoryRelList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "sourceLawCategoryRelList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_lawId));
        sb.append(dm).append(xfND(_lawTypeCode));
        sb.append(dm).append(xfND(_lawPublicCode));
        sb.append(dm).append(xfND(_lawName));
        sb.append(dm).append(xfND(_lawNumber));
        sb.append(dm).append(xfND(_promulgationDate));
        sb.append(dm).append(xfND(_effectiveDate));
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
        if (_lawType != null && _lawType.isPresent())
        { sb.append(dm).append("lawType"); }
        if (_lawAliasList != null && !_lawAliasList.isEmpty())
        { sb.append(dm).append("lawAliasList"); }
        if (_lawCategoryRelList != null && !_lawCategoryRelList.isEmpty())
        { sb.append(dm).append("lawCategoryRelList"); }
        if (_lawHistoryByAmendLawIdList != null && !_lawHistoryByAmendLawIdList.isEmpty())
        { sb.append(dm).append("lawHistoryByAmendLawIdList"); }
        if (_lawHistoryByLawIdList != null && !_lawHistoryByLawIdList.isEmpty())
        { sb.append(dm).append("lawHistoryByLawIdList"); }
        if (_lawSourceRelList != null && !_lawSourceRelList.isEmpty())
        { sb.append(dm).append("lawSourceRelList"); }
        if (_sourceLawCategoryRelList != null && !_sourceLawCategoryRelList.isEmpty())
        { sb.append(dm).append("sourceLawCategoryRelList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Law clone() {
        return (Law)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LAW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLawId() {
        checkSpecifiedProperty("lawId");
        return _lawId;
    }

    /**
     * [set] (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param lawId The value of the column 'LAW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLawId(Integer lawId) {
        registerModifiedProperty("lawId");
        _lawId = lawId;
    }

    /**
     * [get] (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE} <br>
     * @return The value of the column 'LAW_TYPE_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLawTypeCode() {
        checkSpecifiedProperty("lawTypeCode");
        return convertEmptyToNull(_lawTypeCode);
    }

    /**
     * [set] (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE} <br>
     * @param lawTypeCode The value of the column 'LAW_TYPE_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLawTypeCode(String lawTypeCode) {
        registerModifiedProperty("lawTypeCode");
        _lawTypeCode = lawTypeCode;
    }

    /**
     * [get] (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)} <br>
     * LAW + ランダムの大文字アルファベット3文字 + ランダムの数字6文字
     * @return The value of the column 'LAW_PUBLIC_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getLawPublicCode() {
        checkSpecifiedProperty("lawPublicCode");
        return convertEmptyToNull(_lawPublicCode);
    }

    /**
     * [set] (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)} <br>
     * LAW + ランダムの大文字アルファベット3文字 + ランダムの数字6文字
     * @param lawPublicCode The value of the column 'LAW_PUBLIC_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setLawPublicCode(String lawPublicCode) {
        registerModifiedProperty("lawPublicCode");
        _lawPublicCode = lawPublicCode;
    }

    /**
     * [get] (法令名)LAW_NAME: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'LAW_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLawName() {
        checkSpecifiedProperty("lawName");
        return convertEmptyToNull(_lawName);
    }

    /**
     * [set] (法令名)LAW_NAME: {NotNull, TEXT(65535)} <br>
     * @param lawName The value of the column 'LAW_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLawName(String lawName) {
        registerModifiedProperty("lawName");
        _lawName = lawName;
    }

    /**
     * [get] (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)} <br>
     * 法令番号がない場合は「法令番号なし」+PK
     * @return The value of the column 'LAW_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public String getLawNumber() {
        checkSpecifiedProperty("lawNumber");
        return convertEmptyToNull(_lawNumber);
    }

    /**
     * [set] (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)} <br>
     * 法令番号がない場合は「法令番号なし」+PK
     * @param lawNumber The value of the column 'LAW_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setLawNumber(String lawNumber) {
        registerModifiedProperty("lawNumber");
        _lawNumber = lawNumber;
    }

    /**
     * [get] (公布日)PROMULGATION_DATE: {DATE(10)} <br>
     * @return The value of the column 'PROMULGATION_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getPromulgationDate() {
        checkSpecifiedProperty("promulgationDate");
        return _promulgationDate;
    }

    /**
     * [set] (公布日)PROMULGATION_DATE: {DATE(10)} <br>
     * @param promulgationDate The value of the column 'PROMULGATION_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPromulgationDate(java.time.LocalDate promulgationDate) {
        registerModifiedProperty("promulgationDate");
        _promulgationDate = promulgationDate;
    }

    /**
     * [get] (施行日)EFFECTIVE_DATE: {DATE(10)} <br>
     * @return The value of the column 'EFFECTIVE_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getEffectiveDate() {
        checkSpecifiedProperty("effectiveDate");
        return _effectiveDate;
    }

    /**
     * [set] (施行日)EFFECTIVE_DATE: {DATE(10)} <br>
     * @param effectiveDate The value of the column 'EFFECTIVE_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEffectiveDate(java.time.LocalDate effectiveDate) {
        registerModifiedProperty("effectiveDate");
        _effectiveDate = effectiveDate;
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
