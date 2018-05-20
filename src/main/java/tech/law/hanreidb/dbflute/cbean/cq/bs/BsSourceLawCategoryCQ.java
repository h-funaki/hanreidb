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
 * The base condition-query of SOURCE_LAW_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsSourceLawCategoryCQ extends AbstractBsSourceLawCategoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SourceLawCategoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSourceLawCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from SOURCE_LAW_CATEGORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SourceLawCategoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SourceLawCategoryCIQ xcreateCIQ() {
        SourceLawCategoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SourceLawCategoryCIQ xnewCIQ() {
        return new SourceLawCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join SOURCE_LAW_CATEGORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SourceLawCategoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SourceLawCategoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sourceLawCategoryId;
    public ConditionValue xdfgetSourceLawCategoryId()
    { if (_sourceLawCategoryId == null) { _sourceLawCategoryId = nCV(); }
      return _sourceLawCategoryId; }
    protected ConditionValue xgetCValueSourceLawCategoryId() { return xdfgetSourceLawCategoryId(); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetSourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList() { return xgetSQueMap("sourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList"); }
    public String keepSourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("sourceLawCategoryId_ExistsReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetSourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList() { return xgetSQueMap("sourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList"); }
    public String keepSourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("sourceLawCategoryId_NotExistsReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetSourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList() { return xgetSQueMap("sourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepSourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("sourceLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryRelList", sq); }

    public Map<String, SourceLawCategoryRelCQ> xdfgetSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList() { return xgetSQueMap("sourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList(SourceLawCategoryRelCQ sq) { return xkeepSQue("sourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList", sq); }
    public Map<String, Object> xdfgetSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelListParameter() { return xgetSQuePmMap("sourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList"); }
    public String keepSourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelListParameter(Object pm) { return xkeepSQuePm("sourceLawCategoryId_QueryDerivedReferrer_SourceLawCategoryRelList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryId_Asc() { regOBA("SOURCE_LAW_CATEGORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryId_Desc() { regOBD("SOURCE_LAW_CATEGORY_ID"); return this; }

    protected ConditionValue _sourceCode;
    public ConditionValue xdfgetSourceCode()
    { if (_sourceCode == null) { _sourceCode = nCV(); }
      return _sourceCode; }
    protected ConditionValue xgetCValueSourceCode() { return xdfgetSourceCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_SOURCE, classification=Source}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceCode_Asc() { regOBA("SOURCE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_SOURCE, classification=Source}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceCode_Desc() { regOBD("SOURCE_CODE"); return this; }

    protected ConditionValue _lawCategoryId;
    public ConditionValue xdfgetLawCategoryId()
    { if (_lawCategoryId == null) { _lawCategoryId = nCV(); }
      return _lawCategoryId; }
    protected ConditionValue xgetCValueLawCategoryId() { return xdfgetLawCategoryId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_LawCategoryId_Asc() { regOBA("LAW_CATEGORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_LawCategoryId_Desc() { regOBD("LAW_CATEGORY_ID"); return this; }

    protected ConditionValue _sourceLawCategoryName;
    public ConditionValue xdfgetSourceLawCategoryName()
    { if (_sourceLawCategoryName == null) { _sourceLawCategoryName = nCV(); }
      return _sourceLawCategoryName; }
    protected ConditionValue xgetCValueSourceLawCategoryName() { return xdfgetSourceLawCategoryName(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryName_Asc() { regOBA("SOURCE_LAW_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元法令カテゴリー名)SOURCE_LAW_CATEGORY_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryName_Desc() { regOBD("SOURCE_LAW_CATEGORY_NAME"); return this; }

    protected ConditionValue _sourceLawCategoryAlias;
    public ConditionValue xdfgetSourceLawCategoryAlias()
    { if (_sourceLawCategoryAlias == null) { _sourceLawCategoryAlias = nCV(); }
      return _sourceLawCategoryAlias; }
    protected ConditionValue xgetCValueSourceLawCategoryAlias() { return xdfgetSourceLawCategoryAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryAlias_Asc() { regOBA("SOURCE_LAW_CATEGORY_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元法令カテゴリー別名)SOURCE_LAW_CATEGORY_ALIAS: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_SourceLawCategoryAlias_Desc() { regOBD("SOURCE_LAW_CATEGORY_ALIAS"); return this; }

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
    public BsSourceLawCategoryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsSourceLawCategoryCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsSourceLawCategoryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsSourceLawCategoryCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsSourceLawCategoryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsSourceLawCategoryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsSourceLawCategoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsSourceLawCategoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        SourceLawCategoryCQ bq = (SourceLawCategoryCQ)bqs;
        SourceLawCategoryCQ uq = (SourceLawCategoryCQ)uqs;
        if (bq.hasConditionQueryLawCategory()) {
            uq.queryLawCategory().reflectRelationOnUnionQuery(bq.queryLawCategory(), uq.queryLawCategory());
        }
        if (bq.hasConditionQueryClsSource()) {
            uq.queryClsSource().reflectRelationOnUnionQuery(bq.queryClsSource(), uq.queryClsSource());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令カテゴリー)LAW_CATEGORY by my LAW_CATEGORY_ID, named 'lawCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawCategoryCQ queryLawCategory() {
        return xdfgetConditionQueryLawCategory();
    }
    public LawCategoryCQ xdfgetConditionQueryLawCategory() {
        String prop = "lawCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawCategory()); xsetupOuterJoinLawCategory(); }
        return xgetQueRlMap(prop);
    }
    protected LawCategoryCQ xcreateQueryLawCategory() {
        String nrp = xresolveNRP("SOURCE_LAW_CATEGORY", "lawCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawCategory", nrp);
    }
    protected void xsetupOuterJoinLawCategory() { xregOutJo("lawCategory"); }
    public boolean hasConditionQueryLawCategory() { return xhasQueRlMap("lawCategory"); }

    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsSourceCQ queryClsSource() {
        return xdfgetConditionQueryClsSource();
    }
    public ClsSourceCQ xdfgetConditionQueryClsSource() {
        String prop = "clsSource";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsSource()); xsetupOuterJoinClsSource(); }
        return xgetQueRlMap(prop);
    }
    protected ClsSourceCQ xcreateQueryClsSource() {
        String nrp = xresolveNRP("SOURCE_LAW_CATEGORY", "clsSource"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsSourceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsSource", nrp);
    }
    protected void xsetupOuterJoinClsSource() { xregOutJo("clsSource"); }
    public boolean hasConditionQueryClsSource() { return xhasQueRlMap("clsSource"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, SourceLawCategoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(SourceLawCategoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, SourceLawCategoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(SourceLawCategoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, SourceLawCategoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(SourceLawCategoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, SourceLawCategoryCQ> _myselfExistsMap;
    public Map<String, SourceLawCategoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(SourceLawCategoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, SourceLawCategoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(SourceLawCategoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SourceLawCategoryCB.class.getName(); }
    protected String xCQ() { return SourceLawCategoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
