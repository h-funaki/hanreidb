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
package tech.law.hanreidb.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import tech.law.hanreidb.dbflute.allcommon.DBFluteConfig;
import tech.law.hanreidb.dbflute.allcommon.DBMetaInstanceHandler;
import tech.law.hanreidb.dbflute.allcommon.ImplementedInvokerAssistant;
import tech.law.hanreidb.dbflute.allcommon.ImplementedSqlClauseCreator;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;
import tech.law.hanreidb.dbflute.cbean.nss.*;

/**
 * The base condition-bean of JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsJudgementCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected JudgementCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsJudgementCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "JUDGEMENT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param judgementId (判決ID): PK, ID, NotNull, BIGINT UNSIGNED(20). (NotNull)
     * @return this. (NotNull)
     */
    public JudgementCB acceptPK(Long judgementId) {
        assertObjectNotNull("judgementId", judgementId);
        BsJudgementCB cb = this;
        cb.query().setJudgementId_Equal(judgementId);
        return (JudgementCB)this;
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param judgementPublicCode (判決公開コード): UQ, NotNull, VARCHAR(12). (NotNull)
     * @return this. (NotNull)
     */
    public JudgementCB acceptUniqueOf(String judgementPublicCode) {
        assertObjectNotNull("judgementPublicCode", judgementPublicCode);
        BsJudgementCB cb = this;
        cb.query().setJudgementPublicCode_Equal(judgementPublicCode);
        return (JudgementCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_JudgementId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_JudgementId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public JudgementCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return doGetConditionQuery();
    }

    public JudgementCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected JudgementCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected JudgementCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected JudgementCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        JudgementCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected JudgementCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new JudgementCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<JudgementCB> unionCBLambda) {
        final JudgementCB cb = new JudgementCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final JudgementCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<JudgementCB> unionCBLambda) {
        final JudgementCB cb = new JudgementCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final JudgementCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_ClsBench()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getClsBench()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_ClsBench() {
        assertSetupSelectPurpose("clsBench");
        if (hasSpecifiedLocalColumn()) {
            specify().columnBenchCode();
        }
        doSetupSelect(() -> query().queryClsBench());
    }

    protected CaseMarkNss _nssCaseMark;
    public CaseMarkNss xdfgetNssCaseMark() {
        if (_nssCaseMark == null) { _nssCaseMark = new CaseMarkNss(null); }
        return _nssCaseMark;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_CaseMark()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getCaseMark()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public CaseMarkNss setupSelect_CaseMark() {
        assertSetupSelectPurpose("caseMark");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCaseMarkId();
        }
        doSetupSelect(() -> query().queryCaseMark());
        if (_nssCaseMark == null || !_nssCaseMark.hasConditionQuery())
        { _nssCaseMark = new CaseMarkNss(query().queryCaseMark()); }
        return _nssCaseMark;
    }

    /**
     * Set up relation columns to select clause. <br>
     * ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_ClsEra()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getClsEra()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_ClsEra() {
        assertSetupSelectPurpose("clsEra");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCaseNumberEraCode();
        }
        doSetupSelect(() -> query().queryClsEra());
    }

    protected CourtNss _nssCourt;
    public CourtNss xdfgetNssCourt() {
        if (_nssCourt == null) { _nssCourt = new CourtNss(null); }
        return _nssCourt;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (裁判所)COURT by my COURT_ID, named 'court'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_Court()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getCourt()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public CourtNss setupSelect_Court() {
        assertSetupSelectPurpose("court");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCourtId();
        }
        doSetupSelect(() -> query().queryCourt());
        if (_nssCourt == null || !_nssCourt.hasConditionQuery())
        { _nssCourt = new CourtNss(query().queryCourt()); }
        return _nssCourt;
    }

    /**
     * Set up relation columns to select clause. <br>
     * ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_ClsJudgementResult()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getClsJudgementResult()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_ClsJudgementResult() {
        assertSetupSelectPurpose("clsJudgementResult");
        if (hasSpecifiedLocalColumn()) {
            specify().columnJudgementResultCode();
        }
        doSetupSelect(() -> query().queryClsJudgementResult());
    }

    /**
     * Set up relation columns to select clause. <br>
     * ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_ClsJudgementType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getClsJudgementType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_ClsJudgementType() {
        assertSetupSelectPurpose("clsJudgementType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnJudgementTypeCode();
        }
        doSetupSelect(() -> query().queryClsJudgementType());
    }

    protected JudgementNss _nssJudgementSelf;
    public JudgementNss xdfgetNssJudgementSelf() {
        if (_nssJudgementSelf == null) { _nssJudgementSelf = new JudgementNss(null); }
        return _nssJudgementSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_JudgementSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">judgement</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">judgement</span>.<span style="color: #CC4747">getJudgementSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public JudgementNss setupSelect_JudgementSelf() {
        assertSetupSelectPurpose("judgementSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOriginalJudgementId();
        }
        doSetupSelect(() -> query().queryJudgementSelf());
        if (_nssJudgementSelf == null || !_nssJudgementSelf.hasConditionQuery())
        { _nssJudgementSelf = new JudgementNss(query().queryJudgementSelf()); }
        return _nssJudgementSelf;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<JudgementCQ> {
        protected ClsBenchCB.HpSpecification _clsBench;
        protected CaseMarkCB.HpSpecification _caseMark;
        protected ClsEraCB.HpSpecification _clsEra;
        protected CourtCB.HpSpecification _court;
        protected ClsJudgementResultCB.HpSpecification _clsJudgementResult;
        protected ClsJudgementTypeCB.HpSpecification _clsJudgementType;
        protected JudgementCB.HpSpecification _judgementSelf;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<JudgementCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * (判決ID)JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJudgementId() { return doColumn("JUDGEMENT_ID"); }
        /**
         * (判決公開コード)JUDGEMENT_PUBLIC_CODE: {UQ, NotNull, VARCHAR(12)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJudgementPublicCode() { return doColumn("JUDGEMENT_PUBLIC_CODE"); }
        /**
         * (事件名)CASE_NAME: {TEXT(65535)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseName() { return doColumn("CASE_NAME"); }
        /**
         * (裁判年月日)JUDGEMENT_DATE: {DATE(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJudgementDate() { return doColumn("JUDGEMENT_DATE"); }
        /**
         * (原審判決ID)ORIGINAL_JUDGEMENT_ID: {IX, BIGINT UNSIGNED(20), FK to JUDGEMENT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOriginalJudgementId() { return doColumn("ORIGINAL_JUDGEMENT_ID"); }
        /**
         * (元号コード)CASE_NUMBER_ERA_CODE: {IX, NotNull, VARCHAR(10), FK to CLS_ERA, classification=Era}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseNumberEraCode() { return doColumn("CASE_NUMBER_ERA_CODE"); }
        /**
         * (事件番号年)CASE_NUMBER_YEAR: {NotNull, INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseNumberYear() { return doColumn("CASE_NUMBER_YEAR"); }
        /**
         * (事件符号ID)CASE_MARK_ID: {IX, NotNull, INT UNSIGNED(10), FK to CASE_MARK}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseMarkId() { return doColumn("CASE_MARK_ID"); }
        /**
         * (事件番号連番)CASE_NUMBER_SERIAL_NUMBER: {NotNull, INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseNumberSerialNumber() { return doColumn("CASE_NUMBER_SERIAL_NUMBER"); }
        /**
         * (裁判所ID)COURT_ID: {IX, NotNull, INT UNSIGNED(10), FK to COURT}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCourtId() { return doColumn("COURT_ID"); }
        /**
         * (法廷種別コード)BENCH_CODE: {IX, VARCHAR(10), FK to CLS_BENCH, classification=Bench}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBenchCode() { return doColumn("BENCH_CODE"); }
        /**
         * (判決結果コード)JUDGEMENT_RESULT_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_RESULT, classification=JudgementResult}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJudgementResultCode() { return doColumn("JUDGEMENT_RESULT_CODE"); }
        /**
         * (判決種別コード)JUDGEMENT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_JUDGEMENT_TYPE, classification=JudgementType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJudgementTypeCode() { return doColumn("JUDGEMENT_TYPE_CODE"); }
        /**
         * (判決文)SENTENCE: {TEXT(65535)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSentence() { return doColumn("SENTENCE"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnJudgementId(); // PK
            if (qyCall().qy().hasConditionQueryClsBench()
                    || qyCall().qy().xgetReferrerQuery() instanceof ClsBenchCQ) {
                columnBenchCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryCaseMark()
                    || qyCall().qy().xgetReferrerQuery() instanceof CaseMarkCQ) {
                columnCaseMarkId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryClsEra()
                    || qyCall().qy().xgetReferrerQuery() instanceof ClsEraCQ) {
                columnCaseNumberEraCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryCourt()
                    || qyCall().qy().xgetReferrerQuery() instanceof CourtCQ) {
                columnCourtId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryClsJudgementResult()
                    || qyCall().qy().xgetReferrerQuery() instanceof ClsJudgementResultCQ) {
                columnJudgementResultCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryClsJudgementType()
                    || qyCall().qy().xgetReferrerQuery() instanceof ClsJudgementTypeCQ) {
                columnJudgementTypeCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryJudgementSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof JudgementCQ) {
                columnOriginalJudgementId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "JUDGEMENT"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ClsBenchCB.HpSpecification specifyClsBench() {
            assertRelation("clsBench");
            if (_clsBench == null) {
                _clsBench = new ClsBenchCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryClsBench()
                                    , () -> _qyCall.qy().queryClsBench())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _clsBench.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryClsBench()
                      , () -> xsyncQyCall().qy().queryClsBench()));
                }
            }
            return _clsBench;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public CaseMarkCB.HpSpecification specifyCaseMark() {
            assertRelation("caseMark");
            if (_caseMark == null) {
                _caseMark = new CaseMarkCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryCaseMark()
                                    , () -> _qyCall.qy().queryCaseMark())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _caseMark.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCaseMark()
                      , () -> xsyncQyCall().qy().queryCaseMark()));
                }
            }
            return _caseMark;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ClsEraCB.HpSpecification specifyClsEra() {
            assertRelation("clsEra");
            if (_clsEra == null) {
                _clsEra = new ClsEraCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryClsEra()
                                    , () -> _qyCall.qy().queryClsEra())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _clsEra.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryClsEra()
                      , () -> xsyncQyCall().qy().queryClsEra()));
                }
            }
            return _clsEra;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (裁判所)COURT by my COURT_ID, named 'court'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public CourtCB.HpSpecification specifyCourt() {
            assertRelation("court");
            if (_court == null) {
                _court = new CourtCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryCourt()
                                    , () -> _qyCall.qy().queryCourt())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _court.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryCourt()
                      , () -> xsyncQyCall().qy().queryCourt()));
                }
            }
            return _court;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ClsJudgementResultCB.HpSpecification specifyClsJudgementResult() {
            assertRelation("clsJudgementResult");
            if (_clsJudgementResult == null) {
                _clsJudgementResult = new ClsJudgementResultCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryClsJudgementResult()
                                    , () -> _qyCall.qy().queryClsJudgementResult())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _clsJudgementResult.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryClsJudgementResult()
                      , () -> xsyncQyCall().qy().queryClsJudgementResult()));
                }
            }
            return _clsJudgementResult;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public ClsJudgementTypeCB.HpSpecification specifyClsJudgementType() {
            assertRelation("clsJudgementType");
            if (_clsJudgementType == null) {
                _clsJudgementType = new ClsJudgementTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryClsJudgementType()
                                    , () -> _qyCall.qy().queryClsJudgementType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _clsJudgementType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryClsJudgementType()
                      , () -> xsyncQyCall().qy().queryClsJudgementType()));
                }
            }
            return _clsJudgementType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public JudgementCB.HpSpecification specifyJudgementSelf() {
            assertRelation("judgementSelf");
            if (_judgementSelf == null) {
                _judgementSelf = new JudgementCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryJudgementSelf()
                                    , () -> _qyCall.qy().queryJudgementSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _judgementSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryJudgementSelf()
                      , () -> xsyncQyCall().qy().queryJudgementSelf()));
                }
            }
            return _judgementSelf;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from JUDGEMENT where ...) as FOO_MAX} <br>
         * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     judgementCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     judgementCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, Judgement.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<JudgementCB, JudgementCQ> derivedJudgementSelf() {
            assertDerived("judgementSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<JudgementCB> sq, JudgementCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveJudgementSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from JUDGEMENT_REPORT_REL where ...) as FOO_MAX} <br>
         * (判決判例集リレーション)JUDGEMENT_REPORT_REL by JUDGEMENT_ID, named 'judgementReportRelList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     relCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     relCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, JudgementReportRel.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<JudgementReportRelCB, JudgementCQ> derivedJudgementReportRel() {
            assertDerived("judgementReportRelList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<JudgementReportRelCB> sq, JudgementCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveJudgementReportRelList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from JUDGEMENT_SOURCE_REL where ...) as FOO_MAX} <br>
         * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     relCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     relCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, JudgementSourceRel.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<JudgementSourceRelCB, JudgementCQ> derivedJudgementSourceRel() {
            assertDerived("judgementSourceRelList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<JudgementSourceRelCB> sq, JudgementCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveJudgementSourceRelList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from JUDGEMENT_USER_FAVORITE_REL where ...) as FOO_MAX} <br>
         * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     relCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     relCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, JudgementUserFavoriteRel.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<JudgementUserFavoriteRelCB, JudgementCQ> derivedJudgementUserFavoriteRel() {
            assertDerived("judgementUserFavoriteRelList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<JudgementUserFavoriteRelCB> sq, JudgementCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveJudgementUserFavoriteRelList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<JudgementCB, JudgementCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<JudgementCB> sq, JudgementCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public JudgementCB dreamCruiseCB() {
        JudgementCB cb = new JudgementCB();
        cb.xsetupForDreamCruise((JudgementCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<JudgementCB> columnQuery(final SpecifyQuery<JudgementCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected JudgementCB xcreateColumnQueryCB() {
        JudgementCB cb = new JudgementCB();
        cb.xsetupForColumnQuery((JudgementCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<JudgementCB> orCBLambda) {
        xorSQ((JudgementCB)this, orCBLambda);
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<JudgementCB> andCBLambda) {
        xorSQAP((JudgementCB)this, andCBLambda);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    public void customizeCursorSelect(SVOptionCall<CursorSelectOption> opLambda) {
        doAcceptCursorSelectOption(opLambda);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final JudgementCB cb;
        if (mainCB != null) {
            cb = (JudgementCB)mainCB;
        } else {
            cb = new JudgementCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return JudgementCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return JudgementCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
