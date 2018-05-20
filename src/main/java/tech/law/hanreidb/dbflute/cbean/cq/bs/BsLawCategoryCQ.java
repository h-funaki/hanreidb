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
 * The base condition-query of LAW_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawCategoryCQ extends AbstractBsLawCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_CATEGORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawCategoryCIQ xcreateCIQ() {
        LawCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawCategoryCIQ xnewCIQ() {
        return new LawCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_CATEGORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawCategoryId;
    public ConditionValue xdfgetLawCategoryId()
    { if (_lawCategoryId == null) { _lawCategoryId = nCV(); }
      return _lawCategoryId; }
    protected ConditionValue xgetCValueLawCategoryId() { return xdfgetLawCategoryId(); }

    public Map<String, LawCategoryRelCQ> xdfgetLawCategoryId_ExistsReferrer_LawCategoryRelList() { return xgetSQueMap("lawCategoryId_ExistsReferrer_LawCategoryRelList"); }
    public String keepLawCategoryId_ExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawCategoryId_ExistsReferrer_LawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryCQ> xdfgetLawCategoryId_ExistsReferrer_SourceLawCategoryList() { return xgetSQueMap("lawCategoryId_ExistsReferrer_SourceLawCategoryList"); }
    public String keepLawCategoryId_ExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq) { return xkeepSQue("lawCategoryId_ExistsReferrer_SourceLawCategoryList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawCategoryId_NotExistsReferrer_LawCategoryRelList() { return xgetSQueMap("lawCategoryId_NotExistsReferrer_LawCategoryRelList"); }
    public String keepLawCategoryId_NotExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawCategoryId_NotExistsReferrer_LawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryCQ> xdfgetLawCategoryId_NotExistsReferrer_SourceLawCategoryList() { return xgetSQueMap("lawCategoryId_NotExistsReferrer_SourceLawCategoryList"); }
    public String keepLawCategoryId_NotExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq) { return xkeepSQue("lawCategoryId_NotExistsReferrer_SourceLawCategoryList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList() { return xgetSQueMap("lawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList"); }
    public String keepLawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryCQ> xdfgetLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList() { return xgetSQueMap("lawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList"); }
    public String keepLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq) { return xkeepSQue("lawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetLawCategoryId_QueryDerivedReferrer_LawCategoryRelList() { return xgetSQueMap("lawCategoryId_QueryDerivedReferrer_LawCategoryRelList"); }
    public String keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq) { return xkeepSQue("lawCategoryId_QueryDerivedReferrer_LawCategoryRelList", sq); }
    public Map<String, Object> xdfgetLawCategoryId_QueryDerivedReferrer_LawCategoryRelListParameter() { return xgetSQuePmMap("lawCategoryId_QueryDerivedReferrer_LawCategoryRelList"); }
    public String keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelListParameter(Object pm) { return xkeepSQuePm("lawCategoryId_QueryDerivedReferrer_LawCategoryRelList", pm); }

    public Map<String, SourceLawCategoryCQ> xdfgetLawCategoryId_QueryDerivedReferrer_SourceLawCategoryList() { return xgetSQueMap("lawCategoryId_QueryDerivedReferrer_SourceLawCategoryList"); }
    public String keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq) { return xkeepSQue("lawCategoryId_QueryDerivedReferrer_SourceLawCategoryList", sq); }
    public Map<String, Object> xdfgetLawCategoryId_QueryDerivedReferrer_SourceLawCategoryListParameter() { return xgetSQuePmMap("lawCategoryId_QueryDerivedReferrer_SourceLawCategoryList"); }
    public String keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryListParameter(Object pm) { return xkeepSQuePm("lawCategoryId_QueryDerivedReferrer_SourceLawCategoryList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryId_Asc() { regOBA("LAW_CATEGORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryId_Desc() { regOBD("LAW_CATEGORY_ID"); return this; }

    protected ConditionValue _lawCategoryName;
    public ConditionValue xdfgetLawCategoryName()
    { if (_lawCategoryName == null) { _lawCategoryName = nCV(); }
      return _lawCategoryName; }
    protected ConditionValue xgetCValueLawCategoryName() { return xdfgetLawCategoryName(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryName_Asc() { regOBA("LAW_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryName_Desc() { regOBD("LAW_CATEGORY_NAME"); return this; }

    protected ConditionValue _lawCategoryAlias;
    public ConditionValue xdfgetLawCategoryAlias()
    { if (_lawCategoryAlias == null) { _lawCategoryAlias = nCV(); }
      return _lawCategoryAlias; }
    protected ConditionValue xgetCValueLawCategoryAlias() { return xdfgetLawCategoryAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryAlias_Asc() { regOBA("LAW_CATEGORY_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_LawCategoryAlias_Desc() { regOBD("LAW_CATEGORY_ALIAS"); return this; }

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
    public BsLawCategoryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsLawCategoryCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsLawCategoryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsLawCategoryCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsLawCategoryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawCategoryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLawCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LawCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawCategoryCQ> _myselfExistsMap;
    public Map<String, LawCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawCategoryCB.class.getName(); }
    protected String xCQ() { return LawCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
