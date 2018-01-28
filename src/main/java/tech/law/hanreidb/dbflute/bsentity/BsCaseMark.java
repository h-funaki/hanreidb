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
 * The entity of (事件符号)CASE_MARK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     CASE_MARK_ID
 *
 * [column]
 *     CASE_MARK_ID, CASE_MARK_NAME, CASE_MARK_ALIAS, CASE_CATEGORY_CODE, COURT_TYPE_CODE, CASE_MARK_DETAIL, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CASE_MARK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_CASE_CATEGORY, CLS_COURT_TYPE
 *
 * [referrer table]
 *     JUDGEMENT
 *
 * [foreign property]
 *     clsCaseCategory, clsCourtType
 *
 * [referrer property]
 *     judgementList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer caseMarkId = entity.getCaseMarkId();
 * String caseMarkName = entity.getCaseMarkName();
 * String caseMarkAlias = entity.getCaseMarkAlias();
 * String caseCategoryCode = entity.getCaseCategoryCode();
 * String courtTypeCode = entity.getCourtTypeCode();
 * String caseMarkDetail = entity.getCaseMarkDetail();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setCaseMarkId(caseMarkId);
 * entity.setCaseMarkName(caseMarkName);
 * entity.setCaseMarkAlias(caseMarkAlias);
 * entity.setCaseCategoryCode(caseCategoryCode);
 * entity.setCourtTypeCode(courtTypeCode);
 * entity.setCaseMarkDetail(caseMarkDetail);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCaseMark extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _caseMarkId;

    /** (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)} */
    protected String _caseMarkName;

    /** (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)} */
    protected String _caseMarkAlias;

    /** (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} */
    protected String _caseCategoryCode;

    /** (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} */
    protected String _courtTypeCode;

    /** (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)} */
    protected String _caseMarkDetail;

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
        return "CASE_MARK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_caseMarkId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of caseCategoryCode as the classification of CaseCategory. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CaseCategory getCaseCategoryCodeAsCaseCategory() {
        return CDef.CaseCategory.codeOf(getCaseCategoryCode());
    }

    /**
     * Set the value of caseCategoryCode as the classification of CaseCategory. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory cdef) {
        setCaseCategoryCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.CourtType getCourtTypeCodeAsCourtType() {
        return CDef.CourtType.codeOf(getCourtTypeCode());
    }

    /**
     * Set the value of courtTypeCode as the classification of CourtType. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setCourtTypeCodeAsCourtType(CDef.CourtType cdef) {
        setCourtTypeCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of caseCategoryCode as 民事事件 (MIN). <br>
     * 民事事件: 民事事件
     */
    public void setCaseCategoryCode_民事事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.民事事件);
    }

    /**
     * Set the value of caseCategoryCode as 刑事事件 (KEI). <br>
     * 刑事事件: 刑事事件
     */
    public void setCaseCategoryCode_刑事事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.刑事事件);
    }

    /**
     * Set the value of caseCategoryCode as 行政事件 (GYO). <br>
     * 行政事件: 行政事件
     */
    public void setCaseCategoryCode_行政事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.行政事件);
    }

    /**
     * Set the value of caseCategoryCode as 没収裁判取消事件 (CONFISCATE). <br>
     * 没収の裁判の取消事件: 没収の裁判の取消事件
     */
    public void setCaseCategoryCode_没収裁判取消事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.没収裁判取消事件);
    }

    /**
     * Set the value of caseCategoryCode as 家庭事件 (DOMESTIC). <br>
     * 家庭事件: 家庭事件
     */
    public void setCaseCategoryCode_家庭事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.家庭事件);
    }

    /**
     * Set the value of caseCategoryCode as 秩序違反事件 (ORDER). <br>
     * 法廷等の秩序維持に関する法律違反事件: 法廷等の秩序維持に関する法律違反事件
     */
    public void setCaseCategoryCode_秩序違反事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.秩序違反事件);
    }

    /**
     * Set the value of caseCategoryCode as 裁判官の分限事件 (JUDGES). <br>
     * 裁判官の分限事件: 裁判官の分限事件
     */
    public void setCaseCategoryCode_裁判官の分限事件() {
        setCaseCategoryCodeAsCaseCategory(CDef.CaseCategory.裁判官の分限事件);
    }

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
     * Is the value of caseCategoryCode 民事事件? <br>
     * 民事事件: 民事事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode民事事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.民事事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 刑事事件? <br>
     * 刑事事件: 刑事事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode刑事事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.刑事事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 行政事件? <br>
     * 行政事件: 行政事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode行政事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.行政事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 没収裁判取消事件? <br>
     * 没収の裁判の取消事件: 没収の裁判の取消事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode没収裁判取消事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.没収裁判取消事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 家庭事件? <br>
     * 家庭事件: 家庭事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode家庭事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.家庭事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 秩序違反事件? <br>
     * 法廷等の秩序維持に関する法律違反事件: 法廷等の秩序維持に関する法律違反事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode秩序違反事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.秩序違反事件) : false;
    }

    /**
     * Is the value of caseCategoryCode 裁判官の分限事件? <br>
     * 裁判官の分限事件: 裁判官の分限事件
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isCaseCategoryCode裁判官の分限事件() {
        CDef.CaseCategory cdef = getCaseCategoryCodeAsCaseCategory();
        return cdef != null ? cdef.equals(CDef.CaseCategory.裁判官の分限事件) : false;
    }

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
    /** ([区分値]事件カテゴリー)CLS_CASE_CATEGORY by my CASE_CATEGORY_CODE, named 'clsCaseCategory'. */
    protected OptionalEntity<ClsCaseCategory> _clsCaseCategory;

    /**
     * [get] ([区分値]事件カテゴリー)CLS_CASE_CATEGORY by my CASE_CATEGORY_CODE, named 'clsCaseCategory'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'clsCaseCategory'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<ClsCaseCategory> getClsCaseCategory() {
        if (_clsCaseCategory == null) { _clsCaseCategory = OptionalEntity.relationEmpty(this, "clsCaseCategory"); }
        return _clsCaseCategory;
    }

    /**
     * [set] ([区分値]事件カテゴリー)CLS_CASE_CATEGORY by my CASE_CATEGORY_CODE, named 'clsCaseCategory'.
     * @param clsCaseCategory The entity of foreign property 'clsCaseCategory'. (NullAllowed)
     */
    public void setClsCaseCategory(OptionalEntity<ClsCaseCategory> clsCaseCategory) {
        _clsCaseCategory = clsCaseCategory;
    }

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
    /** (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementList'. */
    protected List<Judgement> _judgementList;

    /**
     * [get] (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementList'.
     * @return The entity list of referrer property 'judgementList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Judgement> getJudgementList() {
        if (_judgementList == null) { _judgementList = newReferrerList(); }
        return _judgementList;
    }

    /**
     * [set] (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementList'.
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
        if (obj instanceof BsCaseMark) {
            BsCaseMark other = (BsCaseMark)obj;
            if (!xSV(_caseMarkId, other._caseMarkId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _caseMarkId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_clsCaseCategory != null && _clsCaseCategory.isPresent())
        { sb.append(li).append(xbRDS(_clsCaseCategory, "clsCaseCategory")); }
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
        sb.append(dm).append(xfND(_caseMarkId));
        sb.append(dm).append(xfND(_caseMarkName));
        sb.append(dm).append(xfND(_caseMarkAlias));
        sb.append(dm).append(xfND(_caseCategoryCode));
        sb.append(dm).append(xfND(_courtTypeCode));
        sb.append(dm).append(xfND(_caseMarkDetail));
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
        if (_clsCaseCategory != null && _clsCaseCategory.isPresent())
        { sb.append(dm).append("clsCaseCategory"); }
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
    public CaseMark clone() {
        return (CaseMark)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'CASE_MARK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCaseMarkId() {
        checkSpecifiedProperty("caseMarkId");
        return _caseMarkId;
    }

    /**
     * [set] (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param caseMarkId The value of the column 'CASE_MARK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCaseMarkId(Integer caseMarkId) {
        registerModifiedProperty("caseMarkId");
        _caseMarkId = caseMarkId;
    }

    /**
     * [get] (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'CASE_MARK_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseMarkName() {
        checkSpecifiedProperty("caseMarkName");
        return convertEmptyToNull(_caseMarkName);
    }

    /**
     * [set] (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)} <br>
     * @param caseMarkName The value of the column 'CASE_MARK_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCaseMarkName(String caseMarkName) {
        registerModifiedProperty("caseMarkName");
        _caseMarkName = caseMarkName;
    }

    /**
     * [get] (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'CASE_MARK_ALIAS'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseMarkAlias() {
        checkSpecifiedProperty("caseMarkAlias");
        return convertEmptyToNull(_caseMarkAlias);
    }

    /**
     * [set] (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)} <br>
     * @param caseMarkAlias The value of the column 'CASE_MARK_ALIAS'. (basically NotNull if update: for the constraint)
     */
    public void setCaseMarkAlias(String caseMarkAlias) {
        registerModifiedProperty("caseMarkAlias");
        _caseMarkAlias = caseMarkAlias;
    }

    /**
     * [get] (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
     * @return The value of the column 'CASE_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseCategoryCode() {
        checkSpecifiedProperty("caseCategoryCode");
        return convertEmptyToNull(_caseCategoryCode);
    }

    /**
     * [set] (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
     * @param caseCategoryCode The value of the column 'CASE_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setCaseCategoryCode(String caseCategoryCode) {
        registerModifiedProperty("caseCategoryCode");
        _caseCategoryCode = caseCategoryCode;
    }

    /**
     * [get] (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @return The value of the column 'COURT_TYPE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCourtTypeCode() {
        checkSpecifiedProperty("courtTypeCode");
        return convertEmptyToNull(_courtTypeCode);
    }

    /**
     * [set] (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param courtTypeCode The value of the column 'COURT_TYPE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCourtTypeCode(String courtTypeCode) {
        registerModifiedProperty("courtTypeCode");
        _courtTypeCode = courtTypeCode;
    }

    /**
     * [get] (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)} <br>
     * @return The value of the column 'CASE_MARK_DETAIL'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseMarkDetail() {
        checkSpecifiedProperty("caseMarkDetail");
        return convertEmptyToNull(_caseMarkDetail);
    }

    /**
     * [set] (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)} <br>
     * @param caseMarkDetail The value of the column 'CASE_MARK_DETAIL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseMarkDetail(String caseMarkDetail) {
        registerModifiedProperty("caseMarkDetail");
        _caseMarkDetail = caseMarkDetail;
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
