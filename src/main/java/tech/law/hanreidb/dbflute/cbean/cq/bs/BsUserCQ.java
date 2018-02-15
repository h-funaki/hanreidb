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
 * The base condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, JudgementUserFavoriteRelCQ> xdfgetUserId_ExistsReferrer_JudgementUserFavoriteRelList() { return xgetSQueMap("userId_ExistsReferrer_JudgementUserFavoriteRelList"); }
    public String keepUserId_ExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("userId_ExistsReferrer_JudgementUserFavoriteRelList", sq); }

    public Map<String, LoginHistoryCQ> xdfgetUserId_ExistsReferrer_LoginHistoryList() { return xgetSQueMap("userId_ExistsReferrer_LoginHistoryList"); }
    public String keepUserId_ExistsReferrer_LoginHistoryList(LoginHistoryCQ sq) { return xkeepSQue("userId_ExistsReferrer_LoginHistoryList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserId_ExistsReferrer_UserStatusHistoryList() { return xgetSQueMap("userId_ExistsReferrer_UserStatusHistoryList"); }
    public String keepUserId_ExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userId_ExistsReferrer_UserStatusHistoryList", sq); }

    public Map<String, JudgementUserFavoriteRelCQ> xdfgetUserId_NotExistsReferrer_JudgementUserFavoriteRelList() { return xgetSQueMap("userId_NotExistsReferrer_JudgementUserFavoriteRelList"); }
    public String keepUserId_NotExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("userId_NotExistsReferrer_JudgementUserFavoriteRelList", sq); }

    public Map<String, LoginHistoryCQ> xdfgetUserId_NotExistsReferrer_LoginHistoryList() { return xgetSQueMap("userId_NotExistsReferrer_LoginHistoryList"); }
    public String keepUserId_NotExistsReferrer_LoginHistoryList(LoginHistoryCQ sq) { return xkeepSQue("userId_NotExistsReferrer_LoginHistoryList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserId_NotExistsReferrer_UserStatusHistoryList() { return xgetSQueMap("userId_NotExistsReferrer_UserStatusHistoryList"); }
    public String keepUserId_NotExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userId_NotExistsReferrer_UserStatusHistoryList", sq); }

    public Map<String, JudgementUserFavoriteRelCQ> xdfgetUserId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList"); }
    public String keepUserId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList", sq); }

    public Map<String, LoginHistoryCQ> xdfgetUserId_SpecifyDerivedReferrer_LoginHistoryList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_LoginHistoryList"); }
    public String keepUserId_SpecifyDerivedReferrer_LoginHistoryList(LoginHistoryCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_LoginHistoryList", sq); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserId_SpecifyDerivedReferrer_UserStatusHistoryList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserId_SpecifyDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_UserStatusHistoryList", sq); }

    public Map<String, JudgementUserFavoriteRelCQ> xdfgetUserId_QueryDerivedReferrer_JudgementUserFavoriteRelList() { return xgetSQueMap("userId_QueryDerivedReferrer_JudgementUserFavoriteRelList"); }
    public String keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_JudgementUserFavoriteRelList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_JudgementUserFavoriteRelList"); }
    public String keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_JudgementUserFavoriteRelList", pm); }

    public Map<String, LoginHistoryCQ> xdfgetUserId_QueryDerivedReferrer_LoginHistoryList() { return xgetSQueMap("userId_QueryDerivedReferrer_LoginHistoryList"); }
    public String keepUserId_QueryDerivedReferrer_LoginHistoryList(LoginHistoryCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_LoginHistoryList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_LoginHistoryListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_LoginHistoryList"); }
    public String keepUserId_QueryDerivedReferrer_LoginHistoryListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_LoginHistoryList", pm); }

    public Map<String, UserStatusHistoryCQ> xdfgetUserId_QueryDerivedReferrer_UserStatusHistoryList() { return xgetSQueMap("userId_QueryDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserId_QueryDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_UserStatusHistoryList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_UserStatusHistoryListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_UserStatusHistoryList"); }
    public String keepUserId_QueryDerivedReferrer_UserStatusHistoryListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_UserStatusHistoryList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _userStatusCode;
    public ConditionValue xdfgetUserStatusCode()
    { if (_userStatusCode == null) { _userStatusCode = nCV(); }
      return _userStatusCode; }
    protected ConditionValue xgetCValueUserStatusCode() { return xdfgetUserStatusCode(); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserStatusCode_Asc() { regOBA("USER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_USER_STATUS}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserStatusCode_Desc() { regOBD("USER_STATUS_CODE"); return this; }

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
    public BsUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsUserCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsUserCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsUserCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserCQ bq = (UserCQ)bqs;
        UserCQ uq = (UserCQ)uqs;
        if (bq.hasConditionQueryClsUserStatus()) {
            uq.queryClsUserStatus().reflectRelationOnUnionQuery(bq.queryClsUserStatus(), uq.queryClsUserStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ClsUserStatusCQ queryClsUserStatus() {
        return xdfgetConditionQueryClsUserStatus();
    }
    public ClsUserStatusCQ xdfgetConditionQueryClsUserStatus() {
        String prop = "clsUserStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryClsUserStatus()); xsetupOuterJoinClsUserStatus(); }
        return xgetQueRlMap(prop);
    }
    protected ClsUserStatusCQ xcreateQueryClsUserStatus() {
        String nrp = xresolveNRP("USER", "clsUserStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ClsUserStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "clsUserStatus", nrp);
    }
    protected void xsetupOuterJoinClsUserStatus() { xregOutJo("clsUserStatus"); }
    public boolean hasConditionQueryClsUserStatus() { return xhasQueRlMap("clsUserStatus"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
