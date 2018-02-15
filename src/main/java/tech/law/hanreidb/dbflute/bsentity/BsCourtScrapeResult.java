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
 * The entity of (裁判所スクレイピング結果)COURT_SCRAPE_RESULT as TABLE. <br>
 * 裁判所からスクレイピングした結果を格納
 * <pre>
 * [primary-key]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [column]
 *     COURT_SCRAPE_RESULT_ID, CASE_NUMBER, CASE_NAME, JUDGEMENT_DATE, COURT_NAME, JUDGEMENT_TYPE, JUDGEMENT_RESULT, PRECEDENT_REPORTS, ORIGINAL_COURT_NAME, ORIGINAL_CASE_NUMBER, ORIGINAL_JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_RESULT, JUDGEMENT_CONTENT, JUDGEMENT_SUMMARY, LAW, TEXT_URL, HIGH_COURT_REPORTS, JUDGEMENT_CONTENT_SUMMARY, RIGHT_TYPE, LAWSUIT_TYPE, CASE_CATEGORY, SOURCE_ORIGINAL_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long courtScrapeResultId = entity.getCourtScrapeResultId();
 * String caseNumber = entity.getCaseNumber();
 * String caseName = entity.getCaseName();
 * String judgementDate = entity.getJudgementDate();
 * String courtName = entity.getCourtName();
 * String judgementType = entity.getJudgementType();
 * String judgementResult = entity.getJudgementResult();
 * String precedentReports = entity.getPrecedentReports();
 * String originalCourtName = entity.getOriginalCourtName();
 * String originalCaseNumber = entity.getOriginalCaseNumber();
 * String originalJudgementDate = entity.getOriginalJudgementDate();
 * String originalJudgementResult = entity.getOriginalJudgementResult();
 * String judgementContent = entity.getJudgementContent();
 * String judgementSummary = entity.getJudgementSummary();
 * String law = entity.getLaw();
 * String textUrl = entity.getTextUrl();
 * String highCourtReports = entity.getHighCourtReports();
 * String judgementContentSummary = entity.getJudgementContentSummary();
 * String rightType = entity.getRightType();
 * String lawsuitType = entity.getLawsuitType();
 * String caseCategory = entity.getCaseCategory();
 * Integer sourceOriginalId = entity.getSourceOriginalId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setCourtScrapeResultId(courtScrapeResultId);
 * entity.setCaseNumber(caseNumber);
 * entity.setCaseName(caseName);
 * entity.setJudgementDate(judgementDate);
 * entity.setCourtName(courtName);
 * entity.setJudgementType(judgementType);
 * entity.setJudgementResult(judgementResult);
 * entity.setPrecedentReports(precedentReports);
 * entity.setOriginalCourtName(originalCourtName);
 * entity.setOriginalCaseNumber(originalCaseNumber);
 * entity.setOriginalJudgementDate(originalJudgementDate);
 * entity.setOriginalJudgementResult(originalJudgementResult);
 * entity.setJudgementContent(judgementContent);
 * entity.setJudgementSummary(judgementSummary);
 * entity.setLaw(law);
 * entity.setTextUrl(textUrl);
 * entity.setHighCourtReports(highCourtReports);
 * entity.setJudgementContentSummary(judgementContentSummary);
 * entity.setRightType(rightType);
 * entity.setLawsuitType(lawsuitType);
 * entity.setCaseCategory(caseCategory);
 * entity.setSourceOriginalId(sourceOriginalId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCourtScrapeResult extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} */
    protected Long _courtScrapeResultId;

    /** (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)} */
    protected String _caseNumber;

    /** (事件名)CASE_NAME: {TEXT(65535)} */
    protected String _caseName;

    /** (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)} */
    protected String _judgementDate;

    /** (裁判所名)COURT_NAME: {VARCHAR(50)} */
    protected String _courtName;

    /** (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)} */
    protected String _judgementType;

    /** (結果)JUDGEMENT_RESULT: {VARCHAR(50)} */
    protected String _judgementResult;

    /** (判例集)PRECEDENT_REPORTS: {VARCHAR(50)} */
    protected String _precedentReports;

    /** (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)} */
    protected String _originalCourtName;

    /** (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)} */
    protected String _originalCaseNumber;

    /** (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)} */
    protected String _originalJudgementDate;

    /** (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)} */
    protected String _originalJudgementResult;

    /** (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)} */
    protected String _judgementContent;

    /** (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)} */
    protected String _judgementSummary;

    /** (参照法条)LAW: {TEXT(65535)} */
    protected String _law;

    /** (全文URL)TEXT_URL: {VARCHAR(150)} */
    protected String _textUrl;

    /** (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)} */
    protected String _highCourtReports;

    /** (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)} */
    protected String _judgementContentSummary;

    /** (権利種別)RIGHT_TYPE: {TEXT(65535)} */
    protected String _rightType;

    /** (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)} */
    protected String _lawsuitType;

    /** (事件分野)CASE_CATEGORY: {VARCHAR(100)} */
    protected String _caseCategory;

    /** (取得元ID)SOURCE_ORIGINAL_ID: {NotNull, INT UNSIGNED(10)} */
    protected Integer _sourceOriginalId;

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
        return "COURT_SCRAPE_RESULT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_courtScrapeResultId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param caseNumber (事件番号): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    public void uniqueBy(String caseNumber) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("caseNumber");
        setCaseNumber(caseNumber);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsCourtScrapeResult) {
            BsCourtScrapeResult other = (BsCourtScrapeResult)obj;
            if (!xSV(_courtScrapeResultId, other._courtScrapeResultId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _courtScrapeResultId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_courtScrapeResultId));
        sb.append(dm).append(xfND(_caseNumber));
        sb.append(dm).append(xfND(_caseName));
        sb.append(dm).append(xfND(_judgementDate));
        sb.append(dm).append(xfND(_courtName));
        sb.append(dm).append(xfND(_judgementType));
        sb.append(dm).append(xfND(_judgementResult));
        sb.append(dm).append(xfND(_precedentReports));
        sb.append(dm).append(xfND(_originalCourtName));
        sb.append(dm).append(xfND(_originalCaseNumber));
        sb.append(dm).append(xfND(_originalJudgementDate));
        sb.append(dm).append(xfND(_originalJudgementResult));
        sb.append(dm).append(xfND(_judgementContent));
        sb.append(dm).append(xfND(_judgementSummary));
        sb.append(dm).append(xfND(_law));
        sb.append(dm).append(xfND(_textUrl));
        sb.append(dm).append(xfND(_highCourtReports));
        sb.append(dm).append(xfND(_judgementContentSummary));
        sb.append(dm).append(xfND(_rightType));
        sb.append(dm).append(xfND(_lawsuitType));
        sb.append(dm).append(xfND(_caseCategory));
        sb.append(dm).append(xfND(_sourceOriginalId));
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
        return "";
    }

    @Override
    public CourtScrapeResult clone() {
        return (CourtScrapeResult)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @return The value of the column 'COURT_SCRAPE_RESULT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCourtScrapeResultId() {
        checkSpecifiedProperty("courtScrapeResultId");
        return _courtScrapeResultId;
    }

    /**
     * [set] (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)} <br>
     * @param courtScrapeResultId The value of the column 'COURT_SCRAPE_RESULT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCourtScrapeResultId(Long courtScrapeResultId) {
        registerModifiedProperty("courtScrapeResultId");
        _courtScrapeResultId = courtScrapeResultId;
    }

    /**
     * [get] (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'CASE_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public String getCaseNumber() {
        checkSpecifiedProperty("caseNumber");
        return convertEmptyToNull(_caseNumber);
    }

    /**
     * [set] (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)} <br>
     * @param caseNumber The value of the column 'CASE_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setCaseNumber(String caseNumber) {
        registerModifiedProperty("caseNumber");
        _caseNumber = caseNumber;
    }

    /**
     * [get] (事件名)CASE_NAME: {TEXT(65535)} <br>
     * @return The value of the column 'CASE_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseName() {
        checkSpecifiedProperty("caseName");
        return convertEmptyToNull(_caseName);
    }

    /**
     * [set] (事件名)CASE_NAME: {TEXT(65535)} <br>
     * @param caseName The value of the column 'CASE_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseName(String caseName) {
        registerModifiedProperty("caseName");
        _caseName = caseName;
    }

    /**
     * [get] (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * @return The value of the column 'JUDGEMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementDate() {
        checkSpecifiedProperty("judgementDate");
        return convertEmptyToNull(_judgementDate);
    }

    /**
     * [set] (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * @param judgementDate The value of the column 'JUDGEMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementDate(String judgementDate) {
        registerModifiedProperty("judgementDate");
        _judgementDate = judgementDate;
    }

    /**
     * [get] (裁判所名)COURT_NAME: {VARCHAR(50)} <br>
     * @return The value of the column 'COURT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCourtName() {
        checkSpecifiedProperty("courtName");
        return convertEmptyToNull(_courtName);
    }

    /**
     * [set] (裁判所名)COURT_NAME: {VARCHAR(50)} <br>
     * @param courtName The value of the column 'COURT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCourtName(String courtName) {
        registerModifiedProperty("courtName");
        _courtName = courtName;
    }

    /**
     * [get] (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)} <br>
     * @return The value of the column 'JUDGEMENT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementType() {
        checkSpecifiedProperty("judgementType");
        return convertEmptyToNull(_judgementType);
    }

    /**
     * [set] (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)} <br>
     * @param judgementType The value of the column 'JUDGEMENT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementType(String judgementType) {
        registerModifiedProperty("judgementType");
        _judgementType = judgementType;
    }

    /**
     * [get] (結果)JUDGEMENT_RESULT: {VARCHAR(50)} <br>
     * @return The value of the column 'JUDGEMENT_RESULT'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementResult() {
        checkSpecifiedProperty("judgementResult");
        return convertEmptyToNull(_judgementResult);
    }

    /**
     * [set] (結果)JUDGEMENT_RESULT: {VARCHAR(50)} <br>
     * @param judgementResult The value of the column 'JUDGEMENT_RESULT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementResult(String judgementResult) {
        registerModifiedProperty("judgementResult");
        _judgementResult = judgementResult;
    }

    /**
     * [get] (判例集)PRECEDENT_REPORTS: {VARCHAR(50)} <br>
     * @return The value of the column 'PRECEDENT_REPORTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrecedentReports() {
        checkSpecifiedProperty("precedentReports");
        return convertEmptyToNull(_precedentReports);
    }

    /**
     * [set] (判例集)PRECEDENT_REPORTS: {VARCHAR(50)} <br>
     * @param precedentReports The value of the column 'PRECEDENT_REPORTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrecedentReports(String precedentReports) {
        registerModifiedProperty("precedentReports");
        _precedentReports = precedentReports;
    }

    /**
     * [get] (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)} <br>
     * @return The value of the column 'ORIGINAL_COURT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalCourtName() {
        checkSpecifiedProperty("originalCourtName");
        return convertEmptyToNull(_originalCourtName);
    }

    /**
     * [set] (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)} <br>
     * @param originalCourtName The value of the column 'ORIGINAL_COURT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalCourtName(String originalCourtName) {
        registerModifiedProperty("originalCourtName");
        _originalCourtName = originalCourtName;
    }

    /**
     * [get] (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)} <br>
     * @return The value of the column 'ORIGINAL_CASE_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalCaseNumber() {
        checkSpecifiedProperty("originalCaseNumber");
        return convertEmptyToNull(_originalCaseNumber);
    }

    /**
     * [set] (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)} <br>
     * @param originalCaseNumber The value of the column 'ORIGINAL_CASE_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalCaseNumber(String originalCaseNumber) {
        registerModifiedProperty("originalCaseNumber");
        _originalCaseNumber = originalCaseNumber;
    }

    /**
     * [get] (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * @return The value of the column 'ORIGINAL_JUDGEMENT_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalJudgementDate() {
        checkSpecifiedProperty("originalJudgementDate");
        return convertEmptyToNull(_originalJudgementDate);
    }

    /**
     * [set] (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * @param originalJudgementDate The value of the column 'ORIGINAL_JUDGEMENT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalJudgementDate(String originalJudgementDate) {
        registerModifiedProperty("originalJudgementDate");
        _originalJudgementDate = originalJudgementDate;
    }

    /**
     * [get] (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)} <br>
     * @return The value of the column 'ORIGINAL_JUDGEMENT_RESULT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOriginalJudgementResult() {
        checkSpecifiedProperty("originalJudgementResult");
        return convertEmptyToNull(_originalJudgementResult);
    }

    /**
     * [set] (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)} <br>
     * @param originalJudgementResult The value of the column 'ORIGINAL_JUDGEMENT_RESULT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOriginalJudgementResult(String originalJudgementResult) {
        registerModifiedProperty("originalJudgementResult");
        _originalJudgementResult = originalJudgementResult;
    }

    /**
     * [get] (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)} <br>
     * @return The value of the column 'JUDGEMENT_CONTENT'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementContent() {
        checkSpecifiedProperty("judgementContent");
        return convertEmptyToNull(_judgementContent);
    }

    /**
     * [set] (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)} <br>
     * @param judgementContent The value of the column 'JUDGEMENT_CONTENT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementContent(String judgementContent) {
        registerModifiedProperty("judgementContent");
        _judgementContent = judgementContent;
    }

    /**
     * [get] (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)} <br>
     * @return The value of the column 'JUDGEMENT_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementSummary() {
        checkSpecifiedProperty("judgementSummary");
        return convertEmptyToNull(_judgementSummary);
    }

    /**
     * [set] (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)} <br>
     * @param judgementSummary The value of the column 'JUDGEMENT_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementSummary(String judgementSummary) {
        registerModifiedProperty("judgementSummary");
        _judgementSummary = judgementSummary;
    }

    /**
     * [get] (参照法条)LAW: {TEXT(65535)} <br>
     * @return The value of the column 'LAW'. (NullAllowed even if selected: for no constraint)
     */
    public String getLaw() {
        checkSpecifiedProperty("law");
        return convertEmptyToNull(_law);
    }

    /**
     * [set] (参照法条)LAW: {TEXT(65535)} <br>
     * @param law The value of the column 'LAW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLaw(String law) {
        registerModifiedProperty("law");
        _law = law;
    }

    /**
     * [get] (全文URL)TEXT_URL: {VARCHAR(150)} <br>
     * @return The value of the column 'TEXT_URL'. (NullAllowed even if selected: for no constraint)
     */
    public String getTextUrl() {
        checkSpecifiedProperty("textUrl");
        return convertEmptyToNull(_textUrl);
    }

    /**
     * [set] (全文URL)TEXT_URL: {VARCHAR(150)} <br>
     * @param textUrl The value of the column 'TEXT_URL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTextUrl(String textUrl) {
        registerModifiedProperty("textUrl");
        _textUrl = textUrl;
    }

    /**
     * [get] (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)} <br>
     * @return The value of the column 'HIGH_COURT_REPORTS'. (NullAllowed even if selected: for no constraint)
     */
    public String getHighCourtReports() {
        checkSpecifiedProperty("highCourtReports");
        return convertEmptyToNull(_highCourtReports);
    }

    /**
     * [set] (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)} <br>
     * @param highCourtReports The value of the column 'HIGH_COURT_REPORTS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHighCourtReports(String highCourtReports) {
        registerModifiedProperty("highCourtReports");
        _highCourtReports = highCourtReports;
    }

    /**
     * [get] (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)} <br>
     * @return The value of the column 'JUDGEMENT_CONTENT_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getJudgementContentSummary() {
        checkSpecifiedProperty("judgementContentSummary");
        return convertEmptyToNull(_judgementContentSummary);
    }

    /**
     * [set] (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)} <br>
     * @param judgementContentSummary The value of the column 'JUDGEMENT_CONTENT_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJudgementContentSummary(String judgementContentSummary) {
        registerModifiedProperty("judgementContentSummary");
        _judgementContentSummary = judgementContentSummary;
    }

    /**
     * [get] (権利種別)RIGHT_TYPE: {TEXT(65535)} <br>
     * @return The value of the column 'RIGHT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getRightType() {
        checkSpecifiedProperty("rightType");
        return convertEmptyToNull(_rightType);
    }

    /**
     * [set] (権利種別)RIGHT_TYPE: {TEXT(65535)} <br>
     * @param rightType The value of the column 'RIGHT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRightType(String rightType) {
        registerModifiedProperty("rightType");
        _rightType = rightType;
    }

    /**
     * [get] (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)} <br>
     * @return The value of the column 'LAWSUIT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLawsuitType() {
        checkSpecifiedProperty("lawsuitType");
        return convertEmptyToNull(_lawsuitType);
    }

    /**
     * [set] (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)} <br>
     * @param lawsuitType The value of the column 'LAWSUIT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLawsuitType(String lawsuitType) {
        registerModifiedProperty("lawsuitType");
        _lawsuitType = lawsuitType;
    }

    /**
     * [get] (事件分野)CASE_CATEGORY: {VARCHAR(100)} <br>
     * @return The value of the column 'CASE_CATEGORY'. (NullAllowed even if selected: for no constraint)
     */
    public String getCaseCategory() {
        checkSpecifiedProperty("caseCategory");
        return convertEmptyToNull(_caseCategory);
    }

    /**
     * [set] (事件分野)CASE_CATEGORY: {VARCHAR(100)} <br>
     * @param caseCategory The value of the column 'CASE_CATEGORY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseCategory(String caseCategory) {
        registerModifiedProperty("caseCategory");
        _caseCategory = caseCategory;
    }

    /**
     * [get] (取得元ID)SOURCE_ORIGINAL_ID: {NotNull, INT UNSIGNED(10)} <br>
     * URL末尾のID。最大6桁。
     * @return The value of the column 'SOURCE_ORIGINAL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSourceOriginalId() {
        checkSpecifiedProperty("sourceOriginalId");
        return _sourceOriginalId;
    }

    /**
     * [set] (取得元ID)SOURCE_ORIGINAL_ID: {NotNull, INT UNSIGNED(10)} <br>
     * URL末尾のID。最大6桁。
     * @param sourceOriginalId The value of the column 'SOURCE_ORIGINAL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSourceOriginalId(Integer sourceOriginalId) {
        registerModifiedProperty("sourceOriginalId");
        _sourceOriginalId = sourceOriginalId;
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
