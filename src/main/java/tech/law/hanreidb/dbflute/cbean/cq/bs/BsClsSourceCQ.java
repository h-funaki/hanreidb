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
 * The base condition-query of CLS_SOURCE.
 * @author DBFlute(AutoGenerator)
 */
public class BsClsSourceCQ extends AbstractBsClsSourceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ClsSourceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsClsSourceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CLS_SOURCE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ClsSourceCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ClsSourceCIQ xcreateCIQ() {
        ClsSourceCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ClsSourceCIQ xnewCIQ() {
        return new ClsSourceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CLS_SOURCE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ClsSourceCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ClsSourceCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sourceCode;
    public ConditionValue xdfgetSourceCode()
    { if (_sourceCode == null) { _sourceCode = nCV(); }
      return _sourceCode; }
    protected ConditionValue xgetCValueSourceCode() { return xdfgetSourceCode(); }

    public Map<String, JudgementSourceRelCQ> xdfgetSourceCode_ExistsReferrer_JudgementSourceRelList() { return xgetSQueMap("sourceCode_ExistsReferrer_JudgementSourceRelList"); }
    public String keepSourceCode_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("sourceCode_ExistsReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetSourceCode_NotExistsReferrer_JudgementSourceRelList() { return xgetSQueMap("sourceCode_NotExistsReferrer_JudgementSourceRelList"); }
    public String keepSourceCode_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("sourceCode_NotExistsReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetSourceCode_SpecifyDerivedReferrer_JudgementSourceRelList() { return xgetSQueMap("sourceCode_SpecifyDerivedReferrer_JudgementSourceRelList"); }
    public String keepSourceCode_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("sourceCode_SpecifyDerivedReferrer_JudgementSourceRelList", sq); }

    public Map<String, JudgementSourceRelCQ> xdfgetSourceCode_QueryDerivedReferrer_JudgementSourceRelList() { return xgetSQueMap("sourceCode_QueryDerivedReferrer_JudgementSourceRelList"); }
    public String keepSourceCode_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq) { return xkeepSQue("sourceCode_QueryDerivedReferrer_JudgementSourceRelList", sq); }
    public Map<String, Object> xdfgetSourceCode_QueryDerivedReferrer_JudgementSourceRelListParameter() { return xgetSQuePmMap("sourceCode_QueryDerivedReferrer_JudgementSourceRelList"); }
    public String keepSourceCode_QueryDerivedReferrer_JudgementSourceRelListParameter(Object pm) { return xkeepSQuePm("sourceCode_QueryDerivedReferrer_JudgementSourceRelList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceCode_Asc() { regOBA("SOURCE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceCode_Desc() { regOBD("SOURCE_CODE"); return this; }

    protected ConditionValue _sourceName;
    public ConditionValue xdfgetSourceName()
    { if (_sourceName == null) { _sourceName = nCV(); }
      return _sourceName; }
    protected ConditionValue xgetCValueSourceName() { return xdfgetSourceName(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceName_Asc() { regOBA("SOURCE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceName_Desc() { regOBD("SOURCE_NAME"); return this; }

    protected ConditionValue _sourceAlias;
    public ConditionValue xdfgetSourceAlias()
    { if (_sourceAlias == null) { _sourceAlias = nCV(); }
      return _sourceAlias; }
    protected ConditionValue xgetCValueSourceAlias() { return xdfgetSourceAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceAlias_Asc() { regOBA("SOURCE_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_SourceAlias_Desc() { regOBD("SOURCE_ALIAS"); return this; }

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
    public BsClsSourceCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsClsSourceCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsClsSourceCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsClsSourceCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsClsSourceCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsClsSourceCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsClsSourceCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsClsSourceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsClsSourceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ClsSourceCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ClsSourceCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ClsSourceCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ClsSourceCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ClsSourceCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ClsSourceCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ClsSourceCQ> _myselfExistsMap;
    public Map<String, ClsSourceCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ClsSourceCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ClsSourceCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ClsSourceCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ClsSourceCB.class.getName(); }
    protected String xCQ() { return ClsSourceCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
