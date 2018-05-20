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
 * The base condition-query of LAW_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawHistoryCQ extends AbstractBsLawHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_HISTORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawHistoryCIQ xcreateCIQ() {
        LawHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawHistoryCIQ xnewCIQ() {
        return new LawHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_HISTORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawHistoryId;
    public ConditionValue xdfgetLawHistoryId()
    { if (_lawHistoryId == null) { _lawHistoryId = nCV(); }
      return _lawHistoryId; }
    protected ConditionValue xgetCValueLawHistoryId() { return xdfgetLawHistoryId(); }

    public Map<String, ArticleCQ> xdfgetLawHistoryId_ExistsReferrer_ArticleList() { return xgetSQueMap("lawHistoryId_ExistsReferrer_ArticleList"); }
    public String keepLawHistoryId_ExistsReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawHistoryId_ExistsReferrer_ArticleList", sq); }

    public Map<String, LawContentCQ> xdfgetLawHistoryId_ExistsReferrer_LawContentList() { return xgetSQueMap("lawHistoryId_ExistsReferrer_LawContentList"); }
    public String keepLawHistoryId_ExistsReferrer_LawContentList(LawContentCQ sq) { return xkeepSQue("lawHistoryId_ExistsReferrer_LawContentList", sq); }

    public Map<String, LawTocCQ> xdfgetLawHistoryId_ExistsReferrer_LawTocList() { return xgetSQueMap("lawHistoryId_ExistsReferrer_LawTocList"); }
    public String keepLawHistoryId_ExistsReferrer_LawTocList(LawTocCQ sq) { return xkeepSQue("lawHistoryId_ExistsReferrer_LawTocList", sq); }

    public Map<String, ArticleCQ> xdfgetLawHistoryId_NotExistsReferrer_ArticleList() { return xgetSQueMap("lawHistoryId_NotExistsReferrer_ArticleList"); }
    public String keepLawHistoryId_NotExistsReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawHistoryId_NotExistsReferrer_ArticleList", sq); }

    public Map<String, LawContentCQ> xdfgetLawHistoryId_NotExistsReferrer_LawContentList() { return xgetSQueMap("lawHistoryId_NotExistsReferrer_LawContentList"); }
    public String keepLawHistoryId_NotExistsReferrer_LawContentList(LawContentCQ sq) { return xkeepSQue("lawHistoryId_NotExistsReferrer_LawContentList", sq); }

    public Map<String, LawTocCQ> xdfgetLawHistoryId_NotExistsReferrer_LawTocList() { return xgetSQueMap("lawHistoryId_NotExistsReferrer_LawTocList"); }
    public String keepLawHistoryId_NotExistsReferrer_LawTocList(LawTocCQ sq) { return xkeepSQue("lawHistoryId_NotExistsReferrer_LawTocList", sq); }

    public Map<String, ArticleCQ> xdfgetLawHistoryId_SpecifyDerivedReferrer_ArticleList() { return xgetSQueMap("lawHistoryId_SpecifyDerivedReferrer_ArticleList"); }
    public String keepLawHistoryId_SpecifyDerivedReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawHistoryId_SpecifyDerivedReferrer_ArticleList", sq); }

    public Map<String, LawContentCQ> xdfgetLawHistoryId_SpecifyDerivedReferrer_LawContentList() { return xgetSQueMap("lawHistoryId_SpecifyDerivedReferrer_LawContentList"); }
    public String keepLawHistoryId_SpecifyDerivedReferrer_LawContentList(LawContentCQ sq) { return xkeepSQue("lawHistoryId_SpecifyDerivedReferrer_LawContentList", sq); }

    public Map<String, LawTocCQ> xdfgetLawHistoryId_SpecifyDerivedReferrer_LawTocList() { return xgetSQueMap("lawHistoryId_SpecifyDerivedReferrer_LawTocList"); }
    public String keepLawHistoryId_SpecifyDerivedReferrer_LawTocList(LawTocCQ sq) { return xkeepSQue("lawHistoryId_SpecifyDerivedReferrer_LawTocList", sq); }

    public Map<String, ArticleCQ> xdfgetLawHistoryId_QueryDerivedReferrer_ArticleList() { return xgetSQueMap("lawHistoryId_QueryDerivedReferrer_ArticleList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_ArticleList(ArticleCQ sq) { return xkeepSQue("lawHistoryId_QueryDerivedReferrer_ArticleList", sq); }
    public Map<String, Object> xdfgetLawHistoryId_QueryDerivedReferrer_ArticleListParameter() { return xgetSQuePmMap("lawHistoryId_QueryDerivedReferrer_ArticleList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_ArticleListParameter(Object pm) { return xkeepSQuePm("lawHistoryId_QueryDerivedReferrer_ArticleList", pm); }

    public Map<String, LawContentCQ> xdfgetLawHistoryId_QueryDerivedReferrer_LawContentList() { return xgetSQueMap("lawHistoryId_QueryDerivedReferrer_LawContentList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_LawContentList(LawContentCQ sq) { return xkeepSQue("lawHistoryId_QueryDerivedReferrer_LawContentList", sq); }
    public Map<String, Object> xdfgetLawHistoryId_QueryDerivedReferrer_LawContentListParameter() { return xgetSQuePmMap("lawHistoryId_QueryDerivedReferrer_LawContentList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_LawContentListParameter(Object pm) { return xkeepSQuePm("lawHistoryId_QueryDerivedReferrer_LawContentList", pm); }

    public Map<String, LawTocCQ> xdfgetLawHistoryId_QueryDerivedReferrer_LawTocList() { return xgetSQueMap("lawHistoryId_QueryDerivedReferrer_LawTocList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_LawTocList(LawTocCQ sq) { return xkeepSQue("lawHistoryId_QueryDerivedReferrer_LawTocList", sq); }
    public Map<String, Object> xdfgetLawHistoryId_QueryDerivedReferrer_LawTocListParameter() { return xgetSQuePmMap("lawHistoryId_QueryDerivedReferrer_LawTocList"); }
    public String keepLawHistoryId_QueryDerivedReferrer_LawTocListParameter(Object pm) { return xkeepSQuePm("lawHistoryId_QueryDerivedReferrer_LawTocList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LawHistoryId_Asc() { regOBA("LAW_HISTORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LawHistoryId_Desc() { regOBD("LAW_HISTORY_ID"); return this; }

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
    public BsLawHistoryCQ addOrderBy_LawId_Asc() { regOBA("LAW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LawId_Desc() { regOBD("LAW_ID"); return this; }

    protected ConditionValue _amendLawId;
    public ConditionValue xdfgetAmendLawId()
    { if (_amendLawId == null) { _amendLawId = nCV(); }
      return _amendLawId; }
    protected ConditionValue xgetCValueAmendLawId() { return xdfgetAmendLawId(); }

    /** 
     * Add order-by as ascend. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_AmendLawId_Asc() { regOBA("AMEND_LAW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_AmendLawId_Desc() { regOBD("AMEND_LAW_ID"); return this; }

    protected ConditionValue _lawAmendVersion;
    public ConditionValue xdfgetLawAmendVersion()
    { if (_lawAmendVersion == null) { _lawAmendVersion = nCV(); }
      return _lawAmendVersion; }
    protected ConditionValue xgetCValueLawAmendVersion() { return xdfgetLawAmendVersion(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LawAmendVersion_Asc() { regOBA("LAW_AMEND_VERSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LawAmendVersion_Desc() { regOBD("LAW_AMEND_VERSION"); return this; }

    protected ConditionValue _latestVersionFlg;
    public ConditionValue xdfgetLatestVersionFlg()
    { if (_latestVersionFlg == null) { _latestVersionFlg = nCV(); }
      return _latestVersionFlg; }
    protected ConditionValue xgetCValueLatestVersionFlg() { return xdfgetLatestVersionFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LatestVersionFlg_Asc() { regOBA("LATEST_VERSION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_LatestVersionFlg_Desc() { regOBD("LATEST_VERSION_FLG"); return this; }

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
    public BsLawHistoryCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsLawHistoryCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsLawHistoryCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsLawHistoryCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsLawHistoryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawHistoryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLawHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LawHistoryCQ bq = (LawHistoryCQ)bqs;
        LawHistoryCQ uq = (LawHistoryCQ)uqs;
        if (bq.hasConditionQueryLawByAmendLawId()) {
            uq.queryLawByAmendLawId().reflectRelationOnUnionQuery(bq.queryLawByAmendLawId(), uq.queryLawByAmendLawId());
        }
        if (bq.hasConditionQueryLawByLawId()) {
            uq.queryLawByLawId().reflectRelationOnUnionQuery(bq.queryLawByLawId(), uq.queryLawByLawId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令)LAW by my AMEND_LAW_ID, named 'lawByAmendLawId'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawCQ queryLawByAmendLawId() {
        return xdfgetConditionQueryLawByAmendLawId();
    }
    public LawCQ xdfgetConditionQueryLawByAmendLawId() {
        String prop = "lawByAmendLawId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawByAmendLawId()); xsetupOuterJoinLawByAmendLawId(); }
        return xgetQueRlMap(prop);
    }
    protected LawCQ xcreateQueryLawByAmendLawId() {
        String nrp = xresolveNRP("LAW_HISTORY", "lawByAmendLawId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawByAmendLawId", nrp);
    }
    protected void xsetupOuterJoinLawByAmendLawId() { xregOutJo("lawByAmendLawId"); }
    public boolean hasConditionQueryLawByAmendLawId() { return xhasQueRlMap("lawByAmendLawId"); }

    /**
     * Get the condition-query for relation table. <br>
     * (法令)LAW by my LAW_ID, named 'lawByLawId'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawCQ queryLawByLawId() {
        return xdfgetConditionQueryLawByLawId();
    }
    public LawCQ xdfgetConditionQueryLawByLawId() {
        String prop = "lawByLawId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawByLawId()); xsetupOuterJoinLawByLawId(); }
        return xgetQueRlMap(prop);
    }
    protected LawCQ xcreateQueryLawByLawId() {
        String nrp = xresolveNRP("LAW_HISTORY", "lawByLawId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawByLawId", nrp);
    }
    protected void xsetupOuterJoinLawByLawId() { xregOutJo("lawByLawId"); }
    public boolean hasConditionQueryLawByLawId() { return xhasQueRlMap("lawByLawId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LawHistoryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawHistoryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawHistoryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawHistoryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawHistoryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawHistoryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawHistoryCQ> _myselfExistsMap;
    public Map<String, LawHistoryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawHistoryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawHistoryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawHistoryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawHistoryCB.class.getName(); }
    protected String xCQ() { return LawHistoryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
