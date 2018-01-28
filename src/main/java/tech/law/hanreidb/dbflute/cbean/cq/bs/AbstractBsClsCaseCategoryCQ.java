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
 * The abstract condition-query of CLS_CASE_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsCaseCategoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsCaseCategoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CLS_CASE_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     * @param caseCategoryCode The value of caseCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_Equal(String caseCategoryCode) {
        doSetCaseCategoryCode_Equal(fRES(caseCategoryCode));
    }

    /**
     * Equal(=). As CaseCategory. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory cdef) {
        doSetCaseCategoryCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 民事事件 (MIN). And OnlyOnceRegistered. <br>
     * 民事事件: 民事事件
     */
    public void setCaseCategoryCode_Equal_民事事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.民事事件);
    }

    /**
     * Equal(=). As 刑事事件 (KEI). And OnlyOnceRegistered. <br>
     * 刑事事件: 刑事事件
     */
    public void setCaseCategoryCode_Equal_刑事事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.刑事事件);
    }

    /**
     * Equal(=). As 行政事件 (GYO). And OnlyOnceRegistered. <br>
     * 行政事件: 行政事件
     */
    public void setCaseCategoryCode_Equal_行政事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.行政事件);
    }

    /**
     * Equal(=). As 没収裁判取消事件 (CONFISCATE). And OnlyOnceRegistered. <br>
     * 没収の裁判の取消事件: 没収の裁判の取消事件
     */
    public void setCaseCategoryCode_Equal_没収裁判取消事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.没収裁判取消事件);
    }

    /**
     * Equal(=). As 家庭事件 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭事件: 家庭事件
     */
    public void setCaseCategoryCode_Equal_家庭事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.家庭事件);
    }

    /**
     * Equal(=). As 秩序違反事件 (ORDER). And OnlyOnceRegistered. <br>
     * 法廷等の秩序維持に関する法律違反事件: 法廷等の秩序維持に関する法律違反事件
     */
    public void setCaseCategoryCode_Equal_秩序違反事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.秩序違反事件);
    }

    /**
     * Equal(=). As 裁判官の分限事件 (JUDGES). And OnlyOnceRegistered. <br>
     * 裁判官の分限事件: 裁判官の分限事件
     */
    public void setCaseCategoryCode_Equal_裁判官の分限事件() {
        setCaseCategoryCode_Equal_AsCaseCategory(CDef.CaseCategory.裁判官の分限事件);
    }

    protected void doSetCaseCategoryCode_Equal(String caseCategoryCode) {
        regCaseCategoryCode(CK_EQ, caseCategoryCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     * @param caseCategoryCode The value of caseCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotEqual(String caseCategoryCode) {
        doSetCaseCategoryCode_NotEqual(fRES(caseCategoryCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CaseCategory. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory cdef) {
        doSetCaseCategoryCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 民事事件 (MIN). And OnlyOnceRegistered. <br>
     * 民事事件: 民事事件
     */
    public void setCaseCategoryCode_NotEqual_民事事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.民事事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 刑事事件 (KEI). And OnlyOnceRegistered. <br>
     * 刑事事件: 刑事事件
     */
    public void setCaseCategoryCode_NotEqual_刑事事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.刑事事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 行政事件 (GYO). And OnlyOnceRegistered. <br>
     * 行政事件: 行政事件
     */
    public void setCaseCategoryCode_NotEqual_行政事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.行政事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 没収裁判取消事件 (CONFISCATE). And OnlyOnceRegistered. <br>
     * 没収の裁判の取消事件: 没収の裁判の取消事件
     */
    public void setCaseCategoryCode_NotEqual_没収裁判取消事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.没収裁判取消事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 家庭事件 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭事件: 家庭事件
     */
    public void setCaseCategoryCode_NotEqual_家庭事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.家庭事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 秩序違反事件 (ORDER). And OnlyOnceRegistered. <br>
     * 法廷等の秩序維持に関する法律違反事件: 法廷等の秩序維持に関する法律違反事件
     */
    public void setCaseCategoryCode_NotEqual_秩序違反事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.秩序違反事件);
    }

    /**
     * NotEqual(&lt;&gt;). As 裁判官の分限事件 (JUDGES). And OnlyOnceRegistered. <br>
     * 裁判官の分限事件: 裁判官の分限事件
     */
    public void setCaseCategoryCode_NotEqual_裁判官の分限事件() {
        setCaseCategoryCode_NotEqual_AsCaseCategory(CDef.CaseCategory.裁判官の分限事件);
    }

    protected void doSetCaseCategoryCode_NotEqual(String caseCategoryCode) {
        regCaseCategoryCode(CK_NES, caseCategoryCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     * @param caseCategoryCodeList The collection of caseCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_InScope(Collection<String> caseCategoryCodeList) {
        doSetCaseCategoryCode_InScope(caseCategoryCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CaseCategory. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_InScope_AsCaseCategory(Collection<CDef.CaseCategory> cdefList) {
        doSetCaseCategoryCode_InScope(cTStrL(cdefList));
    }

    protected void doSetCaseCategoryCode_InScope(Collection<String> caseCategoryCodeList) {
        regINS(CK_INS, cTL(caseCategoryCodeList), xgetCValueCaseCategoryCode(), "CASE_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     * @param caseCategoryCodeList The collection of caseCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotInScope(Collection<String> caseCategoryCodeList) {
        doSetCaseCategoryCode_NotInScope(caseCategoryCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CaseCategory. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotInScope_AsCaseCategory(Collection<CDef.CaseCategory> cdefList) {
        doSetCaseCategoryCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCaseCategoryCode_NotInScope(Collection<String> caseCategoryCodeList) {
        regINS(CK_NINS, cTL(caseCategoryCodeList), xgetCValueCaseCategoryCode(), "CASE_CATEGORY_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CASE_CATEGORY_CODE from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by CASE_CATEGORY_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsCaseMark</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CaseMarkList for 'exists'. (NotNull)
     */
    public void existsCaseMark(SubQuery<CaseMarkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCaseCategoryCode_ExistsReferrer_CaseMarkList(cb.query());
        registerExistsReferrer(cb.query(), "CASE_CATEGORY_CODE", "CASE_CATEGORY_CODE", pp, "caseMarkList");
    }
    public abstract String keepCaseCategoryCode_ExistsReferrer_CaseMarkList(CaseMarkCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CASE_CATEGORY_CODE from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by CASE_CATEGORY_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsCaseMark</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CaseCategoryCode_NotExistsReferrer_CaseMarkList for 'not exists'. (NotNull)
     */
    public void notExistsCaseMark(SubQuery<CaseMarkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCaseCategoryCode_NotExistsReferrer_CaseMarkList(cb.query());
        registerNotExistsReferrer(cb.query(), "CASE_CATEGORY_CODE", "CASE_CATEGORY_CODE", pp, "caseMarkList");
    }
    public abstract String keepCaseCategoryCode_NotExistsReferrer_CaseMarkList(CaseMarkCQ sq);

    public void xsderiveCaseMarkList(String fn, SubQuery<CaseMarkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCaseCategoryCode_SpecifyDerivedReferrer_CaseMarkList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CASE_CATEGORY_CODE", "CASE_CATEGORY_CODE", pp, "caseMarkList", al, op);
    }
    public abstract String keepCaseCategoryCode_SpecifyDerivedReferrer_CaseMarkList(CaseMarkCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from CASE_MARK where ...)} <br>
     * (事件符号)CASE_MARK by CASE_CATEGORY_CODE, named 'caseMarkAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedCaseMark()</span>.<span style="color: #CC4747">max</span>(markCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     markCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     markCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<CaseMarkCB> derivedCaseMark() {
        return xcreateQDRFunctionCaseMarkList();
    }
    protected HpQDRFunction<CaseMarkCB> xcreateQDRFunctionCaseMarkList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveCaseMarkList(fn, sq, rd, vl, op));
    }
    public void xqderiveCaseMarkList(String fn, SubQuery<CaseMarkCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCaseCategoryCode_QueryDerivedReferrer_CaseMarkList(cb.query()); String prpp = keepCaseCategoryCode_QueryDerivedReferrer_CaseMarkListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CASE_CATEGORY_CODE", "CASE_CATEGORY_CODE", sqpp, "caseMarkList", rd, vl, prpp, op);
    }
    public abstract String keepCaseCategoryCode_QueryDerivedReferrer_CaseMarkList(CaseMarkCQ sq);
    public abstract String keepCaseCategoryCode_QueryDerivedReferrer_CaseMarkListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     */
    public void setCaseCategoryCode_IsNull() { regCaseCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {PK, NotNull, VARCHAR(10), classification=CaseCategory}
     */
    public void setCaseCategoryCode_IsNotNull() { regCaseCategoryCode(CK_ISNN, DOBJ); }

    protected void regCaseCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCategoryCode(), "CASE_CATEGORY_CODE"); }
    protected abstract ConditionValue xgetCValueCaseCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリー名)CASE_CATEGORY_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param caseCategoryName The value of caseCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryName_Equal(String caseCategoryName) {
        doSetCaseCategoryName_Equal(fRES(caseCategoryName));
    }

    protected void doSetCaseCategoryName_Equal(String caseCategoryName) {
        regCaseCategoryName(CK_EQ, caseCategoryName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー名)CASE_CATEGORY_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseCategoryName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseCategoryName The value of caseCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategoryName_LikeSearch(String caseCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategoryName_LikeSearch(caseCategoryName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー名)CASE_CATEGORY_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseCategoryName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseCategoryName The value of caseCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseCategoryName_LikeSearch(String caseCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseCategoryName), xgetCValueCaseCategoryName(), "CASE_CATEGORY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー名)CASE_CATEGORY_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param caseCategoryName The value of caseCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategoryName_NotLikeSearch(String caseCategoryName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategoryName_NotLikeSearch(caseCategoryName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー名)CASE_CATEGORY_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param caseCategoryName The value of caseCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseCategoryName_NotLikeSearch(String caseCategoryName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseCategoryName), xgetCValueCaseCategoryName(), "CASE_CATEGORY_NAME", likeSearchOption);
    }

    protected void regCaseCategoryName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCategoryName(), "CASE_CATEGORY_NAME"); }
    protected abstract ConditionValue xgetCValueCaseCategoryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAlias The value of caseCategoryAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryAlias_Equal(String caseCategoryAlias) {
        doSetCaseCategoryAlias_Equal(fRES(caseCategoryAlias));
    }

    protected void doSetCaseCategoryAlias_Equal(String caseCategoryAlias) {
        regCaseCategoryAlias(CK_EQ, caseCategoryAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAlias The value of caseCategoryAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryAlias_NotEqual(String caseCategoryAlias) {
        doSetCaseCategoryAlias_NotEqual(fRES(caseCategoryAlias));
    }

    protected void doSetCaseCategoryAlias_NotEqual(String caseCategoryAlias) {
        regCaseCategoryAlias(CK_NES, caseCategoryAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAliasList The collection of caseCategoryAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryAlias_InScope(Collection<String> caseCategoryAliasList) {
        doSetCaseCategoryAlias_InScope(caseCategoryAliasList);
    }

    protected void doSetCaseCategoryAlias_InScope(Collection<String> caseCategoryAliasList) {
        regINS(CK_INS, cTL(caseCategoryAliasList), xgetCValueCaseCategoryAlias(), "CASE_CATEGORY_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAliasList The collection of caseCategoryAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryAlias_NotInScope(Collection<String> caseCategoryAliasList) {
        doSetCaseCategoryAlias_NotInScope(caseCategoryAliasList);
    }

    protected void doSetCaseCategoryAlias_NotInScope(Collection<String> caseCategoryAliasList) {
        regINS(CK_NINS, cTL(caseCategoryAliasList), xgetCValueCaseCategoryAlias(), "CASE_CATEGORY_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setCaseCategoryAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseCategoryAlias The value of caseCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategoryAlias_LikeSearch(String caseCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategoryAlias_LikeSearch(caseCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setCaseCategoryAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseCategoryAlias The value of caseCategoryAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseCategoryAlias_LikeSearch(String caseCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseCategoryAlias), xgetCValueCaseCategoryAlias(), "CASE_CATEGORY_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAlias The value of caseCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategoryAlias_NotLikeSearch(String caseCategoryAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategoryAlias_NotLikeSearch(caseCategoryAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件カテゴリー別名)CASE_CATEGORY_ALIAS: {UQ, NotNull, VARCHAR(30)}
     * @param caseCategoryAlias The value of caseCategoryAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseCategoryAlias_NotLikeSearch(String caseCategoryAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseCategoryAlias), xgetCValueCaseCategoryAlias(), "CASE_CATEGORY_ALIAS", likeSearchOption);
    }

    protected void regCaseCategoryAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCategoryAlias(), "CASE_CATEGORY_ALIAS"); }
    protected abstract ConditionValue xgetCValueCaseCategoryAlias();

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
    public HpSLCFunction<ClsCaseCategoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsCaseCategoryCB.class);
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
    public HpSLCFunction<ClsCaseCategoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsCaseCategoryCB.class);
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
    public HpSLCFunction<ClsCaseCategoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsCaseCategoryCB.class);
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
    public HpSLCFunction<ClsCaseCategoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsCaseCategoryCB.class);
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
    public HpSLCFunction<ClsCaseCategoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsCaseCategoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsCaseCategoryCB&gt;() {
     *     public void query(ClsCaseCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsCaseCategoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsCaseCategoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCaseCategoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsCaseCategoryCQ sq);

    protected ClsCaseCategoryCB xcreateScalarConditionCB() {
        ClsCaseCategoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsCaseCategoryCB xcreateScalarConditionPartitionByCB() {
        ClsCaseCategoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsCaseCategoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCaseCategoryCB cb = new ClsCaseCategoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CASE_CATEGORY_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsCaseCategoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsCaseCategoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsCaseCategoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsCaseCategoryCB cb = new ClsCaseCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CASE_CATEGORY_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsCaseCategoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsCaseCategoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsCaseCategoryCB cb = new ClsCaseCategoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsCaseCategoryCQ sq);

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
    protected ClsCaseCategoryCB newMyCB() {
        return new ClsCaseCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsCaseCategoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
