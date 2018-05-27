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
 * The base condition-query of LAW_CONTENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsLawContentCQ extends AbstractBsLawContentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LawContentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLawContentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LAW_CONTENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LawContentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LawContentCIQ xcreateCIQ() {
        LawContentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LawContentCIQ xnewCIQ() {
        return new LawContentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LAW_CONTENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LawContentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LawContentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lawContentId;
    public ConditionValue xdfgetLawContentId()
    { if (_lawContentId == null) { _lawContentId = nCV(); }
      return _lawContentId; }
    protected ConditionValue xgetCValueLawContentId() { return xdfgetLawContentId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_LawContentId_Asc() { regOBA("LAW_CONTENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_LawContentId_Desc() { regOBD("LAW_CONTENT_ID"); return this; }

    protected ConditionValue _lawHistoryId;
    public ConditionValue xdfgetLawHistoryId()
    { if (_lawHistoryId == null) { _lawHistoryId = nCV(); }
      return _lawHistoryId; }
    protected ConditionValue xgetCValueLawHistoryId() { return xdfgetLawHistoryId(); }

    /** 
     * Add order-by as ascend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_LawHistoryId_Asc() { regOBA("LAW_HISTORY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {UQ, NotNull, INT(10), FK to LAW_HISTORY}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_LawHistoryId_Desc() { regOBD("LAW_HISTORY_ID"); return this; }

    protected ConditionValue _lawContentRawXml;
    public ConditionValue xdfgetLawContentRawXml()
    { if (_lawContentRawXml == null) { _lawContentRawXml = nCV(); }
      return _lawContentRawXml; }
    protected ConditionValue xgetCValueLawContentRawXml() { return xdfgetLawContentRawXml(); }

    protected ConditionValue _lawContentSearchText;
    public ConditionValue xdfgetLawContentSearchText()
    { if (_lawContentSearchText == null) { _lawContentSearchText = nCV(); }
      return _lawContentSearchText; }
    protected ConditionValue xgetCValueLawContentSearchText() { return xdfgetLawContentSearchText(); }

    protected ConditionValue _lawContentViewXml;
    public ConditionValue xdfgetLawContentViewXml()
    { if (_lawContentViewXml == null) { _lawContentViewXml = nCV(); }
      return _lawContentViewXml; }
    protected ConditionValue xgetCValueLawContentViewXml() { return xdfgetLawContentViewXml(); }

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
    public BsLawContentCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsLawContentCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsLawContentCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsLawContentCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsLawContentCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsLawContentCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsLawContentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLawContentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LawContentCQ bq = (LawContentCQ)bqs;
        LawContentCQ uq = (LawContentCQ)uqs;
        if (bq.hasConditionQueryLawHistory()) {
            uq.queryLawHistory().reflectRelationOnUnionQuery(bq.queryLawHistory(), uq.queryLawHistory());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (法令履歴)LAW_HISTORY by my LAW_HISTORY_ID, named 'lawHistory'.
     * @return The instance of condition-query. (NotNull)
     */
    public LawHistoryCQ queryLawHistory() {
        return xdfgetConditionQueryLawHistory();
    }
    public LawHistoryCQ xdfgetConditionQueryLawHistory() {
        String prop = "lawHistory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLawHistory()); xsetupOuterJoinLawHistory(); }
        return xgetQueRlMap(prop);
    }
    protected LawHistoryCQ xcreateQueryLawHistory() {
        String nrp = xresolveNRP("LAW_CONTENT", "lawHistory"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LawHistoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "lawHistory", nrp);
    }
    protected void xsetupOuterJoinLawHistory() { xregOutJo("lawHistory"); }
    public boolean hasConditionQueryLawHistory() { return xhasQueRlMap("lawHistory"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LawContentCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LawContentCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LawContentCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LawContentCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LawContentCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LawContentCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LawContentCQ> _myselfExistsMap;
    public Map<String, LawContentCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LawContentCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LawContentCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LawContentCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LawContentCB.class.getName(); }
    protected String xCQ() { return LawContentCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
