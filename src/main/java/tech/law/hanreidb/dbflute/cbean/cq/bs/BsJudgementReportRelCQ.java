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
 * The base condition-query of JUDGEMENT_REPORT_REL.
 * @author DBFlute(AutoGenerator)
 */
public class BsJudgementReportRelCQ extends AbstractBsJudgementReportRelCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected JudgementReportRelCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsJudgementReportRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from JUDGEMENT_REPORT_REL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public JudgementReportRelCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected JudgementReportRelCIQ xcreateCIQ() {
        JudgementReportRelCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected JudgementReportRelCIQ xnewCIQ() {
        return new JudgementReportRelCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join JUDGEMENT_REPORT_REL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public JudgementReportRelCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        JudgementReportRelCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _judgementReportsRelId;
    public ConditionValue xdfgetJudgementReportsRelId()
    { if (_judgementReportsRelId == null) { _judgementReportsRelId = nCV(); }
      return _judgementReportsRelId; }
    protected ConditionValue xgetCValueJudgementReportsRelId() { return xdfgetJudgementReportsRelId(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_JudgementReportsRelId_Asc() { regOBA("JUDGEMENT_REPORTS_REL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_JudgementReportsRelId_Desc() { regOBD("JUDGEMENT_REPORTS_REL_ID"); return this; }

    protected ConditionValue _judgementId;
    public ConditionValue xdfgetJudgementId()
    { if (_judgementId == null) { _judgementId = nCV(); }
      return _judgementId; }
    protected ConditionValue xgetCValueJudgementId() { return xdfgetJudgementId(); }

    /** 
     * Add order-by as ascend. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_JudgementId_Asc() { regOBA("JUDGEMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_JudgementId_Desc() { regOBD("JUDGEMENT_ID"); return this; }

    protected ConditionValue _reportId;
    public ConditionValue xdfgetReportId()
    { if (_reportId == null) { _reportId = nCV(); }
      return _reportId; }
    protected ConditionValue xgetCValueReportId() { return xdfgetReportId(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportId_Asc() { regOBA("REPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportId_Desc() { regOBD("REPORT_ID"); return this; }

    protected ConditionValue _reportKan;
    public ConditionValue xdfgetReportKan()
    { if (_reportKan == null) { _reportKan = nCV(); }
      return _reportKan; }
    protected ConditionValue xgetCValueReportKan() { return xdfgetReportKan(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportKan_Asc() { regOBA("REPORT_KAN"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportKan_Desc() { regOBD("REPORT_KAN"); return this; }

    protected ConditionValue _reportGo;
    public ConditionValue xdfgetReportGo()
    { if (_reportGo == null) { _reportGo = nCV(); }
      return _reportGo; }
    protected ConditionValue xgetCValueReportGo() { return xdfgetReportGo(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportGo_Asc() { regOBA("REPORT_GO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportGo_Desc() { regOBD("REPORT_GO"); return this; }

    protected ConditionValue _reportKo;
    public ConditionValue xdfgetReportKo()
    { if (_reportKo == null) { _reportKo = nCV(); }
      return _reportKo; }
    protected ConditionValue xgetCValueReportKo() { return xdfgetReportKo(); }

    /** 
     * Add order-by as ascend. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportKo_Asc() { regOBA("REPORT_KO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_ReportKo_Desc() { regOBD("REPORT_KO"); return this; }

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
    public BsJudgementReportRelCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsJudgementReportRelCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsJudgementReportRelCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsJudgementReportRelCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsJudgementReportRelCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @return this. (NotNull)
     */
    public BsJudgementReportRelCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsJudgementReportRelCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsJudgementReportRelCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        JudgementReportRelCQ bq = (JudgementReportRelCQ)bqs;
        JudgementReportRelCQ uq = (JudgementReportRelCQ)uqs;
        if (bq.hasConditionQueryJudgement()) {
            uq.queryJudgement().reflectRelationOnUnionQuery(bq.queryJudgement(), uq.queryJudgement());
        }
        if (bq.hasConditionQueryReport()) {
            uq.queryReport().reflectRelationOnUnionQuery(bq.queryReport(), uq.queryReport());
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
        String nrp = xresolveNRP("JUDGEMENT_REPORT_REL", "judgement"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new JudgementCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "judgement", nrp);
    }
    protected void xsetupOuterJoinJudgement() { xregOutJo("judgement"); }
    public boolean hasConditionQueryJudgement() { return xhasQueRlMap("judgement"); }

    /**
     * Get the condition-query for relation table. <br>
     * (判例集)REPORT by my REPORT_ID, named 'report'.
     * @return The instance of condition-query. (NotNull)
     */
    public ReportCQ queryReport() {
        return xdfgetConditionQueryReport();
    }
    public ReportCQ xdfgetConditionQueryReport() {
        String prop = "report";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryReport()); xsetupOuterJoinReport(); }
        return xgetQueRlMap(prop);
    }
    protected ReportCQ xcreateQueryReport() {
        String nrp = xresolveNRP("JUDGEMENT_REPORT_REL", "report"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new ReportCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "report", nrp);
    }
    protected void xsetupOuterJoinReport() { xregOutJo("report"); }
    public boolean hasConditionQueryReport() { return xhasQueRlMap("report"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, JudgementReportRelCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(JudgementReportRelCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, JudgementReportRelCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(JudgementReportRelCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, JudgementReportRelCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(JudgementReportRelCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, JudgementReportRelCQ> _myselfExistsMap;
    public Map<String, JudgementReportRelCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(JudgementReportRelCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, JudgementReportRelCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(JudgementReportRelCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return JudgementReportRelCB.class.getName(); }
    protected String xCQ() { return JudgementReportRelCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
