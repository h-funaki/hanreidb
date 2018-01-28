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
 * The base condition-query of CASE_MARK.
 * @author DBFlute(AutoGenerator)
 */
public class BsCaseMarkCQ extends AbstractBsCaseMarkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected CaseMarkCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsCaseMarkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CASE_MARK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public CaseMarkCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected CaseMarkCIQ xcreateCIQ() {
        CaseMarkCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected CaseMarkCIQ xnewCIQ() {
        return new CaseMarkCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CASE_MARK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public CaseMarkCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        CaseMarkCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _caseMarkId;
    public ConditionValue xdfgetCaseMarkId()
    { if (_caseMarkId == null) { _caseMarkId = nCV(); }
      return _caseMarkId; }
    protected ConditionValue xgetCValueCaseMarkId() { return xdfgetCaseMarkId(); }

    public Map<String, JudgementCQ> xdfgetCaseMarkId_ExistsReferrer_JudgementList() { return xgetSQueMap("caseMarkId_ExistsReferrer_JudgementList"); }
    public String keepCaseMarkId_ExistsReferrer_JudgementList(JudgementCQ sq) { return xkeepSQue("caseMarkId_ExistsReferrer_JudgementList", sq); }

    public Map<String, JudgementCQ> xdfgetCaseMarkId_NotExistsReferrer_JudgementList() { return xgetSQueMap("caseMarkId_NotExistsReferrer_JudgementList"); }
    public String keepCaseMarkId_NotExistsReferrer_JudgementList(JudgementCQ sq) { return xkeepSQue("caseMarkId_NotExistsReferrer_JudgementList", sq); }

    public Map<String, JudgementCQ> xdfgetCaseMarkId_SpecifyDerivedReferrer_JudgementList() { return xgetSQueMap("caseMarkId_SpecifyDerivedReferrer_JudgementList"); }
    public String keepCaseMarkId_SpecifyDerivedReferrer_JudgementList(JudgementCQ sq) { return xkeepSQue("caseMarkId_SpecifyDerivedReferrer_JudgementList", sq); }

    public Map<String, JudgementCQ> xdfgetCaseMarkId_QueryDerivedReferrer_JudgementList() { return xgetSQueMap("caseMarkId_QueryDerivedReferrer_JudgementList"); }
    public String keepCaseMarkId_QueryDerivedReferrer_JudgementList(JudgementCQ sq) { return xkeepSQue("caseMarkId_QueryDerivedReferrer_JudgementList", sq); }
    public Map<String, Object> xdfgetCaseMarkId_QueryDerivedReferrer_JudgementListParameter() { return xgetSQuePmMap("caseMarkId_QueryDerivedReferrer_JudgementList"); }
    public String keepCaseMarkId_QueryDerivedReferrer_JudgementListParameter(Object pm) { return xkeepSQuePm("caseMarkId_QueryDerivedReferrer_JudgementList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkId_Asc() { regOBA("CASE_MARK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkId_Desc() { regOBD("CASE_MARK_ID"); return this; }

    protected ConditionValue _caseMarkName;
    public ConditionValue xdfgetCaseMarkName()
    { if (_caseMarkName == null) { _caseMarkName = nCV(); }
      return _caseMarkName; }
    protected ConditionValue xgetCValueCaseMarkName() { return xdfgetCaseMarkName(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkName_Asc() { regOBA("CASE_MARK_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkName_Desc() { regOBD("CASE_MARK_NAME"); return this; }

    protected ConditionValue _caseMarkAlias;
    public ConditionValue xdfgetCaseMarkAlias()
    { if (_caseMarkAlias == null) { _caseMarkAlias = nCV(); }
      return _caseMarkAlias; }
    protected ConditionValue xgetCValueCaseMarkAlias() { return xdfgetCaseMarkAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkAlias_Asc() { regOBA("CASE_MARK_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkAlias_Desc() { regOBD("CASE_MARK_ALIAS"); return this; }

    protected ConditionValue _caseCategoryCode;
    public ConditionValue xdfgetCaseCategoryCode()
    { if (_caseCategoryCode == null) { _caseCategoryCode = nCV(); }
      return _caseCategoryCode; }
    protected ConditionValue xgetCValueCaseCategoryCode() { return xdfgetCaseCategoryCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseCategoryCode_Asc() { regOBA("CASE_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseCategoryCode_Desc() { regOBD("CASE_CATEGORY_CODE"); return this; }

    protected ConditionValue _courtTypeCode;
    public ConditionValue xdfgetCourtTypeCode()
    { if (_courtTypeCode == null) { _courtTypeCode = nCV(); }
      return _courtTypeCode; }
    protected ConditionValue xgetCValueCourtTypeCode() { return xdfgetCourtTypeCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CourtTypeCode_Asc() { regOBA("COURT_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CourtTypeCode_Desc() { regOBD("COURT_TYPE_CODE"); return this; }

    protected ConditionValue _caseMarkDetail;
    public ConditionValue xdfgetCaseMarkDetail()
    { if (_caseMarkDetail == null) { _caseMarkDetail = nCV(); }
      return _caseMarkDetail; }
    protected ConditionValue xgetCValueCaseMarkDetail() { return xdfgetCaseMarkDetail(); }

    /** 
     * Add order-by as ascend. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkDetail_Asc() { regOBA("CASE_MARK_DETAIL"); return this; }

    /**
     * Add order-by as descend. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_CaseMarkDetail_Desc() { regOBD("CASE_MARK_DETAIL"); return this; }

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
    public BsCaseMarkCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsCaseMarkCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsCaseMarkCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsCaseMarkCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsCaseMarkCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsCaseMarkCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsCaseMarkCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsCaseMarkCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        CaseMarkCQ bq = (CaseMarkCQ)bqs;
        CaseMarkCQ uq = (CaseMarkCQ)uqs;
        if (bq.hasConditionQueryClsCaseCategory()) {
            uq.queryClsCaseCategory().reflectRelationOnUnionQuery(bq.queryClsCaseCategory(), uq.queryClsCaseCategory());
        }
        if (bq.hasConditionQueryClsCourtType()) {
            uq.queryClsCourtType().reflectRelationOnUnionQuery(bq.queryClsCourtType(), uq.queryClsCourtType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]事件カテゴリー)CLS_CASE_CATEGORY by my CASE_CATEGORY_CODE, named 'clsCaseCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsCaseCategoryCQ queryClsCaseCategory() {
        return xdfgetConditionQueryClsCaseCategory();
    }
    public ClsCaseCategoryCQ xdfgetConditionQueryClsCaseCategory() {
        String prop = "clsCaseCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsCaseCategory()); xsetupOuterJoinClsCaseCategory(); }
        return xgetQueRlMap(prop);
    }
    protected ClsCaseCategoryCQ xcreateQueryClsCaseCategory() {
        String nrp = xresolveNRP("CASE_MARK", "clsCaseCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsCaseCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsCaseCategory", nrp);
    }
    protected void xsetupOuterJoinClsCaseCategory() { xregOutJo("clsCaseCategory"); }
    public boolean hasConditionQueryClsCaseCategory() { return xhasQueRlMap("clsCaseCategory"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]裁判所種別)CLS_COURT_TYPE by my COURT_TYPE_CODE, named 'clsCourtType'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsCourtTypeCQ queryClsCourtType() {
        return xdfgetConditionQueryClsCourtType();
    }
    public ClsCourtTypeCQ xdfgetConditionQueryClsCourtType() {
        String prop = "clsCourtType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsCourtType()); xsetupOuterJoinClsCourtType(); }
        return xgetQueRlMap(prop);
    }
    protected ClsCourtTypeCQ xcreateQueryClsCourtType() {
        String nrp = xresolveNRP("CASE_MARK", "clsCourtType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsCourtTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsCourtType", nrp);
    }
    protected void xsetupOuterJoinClsCourtType() { xregOutJo("clsCourtType"); }
    public boolean hasConditionQueryClsCourtType() { return xhasQueRlMap("clsCourtType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, CaseMarkCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(CaseMarkCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, CaseMarkCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(CaseMarkCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, CaseMarkCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(CaseMarkCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, CaseMarkCQ> _myselfExistsMap;
    public Map<String, CaseMarkCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(CaseMarkCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, CaseMarkCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(CaseMarkCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return CaseMarkCB.class.getName(); }
    protected String xCQ() { return CaseMarkCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
