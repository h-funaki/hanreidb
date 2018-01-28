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

    public Map<String, UserCQ> xdfgetUserStatusCode_NotExistsReferrer_UserList() { return xgetSQueMap("userStatusCode_NotExistsReferrer_UserList"); }
    public String keepUserStatusCode_NotExistsReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_NotExistsReferrer_UserList", sq); }

    public Map<String, UserCQ> xdfgetUserStatusCode_SpecifyDerivedReferrer_UserList() { return xgetSQueMap("userStatusCode_SpecifyDerivedReferrer_UserList"); }
    public String keepUserStatusCode_SpecifyDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_SpecifyDerivedReferrer_UserList", sq); }

    public Map<String, UserCQ> xdfgetUserStatusCode_QueryDerivedReferrer_UserList() { return xgetSQueMap("userStatusCode_QueryDerivedReferrer_UserList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserList(UserCQ sq) { return xkeepSQue("userStatusCode_QueryDerivedReferrer_UserList", sq); }
    public Map<String, Object> xdfgetUserStatusCode_QueryDerivedReferrer_UserListParameter() { return xgetSQuePmMap("userStatusCode_QueryDerivedReferrer_UserList"); }
    public String keepUserStatusCode_QueryDerivedReferrer_UserListParameter(Object pm) { return xkeepSQuePm("userStatusCode_QueryDerivedReferrer_UserList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsClsUserStatusCQ addOrderBy_UserStatusCode_Asc() { regOBA("USER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
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
