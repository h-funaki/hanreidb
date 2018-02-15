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
package tech.law.hanreidb.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import tech.law.hanreidb.dbflute.cbean.cq.ciq.*;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The base condition-query of COURT_SCRAPE_RESULT.
 * @author DBFlute(AutoGenerator)
 */
public class BsCourtScrapeResultCQ extends AbstractBsCourtScrapeResultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CourtScrapeResultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCourtScrapeResultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from COURT_SCRAPE_RESULT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CourtScrapeResultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CourtScrapeResultCIQ xcreateCIQ() {
        CourtScrapeResultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CourtScrapeResultCIQ xnewCIQ() {
        return new CourtScrapeResultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join COURT_SCRAPE_RESULT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CourtScrapeResultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CourtScrapeResultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _courtScrapeResultId;
    public ConditionValue xdfgetCourtScrapeResultId()
    { if (_courtScrapeResultId == null) { _courtScrapeResultId = nCV(); }
      return _courtScrapeResultId; }
    protected ConditionValue xgetCValueCourtScrapeResultId() { return xdfgetCourtScrapeResultId(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CourtScrapeResultId_Asc() { regOBA("COURT_SCRAPE_RESULT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所スクレイピング結果ID)COURT_SCRAPE_RESULT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CourtScrapeResultId_Desc() { regOBD("COURT_SCRAPE_RESULT_ID"); return this; }

    protected ConditionValue _caseNumber;
    public ConditionValue xdfgetCaseNumber()
    { if (_caseNumber == null) { _caseNumber = nCV(); }
      return _caseNumber; }
    protected ConditionValue xgetCValueCaseNumber() { return xdfgetCaseNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CaseNumber_Asc() { regOBA("CASE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件番号)CASE_NUMBER: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CaseNumber_Desc() { regOBD("CASE_NUMBER"); return this; }

    protected ConditionValue _caseName;
    public ConditionValue xdfgetCaseName()
    { if (_caseName == null) { _caseName = nCV(); }
      return _caseName; }
    protected ConditionValue xgetCValueCaseName() { return xdfgetCaseName(); }

    protected ConditionValue _judgementDate;
    public ConditionValue xdfgetJudgementDate()
    { if (_judgementDate == null) { _judgementDate = nCV(); }
      return _judgementDate; }
    protected ConditionValue xgetCValueJudgementDate() { return xdfgetJudgementDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementDate_Asc() { regOBA("JUDGEMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementDate_Desc() { regOBD("JUDGEMENT_DATE"); return this; }

    protected ConditionValue _courtName;
    public ConditionValue xdfgetCourtName()
    { if (_courtName == null) { _courtName = nCV(); }
      return _courtName; }
    protected ConditionValue xgetCValueCourtName() { return xdfgetCourtName(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CourtName_Asc() { regOBA("COURT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CourtName_Desc() { regOBD("COURT_NAME"); return this; }

    protected ConditionValue _judgementType;
    public ConditionValue xdfgetJudgementType()
    { if (_judgementType == null) { _judgementType = nCV(); }
      return _judgementType; }
    protected ConditionValue xgetCValueJudgementType() { return xdfgetJudgementType(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementType_Asc() { regOBA("JUDGEMENT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementType_Desc() { regOBD("JUDGEMENT_TYPE"); return this; }

    protected ConditionValue _judgementResult;
    public ConditionValue xdfgetJudgementResult()
    { if (_judgementResult == null) { _judgementResult = nCV(); }
      return _judgementResult; }
    protected ConditionValue xgetCValueJudgementResult() { return xdfgetJudgementResult(); }

    /** 
     * Add order-by as ascend. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementResult_Asc() { regOBA("JUDGEMENT_RESULT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_JudgementResult_Desc() { regOBD("JUDGEMENT_RESULT"); return this; }

    protected ConditionValue _precedentReports;
    public ConditionValue xdfgetPrecedentReports()
    { if (_precedentReports == null) { _precedentReports = nCV(); }
      return _precedentReports; }
    protected ConditionValue xgetCValuePrecedentReports() { return xdfgetPrecedentReports(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_PrecedentReports_Asc() { regOBA("PRECEDENT_REPORTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_PrecedentReports_Desc() { regOBD("PRECEDENT_REPORTS"); return this; }

    protected ConditionValue _originalCourtName;
    public ConditionValue xdfgetOriginalCourtName()
    { if (_originalCourtName == null) { _originalCourtName = nCV(); }
      return _originalCourtName; }
    protected ConditionValue xgetCValueOriginalCourtName() { return xdfgetOriginalCourtName(); }

    /** 
     * Add order-by as ascend. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalCourtName_Asc() { regOBA("ORIGINAL_COURT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalCourtName_Desc() { regOBD("ORIGINAL_COURT_NAME"); return this; }

    protected ConditionValue _originalCaseNumber;
    public ConditionValue xdfgetOriginalCaseNumber()
    { if (_originalCaseNumber == null) { _originalCaseNumber = nCV(); }
      return _originalCaseNumber; }
    protected ConditionValue xgetCValueOriginalCaseNumber() { return xdfgetOriginalCaseNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalCaseNumber_Asc() { regOBA("ORIGINAL_CASE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalCaseNumber_Desc() { regOBD("ORIGINAL_CASE_NUMBER"); return this; }

    protected ConditionValue _originalJudgementDate;
    public ConditionValue xdfgetOriginalJudgementDate()
    { if (_originalJudgementDate == null) { _originalJudgementDate = nCV(); }
      return _originalJudgementDate; }
    protected ConditionValue xgetCValueOriginalJudgementDate() { return xdfgetOriginalJudgementDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalJudgementDate_Asc() { regOBA("ORIGINAL_JUDGEMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalJudgementDate_Desc() { regOBD("ORIGINAL_JUDGEMENT_DATE"); return this; }

    protected ConditionValue _originalJudgementResult;
    public ConditionValue xdfgetOriginalJudgementResult()
    { if (_originalJudgementResult == null) { _originalJudgementResult = nCV(); }
      return _originalJudgementResult; }
    protected ConditionValue xgetCValueOriginalJudgementResult() { return xdfgetOriginalJudgementResult(); }

    /** 
     * Add order-by as ascend. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalJudgementResult_Asc() { regOBA("ORIGINAL_JUDGEMENT_RESULT"); return this; }

    /**
     * Add order-by as descend. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_OriginalJudgementResult_Desc() { regOBD("ORIGINAL_JUDGEMENT_RESULT"); return this; }

    protected ConditionValue _judgementContent;
    public ConditionValue xdfgetJudgementContent()
    { if (_judgementContent == null) { _judgementContent = nCV(); }
      return _judgementContent; }
    protected ConditionValue xgetCValueJudgementContent() { return xdfgetJudgementContent(); }

    protected ConditionValue _judgementSummary;
    public ConditionValue xdfgetJudgementSummary()
    { if (_judgementSummary == null) { _judgementSummary = nCV(); }
      return _judgementSummary; }
    protected ConditionValue xgetCValueJudgementSummary() { return xdfgetJudgementSummary(); }

    protected ConditionValue _law;
    public ConditionValue xdfgetLaw()
    { if (_law == null) { _law = nCV(); }
      return _law; }
    protected ConditionValue xgetCValueLaw() { return xdfgetLaw(); }

    protected ConditionValue _textUrl;
    public ConditionValue xdfgetTextUrl()
    { if (_textUrl == null) { _textUrl = nCV(); }
      return _textUrl; }
    protected ConditionValue xgetCValueTextUrl() { return xdfgetTextUrl(); }

    /** 
     * Add order-by as ascend. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_TextUrl_Asc() { regOBA("TEXT_URL"); return this; }

    /**
     * Add order-by as descend. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_TextUrl_Desc() { regOBD("TEXT_URL"); return this; }

    protected ConditionValue _highCourtReports;
    public ConditionValue xdfgetHighCourtReports()
    { if (_highCourtReports == null) { _highCourtReports = nCV(); }
      return _highCourtReports; }
    protected ConditionValue xgetCValueHighCourtReports() { return xdfgetHighCourtReports(); }

    /** 
     * Add order-by as ascend. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_HighCourtReports_Asc() { regOBA("HIGH_COURT_REPORTS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_HighCourtReports_Desc() { regOBD("HIGH_COURT_REPORTS"); return this; }

    protected ConditionValue _judgementContentSummary;
    public ConditionValue xdfgetJudgementContentSummary()
    { if (_judgementContentSummary == null) { _judgementContentSummary = nCV(); }
      return _judgementContentSummary; }
    protected ConditionValue xgetCValueJudgementContentSummary() { return xdfgetJudgementContentSummary(); }

    protected ConditionValue _rightType;
    public ConditionValue xdfgetRightType()
    { if (_rightType == null) { _rightType = nCV(); }
      return _rightType; }
    protected ConditionValue xgetCValueRightType() { return xdfgetRightType(); }

    protected ConditionValue _lawsuitType;
    public ConditionValue xdfgetLawsuitType()
    { if (_lawsuitType == null) { _lawsuitType = nCV(); }
      return _lawsuitType; }
    protected ConditionValue xgetCValueLawsuitType() { return xdfgetLawsuitType(); }

    /** 
     * Add order-by as ascend. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_LawsuitType_Asc() { regOBA("LAWSUIT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_LawsuitType_Desc() { regOBD("LAWSUIT_TYPE"); return this; }

    protected ConditionValue _caseCategory;
    public ConditionValue xdfgetCaseCategory()
    { if (_caseCategory == null) { _caseCategory = nCV(); }
      return _caseCategory; }
    protected ConditionValue xgetCValueCaseCategory() { return xdfgetCaseCategory(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CaseCategory_Asc() { regOBA("CASE_CATEGORY"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_CaseCategory_Desc() { regOBD("CASE_CATEGORY"); return this; }

    protected ConditionValue _sourceOriginalId;
    public ConditionValue xdfgetSourceOriginalId()
    { if (_sourceOriginalId == null) { _sourceOriginalId = nCV(); }
      return _sourceOriginalId; }
    protected ConditionValue xgetCValueSourceOriginalId() { return xdfgetSourceOriginalId(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_SourceOriginalId_Asc() { regOBA("SOURCE_ORIGINAL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_SourceOriginalId_Desc() { regOBD("SOURCE_ORIGINAL_ID"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsCourtScrapeResultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CourtScrapeResultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CourtScrapeResultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CourtScrapeResultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CourtScrapeResultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CourtScrapeResultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CourtScrapeResultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CourtScrapeResultCQ> _myselfExistsMap;
    public Map<String, CourtScrapeResultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CourtScrapeResultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CourtScrapeResultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CourtScrapeResultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CourtScrapeResultCB.class.getName(); }
    protected String xCQ() { return CourtScrapeResultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
