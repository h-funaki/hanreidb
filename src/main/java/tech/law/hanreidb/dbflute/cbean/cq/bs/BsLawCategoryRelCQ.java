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
 * The base condition-query of LAW_CATEGORY_REL.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawCategoryRelCQ extends AbstractBsLawCategoryRelCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawCategoryRelCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawCategoryRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_CATEGORY_REL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawCategoryRelCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawCategoryRelCIQ xcreateCIQ() {
        LawCategoryRelCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawCategoryRelCIQ xnewCIQ() {
        return new LawCategoryRelCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_CATEGORY_REL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawCategoryRelCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawCategoryRelCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawCategoryRelId;
    public ConditionValue xdfgetLawCategoryRelId()
    { if (_lawCategoryRelId == null) { _lawCategoryRelId = nCV(); }
      return _lawCategoryRelId; }
    protected ConditionValue xgetCValueLawCategoryRelId() { return xdfgetLawCategoryRelId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawCategoryRelId_Asc() { regOBA("LAW_CATEGORY_REL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawCategoryRelId_Desc() { regOBD("LAW_CATEGORY_REL_ID"); return this; }

    protected ConditionValue _lawId;
    public ConditionValue xdfgetLawId()
    { if (_lawId == null) { _lawId = nCV(); }
      return _lawId; }
    protected ConditionValue xgetCValueLawId() { return xdfgetLawId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawId_Asc() { regOBA("LAW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawId_Desc() { regOBD("LAW_ID"); return this; }

    protected ConditionValue _lawCategoryId;
    public ConditionValue xdfgetLawCategoryId()
    { if (_lawCategoryId == null) { _lawCategoryId = nCV(); }
      return _lawCategoryId; }
    protected ConditionValue xgetCValueLawCategoryId() { return xdfgetLawCategoryId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawCategoryId_Asc() { regOBA("LAW_CATEGORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_LawCategoryId_Desc() { regOBD("LAW_CATEGORY_ID"); return this; }

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
    public BsLawCategoryRelCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsLawCategoryRelCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsLawCategoryRelCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsLawCategoryRelCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsLawCategoryRelCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawCategoryRelCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLawCategoryRelCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawCategoryRelCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LawCategoryRelCQ bq = (LawCategoryRelCQ)bqs;
        LawCategoryRelCQ uq = (LawCategoryRelCQ)uqs;
        if (bq.hasConditionQueryLawCategory()) {
            uq.queryLawCategory().reflectRelationOnUnionQuery(bq.queryLawCategory(), uq.queryLawCategory());
        }
        if (bq.hasConditionQueryLaw()) {
            uq.queryLaw().reflectRelationOnUnionQuery(bq.queryLaw(), uq.queryLaw());
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
        String nrp = xresolveNRP("LAW_CATEGORY_REL", "lawCategory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawCategory", nrp);
    }
    protected void xsetupOuterJoinLawCategory() { xregOutJo("lawCategory"); }
    public boolean hasConditionQueryLawCategory() { return xhasQueRlMap("lawCategory"); }

    /**
     * Get the condition-query for relation table. <br>
     * (法令)LAW by my LAW_ID, named 'law'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawCQ queryLaw() {
        return xdfgetConditionQueryLaw();
    }
    public LawCQ xdfgetConditionQueryLaw() {
        String prop = "law";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLaw()); xsetupOuterJoinLaw(); }
        return xgetQueRlMap(prop);
    }
    protected LawCQ xcreateQueryLaw() {
        String nrp = xresolveNRP("LAW_CATEGORY_REL", "law"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "law", nrp);
    }
    protected void xsetupOuterJoinLaw() { xregOutJo("law"); }
    public boolean hasConditionQueryLaw() { return xhasQueRlMap("law"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LawCategoryRelCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawCategoryRelCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawCategoryRelCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawCategoryRelCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawCategoryRelCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawCategoryRelCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawCategoryRelCQ> _myselfExistsMap;
    public Map<String, LawCategoryRelCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawCategoryRelCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawCategoryRelCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawCategoryRelCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawCategoryRelCB.class.getName(); }
    protected String xCQ() { return LawCategoryRelCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
