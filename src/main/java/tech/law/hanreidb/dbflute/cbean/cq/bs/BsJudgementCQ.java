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
 * The base condition-query of JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsJudgementCQ extends AbstractBsJudgementCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected JudgementCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsJudgementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from JUDGEMENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public JudgementCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected JudgementCIQ xcreateCIQ() {
        JudgementCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected JudgementCIQ xnewCIQ() {
        return new JudgementCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join JUDGEMENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public JudgementCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        JudgementCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _judgementId;
    public ConditionValue xdfgetJudgementId()
    { if (_judgementId == null) { _judgementId = nCV(); }
      return _judgementId; }
    protected ConditionValue xgetCValueJudgementId() { return xdfgetJudgementId(); }

    public Map<String, JudgementCQ> xdfgetJudgementId_ExistsReferrer_JudgementSelfList() { return xgetSQueMap("judgementId_ExistsReferrer_JudgementSelfList"); }
    public String keepJudgementId_ExistsReferrer_JudgementSelfList(JudgementCQ sq) { return xkeepSQue("judgementId_ExistsReferrer_JudgementSelfList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetJudgementId_ExistsReferrer_JudgementSourceRelList() { return xgetSQueMap("judgementId_ExistsReferrer_JudgementSourceRelList"); }
    public String keepJudgementId_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("judgementId_ExistsReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementCQ> xdfgetJudgementId_NotExistsReferrer_JudgementSelfList() { return xgetSQueMap("judgementId_NotExistsReferrer_JudgementSelfList"); }
    public String keepJudgementId_NotExistsReferrer_JudgementSelfList(JudgementCQ sq) { return xkeepSQue("judgementId_NotExistsReferrer_JudgementSelfList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetJudgementId_NotExistsReferrer_JudgementSourceRelList() { return xgetSQueMap("judgementId_NotExistsReferrer_JudgementSourceRelList"); }
    public String keepJudgementId_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("judgementId_NotExistsReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementCQ> xdfgetJudgementId_SpecifyDerivedReferrer_JudgementSelfList() { return xgetSQueMap("judgementId_SpecifyDerivedReferrer_JudgementSelfList"); }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementSelfList(JudgementCQ sq) { return xkeepSQue("judgementId_SpecifyDerivedReferrer_JudgementSelfList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetJudgementId_SpecifyDerivedReferrer_JudgementSourceRelList() { return xgetSQueMap("judgementId_SpecifyDerivedReferrer_JudgementSourceRelList"); }
    public String keepJudgementId_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("judgementId_SpecifyDerivedReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementCQ> xdfgetJudgementId_QueryDerivedReferrer_JudgementSelfList() { return xgetSQueMap("judgementId_QueryDerivedReferrer_JudgementSelfList"); }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSelfList(JudgementCQ sq) { return xkeepSQue("judgementId_QueryDerivedReferrer_JudgementSelfList", sq); }
    public Map<String, Object> xdfgetJudgementId_QueryDerivedReferrer_JudgementSelfListParameter() { return xgetSQuePmMap("judgementId_QueryDerivedReferrer_JudgementSelfList"); }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSelfListParameter(Object pm) { return xkeepSQuePm("judgementId_QueryDerivedReferrer_JudgementSelfList", pm); }

    public Map<String, JudgementSourceRelCQ> xdfgetJudgementId_QueryDerivedReferrer_JudgementSourceRelList() { return xgetSQueMap("judgementId_QueryDerivedReferrer_JudgementSourceRelList"); }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("judgementId_QueryDerivedReferrer_JudgementSourceRelList", sq); }
    public Map<String, Object> xdfgetJudgementId_QueryDerivedReferrer_JudgementSourceRelListParameter() { return xgetSQuePmMap("judgementId_QueryDerivedReferrer_JudgementSourceRelList"); }
    public String keepJudgementId_QueryDerivedReferrer_JudgementSourceRelListParameter(Object pm) { return xkeepSQuePm("judgementId_QueryDerivedReferrer_JudgementSourceRelList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementId_Asc() { regOBA("JUDGEMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementId_Desc() { regOBD("JUDGEMENT_ID"); return this; }

    protected ConditionValue _judgementPublicCode;
    public ConditionValue xdfgetJudgementPublicCode()
    { if (_judgementPublicCode == null) { _judgementPublicCode = nCV(); }
      return _judgementPublicCode; }
    protected ConditionValue xgetCValueJudgementPublicCode() { return xdfgetJudgementPublicCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementPublicCode_Asc() { regOBA("JUDGEMENT_PUBLIC_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementPublicCode_Desc() { regOBD("JUDGEMENT_PUBLIC_CODE"); return this; }

    protected ConditionValue _caseName;
    public ConditionValue xdfgetCaseName()
    { if (_caseName == null) { _caseName = nCV(); }
      return _caseName; }
    protected ConditionValue xgetCValueCaseName() { return xdfgetCaseName(); }

    protected ConditionValue _precedentReportsKan;
    public ConditionValue xdfgetPrecedentReportsKan()
    { if (_precedentReportsKan == null) { _precedentReportsKan = nCV(); }
      return _precedentReportsKan; }
    protected ConditionValue xgetCValuePrecedentReportsKan() { return xdfgetPrecedentReportsKan(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsKan_Asc() { regOBA("PRECEDENT_REPORTS_KAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集巻)PRECEDENT_REPORTS_KAN: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsKan_Desc() { regOBD("PRECEDENT_REPORTS_KAN"); return this; }

    protected ConditionValue _precedentReportsGo;
    public ConditionValue xdfgetPrecedentReportsGo()
    { if (_precedentReportsGo == null) { _precedentReportsGo = nCV(); }
      return _precedentReportsGo; }
    protected ConditionValue xgetCValuePrecedentReportsGo() { return xdfgetPrecedentReportsGo(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsGo_Asc() { regOBA("PRECEDENT_REPORTS_GO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集号)PRECEDENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsGo_Desc() { regOBD("PRECEDENT_REPORTS_GO"); return this; }

    protected ConditionValue _precedentReportsKo;
    public ConditionValue xdfgetPrecedentReportsKo()
    { if (_precedentReportsKo == null) { _precedentReportsKo = nCV(); }
      return _precedentReportsKo; }
    protected ConditionValue xgetCValuePrecedentReportsKo() { return xdfgetPrecedentReportsKo(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsKo_Asc() { regOBA("PRECEDENT_REPORTS_KO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集頁)PRECEDENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_PrecedentReportsKo_Desc() { regOBD("PRECEDENT_REPORTS_KO"); return this; }

    protected ConditionValue _judgementReportsGo;
    public ConditionValue xdfgetJudgementReportsGo()
    { if (_judgementReportsGo == null) { _judgementReportsGo = nCV(); }
      return _judgementReportsGo; }
    protected ConditionValue xgetCValueJudgementReportsGo() { return xdfgetJudgementReportsGo(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementReportsGo_Asc() { regOBA("JUDGEMENT_REPORTS_GO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判集号)JUDGEMENT_REPORTS_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementReportsGo_Desc() { regOBD("JUDGEMENT_REPORTS_GO"); return this; }

    protected ConditionValue _judgementReportsKo;
    public ConditionValue xdfgetJudgementReportsKo()
    { if (_judgementReportsKo == null) { _judgementReportsKo = nCV(); }
      return _judgementReportsKo; }
    protected ConditionValue xgetCValueJudgementReportsKo() { return xdfgetJudgementReportsKo(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementReportsKo_Asc() { regOBA("JUDGEMENT_REPORTS_KO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判集頁)JUDGEMENT_REPORTS_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementReportsKo_Desc() { regOBD("JUDGEMENT_REPORTS_KO"); return this; }

    protected ConditionValue _judgementDate;
    public ConditionValue xdfgetJudgementDate()
    { if (_judgementDate == null) { _judgementDate = nCV(); }
      return _judgementDate; }
    protected ConditionValue xgetCValueJudgementDate() { return xdfgetJudgementDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementDate_Asc() { regOBA("JUDGEMENT_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementDate_Desc() { regOBD("JUDGEMENT_DATE"); return this; }

    protected ConditionValue _originalJudgementId;
    public ConditionValue xdfgetOriginalJudgementId()
    { if (_originalJudgementId == null) { _originalJudgementId = nCV(); }
      return _originalJudgementId; }
    protected ConditionValue xgetCValueOriginalJudgementId() { return xdfgetOriginalJudgementId(); }

    /** 
     * Add order-by as ascend. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_OriginalJudgementId_Asc() { regOBA("ORIGINAL_JUDGEMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_OriginalJudgementId_Desc() { regOBD("ORIGINAL_JUDGEMENT_ID"); return this; }

    protected ConditionValue _caseNumberEraCode;
    public ConditionValue xdfgetCaseNumberEraCode()
    { if (_caseNumberEraCode == null) { _caseNumberEraCode = nCV(); }
      return _caseNumberEraCode; }
    protected ConditionValue xgetCValueCaseNumberEraCode() { return xdfgetCaseNumberEraCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberEraCode_Asc() { regOBA("CASE_NUMBER_ERA_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberEraCode_Desc() { regOBD("CASE_NUMBER_ERA_CODE"); return this; }

    protected ConditionValue _caseNumberYear;
    public ConditionValue xdfgetCaseNumberYear()
    { if (_caseNumberYear == null) { _caseNumberYear = nCV(); }
      return _caseNumberYear; }
    protected ConditionValue xgetCValueCaseNumberYear() { return xdfgetCaseNumberYear(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberYear_Asc() { regOBA("CASE_NUMBER_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberYear_Desc() { regOBD("CASE_NUMBER_YEAR"); return this; }

    protected ConditionValue _caseMarkId;
    public ConditionValue xdfgetCaseMarkId()
    { if (_caseMarkId == null) { _caseMarkId = nCV(); }
      return _caseMarkId; }
    protected ConditionValue xgetCValueCaseMarkId() { return xdfgetCaseMarkId(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseMarkId_Asc() { regOBA("CASE_MARK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseMarkId_Desc() { regOBD("CASE_MARK_ID"); return this; }

    protected ConditionValue _caseNumberSerialNumber;
    public ConditionValue xdfgetCaseNumberSerialNumber()
    { if (_caseNumberSerialNumber == null) { _caseNumberSerialNumber = nCV(); }
      return _caseNumberSerialNumber; }
    protected ConditionValue xgetCValueCaseNumberSerialNumber() { return xdfgetCaseNumberSerialNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberSerialNumber_Asc() { regOBA("CASE_NUMBER_SERIAL_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CaseNumberSerialNumber_Desc() { regOBD("CASE_NUMBER_SERIAL_NUMBER"); return this; }

    protected ConditionValue _courtId;
    public ConditionValue xdfgetCourtId()
    { if (_courtId == null) { _courtId = nCV(); }
      return _courtId; }
    protected ConditionValue xgetCValueCourtId() { return xdfgetCourtId(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CourtId_Asc() { regOBA("COURT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_CourtId_Desc() { regOBD("COURT_ID"); return this; }

    protected ConditionValue _benchCode;
    public ConditionValue xdfgetBenchCode()
    { if (_benchCode == null) { _benchCode = nCV(); }
      return _benchCode; }
    protected ConditionValue xgetCValueBenchCode() { return xdfgetBenchCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_BenchCode_Asc() { regOBA("BENCH_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_BenchCode_Desc() { regOBD("BENCH_CODE"); return this; }

    protected ConditionValue _judgementResultCode;
    public ConditionValue xdfgetJudgementResultCode()
    { if (_judgementResultCode == null) { _judgementResultCode = nCV(); }
      return _judgementResultCode; }
    protected ConditionValue xgetCValueJudgementResultCode() { return xdfgetJudgementResultCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementResultCode_Asc() { regOBA("JUDGEMENT_RESULT_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementResultCode_Desc() { regOBD("JUDGEMENT_RESULT_CODE"); return this; }

    protected ConditionValue _judgementTypeCode;
    public ConditionValue xdfgetJudgementTypeCode()
    { if (_judgementTypeCode == null) { _judgementTypeCode = nCV(); }
      return _judgementTypeCode; }
    protected ConditionValue xgetCValueJudgementTypeCode() { return xdfgetJudgementTypeCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementTypeCode_Asc() { regOBA("JUDGEMENT_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
     * @return this. (NotNull)
     */
    public BsJudgementCQ addOrderBy_JudgementTypeCode_Desc() { regOBD("JUDGEMENT_TYPE_CODE"); return this; }

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
    public BsJudgementCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsJudgementCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        JudgementCQ bq = (JudgementCQ)bqs;
        JudgementCQ uq = (JudgementCQ)uqs;
        if (bq.hasConditionQueryClsBench()) {
            uq.queryClsBench().reflectRelationOnUnionQuery(bq.queryClsBench(), uq.queryClsBench());
        }
        if (bq.hasConditionQueryCaseMark()) {
            uq.queryCaseMark().reflectRelationOnUnionQuery(bq.queryCaseMark(), uq.queryCaseMark());
        }
        if (bq.hasConditionQueryClsEra()) {
            uq.queryClsEra().reflectRelationOnUnionQuery(bq.queryClsEra(), uq.queryClsEra());
        }
        if (bq.hasConditionQueryCourt()) {
            uq.queryCourt().reflectRelationOnUnionQuery(bq.queryCourt(), uq.queryCourt());
        }
        if (bq.hasConditionQueryClsJudgementResult()) {
            uq.queryClsJudgementResult().reflectRelationOnUnionQuery(bq.queryClsJudgementResult(), uq.queryClsJudgementResult());
        }
        if (bq.hasConditionQueryClsJudgementType()) {
            uq.queryClsJudgementType().reflectRelationOnUnionQuery(bq.queryClsJudgementType(), uq.queryClsJudgementType());
        }
        if (bq.hasConditionQueryJudgementSelf()) {
            uq.queryJudgementSelf().reflectRelationOnUnionQuery(bq.queryJudgementSelf(), uq.queryJudgementSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsBenchCQ queryClsBench() {
        return xdfgetConditionQueryClsBench();
    }
    public ClsBenchCQ xdfgetConditionQueryClsBench() {
        String prop = "clsBench";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsBench()); xsetupOuterJoinClsBench(); }
        return xgetQueRlMap(prop);
    }
    protected ClsBenchCQ xcreateQueryClsBench() {
        String nrp = xresolveNRP("JUDGEMENT", "clsBench"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsBenchCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsBench", nrp);
    }
    protected void xsetupOuterJoinClsBench() { xregOutJo("clsBench"); }
    public boolean hasConditionQueryClsBench() { return xhasQueRlMap("clsBench"); }

    /**
     * Get the condition-query for relation table. <br>
     * (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
     * @return The instance of condition-query. (NotNull)
     */
    public CaseMarkCQ queryCaseMark() {
        return xdfgetConditionQueryCaseMark();
    }
    public CaseMarkCQ xdfgetConditionQueryCaseMark() {
        String prop = "caseMark";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCaseMark()); xsetupOuterJoinCaseMark(); }
        return xgetQueRlMap(prop);
    }
    protected CaseMarkCQ xcreateQueryCaseMark() {
        String nrp = xresolveNRP("JUDGEMENT", "caseMark"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CaseMarkCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "caseMark", nrp);
    }
    protected void xsetupOuterJoinCaseMark() { xregOutJo("caseMark"); }
    public boolean hasConditionQueryCaseMark() { return xhasQueRlMap("caseMark"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsEraCQ queryClsEra() {
        return xdfgetConditionQueryClsEra();
    }
    public ClsEraCQ xdfgetConditionQueryClsEra() {
        String prop = "clsEra";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsEra()); xsetupOuterJoinClsEra(); }
        return xgetQueRlMap(prop);
    }
    protected ClsEraCQ xcreateQueryClsEra() {
        String nrp = xresolveNRP("JUDGEMENT", "clsEra"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsEraCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsEra", nrp);
    }
    protected void xsetupOuterJoinClsEra() { xregOutJo("clsEra"); }
    public boolean hasConditionQueryClsEra() { return xhasQueRlMap("clsEra"); }

    /**
     * Get the condition-query for relation table. <br>
     * (裁判所)COURT by my COURT_ID, named 'court'.
     * @return The instance of condition-query. (NotNull)
     */
    public CourtCQ queryCourt() {
        return xdfgetConditionQueryCourt();
    }
    public CourtCQ xdfgetConditionQueryCourt() {
        String prop = "court";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCourt()); xsetupOuterJoinCourt(); }
        return xgetQueRlMap(prop);
    }
    protected CourtCQ xcreateQueryCourt() {
        String nrp = xresolveNRP("JUDGEMENT", "court"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CourtCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "court", nrp);
    }
    protected void xsetupOuterJoinCourt() { xregOutJo("court"); }
    public boolean hasConditionQueryCourt() { return xhasQueRlMap("court"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsJudgementResultCQ queryClsJudgementResult() {
        return xdfgetConditionQueryClsJudgementResult();
    }
    public ClsJudgementResultCQ xdfgetConditionQueryClsJudgementResult() {
        String prop = "clsJudgementResult";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsJudgementResult()); xsetupOuterJoinClsJudgementResult(); }
        return xgetQueRlMap(prop);
    }
    protected ClsJudgementResultCQ xcreateQueryClsJudgementResult() {
        String nrp = xresolveNRP("JUDGEMENT", "clsJudgementResult"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsJudgementResultCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsJudgementResult", nrp);
    }
    protected void xsetupOuterJoinClsJudgementResult() { xregOutJo("clsJudgementResult"); }
    public boolean hasConditionQueryClsJudgementResult() { return xhasQueRlMap("clsJudgementResult"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsJudgementTypeCQ queryClsJudgementType() {
        return xdfgetConditionQueryClsJudgementType();
    }
    public ClsJudgementTypeCQ xdfgetConditionQueryClsJudgementType() {
        String prop = "clsJudgementType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsJudgementType()); xsetupOuterJoinClsJudgementType(); }
        return xgetQueRlMap(prop);
    }
    protected ClsJudgementTypeCQ xcreateQueryClsJudgementType() {
        String nrp = xresolveNRP("JUDGEMENT", "clsJudgementType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsJudgementTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsJudgementType", nrp);
    }
    protected void xsetupOuterJoinClsJudgementType() { xregOutJo("clsJudgementType"); }
    public boolean hasConditionQueryClsJudgementType() { return xhasQueRlMap("clsJudgementType"); }

    /**
     * Get the condition-query for relation table. <br>
     * (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public JudgementCQ queryJudgementSelf() {
        return xdfgetConditionQueryJudgementSelf();
    }
    public JudgementCQ xdfgetConditionQueryJudgementSelf() {
        String prop = "judgementSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryJudgementSelf()); xsetupOuterJoinJudgementSelf(); }
        return xgetQueRlMap(prop);
    }
    protected JudgementCQ xcreateQueryJudgementSelf() {
        String nrp = xresolveNRP("JUDGEMENT", "judgementSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new JudgementCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "judgementSelf", nrp);
    }
    protected void xsetupOuterJoinJudgementSelf() { xregOutJo("judgementSelf"); }
    public boolean hasConditionQueryJudgementSelf() { return xhasQueRlMap("judgementSelf"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, JudgementCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(JudgementCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, JudgementCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(JudgementCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, JudgementCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(JudgementCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, JudgementCQ> _myselfExistsMap;
    public Map<String, JudgementCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(JudgementCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, JudgementCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(JudgementCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return JudgementCB.class.getName(); }
    protected String xCQ() { return JudgementCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
