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
 * The base condition-query of LAW.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawCQ extends AbstractBsLawCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawCIQ xcreateCIQ() {
        LawCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawCIQ xnewCIQ() {
        return new LawCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawId;
    public ConditionValue xdfgetLawId()
    { if (_lawId == null) { _lawId = nCV(); }
      return _lawId; }
    protected ConditionValue xgetCValueLawId() { return xdfgetLawId(); }

    public Map<String, LawAliasCQ> xdfgetLawId_ExistsReferrer_LawAliasList() { return xgetSQueMap("lawId_ExistsReferrer_LawAliasList"); }
    public String keepLawId_ExistsReferrer_LawAliasList(LawAliasCQ sq) { return xkeepSQue("lawId_ExistsReferrer_LawAliasList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawId_ExistsReferrer_LawCategoryRelList() { return xgetSQueMap("lawId_ExistsReferrer_LawCategoryRelList"); }
    public String keepLawId_ExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawId_ExistsReferrer_LawCategoryRelList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_ExistsReferrer_LawHistoryByAmendLawIdList() { return xgetSQueMap("lawId_ExistsReferrer_LawHistoryByAmendLawIdList"); }
    public String keepLawId_ExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_ExistsReferrer_LawHistoryByAmendLawIdList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_ExistsReferrer_LawHistoryByLawIdList() { return xgetSQueMap("lawId_ExistsReferrer_LawHistoryByLawIdList"); }
    public String keepLawId_ExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_ExistsReferrer_LawHistoryByLawIdList", sq); }

    public Map<String, LawSourceRelCQ> xdfgetLawId_ExistsReferrer_LawSourceRelList() { return xgetSQueMap("lawId_ExistsReferrer_LawSourceRelList"); }
    public String keepLawId_ExistsReferrer_LawSourceRelList(LawSourceRelCQ sq) { return xkeepSQue("lawId_ExistsReferrer_LawSourceRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetLawId_ExistsReferrer_SourceLawCategoryRelList() { return xgetSQueMap("lawId_ExistsReferrer_SourceLawCategoryRelList"); }
    public String keepLawId_ExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("lawId_ExistsReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, LawAliasCQ> xdfgetLawId_NotExistsReferrer_LawAliasList() { return xgetSQueMap("lawId_NotExistsReferrer_LawAliasList"); }
    public String keepLawId_NotExistsReferrer_LawAliasList(LawAliasCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_LawAliasList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawId_NotExistsReferrer_LawCategoryRelList() { return xgetSQueMap("lawId_NotExistsReferrer_LawCategoryRelList"); }
    public String keepLawId_NotExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_LawCategoryRelList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_NotExistsReferrer_LawHistoryByAmendLawIdList() { return xgetSQueMap("lawId_NotExistsReferrer_LawHistoryByAmendLawIdList"); }
    public String keepLawId_NotExistsReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_LawHistoryByAmendLawIdList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_NotExistsReferrer_LawHistoryByLawIdList() { return xgetSQueMap("lawId_NotExistsReferrer_LawHistoryByLawIdList"); }
    public String keepLawId_NotExistsReferrer_LawHistoryByLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_LawHistoryByLawIdList", sq); }

    public Map<String, LawSourceRelCQ> xdfgetLawId_NotExistsReferrer_LawSourceRelList() { return xgetSQueMap("lawId_NotExistsReferrer_LawSourceRelList"); }
    public String keepLawId_NotExistsReferrer_LawSourceRelList(LawSourceRelCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_LawSourceRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetLawId_NotExistsReferrer_SourceLawCategoryRelList() { return xgetSQueMap("lawId_NotExistsReferrer_SourceLawCategoryRelList"); }
    public String keepLawId_NotExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("lawId_NotExistsReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, LawAliasCQ> xdfgetLawId_SpecifyDerivedReferrer_LawAliasList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_LawAliasList"); }
    public String keepLawId_SpecifyDerivedReferrer_LawAliasList(LawAliasCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_LawAliasList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawId_SpecifyDerivedReferrer_LawCategoryRelList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_LawCategoryRelList"); }
    public String keepLawId_SpecifyDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_LawCategoryRelList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList"); }
    public String keepLawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_LawHistoryByAmendLawIdList", sq); }

    public Map<String, LawHistoryCQ> xdfgetLawId_SpecifyDerivedReferrer_LawHistoryByLawIdList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_LawHistoryByLawIdList"); }
    public String keepLawId_SpecifyDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_LawHistoryByLawIdList", sq); }

    public Map<String, LawSourceRelCQ> xdfgetLawId_SpecifyDerivedReferrer_LawSourceRelList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_LawSourceRelList"); }
    public String keepLawId_SpecifyDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_LawSourceRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetLawId_SpecifyDerivedReferrer_SourceLawCategoryRelList() { return xgetSQueMap("lawId_SpecifyDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepLawId_SpecifyDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("lawId_SpecifyDerivedReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, LawAliasCQ> xdfgetLawId_QueryDerivedReferrer_LawAliasList() { return xgetSQueMap("lawId_QueryDerivedReferrer_LawAliasList"); }
    public String keepLawId_QueryDerivedReferrer_LawAliasList(LawAliasCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_LawAliasList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_LawAliasListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_LawAliasList"); }
    public String keepLawId_QueryDerivedReferrer_LawAliasListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_LawAliasList", pm); }

    public Map<String, LawCategoryRelCQ> xdfgetLawId_QueryDerivedReferrer_LawCategoryRelList() { return xgetSQueMap("lawId_QueryDerivedReferrer_LawCategoryRelList"); }
    public String keepLawId_QueryDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_LawCategoryRelList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_LawCategoryRelListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_LawCategoryRelList"); }
    public String keepLawId_QueryDerivedReferrer_LawCategoryRelListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_LawCategoryRelList", pm); }

    public Map<String, LawHistoryCQ> xdfgetLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList() { return xgetSQueMap("lawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList"); }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList"); }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByAmendLawIdListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_LawHistoryByAmendLawIdList", pm); }

    public Map<String, LawHistoryCQ> xdfgetLawId_QueryDerivedReferrer_LawHistoryByLawIdList() { return xgetSQueMap("lawId_QueryDerivedReferrer_LawHistoryByLawIdList"); }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdList(LawHistoryCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_LawHistoryByLawIdList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_LawHistoryByLawIdListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_LawHistoryByLawIdList"); }
    public String keepLawId_QueryDerivedReferrer_LawHistoryByLawIdListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_LawHistoryByLawIdList", pm); }

    public Map<String, LawSourceRelCQ> xdfgetLawId_QueryDerivedReferrer_LawSourceRelList() { return xgetSQueMap("lawId_QueryDerivedReferrer_LawSourceRelList"); }
    public String keepLawId_QueryDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_LawSourceRelList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_LawSourceRelListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_LawSourceRelList"); }
    public String keepLawId_QueryDerivedReferrer_LawSourceRelListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_LawSourceRelList", pm); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetLawId_QueryDerivedReferrer_SourceLawCategoryRelList() { return xgetSQueMap("lawId_QueryDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("lawId_QueryDerivedReferrer_SourceLawCategoryRelList", sq); }
    public Map<String, Object> xdfgetLawId_QueryDerivedReferrer_SourceLawCategoryRelListParameter() { return xgetSQuePmMap("lawId_QueryDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepLawId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(Object pm) { return xkeepSQuePm("lawId_QueryDerivedReferrer_SourceLawCategoryRelList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawId_Asc() { regOBA("LAW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令ID)LAW_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawId_Desc() { regOBD("LAW_ID"); return this; }

    protected ConditionValue _lawTypeCode;
    public ConditionValue xdfgetLawTypeCode()
    { if (_lawTypeCode == null) { _lawTypeCode = nCV(); }
      return _lawTypeCode; }
    protected ConditionValue xgetCValueLawTypeCode() { return xdfgetLawTypeCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawTypeCode_Asc() { regOBA("LAW_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令種別コード)LAW_TYPE_CODE: {IX, NotNull, VARCHAR(20), FK to LAW_TYPE}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawTypeCode_Desc() { regOBD("LAW_TYPE_CODE"); return this; }

    protected ConditionValue _lawPublicCode;
    public ConditionValue xdfgetLawPublicCode()
    { if (_lawPublicCode == null) { _lawPublicCode = nCV(); }
      return _lawPublicCode; }
    protected ConditionValue xgetCValueLawPublicCode() { return xdfgetLawPublicCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawPublicCode_Asc() { regOBA("LAW_PUBLIC_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令公開コード)LAW_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawPublicCode_Desc() { regOBD("LAW_PUBLIC_CODE"); return this; }

    protected ConditionValue _lawName;
    public ConditionValue xdfgetLawName()
    { if (_lawName == null) { _lawName = nCV(); }
      return _lawName; }
    protected ConditionValue xgetCValueLawName() { return xdfgetLawName(); }

    protected ConditionValue _lawNumber;
    public ConditionValue xdfgetLawNumber()
    { if (_lawNumber == null) { _lawNumber = nCV(); }
      return _lawNumber; }
    protected ConditionValue xgetCValueLawNumber() { return xdfgetLawNumber(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawNumber_Asc() { regOBA("LAW_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令番号)LAW_NUMBER: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_LawNumber_Desc() { regOBD("LAW_NUMBER"); return this; }

    protected ConditionValue _promulgationDate;
    public ConditionValue xdfgetPromulgationDate()
    { if (_promulgationDate == null) { _promulgationDate = nCV(); }
      return _promulgationDate; }
    protected ConditionValue xgetCValuePromulgationDate() { return xdfgetPromulgationDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_PromulgationDate_Asc() { regOBA("PROMULGATION_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (公布日)PROMULGATION_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_PromulgationDate_Desc() { regOBD("PROMULGATION_DATE"); return this; }

    protected ConditionValue _effectiveDate;
    public ConditionValue xdfgetEffectiveDate()
    { if (_effectiveDate == null) { _effectiveDate = nCV(); }
      return _effectiveDate; }
    protected ConditionValue xgetCValueEffectiveDate() { return xdfgetEffectiveDate(); }

    /** 
     * Add order-by as ascend. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_EffectiveDate_Asc() { regOBA("EFFECTIVE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (施行日)EFFECTIVE_DATE: {DATE(10)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_EffectiveDate_Desc() { regOBD("EFFECTIVE_DATE"); return this; }

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
    public BsLawCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsLawCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsLawCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsLawCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsLawCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLawCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LawCQ bq = (LawCQ)bqs;
        LawCQ uq = (LawCQ)uqs;
        if (bq.hasConditionQueryLawType()) {
            uq.queryLawType().reflectRelationOnUnionQuery(bq.queryLawType(), uq.queryLawType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令種別)LAW_TYPE by my LAW_TYPE_CODE, named 'lawType'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawTypeCQ queryLawType() {
        return xdfgetConditionQueryLawType();
    }
    public LawTypeCQ xdfgetConditionQueryLawType() {
        String prop = "lawType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawType()); xsetupOuterJoinLawType(); }
        return xgetQueRlMap(prop);
    }
    protected LawTypeCQ xcreateQueryLawType() {
        String nrp = xresolveNRP("LAW", "lawType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawType", nrp);
    }
    protected void xsetupOuterJoinLawType() { xregOutJo("lawType"); }
    public boolean hasConditionQueryLawType() { return xhasQueRlMap("lawType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LawCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawCQ> _myselfExistsMap;
    public Map<String, LawCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawCB.class.getName(); }
    protected String xCQ() { return LawCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
