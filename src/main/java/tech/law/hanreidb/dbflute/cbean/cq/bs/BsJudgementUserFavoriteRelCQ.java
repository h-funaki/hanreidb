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
 * The base condition-query of JUDGEMENT_USER_FAVORITE_REL.
 * @author DBFlute(AutoGenerator)
 */
public class BsJudgementUserFavoriteRelCQ extends AbstractBsJudgementUserFavoriteRelCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected JudgementUserFavoriteRelCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsJudgementUserFavoriteRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from JUDGEMENT_USER_FAVORITE_REL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public JudgementUserFavoriteRelCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected JudgementUserFavoriteRelCIQ xcreateCIQ() {
        JudgementUserFavoriteRelCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected JudgementUserFavoriteRelCIQ xnewCIQ() {
        return new JudgementUserFavoriteRelCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join JUDGEMENT_USER_FAVORITE_REL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public JudgementUserFavoriteRelCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        JudgementUserFavoriteRelCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _judgementUserFavoriteRelId;
    public ConditionValue xdfgetJudgementUserFavoriteRelId()
    { if (_judgementUserFavoriteRelId == null) { _judgementUserFavoriteRelId = nCV(); }
      return _judgementUserFavoriteRelId; }
    protected ConditionValue xgetCValueJudgementUserFavoriteRelId() { return xdfgetJudgementUserFavoriteRelId(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決ユーザーお気に入りリレーションID)JUDGEMENT_USER_FAVORITE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_JudgementUserFavoriteRelId_Asc() { regOBA("JUDGEMENT_USER_FAVORITE_REL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決ユーザーお気に入りリレーションID)JUDGEMENT_USER_FAVORITE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_JudgementUserFavoriteRelId_Desc() { regOBD("JUDGEMENT_USER_FAVORITE_REL_ID"); return this; }

    protected ConditionValue _judgementId;
    public ConditionValue xdfgetJudgementId()
    { if (_judgementId == null) { _judgementId = nCV(); }
      return _judgementId; }
    protected ConditionValue xgetCValueJudgementId() { return xdfgetJudgementId(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決ID)JUDGEMENT_ID: {UQ+, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_JudgementId_Asc() { regOBA("JUDGEMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決ID)JUDGEMENT_ID: {UQ+, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_JudgementId_Desc() { regOBD("JUDGEMENT_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * (ユーザーID)USER_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーID)USER_ID: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsJudgementUserFavoriteRelCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsJudgementUserFavoriteRelCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsJudgementUserFavoriteRelCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        JudgementUserFavoriteRelCQ bq = (JudgementUserFavoriteRelCQ)bqs;
        JudgementUserFavoriteRelCQ uq = (JudgementUserFavoriteRelCQ)uqs;
        if (bq.hasConditionQueryJudgement()) {
            uq.queryJudgement().reflectRelationOnUnionQuery(bq.queryJudgement(), uq.queryJudgement());
        }
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @return The instance of condition-query. (NotNull)
     */
    public JudgementCQ queryJudgement() {
        return xdfgetConditionQueryJudgement();
    }
    public JudgementCQ xdfgetConditionQueryJudgement() {
        String prop = "judgement";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryJudgement()); xsetupOuterJoinJudgement(); }
        return xgetQueRlMap(prop);
    }
    protected JudgementCQ xcreateQueryJudgement() {
        String nrp = xresolveNRP("JUDGEMENT_USER_FAVORITE_REL", "judgement"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new JudgementCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "judgement", nrp);
    }
    protected void xsetupOuterJoinJudgement() { xregOutJo("judgement"); }
    public boolean hasConditionQueryJudgement() { return xhasQueRlMap("judgement"); }

    /**
     * Get the condition-query for relation table. <br>
     * (ユーザー)USER by my USER_ID, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public UserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("JUDGEMENT_USER_FAVORITE_REL", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, JudgementUserFavoriteRelCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, JudgementUserFavoriteRelCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, JudgementUserFavoriteRelCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, JudgementUserFavoriteRelCQ> _myselfExistsMap;
    public Map<String, JudgementUserFavoriteRelCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, JudgementUserFavoriteRelCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(JudgementUserFavoriteRelCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return JudgementUserFavoriteRelCB.class.getName(); }
    protected String xCQ() { return JudgementUserFavoriteRelCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
