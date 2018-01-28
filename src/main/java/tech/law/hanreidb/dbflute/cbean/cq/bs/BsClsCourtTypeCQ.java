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
 * The base condition-query of CLS_COURT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public class BsClsCourtTypeCQ extends AbstractBsClsCourtTypeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ClsCourtTypeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsClsCourtTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CLS_COURT_TYPE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ClsCourtTypeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ClsCourtTypeCIQ xcreateCIQ() {
        ClsCourtTypeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ClsCourtTypeCIQ xnewCIQ() {
        return new ClsCourtTypeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CLS_COURT_TYPE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ClsCourtTypeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ClsCourtTypeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _courtTypeCode;
    public ConditionValue xdfgetCourtTypeCode()
    { if (_courtTypeCode == null) { _courtTypeCode = nCV(); }
      return _courtTypeCode; }
    protected ConditionValue xgetCValueCourtTypeCode() { return xdfgetCourtTypeCode(); }

    public Map<String, CaseMarkCQ> xdfgetCourtTypeCode_ExistsReferrer_CaseMarkList() { return xgetSQueMap("courtTypeCode_ExistsReferrer_CaseMarkList"); }
    public String keepCourtTypeCode_ExistsReferrer_CaseMarkList(CaseMarkCQ sq) { return xkeepSQue("courtTypeCode_ExistsReferrer_CaseMarkList", sq); }

    public Map<String, CourtCQ> xdfgetCourtTypeCode_ExistsReferrer_CourtList() { return xgetSQueMap("courtTypeCode_ExistsReferrer_CourtList"); }
    public String keepCourtTypeCode_ExistsReferrer_CourtList(CourtCQ sq) { return xkeepSQue("courtTypeCode_ExistsReferrer_CourtList", sq); }

    public Map<String, CaseMarkCQ> xdfgetCourtTypeCode_NotExistsReferrer_CaseMarkList() { return xgetSQueMap("courtTypeCode_NotExistsReferrer_CaseMarkList"); }
    public String keepCourtTypeCode_NotExistsReferrer_CaseMarkList(CaseMarkCQ sq) { return xkeepSQue("courtTypeCode_NotExistsReferrer_CaseMarkList", sq); }

    public Map<String, CourtCQ> xdfgetCourtTypeCode_NotExistsReferrer_CourtList() { return xgetSQueMap("courtTypeCode_NotExistsReferrer_CourtList"); }
    public String keepCourtTypeCode_NotExistsReferrer_CourtList(CourtCQ sq) { return xkeepSQue("courtTypeCode_NotExistsReferrer_CourtList", sq); }

    public Map<String, CaseMarkCQ> xdfgetCourtTypeCode_SpecifyDerivedReferrer_CaseMarkList() { return xgetSQueMap("courtTypeCode_SpecifyDerivedReferrer_CaseMarkList"); }
    public String keepCourtTypeCode_SpecifyDerivedReferrer_CaseMarkList(CaseMarkCQ sq) { return xkeepSQue("courtTypeCode_SpecifyDerivedReferrer_CaseMarkList", sq); }

    public Map<String, CourtCQ> xdfgetCourtTypeCode_SpecifyDerivedReferrer_CourtList() { return xgetSQueMap("courtTypeCode_SpecifyDerivedReferrer_CourtList"); }
    public String keepCourtTypeCode_SpecifyDerivedReferrer_CourtList(CourtCQ sq) { return xkeepSQue("courtTypeCode_SpecifyDerivedReferrer_CourtList", sq); }

    public Map<String, CaseMarkCQ> xdfgetCourtTypeCode_QueryDerivedReferrer_CaseMarkList() { return xgetSQueMap("courtTypeCode_QueryDerivedReferrer_CaseMarkList"); }
    public String keepCourtTypeCode_QueryDerivedReferrer_CaseMarkList(CaseMarkCQ sq) { return xkeepSQue("courtTypeCode_QueryDerivedReferrer_CaseMarkList", sq); }
    public Map<String, Object> xdfgetCourtTypeCode_QueryDerivedReferrer_CaseMarkListParameter() { return xgetSQuePmMap("courtTypeCode_QueryDerivedReferrer_CaseMarkList"); }
    public String keepCourtTypeCode_QueryDerivedReferrer_CaseMarkListParameter(Object pm) { return xkeepSQuePm("courtTypeCode_QueryDerivedReferrer_CaseMarkList", pm); }

    public Map<String, CourtCQ> xdfgetCourtTypeCode_QueryDerivedReferrer_CourtList() { return xgetSQueMap("courtTypeCode_QueryDerivedReferrer_CourtList"); }
    public String keepCourtTypeCode_QueryDerivedReferrer_CourtList(CourtCQ sq) { return xkeepSQue("courtTypeCode_QueryDerivedReferrer_CourtList", sq); }
    public Map<String, Object> xdfgetCourtTypeCode_QueryDerivedReferrer_CourtListParameter() { return xgetSQuePmMap("courtTypeCode_QueryDerivedReferrer_CourtList"); }
    public String keepCourtTypeCode_QueryDerivedReferrer_CourtListParameter(Object pm) { return xkeepSQuePm("courtTypeCode_QueryDerivedReferrer_CourtList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeCode_Asc() { regOBA("COURT_TYPE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {PK, NotNull, VARCHAR(10), classification=CourtType}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeCode_Desc() { regOBD("COURT_TYPE_CODE"); return this; }

    protected ConditionValue _courtTypeName;
    public ConditionValue xdfgetCourtTypeName()
    { if (_courtTypeName == null) { _courtTypeName = nCV(); }
      return _courtTypeName; }
    protected ConditionValue xgetCValueCourtTypeName() { return xdfgetCourtTypeName(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeName_Asc() { regOBA("COURT_TYPE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所種別名)COURT_TYPE_NAME: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeName_Desc() { regOBD("COURT_TYPE_NAME"); return this; }

    protected ConditionValue _courtTypeAlias;
    public ConditionValue xdfgetCourtTypeAlias()
    { if (_courtTypeAlias == null) { _courtTypeAlias = nCV(); }
      return _courtTypeAlias; }
    protected ConditionValue xgetCValueCourtTypeAlias() { return xdfgetCourtTypeAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeAlias_Asc() { regOBA("COURT_TYPE_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (裁判所種別別名)COURT_TYPE_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_CourtTypeAlias_Desc() { regOBD("COURT_TYPE_ALIAS"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsClsCourtTypeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsClsCourtTypeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsClsCourtTypeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsClsCourtTypeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ClsCourtTypeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ClsCourtTypeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ClsCourtTypeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ClsCourtTypeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ClsCourtTypeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ClsCourtTypeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ClsCourtTypeCQ> _myselfExistsMap;
    public Map<String, ClsCourtTypeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ClsCourtTypeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ClsCourtTypeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ClsCourtTypeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ClsCourtTypeCB.class.getName(); }
    protected String xCQ() { return ClsCourtTypeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
