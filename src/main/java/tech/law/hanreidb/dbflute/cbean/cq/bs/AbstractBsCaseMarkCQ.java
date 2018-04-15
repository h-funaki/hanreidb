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
 * The abstract condition-query of CASE_MARK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCaseMarkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCaseMarkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CASE_MARK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_Equal(Integer caseMarkId) {
        doSetCaseMarkId_Equal(caseMarkId);
    }

    protected void doSetCaseMarkId_Equal(Integer caseMarkId) {
        regCaseMarkId(CK_EQ, caseMarkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_NotEqual(Integer caseMarkId) {
        doSetCaseMarkId_NotEqual(caseMarkId);
    }

    protected void doSetCaseMarkId_NotEqual(Integer caseMarkId) {
        regCaseMarkId(CK_NES, caseMarkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_GreaterThan(Integer caseMarkId) {
        regCaseMarkId(CK_GT, caseMarkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_LessThan(Integer caseMarkId) {
        regCaseMarkId(CK_LT, caseMarkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_GreaterEqual(Integer caseMarkId) {
        regCaseMarkId(CK_GE, caseMarkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkId The value of caseMarkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseMarkId_LessEqual(Integer caseMarkId) {
        regCaseMarkId(CK_LE, caseMarkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseMarkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseMarkId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCaseMarkId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCaseMarkId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of caseMarkId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of caseMarkId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCaseMarkId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseMarkId(), "CASE_MARK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkIdList The collection of caseMarkId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkId_InScope(Collection<Integer> caseMarkIdList) {
        doSetCaseMarkId_InScope(caseMarkIdList);
    }

    protected void doSetCaseMarkId_InScope(Collection<Integer> caseMarkIdList) {
        regINS(CK_INS, cTL(caseMarkIdList), xgetCValueCaseMarkId(), "CASE_MARK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param caseMarkIdList The collection of caseMarkId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkId_NotInScope(Collection<Integer> caseMarkIdList) {
        doSetCaseMarkId_NotInScope(caseMarkIdList);
    }

    protected void doSetCaseMarkId_NotInScope(Collection<Integer> caseMarkIdList) {
        regINS(CK_NINS, cTL(caseMarkIdList), xgetCValueCaseMarkId(), "CASE_MARK_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CASE_MARK_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCaseMarkId_ExistsReferrer_JudgementList(cb.query());
        registerExistsReferrer(cb.query(), "CASE_MARK_ID", "CASE_MARK_ID", pp, "judgementList");
    }
    public abstract String keepCaseMarkId_ExistsReferrer_JudgementList(JudgementCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CASE_MARK_ID from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgement</span>(judgementCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     judgementCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CaseMarkId_NotExistsReferrer_JudgementList for 'not exists'. (NotNull)
     */
    public void notExistsJudgement(SubQuery<JudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementCB cb = new JudgementCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCaseMarkId_NotExistsReferrer_JudgementList(cb.query());
        registerNotExistsReferrer(cb.query(), "CASE_MARK_ID", "CASE_MARK_ID", pp, "judgementList");
    }
    public abstract String keepCaseMarkId_NotExistsReferrer_JudgementList(JudgementCQ sq);

    public void xsderiveJudgementList(String fn, SubQuery<JudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementCB cb = new JudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCaseMarkId_SpecifyDerivedReferrer_JudgementList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CASE_MARK_ID", "CASE_MARK_ID", pp, "judgementList", al, op);
    }
    public abstract String keepCaseMarkId_SpecifyDerivedReferrer_JudgementList(JudgementCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT where ...)} <br>
     * (判決)JUDGEMENT by CASE_MARK_ID, named 'judgementAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCaseMarkId_QueryDerivedReferrer_JudgementList(cb.query()); String prpp = keepCaseMarkId_QueryDerivedReferrer_JudgementListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CASE_MARK_ID", "CASE_MARK_ID", sqpp, "judgementList", rd, vl, prpp, op);
    }
    public abstract String keepCaseMarkId_QueryDerivedReferrer_JudgementList(JudgementCQ sq);
    public abstract String keepCaseMarkId_QueryDerivedReferrer_JudgementListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCaseMarkId_IsNull() { regCaseMarkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件符号ID)CASE_MARK_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setCaseMarkId_IsNotNull() { regCaseMarkId(CK_ISNN, DOBJ); }

    protected void regCaseMarkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMarkId(), "CASE_MARK_ID"); }
    protected abstract ConditionValue xgetCValueCaseMarkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @param caseMarkName The value of caseMarkName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkName_Equal(String caseMarkName) {
        doSetCaseMarkName_Equal(fRES(caseMarkName));
    }

    protected void doSetCaseMarkName_Equal(String caseMarkName) {
        regCaseMarkName(CK_EQ, caseMarkName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseMarkName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseMarkName The value of caseMarkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkName_LikeSearch(String caseMarkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkName_LikeSearch(caseMarkName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseMarkName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseMarkName The value of caseMarkName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseMarkName_LikeSearch(String caseMarkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseMarkName), xgetCValueCaseMarkName(), "CASE_MARK_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @param caseMarkName The value of caseMarkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkName_NotLikeSearch(String caseMarkName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkName_NotLikeSearch(caseMarkName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号名)CASE_MARK_NAME: {NotNull, VARCHAR(10)}
     * @param caseMarkName The value of caseMarkName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseMarkName_NotLikeSearch(String caseMarkName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseMarkName), xgetCValueCaseMarkName(), "CASE_MARK_NAME", likeSearchOption);
    }

    protected void regCaseMarkName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMarkName(), "CASE_MARK_NAME"); }
    protected abstract ConditionValue xgetCValueCaseMarkName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAlias The value of caseMarkAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkAlias_Equal(String caseMarkAlias) {
        doSetCaseMarkAlias_Equal(fRES(caseMarkAlias));
    }

    protected void doSetCaseMarkAlias_Equal(String caseMarkAlias) {
        regCaseMarkAlias(CK_EQ, caseMarkAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAlias The value of caseMarkAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkAlias_NotEqual(String caseMarkAlias) {
        doSetCaseMarkAlias_NotEqual(fRES(caseMarkAlias));
    }

    protected void doSetCaseMarkAlias_NotEqual(String caseMarkAlias) {
        regCaseMarkAlias(CK_NES, caseMarkAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAliasList The collection of caseMarkAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkAlias_InScope(Collection<String> caseMarkAliasList) {
        doSetCaseMarkAlias_InScope(caseMarkAliasList);
    }

    protected void doSetCaseMarkAlias_InScope(Collection<String> caseMarkAliasList) {
        regINS(CK_INS, cTL(caseMarkAliasList), xgetCValueCaseMarkAlias(), "CASE_MARK_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAliasList The collection of caseMarkAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkAlias_NotInScope(Collection<String> caseMarkAliasList) {
        doSetCaseMarkAlias_NotInScope(caseMarkAliasList);
    }

    protected void doSetCaseMarkAlias_NotInScope(Collection<String> caseMarkAliasList) {
        regINS(CK_NINS, cTL(caseMarkAliasList), xgetCValueCaseMarkAlias(), "CASE_MARK_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseMarkAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseMarkAlias The value of caseMarkAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkAlias_LikeSearch(String caseMarkAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkAlias_LikeSearch(caseMarkAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setCaseMarkAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseMarkAlias The value of caseMarkAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseMarkAlias_LikeSearch(String caseMarkAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseMarkAlias), xgetCValueCaseMarkAlias(), "CASE_MARK_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAlias The value of caseMarkAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkAlias_NotLikeSearch(String caseMarkAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkAlias_NotLikeSearch(caseMarkAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号別名)CASE_MARK_ALIAS: {NotNull, VARCHAR(10)}
     * @param caseMarkAlias The value of caseMarkAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseMarkAlias_NotLikeSearch(String caseMarkAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseMarkAlias), xgetCValueCaseMarkAlias(), "CASE_MARK_ALIAS", likeSearchOption);
    }

    protected void regCaseMarkAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMarkAlias(), "CASE_MARK_ALIAS"); }
    protected abstract ConditionValue xgetCValueCaseMarkAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @param caseCategoryCode The value of caseCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_Equal(String caseCategoryCode) {
        doSetCaseCategoryCode_Equal(fRES(caseCategoryCode));
    }

    /**
     * Equal(=). As CaseCategory. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
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
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @param caseCategoryCode The value of caseCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotEqual(String caseCategoryCode) {
        doSetCaseCategoryCode_NotEqual(fRES(caseCategoryCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CaseCategory. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
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
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @param caseCategoryCodeList The collection of caseCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_InScope(Collection<String> caseCategoryCodeList) {
        doSetCaseCategoryCode_InScope(caseCategoryCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CaseCategory. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
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
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     * @param caseCategoryCodeList The collection of caseCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotInScope(Collection<String> caseCategoryCodeList) {
        doSetCaseCategoryCode_NotInScope(caseCategoryCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CaseCategory. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategoryCode_NotInScope_AsCaseCategory(Collection<CDef.CaseCategory> cdefList) {
        doSetCaseCategoryCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCaseCategoryCode_NotInScope(Collection<String> caseCategoryCodeList) {
        regINS(CK_NINS, cTL(caseCategoryCodeList), xgetCValueCaseCategoryCode(), "CASE_CATEGORY_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     */
    public void setCaseCategoryCode_IsNull() { regCaseCategoryCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     */
    public void setCaseCategoryCode_IsNullOrEmpty() { regCaseCategoryCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件カテゴリーコード)CASE_CATEGORY_CODE: {IX, VARCHAR(10), FK to CLS_CASE_CATEGORY, classification=CaseCategory}
     */
    public void setCaseCategoryCode_IsNotNull() { regCaseCategoryCode(CK_ISNN, DOBJ); }

    protected void regCaseCategoryCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCategoryCode(), "CASE_CATEGORY_CODE"); }
    protected abstract ConditionValue xgetCValueCaseCategoryCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_Equal(String courtTypeCode) {
        doSetCourtTypeCode_Equal(fRES(courtTypeCode));
    }

    /**
     * Equal(=). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtTypeCode_Equal_AsCourtType(CDef.CourtType cdef) {
        doSetCourtTypeCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 最高裁判所 (SUPREME). And OnlyOnceRegistered. <br>
     * 最高裁判所: 最高裁判所
     */
    public void setCourtTypeCode_Equal_最高裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.最高裁判所);
    }

    /**
     * Equal(=). As 高等裁判所 (HIGH). And OnlyOnceRegistered. <br>
     * 高等裁判所: 高等裁判所
     */
    public void setCourtTypeCode_Equal_高等裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.高等裁判所);
    }

    /**
     * Equal(=). As 地方裁判所 (DISTRICT). And OnlyOnceRegistered. <br>
     * 地方裁判所: 地方裁判所
     */
    public void setCourtTypeCode_Equal_地方裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.地方裁判所);
    }

    /**
     * Equal(=). As 簡易裁判所 (SUMMARY). And OnlyOnceRegistered. <br>
     * 簡易裁判所: 簡易裁判所
     */
    public void setCourtTypeCode_Equal_簡易裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.簡易裁判所);
    }

    /**
     * Equal(=). As 家庭裁判所 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭裁判所: 家庭裁判所
     */
    public void setCourtTypeCode_Equal_家庭裁判所() {
        setCourtTypeCode_Equal_AsCourtType(CDef.CourtType.家庭裁判所);
    }

    protected void doSetCourtTypeCode_Equal(String courtTypeCode) {
        regCourtTypeCode(CK_EQ, courtTypeCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCode The value of courtTypeCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotEqual(String courtTypeCode) {
        doSetCourtTypeCode_NotEqual(fRES(courtTypeCode));
    }

    /**
     * NotEqual(&lt;&gt;). As CourtType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType cdef) {
        doSetCourtTypeCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 最高裁判所 (SUPREME). And OnlyOnceRegistered. <br>
     * 最高裁判所: 最高裁判所
     */
    public void setCourtTypeCode_NotEqual_最高裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.最高裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 高等裁判所 (HIGH). And OnlyOnceRegistered. <br>
     * 高等裁判所: 高等裁判所
     */
    public void setCourtTypeCode_NotEqual_高等裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.高等裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 地方裁判所 (DISTRICT). And OnlyOnceRegistered. <br>
     * 地方裁判所: 地方裁判所
     */
    public void setCourtTypeCode_NotEqual_地方裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.地方裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 簡易裁判所 (SUMMARY). And OnlyOnceRegistered. <br>
     * 簡易裁判所: 簡易裁判所
     */
    public void setCourtTypeCode_NotEqual_簡易裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.簡易裁判所);
    }

    /**
     * NotEqual(&lt;&gt;). As 家庭裁判所 (DOMESTIC). And OnlyOnceRegistered. <br>
     * 家庭裁判所: 家庭裁判所
     */
    public void setCourtTypeCode_NotEqual_家庭裁判所() {
        setCourtTypeCode_NotEqual_AsCourtType(CDef.CourtType.家庭裁判所);
    }

    protected void doSetCourtTypeCode_NotEqual(String courtTypeCode) {
        regCourtTypeCode(CK_NES, courtTypeCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_InScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_InScope(courtTypeCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_InScope_AsCourtType(Collection<CDef.CourtType> cdefList) {
        doSetCourtTypeCode_InScope(cTStrL(cdefList));
    }

    protected void doSetCourtTypeCode_InScope(Collection<String> courtTypeCodeList) {
        regINS(CK_INS, cTL(courtTypeCodeList), xgetCValueCourtTypeCode(), "COURT_TYPE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     * @param courtTypeCodeList The collection of courtTypeCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        doSetCourtTypeCode_NotInScope(courtTypeCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CourtType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtTypeCode_NotInScope_AsCourtType(Collection<CDef.CourtType> cdefList) {
        doSetCourtTypeCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCourtTypeCode_NotInScope(Collection<String> courtTypeCodeList) {
        regINS(CK_NINS, cTL(courtTypeCodeList), xgetCValueCourtTypeCode(), "COURT_TYPE_CODE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     */
    public void setCourtTypeCode_IsNull() { regCourtTypeCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     */
    public void setCourtTypeCode_IsNullOrEmpty() { regCourtTypeCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判所種別コード)COURT_TYPE_CODE: {IX, VARCHAR(10), FK to CLS_COURT_TYPE, classification=CourtType}
     */
    public void setCourtTypeCode_IsNotNull() { regCourtTypeCode(CK_ISNN, DOBJ); }

    protected void regCourtTypeCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtTypeCode(), "COURT_TYPE_CODE"); }
    protected abstract ConditionValue xgetCValueCourtTypeCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetail The value of caseMarkDetail as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkDetail_Equal(String caseMarkDetail) {
        doSetCaseMarkDetail_Equal(fRES(caseMarkDetail));
    }

    protected void doSetCaseMarkDetail_Equal(String caseMarkDetail) {
        regCaseMarkDetail(CK_EQ, caseMarkDetail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetail The value of caseMarkDetail as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkDetail_NotEqual(String caseMarkDetail) {
        doSetCaseMarkDetail_NotEqual(fRES(caseMarkDetail));
    }

    protected void doSetCaseMarkDetail_NotEqual(String caseMarkDetail) {
        regCaseMarkDetail(CK_NES, caseMarkDetail);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetailList The collection of caseMarkDetail as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkDetail_InScope(Collection<String> caseMarkDetailList) {
        doSetCaseMarkDetail_InScope(caseMarkDetailList);
    }

    protected void doSetCaseMarkDetail_InScope(Collection<String> caseMarkDetailList) {
        regINS(CK_INS, cTL(caseMarkDetailList), xgetCValueCaseMarkDetail(), "CASE_MARK_DETAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetailList The collection of caseMarkDetail as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseMarkDetail_NotInScope(Collection<String> caseMarkDetailList) {
        doSetCaseMarkDetail_NotInScope(caseMarkDetailList);
    }

    protected void doSetCaseMarkDetail_NotInScope(Collection<String> caseMarkDetailList) {
        regINS(CK_NINS, cTL(caseMarkDetailList), xgetCValueCaseMarkDetail(), "CASE_MARK_DETAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)} <br>
     * <pre>e.g. setCaseMarkDetail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseMarkDetail The value of caseMarkDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkDetail_LikeSearch(String caseMarkDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkDetail_LikeSearch(caseMarkDetail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)} <br>
     * <pre>e.g. setCaseMarkDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseMarkDetail The value of caseMarkDetail as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseMarkDetail_LikeSearch(String caseMarkDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseMarkDetail), xgetCValueCaseMarkDetail(), "CASE_MARK_DETAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetail The value of caseMarkDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseMarkDetail_NotLikeSearch(String caseMarkDetail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseMarkDetail_NotLikeSearch(caseMarkDetail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     * @param caseMarkDetail The value of caseMarkDetail as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseMarkDetail_NotLikeSearch(String caseMarkDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseMarkDetail), xgetCValueCaseMarkDetail(), "CASE_MARK_DETAIL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     */
    public void setCaseMarkDetail_IsNull() { regCaseMarkDetail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     */
    public void setCaseMarkDetail_IsNullOrEmpty() { regCaseMarkDetail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件符号詳細)CASE_MARK_DETAIL: {VARCHAR(100)}
     */
    public void setCaseMarkDetail_IsNotNull() { regCaseMarkDetail(CK_ISNN, DOBJ); }

    protected void regCaseMarkDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseMarkDetail(), "CASE_MARK_DETAIL"); }
    protected abstract ConditionValue xgetCValueCaseMarkDetail();

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
    public HpSLCFunction<CaseMarkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CaseMarkCB.class);
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
    public HpSLCFunction<CaseMarkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CaseMarkCB.class);
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
    public HpSLCFunction<CaseMarkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CaseMarkCB.class);
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
    public HpSLCFunction<CaseMarkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CaseMarkCB.class);
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
    public HpSLCFunction<CaseMarkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CaseMarkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CaseMarkCB&gt;() {
     *     public void query(CaseMarkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CaseMarkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CaseMarkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CaseMarkCQ sq);

    protected CaseMarkCB xcreateScalarConditionCB() {
        CaseMarkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CaseMarkCB xcreateScalarConditionPartitionByCB() {
        CaseMarkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CaseMarkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CASE_MARK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CaseMarkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CaseMarkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CaseMarkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CASE_MARK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CaseMarkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CaseMarkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CaseMarkCB cb = new CaseMarkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CaseMarkCQ sq);

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
    protected CaseMarkCB newMyCB() {
        return new CaseMarkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CaseMarkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
