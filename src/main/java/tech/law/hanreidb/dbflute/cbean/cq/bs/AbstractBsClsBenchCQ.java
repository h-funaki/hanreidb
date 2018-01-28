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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import tech.law.hanreidb.dbflute.allcommon.*;
import tech.law.hanreidb.dbflute.cbean.*;
import tech.law.hanreidb.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of CLS_BENCH.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsBenchCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsBenchCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "CLS_BENCH";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     * @param benchCode The value of benchCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_Equal(String benchCode) {
        doSetBenchCode_Equal(fRES(benchCode));
    }

    /**
     * Equal(=). As Bench. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBenchCode_Equal_AsBench(CDef.Bench cdef) {
        doSetBenchCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 大法廷 (FULL). And OnlyOnceRegistered. <br>
     * 大法廷: 大法廷
     */
    public void setBenchCode_Equal_大法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.大法廷);
    }

    /**
     * Equal(=). As 第一小法廷 (FIRST). And OnlyOnceRegistered. <br>
     * 第一小法廷: 第一小法廷
     */
    public void setBenchCode_Equal_第一小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第一小法廷);
    }

    /**
     * Equal(=). As 第二小法廷 (SECOND). And OnlyOnceRegistered. <br>
     * 第二小法廷: 第二小法廷
     */
    public void setBenchCode_Equal_第二小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第二小法廷);
    }

    /**
     * Equal(=). As 第三小法廷 (THIRD). And OnlyOnceRegistered. <br>
     * 第三小法廷: 第三小法廷
     */
    public void setBenchCode_Equal_第三小法廷() {
        setBenchCode_Equal_AsBench(CDef.Bench.第三小法廷);
    }

    protected void doSetBenchCode_Equal(String benchCode) {
        regBenchCode(CK_EQ, benchCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     * @param benchCode The value of benchCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotEqual(String benchCode) {
        doSetBenchCode_NotEqual(fRES(benchCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Bench. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBenchCode_NotEqual_AsBench(CDef.Bench cdef) {
        doSetBenchCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 大法廷 (FULL). And OnlyOnceRegistered. <br>
     * 大法廷: 大法廷
     */
    public void setBenchCode_NotEqual_大法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.大法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第一小法廷 (FIRST). And OnlyOnceRegistered. <br>
     * 第一小法廷: 第一小法廷
     */
    public void setBenchCode_NotEqual_第一小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第一小法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第二小法廷 (SECOND). And OnlyOnceRegistered. <br>
     * 第二小法廷: 第二小法廷
     */
    public void setBenchCode_NotEqual_第二小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第二小法廷);
    }

    /**
     * NotEqual(&lt;&gt;). As 第三小法廷 (THIRD). And OnlyOnceRegistered. <br>
     * 第三小法廷: 第三小法廷
     */
    public void setBenchCode_NotEqual_第三小法廷() {
        setBenchCode_NotEqual_AsBench(CDef.Bench.第三小法廷);
    }

    protected void doSetBenchCode_NotEqual(String benchCode) {
        regBenchCode(CK_NES, benchCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     * @param benchCodeList The collection of benchCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_InScope(Collection<String> benchCodeList) {
        doSetBenchCode_InScope(benchCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Bench. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_InScope_AsBench(Collection<CDef.Bench> cdefList) {
        doSetBenchCode_InScope(cTStrL(cdefList));
    }

    protected void doSetBenchCode_InScope(Collection<String> benchCodeList) {
        regINS(CK_INS, cTL(benchCodeList), xgetCValueBenchCode(), "BENCH_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     * @param benchCodeList The collection of benchCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotInScope(Collection<String> benchCodeList) {
        doSetBenchCode_NotInScope(benchCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Bench. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchCode_NotInScope_AsBench(Collection<CDef.Bench> cdefList) {
        doSetBenchCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBenchCode_NotInScope(Collection<String> benchCodeList) {
        regINS(CK_NINS, cTL(benchCodeList), xgetCValueBenchCode(), "BENCH_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select BENCH_CODE from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by BENCH_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementList for 'exists'. (NotNull)
     */
    public void existsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBenchCode_ExistsReferrer_JudgementList(cb.query());
        registerExistsReferrer(cb.query(), "BENCH_CODE", "BENCH_CODE", pp, "judgementList");
    }
    public abstract String keepBenchCode_ExistsReferrer_JudgementList(JudgementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select BENCH_CODE from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by BENCH_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BenchCode_NotExistsReferrer_JudgementList for 'not exists'. (NotNull)
     */
    public void notExistsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepBenchCode_NotExistsReferrer_JudgementList(cb.query());
        registerNotExistsReferrer(cb.query(), "BENCH_CODE", "BENCH_CODE", pp, "judgementList");
    }
    public abstract String keepBenchCode_NotExistsReferrer_JudgementList(JudgementCQ sq);

    public void xsderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepBenchCode_SpecifyDerivedReferrer_JudgementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "BENCH_CODE", "BENCH_CODE", pp, "judgementList", al, op);
    }
    public abstract String keepBenchCode_SpecifyDerivedReferrer_JudgementList(JudgementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by BENCH_CODE, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgement()</span>.<span style="color: #CC4747">max</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     judgementCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementCB> derivedJudgement() {
        return xcreateQDRFunctionJudgementList();
    }
    protected HpQDRFunction<JudgementCB> xcreateQDRFunctionJudgementList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepBenchCode_QueryDerivedReferrer_JudgementList(cb.query()); String prpp = keepBenchCode_QueryDerivedReferrer_JudgementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "BENCH_CODE", "BENCH_CODE", sqpp, "judgementList", rd, vl, prpp, op);
    }
    public abstract String keepBenchCode_QueryDerivedReferrer_JudgementList(JudgementCQ sq);
    public abstract String keepBenchCode_QueryDerivedReferrer_JudgementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     */
    public void setBenchCode_IsNull() { regBenchCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法廷種別コード)BENCH_CODE: {PK, NotNull, VARCHAR(10), classification=Bench}
     */
    public void setBenchCode_IsNotNull() { regBenchCode(CK_ISNN, DOBJ); }

    protected void regBenchCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBenchCode(), "BENCH_CODE"); }
    protected abstract ConditionValue xgetCValueBenchCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param benchName The value of benchName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchName_Equal(String benchName) {
        doSetBenchName_Equal(fRES(benchName));
    }

    protected void doSetBenchName_Equal(String benchName) {
        regBenchName(CK_EQ, benchName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setBenchName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param benchName The value of benchName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBenchName_LikeSearch(String benchName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBenchName_LikeSearch(benchName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setBenchName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param benchName The value of benchName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBenchName_LikeSearch(String benchName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(benchName), xgetCValueBenchName(), "BENCH_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param benchName The value of benchName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBenchName_NotLikeSearch(String benchName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBenchName_NotLikeSearch(benchName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別名)BENCH_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param benchName The value of benchName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBenchName_NotLikeSearch(String benchName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(benchName), xgetCValueBenchName(), "BENCH_NAME", likeSearchOption);
    }

    protected void regBenchName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBenchName(), "BENCH_NAME"); }
    protected abstract ConditionValue xgetCValueBenchName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAlias The value of benchAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchAlias_Equal(String benchAlias) {
        doSetBenchAlias_Equal(fRES(benchAlias));
    }

    protected void doSetBenchAlias_Equal(String benchAlias) {
        regBenchAlias(CK_EQ, benchAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAlias The value of benchAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchAlias_NotEqual(String benchAlias) {
        doSetBenchAlias_NotEqual(fRES(benchAlias));
    }

    protected void doSetBenchAlias_NotEqual(String benchAlias) {
        regBenchAlias(CK_NES, benchAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAliasList The collection of benchAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchAlias_InScope(Collection<String> benchAliasList) {
        doSetBenchAlias_InScope(benchAliasList);
    }

    protected void doSetBenchAlias_InScope(Collection<String> benchAliasList) {
        regINS(CK_INS, cTL(benchAliasList), xgetCValueBenchAlias(), "BENCH_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAliasList The collection of benchAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBenchAlias_NotInScope(Collection<String> benchAliasList) {
        doSetBenchAlias_NotInScope(benchAliasList);
    }

    protected void doSetBenchAlias_NotInScope(Collection<String> benchAliasList) {
        regINS(CK_NINS, cTL(benchAliasList), xgetCValueBenchAlias(), "BENCH_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setBenchAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param benchAlias The value of benchAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBenchAlias_LikeSearch(String benchAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBenchAlias_LikeSearch(benchAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setBenchAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param benchAlias The value of benchAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBenchAlias_LikeSearch(String benchAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(benchAlias), xgetCValueBenchAlias(), "BENCH_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAlias The value of benchAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBenchAlias_NotLikeSearch(String benchAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBenchAlias_NotLikeSearch(benchAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法廷種別別名)BENCH_ALIAS: {UQ, NotNull, VARCHAR(10)}
     * @param benchAlias The value of benchAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBenchAlias_NotLikeSearch(String benchAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(benchAlias), xgetCValueBenchAlias(), "BENCH_ALIAS", likeSearchOption);
    }

    protected void regBenchAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBenchAlias(), "BENCH_ALIAS"); }
    protected abstract ConditionValue xgetCValueBenchAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (登録ユーザー)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "REGISTER_USER"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (更新ユーザー)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "UPDATE_USER"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (バージョン番号)VERSION_NO: {NotNull, BIGINT UNSIGNED(20), default=[0]}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsBenchCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsBenchCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsBenchCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsBenchCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsBenchCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsBenchCB&gt;() {
     *     public void query(ClsBenchCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsBenchCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsBenchCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsBenchCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsBenchCQ sq);

    protected ClsBenchCB xcreateScalarConditionCB() {
        ClsBenchCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsBenchCB xcreateScalarConditionPartitionByCB() {
        ClsBenchCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsBenchCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsBenchCB cb = new ClsBenchCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BENCH_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsBenchCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsBenchCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsBenchCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsBenchCB cb = new ClsBenchCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BENCH_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsBenchCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsBenchCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsBenchCB cb = new ClsBenchCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsBenchCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ClsBenchCB newMyCB() {
        return new ClsBenchCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsBenchCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
