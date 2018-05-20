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
 * The abstract condition-query of CLS_SOURCE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsSourceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsSourceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CLS_SOURCE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @param sourceCode The value of sourceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_Equal(String sourceCode) {
        doSetSourceCode_Equal(fRES(sourceCode));
    }

    /**
     * Equal(=). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_Equal_AsSource(CDef.Source cdef) {
        doSetSourceCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_Equal_裁判所裁判例() {
        setSourceCode_Equal_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * Equal(=). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_Equal_Egov() {
        setSourceCode_Equal_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_Equal(String sourceCode) {
        regSourceCode(CK_EQ, sourceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @param sourceCode The value of sourceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotEqual(String sourceCode) {
        doSetSourceCode_NotEqual(fRES(sourceCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_NotEqual_AsSource(CDef.Source cdef) {
        doSetSourceCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_NotEqual_裁判所裁判例() {
        setSourceCode_NotEqual_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * NotEqual(&lt;&gt;). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_NotEqual_Egov() {
        setSourceCode_NotEqual_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_NotEqual(String sourceCode) {
        regSourceCode(CK_NES, sourceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @param sourceCodeList The collection of sourceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope(Collection<String> sourceCodeList) {
        doSetSourceCode_InScope(sourceCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_InScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_InScope(Collection<String> sourceCodeList) {
        regINS(CK_INS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     * @param sourceCodeList The collection of sourceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope(Collection<String> sourceCodeList) {
        doSetSourceCode_NotInScope(sourceCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_NotInScope(Collection<String> sourceCodeList) {
        regINS(CK_NINS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SOURCE_CODE from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementSourceRelList for 'exists'. (NotNull)
     */
    public void existsJudgementSourceRel(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_ExistsReferrer_JudgementSourceRelList(cb.query());
        registerExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "judgementSourceRelList");
    }
    public abstract String keepSourceCode_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SOURCE_CODE from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawSourceRelList for 'exists'. (NotNull)
     */
    public void existsLawSourceRel(SubQuery<LawSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_ExistsReferrer_LawSourceRelList(cb.query());
        registerExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "lawSourceRelList");
    }
    public abstract String keepSourceCode_ExistsReferrer_LawSourceRelList(LawSourceRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SOURCE_CODE from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsSourceLawCategory</span>(categoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     categoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceLawCategoryList for 'exists'. (NotNull)
     */
    public void existsSourceLawCategory(SubQuery<SourceLawCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_ExistsReferrer_SourceLawCategoryList(cb.query());
        registerExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "sourceLawCategoryList");
    }
    public abstract String keepSourceCode_ExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SOURCE_CODE from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceCode_NotExistsReferrer_JudgementSourceRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementSourceRel(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_NotExistsReferrer_JudgementSourceRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "judgementSourceRelList");
    }
    public abstract String keepSourceCode_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SOURCE_CODE from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceCode_NotExistsReferrer_LawSourceRelList for 'not exists'. (NotNull)
     */
    public void notExistsLawSourceRel(SubQuery<LawSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_NotExistsReferrer_LawSourceRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "lawSourceRelList");
    }
    public abstract String keepSourceCode_NotExistsReferrer_LawSourceRelList(LawSourceRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SOURCE_CODE from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSourceLawCategory</span>(categoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     categoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceCode_NotExistsReferrer_SourceLawCategoryList for 'not exists'. (NotNull)
     */
    public void notExistsSourceLawCategory(SubQuery<SourceLawCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceCode_NotExistsReferrer_SourceLawCategoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "sourceLawCategoryList");
    }
    public abstract String keepSourceCode_NotExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    public void xsderiveJudgementSourceRelList(String fn, SubQuery<JudgementSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSourceCode_SpecifyDerivedReferrer_JudgementSourceRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "judgementSourceRelList", al, op);
    }
    public abstract String keepSourceCode_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    public void xsderiveLawSourceRelList(String fn, SubQuery<LawSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSourceCode_SpecifyDerivedReferrer_LawSourceRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "lawSourceRelList", al, op);
    }
    public abstract String keepSourceCode_SpecifyDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq);

    public void xsderiveSourceLawCategoryList(String fn, SubQuery<SourceLawCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSourceCode_SpecifyDerivedReferrer_SourceLawCategoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", pp, "sourceLawCategoryList", al, op);
    }
    public abstract String keepSourceCode_SpecifyDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementSourceRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementSourceRelCB> derivedJudgementSourceRel() {
        return xcreateQDRFunctionJudgementSourceRelList();
    }
    protected HpQDRFunction<JudgementSourceRelCB> xcreateQDRFunctionJudgementSourceRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementSourceRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementSourceRelList(String fn, SubQuery<JudgementSourceRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSourceCode_QueryDerivedReferrer_JudgementSourceRelList(cb.query()); String prpp = keepSourceCode_QueryDerivedReferrer_JudgementSourceRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", sqpp, "judgementSourceRelList", rd, vl, prpp, op);
    }
    public abstract String keepSourceCode_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);
    public abstract String keepSourceCode_QueryDerivedReferrer_JudgementSourceRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_SOURCE_REL where ...)} <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawSourceRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawSourceRelCB> derivedLawSourceRel() {
        return xcreateQDRFunctionLawSourceRelList();
    }
    protected HpQDRFunction<LawSourceRelCB> xcreateQDRFunctionLawSourceRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawSourceRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawSourceRelList(String fn, SubQuery<LawSourceRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSourceCode_QueryDerivedReferrer_LawSourceRelList(cb.query()); String prpp = keepSourceCode_QueryDerivedReferrer_LawSourceRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", sqpp, "lawSourceRelList", rd, vl, prpp, op);
    }
    public abstract String keepSourceCode_QueryDerivedReferrer_LawSourceRelList(LawSourceRelCQ sq);
    public abstract String keepSourceCode_QueryDerivedReferrer_LawSourceRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedSourceLawCategory()</span>.<span style="color: #CC4747">max</span>(categoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     categoryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     categoryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SourceLawCategoryCB> derivedSourceLawCategory() {
        return xcreateQDRFunctionSourceLawCategoryList();
    }
    protected HpQDRFunction<SourceLawCategoryCB> xcreateQDRFunctionSourceLawCategoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveSourceLawCategoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveSourceLawCategoryList(String fn, SubQuery<SourceLawCategoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSourceCode_QueryDerivedReferrer_SourceLawCategoryList(cb.query()); String prpp = keepSourceCode_QueryDerivedReferrer_SourceLawCategoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SOURCE_CODE", "SOURCE_CODE", sqpp, "sourceLawCategoryList", rd, vl, prpp, op);
    }
    public abstract String keepSourceCode_QueryDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);
    public abstract String keepSourceCode_QueryDerivedReferrer_SourceLawCategoryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     */
    public void setSourceCode_IsNull() { regSourceCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {PK, NotNull, VARCHAR(10), classification=Source}
     */
    public void setSourceCode_IsNotNull() { regSourceCode(CK_ISNN, DOBJ); }

    protected void regSourceCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCode(), "SOURCE_CODE"); }
    protected abstract ConditionValue xgetCValueSourceCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param sourceName The value of sourceName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceName_Equal(String sourceName) {
        doSetSourceName_Equal(fRES(sourceName));
    }

    protected void doSetSourceName_Equal(String sourceName) {
        regSourceName(CK_EQ, sourceName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setSourceName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sourceName The value of sourceName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceName_LikeSearch(String sourceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceName_LikeSearch(sourceName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setSourceName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceName The value of sourceName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSourceName_LikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param sourceName The value of sourceName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceName_NotLikeSearch(String sourceName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceName_NotLikeSearch(sourceName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元名)SOURCE_NAME: {UQ, NotNull, VARCHAR(100)}
     * @param sourceName The value of sourceName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSourceName_NotLikeSearch(String sourceName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceName), xgetCValueSourceName(), "SOURCE_NAME", likeSearchOption);
    }

    protected void regSourceName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceName(), "SOURCE_NAME"); }
    protected abstract ConditionValue xgetCValueSourceName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAlias The value of sourceAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceAlias_Equal(String sourceAlias) {
        doSetSourceAlias_Equal(fRES(sourceAlias));
    }

    protected void doSetSourceAlias_Equal(String sourceAlias) {
        regSourceAlias(CK_EQ, sourceAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAlias The value of sourceAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceAlias_NotEqual(String sourceAlias) {
        doSetSourceAlias_NotEqual(fRES(sourceAlias));
    }

    protected void doSetSourceAlias_NotEqual(String sourceAlias) {
        regSourceAlias(CK_NES, sourceAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAliasList The collection of sourceAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceAlias_InScope(Collection<String> sourceAliasList) {
        doSetSourceAlias_InScope(sourceAliasList);
    }

    protected void doSetSourceAlias_InScope(Collection<String> sourceAliasList) {
        regINS(CK_INS, cTL(sourceAliasList), xgetCValueSourceAlias(), "SOURCE_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAliasList The collection of sourceAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceAlias_NotInScope(Collection<String> sourceAliasList) {
        doSetSourceAlias_NotInScope(sourceAliasList);
    }

    protected void doSetSourceAlias_NotInScope(Collection<String> sourceAliasList) {
        regINS(CK_NINS, cTL(sourceAliasList), xgetCValueSourceAlias(), "SOURCE_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setSourceAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sourceAlias The value of sourceAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceAlias_LikeSearch(String sourceAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceAlias_LikeSearch(sourceAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setSourceAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sourceAlias The value of sourceAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSourceAlias_LikeSearch(String sourceAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sourceAlias), xgetCValueSourceAlias(), "SOURCE_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAlias The value of sourceAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSourceAlias_NotLikeSearch(String sourceAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSourceAlias_NotLikeSearch(sourceAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (取得元別名)SOURCE_ALIAS: {UQ, NotNull, VARCHAR(100)}
     * @param sourceAlias The value of sourceAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSourceAlias_NotLikeSearch(String sourceAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sourceAlias), xgetCValueSourceAlias(), "SOURCE_ALIAS", likeSearchOption);
    }

    protected void regSourceAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceAlias(), "SOURCE_ALIAS"); }
    protected abstract ConditionValue xgetCValueSourceAlias();

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
    public HpSLCFunction<ClsSourceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsSourceCB.class);
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
    public HpSLCFunction<ClsSourceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsSourceCB.class);
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
    public HpSLCFunction<ClsSourceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsSourceCB.class);
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
    public HpSLCFunction<ClsSourceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsSourceCB.class);
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
    public HpSLCFunction<ClsSourceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsSourceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsSourceCB&gt;() {
     *     public void query(ClsSourceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsSourceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsSourceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsSourceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsSourceCQ sq);

    protected ClsSourceCB xcreateScalarConditionCB() {
        ClsSourceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsSourceCB xcreateScalarConditionPartitionByCB() {
        ClsSourceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsSourceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsSourceCB cb = new ClsSourceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOURCE_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsSourceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsSourceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsSourceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsSourceCB cb = new ClsSourceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOURCE_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsSourceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsSourceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsSourceCB cb = new ClsSourceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsSourceCQ sq);

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
    protected ClsSourceCB newMyCB() {
        return new ClsSourceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsSourceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
