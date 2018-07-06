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
 * The base condition-query of CLS_USER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsClsUserStatusCQ extends AbstractBsClsUserStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ClsUserStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsClsUserStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from CLS_USER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ClsUserStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ClsUserStatusCIQ xcreateCIQ() {
        ClsUserStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ClsUserStatusCIQ xnewCIQ() {
        return new ClsUserStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join CLS_USER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ClsUserStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ClsUserStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userStatusCode;
    public ConditionValue xdfgetUserStatusCode()
    { if (_userStatusCode == null) { _userStatusCode = nCV(); }
      return _userStatusCode; }
    protected ConditionValue xgetCValueUserStatusCode() { return xdfgetUserStatusCode(); }

    public Map<String, UserCQ> xdfgetUserStatusCode_ExistsReferrer_UserList() { return xgetSQueMap("userStatusCode_ExistsReferrer_UserList"); }
    public String keepUserStatusCode_ExistsReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_ExistsReferrer_UserList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserStatusCode_ExistsReferrer_UserStatusHistoryList() { return xgetSQueMap("userStatusCode_ExistsReferrer_UserStatusHistoryList"); }
    public String keepUserStatusCode_ExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userStatusCode_ExistsReferrer_UserStatusHistoryList", sq); }

    public Map<String, UserCQ> xdfgetUserStatusCode_NotExistsReferrer_UserList() { return xgetSQueMap("userStatusCode_NotExistsReferrer_UserList"); }
    public String keepUserStatusCode_NotExistsReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_NotExistsReferrer_UserList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserStatusCode_NotExistsReferrer_UserStatusHistoryList() { return xgetSQueMap("userStatusCode_NotExistsReferrer_UserStatusHistoryList"); }
    public String keepUserStatusCode_NotExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userStatusCode_NotExistsReferrer_UserStatusHistoryList", sq); }

    public Map<String, UserCQ> xdfgetUserStatusCode_SpecifyDerivedReferrer_UserList() { return xgetSQueMap("userStatusCode_SpecifyDerivedReferrer_UserList"); }
    public String keepUserStatusCode_SpecifyDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_SpecifyDerivedReferrer_UserList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList() { return xgetSQueMap("userStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList", sq); }

    public Map<String, UserCQ> xdfgetUserStatusCode_QueryDerivedReferrer_UserList() { return xgetSQueMap("userStatusCode_QueryDerivedReferrer_UserList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_QueryDerivedReferrer_UserList", sq); }
    public Map<String, Object> xdfgetUserStatusCode_QueryDerivedReferrer_UserListParameter() { return xgetSQuePmMap("userStatusCode_QueryDerivedReferrer_UserList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserListParameter(Object pm) { return xkeepSQuePm("userStatusCode_QueryDerivedReferrer_UserList", pm); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserStatusCode_QueryDerivedReferrer_UserStatusHistoryList() { return xgetSQueMap("userStatusCode_QueryDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userStatusCode_QueryDerivedReferrer_UserStatusHistoryList", sq); }
    public Map<String, Object> xdfgetUserStatusCode_QueryDerivedReferrer_UserStatusHistoryListParameter() { return xgetSQuePmMap("userStatusCode_QueryDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryListParameter(Object pm) { return xkeepSQuePm("userStatusCode_QueryDerivedReferrer_UserStatusHistoryList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusCode_Asc() { regOBA("USER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10), classification=UserStatus}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusCode_Desc() { regOBD("USER_STATUS_CODE"); return this; }

    protected ConditionValue _userStatusName;
    public ConditionValue xdfgetUserStatusName()
    { if (_userStatusName == null) { _userStatusName = nCV(); }
      return _userStatusName; }
    protected ConditionValue xgetCValueUserStatusName() { return xdfgetUserStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusName_Asc() { regOBA("USER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusName_Desc() { regOBD("USER_STATUS_NAME"); return this; }

    protected ConditionValue _userStatusAlias;
    public ConditionValue xdfgetUserStatusAlias()
    { if (_userStatusAlias == null) { _userStatusAlias = nCV(); }
      return _userStatusAlias; }
    protected ConditionValue xgetCValueUserStatusAlias() { return xdfgetUserStatusAlias(); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusAlias_Asc() { regOBA("USER_STATUS_ALIAS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusAlias_Desc() { regOBD("USER_STATUS_ALIAS"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsClsUserStatusCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsClsUserStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsClsUserStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ClsUserStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ClsUserStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ClsUserStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ClsUserStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ClsUserStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ClsUserStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ClsUserStatusCQ> _myselfExistsMap;
    public Map<String, ClsUserStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ClsUserStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ClsUserStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ClsUserStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ClsUserStatusCB.class.getName(); }
    protected String xCQ() { return ClsUserStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
