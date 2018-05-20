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
 * The base condition-query of LAW_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawTypeCQ extends AbstractBsLawTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawTypeCIQ xcreateCIQ() {
        LawTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawTypeCIQ xnewCIQ() {
        return new LawTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawTypeCode;
    public ConditionValue xdfgetLawTypeCode()
    { if (_lawTypeCode == null) { _lawTypeCode = nCV(); }
      return _lawTypeCode; }
    protected ConditionValue xgetCValueLawTypeCode() { return xdfgetLawTypeCode(); }

    public Map<String, LawCQ> xdfgetLawTypeCode_ExistsReferrer_LawList() { return xgetSQueMap("lawTypeCode_ExistsReferrer_LawList"); }
    public String keepLawTypeCode_ExistsReferrer_LawList(LawCQ sq) { return xkeepSQue("lawTypeCode_ExistsReferrer_LawList", sq); }

    public Map<String, LawCQ> xdfgetLawTypeCode_NotExistsReferrer_LawList() { return xgetSQueMap("lawTypeCode_NotExistsReferrer_LawList"); }
    public String keepLawTypeCode_NotExistsReferrer_LawList(LawCQ sq) { return xkeepSQue("lawTypeCode_NotExistsReferrer_LawList", sq); }

    public Map<String, LawCQ> xdfgetLawTypeCode_SpecifyDerivedReferrer_LawList() { return xgetSQueMap("lawTypeCode_SpecifyDerivedReferrer_LawList"); }
    public String keepLawTypeCode_SpecifyDerivedReferrer_LawList(LawCQ sq) { return xkeepSQue("lawTypeCode_SpecifyDerivedReferrer_LawList", sq); }

    public Map<String, LawCQ> xdfgetLawTypeCode_QueryDerivedReferrer_LawList() { return xgetSQueMap("lawTypeCode_QueryDerivedReferrer_LawList"); }
    public String keepLawTypeCode_QueryDerivedReferrer_LawList(LawCQ sq) { return xkeepSQue("lawTypeCode_QueryDerivedReferrer_LawList", sq); }
    public Map<String, Object> xdfgetLawTypeCode_QueryDerivedReferrer_LawListParameter() { return xgetSQuePmMap("lawTypeCode_QueryDerivedReferrer_LawList"); }
    public String keepLawTypeCode_QueryDerivedReferrer_LawListParameter(Object pm) { return xkeepSQuePm("lawTypeCode_QueryDerivedReferrer_LawList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeCode_Asc() { regOBA("LAW_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令種別コード)LAW_TYPE_CODE: {PK, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeCode_Desc() { regOBD("LAW_TYPE_CODE"); return this; }

    protected ConditionValue _lawTypeName;
    public ConditionValue xdfgetLawTypeName()
    { if (_lawTypeName == null) { _lawTypeName = nCV(); }
      return _lawTypeName; }
    protected ConditionValue xgetCValueLawTypeName() { return xdfgetLawTypeName(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeName_Asc() { regOBA("LAW_TYPE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令種別)LAW_TYPE_NAME: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeName_Desc() { regOBD("LAW_TYPE_NAME"); return this; }

    protected ConditionValue _lawTypeAlias;
    public ConditionValue xdfgetLawTypeAlias()
    { if (_lawTypeAlias == null) { _lawTypeAlias = nCV(); }
      return _lawTypeAlias; }
    protected ConditionValue xgetCValueLawTypeAlias() { return xdfgetLawTypeAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeAlias_Asc() { regOBA("LAW_TYPE_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令種別別名)LAW_TYPE_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_LawTypeAlias_Desc() { regOBD("LAW_TYPE_ALIAS"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsLawTypeCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsLawTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, LawTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawTypeCQ> _myselfExistsMap;
    public Map<String, LawTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawTypeCB.class.getName(); }
    protected String xCQ() { return LawTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
