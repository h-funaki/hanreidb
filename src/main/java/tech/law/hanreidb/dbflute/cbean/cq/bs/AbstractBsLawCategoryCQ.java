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
 * The abstract condition-query of LAW_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_Equal(Integer lawCategoryId) {
        doSetLawCategoryId_Equal(lawCategoryId);
    }

    protected void doSetLawCategoryId_Equal(Integer lawCategoryId) {
        regLawCategoryId(CK_EQ, lawCategoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_NotEqual(Integer lawCategoryId) {
        doSetLawCategoryId_NotEqual(lawCategoryId);
    }

    protected void doSetLawCategoryId_NotEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_NES, lawCategoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterThan(Integer lawCategoryId) {
        regLawCategoryId(CK_GT, lawCategoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessThan(Integer lawCategoryId) {
        regLawCategoryId(CK_LT, lawCategoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_GE, lawCategoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryId The value of lawCategoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_LE, lawCategoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryIdList The collection of lawCategoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_InScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_INS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawCategoryIdList The collection of lawCategoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_NotInScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_NINS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_CATEGORY_ID from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawCategoryRelList for 'exists'. (NotNull)
     */
    public void existsLawCategoryRel(SubQuery<LawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawCategoryId_ExistsReferrer_LawCategoryRelList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "lawCategoryRelList");
    }
    public abstract String keepLawCategoryId_ExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_CATEGORY_ID from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawCategoryId_ExistsReferrer_SourceLawCategoryList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "sourceLawCategoryList");
    }
    public abstract String keepLawCategoryId_ExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_CATEGORY_ID from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawCategoryRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawCategoryId_NotExistsReferrer_LawCategoryRelList for 'not exists'. (NotNull)
     */
    public void notExistsLawCategoryRel(SubQuery<LawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawCategoryId_NotExistsReferrer_LawCategoryRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "lawCategoryRelList");
    }
    public abstract String keepLawCategoryId_NotExistsReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_CATEGORY_ID from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsSourceLawCategory</span>(categoryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     categoryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawCategoryId_NotExistsReferrer_SourceLawCategoryList for 'not exists'. (NotNull)
     */
    public void notExistsSourceLawCategory(SubQuery<SourceLawCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawCategoryId_NotExistsReferrer_SourceLawCategoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "sourceLawCategoryList");
    }
    public abstract String keepLawCategoryId_NotExistsReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    public void xsderiveLawCategoryRelList(String fn, SubQuery<LawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "lawCategoryRelList", al, op);
    }
    public abstract String keepLawCategoryId_SpecifyDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq);

    public void xsderiveSourceLawCategoryList(String fn, SubQuery<SourceLawCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryCB cb = new SourceLawCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", pp, "sourceLawCategoryList", al, op);
    }
    public abstract String keepLawCategoryId_SpecifyDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_CATEGORY_REL where ...)} <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawCategoryRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawCategoryRelCB> derivedLawCategoryRel() {
        return xcreateQDRFunctionLawCategoryRelList();
    }
    protected HpQDRFunction<LawCategoryRelCB> xcreateQDRFunctionLawCategoryRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawCategoryRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawCategoryRelList(String fn, SubQuery<LawCategoryRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelList(cb.query()); String prpp = keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", sqpp, "lawCategoryRelList", rd, vl, prpp, op);
    }
    public abstract String keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelList(LawCategoryRelCQ sq);
    public abstract String keepLawCategoryId_QueryDerivedReferrer_LawCategoryRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from SOURCE_LAW_CATEGORY where ...)} <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryList(cb.query()); String prpp = keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_CATEGORY_ID", "LAW_CATEGORY_ID", sqpp, "sourceLawCategoryList", rd, vl, prpp, op);
    }
    public abstract String keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryList(SourceLawCategoryCQ sq);
    public abstract String keepLawCategoryId_QueryDerivedReferrer_SourceLawCategoryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawCategoryId_IsNull() { regLawCategoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawCategoryId_IsNotNull() { regLawCategoryId(CK_ISNN, DOBJ); }

    protected void regLawCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID"); }
    protected abstract ConditionValue xgetCValueLawCategoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryName The value of lawCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryName_Equal(String lawCategoryName) {
        doSetLawCategoryName_Equal(fRES(lawCategoryName));
    }

    protected void doSetLawCategoryName_Equal(String lawCategoryName) {
        regLawCategoryName(CK_EQ, lawCategoryName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawCategoryName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawCategoryName The value of lawCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawCategoryName_LikeSearch(String lawCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawCategoryName_LikeSearch(lawCategoryName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawCategoryName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawCategoryName The value of lawCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawCategoryName_LikeSearch(String lawCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawCategoryName), xgetCValueLawCategoryName(), "LAW_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryName The value of lawCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawCategoryName_NotLikeSearch(String lawCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawCategoryName_NotLikeSearch(lawCategoryName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー名)LAW_CATEGORY_NAME: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryName The value of lawCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawCategoryName_NotLikeSearch(String lawCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawCategoryName), xgetCValueLawCategoryName(), "LAW_CATEGORY_NAME", likeSearchOption);
    }

    protected void regLawCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryName(), "LAW_CATEGORY_NAME"); }
    protected abstract ConditionValue xgetCValueLawCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAlias The value of lawCategoryAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryAlias_Equal(String lawCategoryAlias) {
        doSetLawCategoryAlias_Equal(fRES(lawCategoryAlias));
    }

    protected void doSetLawCategoryAlias_Equal(String lawCategoryAlias) {
        regLawCategoryAlias(CK_EQ, lawCategoryAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAlias The value of lawCategoryAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryAlias_NotEqual(String lawCategoryAlias) {
        doSetLawCategoryAlias_NotEqual(fRES(lawCategoryAlias));
    }

    protected void doSetLawCategoryAlias_NotEqual(String lawCategoryAlias) {
        regLawCategoryAlias(CK_NES, lawCategoryAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAliasList The collection of lawCategoryAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryAlias_InScope(Collection<String> lawCategoryAliasList) {
        doSetLawCategoryAlias_InScope(lawCategoryAliasList);
    }

    protected void doSetLawCategoryAlias_InScope(Collection<String> lawCategoryAliasList) {
        regINS(CK_INS, cTL(lawCategoryAliasList), xgetCValueLawCategoryAlias(), "LAW_CATEGORY_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAliasList The collection of lawCategoryAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryAlias_NotInScope(Collection<String> lawCategoryAliasList) {
        doSetLawCategoryAlias_NotInScope(lawCategoryAliasList);
    }

    protected void doSetLawCategoryAlias_NotInScope(Collection<String> lawCategoryAliasList) {
        regINS(CK_NINS, cTL(lawCategoryAliasList), xgetCValueLawCategoryAlias(), "LAW_CATEGORY_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawCategoryAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawCategoryAlias The value of lawCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawCategoryAlias_LikeSearch(String lawCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawCategoryAlias_LikeSearch(lawCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setLawCategoryAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawCategoryAlias The value of lawCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawCategoryAlias_LikeSearch(String lawCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawCategoryAlias), xgetCValueLawCategoryAlias(), "LAW_CATEGORY_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAlias The value of lawCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawCategoryAlias_NotLikeSearch(String lawCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawCategoryAlias_NotLikeSearch(lawCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令カテゴリー別名)LAW_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(20)}
     * @param lawCategoryAlias The value of lawCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawCategoryAlias_NotLikeSearch(String lawCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawCategoryAlias), xgetCValueLawCategoryAlias(), "LAW_CATEGORY_ALIAS", likeSearchOption);
    }

    protected void regLawCategoryAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryAlias(), "LAW_CATEGORY_ALIAS"); }
    protected abstract ConditionValue xgetCValueLawCategoryAlias();

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
    public HpSLCFunction<LawCategoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawCategoryCB.class);
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
    public HpSLCFunction<LawCategoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawCategoryCB.class);
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
    public HpSLCFunction<LawCategoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawCategoryCB.class);
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
    public HpSLCFunction<LawCategoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawCategoryCB.class);
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
    public HpSLCFunction<LawCategoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawCategoryCB&gt;() {
     *     public void query(LawCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawCategoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawCategoryCQ sq);

    protected LawCategoryCB xcreateScalarConditionCB() {
        LawCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawCategoryCB xcreateScalarConditionPartitionByCB() {
        LawCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryCB cb = new LawCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_CATEGORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryCB cb = new LawCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_CATEGORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryCB cb = new LawCategoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawCategoryCQ sq);

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
    protected LawCategoryCB newMyCB() {
        return new LawCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}