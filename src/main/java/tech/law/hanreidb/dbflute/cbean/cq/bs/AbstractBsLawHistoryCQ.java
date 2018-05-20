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
 * The abstract condition-query of LAW_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_HISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_Equal(Integer lawHistoryId) {
        doSetLawHistoryId_Equal(lawHistoryId);
    }

    protected void doSetLawHistoryId_Equal(Integer lawHistoryId) {
        regLawHistoryId(CK_EQ, lawHistoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_NotEqual(Integer lawHistoryId) {
        doSetLawHistoryId_NotEqual(lawHistoryId);
    }

    protected void doSetLawHistoryId_NotEqual(Integer lawHistoryId) {
        regLawHistoryId(CK_NES, lawHistoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_GreaterThan(Integer lawHistoryId) {
        regLawHistoryId(CK_GT, lawHistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_LessThan(Integer lawHistoryId) {
        regLawHistoryId(CK_LT, lawHistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_GreaterEqual(Integer lawHistoryId) {
        regLawHistoryId(CK_GE, lawHistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryId The value of lawHistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_LessEqual(Integer lawHistoryId) {
        regLawHistoryId(CK_LE, lawHistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawHistoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawHistoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawHistoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawHistoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawHistoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawHistoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawHistoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawHistoryId(), "LAW_HISTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryIdList The collection of lawHistoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawHistoryId_InScope(Collection<Integer> lawHistoryIdList) {
        doSetLawHistoryId_InScope(lawHistoryIdList);
    }

    protected void doSetLawHistoryId_InScope(Collection<Integer> lawHistoryIdList) {
        regINS(CK_INS, cTL(lawHistoryIdList), xgetCValueLawHistoryId(), "LAW_HISTORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     * @param lawHistoryIdList The collection of lawHistoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawHistoryId_NotInScope(Collection<Integer> lawHistoryIdList) {
        doSetLawHistoryId_NotInScope(lawHistoryIdList);
    }

    protected void doSetLawHistoryId_NotInScope(Collection<Integer> lawHistoryIdList) {
        regINS(CK_NINS, cTL(lawHistoryIdList), xgetCValueLawHistoryId(), "LAW_HISTORY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_HISTORY_ID from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsArticle</span>(articleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     articleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArticleList for 'exists'. (NotNull)
     */
    public void existsArticle(SubQuery<ArticleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleCB cb = new ArticleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_ExistsReferrer_ArticleList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "articleList");
    }
    public abstract String keepLawHistoryId_ExistsReferrer_ArticleList(ArticleCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_HISTORY_ID from LAW_CONTENT where ...)} <br>
     * (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawContent</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawContentList for 'exists'. (NotNull)
     */
    public void existsLawContent(SubQuery<LawContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawContentCB cb = new LawContentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_ExistsReferrer_LawContentList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawContentList");
    }
    public abstract String keepLawHistoryId_ExistsReferrer_LawContentList(LawContentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_HISTORY_ID from LAW_TOC where ...)} <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLawToc</span>(tocCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tocCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawTocList for 'exists'. (NotNull)
     */
    public void existsLawToc(SubQuery<LawTocCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawTocCB cb = new LawTocCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_ExistsReferrer_LawTocList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawTocList");
    }
    public abstract String keepLawHistoryId_ExistsReferrer_LawTocList(LawTocCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_HISTORY_ID from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsArticle</span>(articleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     articleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawHistoryId_NotExistsReferrer_ArticleList for 'not exists'. (NotNull)
     */
    public void notExistsArticle(SubQuery<ArticleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleCB cb = new ArticleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_NotExistsReferrer_ArticleList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "articleList");
    }
    public abstract String keepLawHistoryId_NotExistsReferrer_ArticleList(ArticleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_HISTORY_ID from LAW_CONTENT where ...)} <br>
     * (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawContent</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawHistoryId_NotExistsReferrer_LawContentList for 'not exists'. (NotNull)
     */
    public void notExistsLawContent(SubQuery<LawContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawContentCB cb = new LawContentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_NotExistsReferrer_LawContentList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawContentList");
    }
    public abstract String keepLawHistoryId_NotExistsReferrer_LawContentList(LawContentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_HISTORY_ID from LAW_TOC where ...)} <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLawToc</span>(tocCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tocCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawHistoryId_NotExistsReferrer_LawTocList for 'not exists'. (NotNull)
     */
    public void notExistsLawToc(SubQuery<LawTocCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawTocCB cb = new LawTocCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawHistoryId_NotExistsReferrer_LawTocList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawTocList");
    }
    public abstract String keepLawHistoryId_NotExistsReferrer_LawTocList(LawTocCQ sq);

    public void xsderiveArticleList(String fn, SubQuery<ArticleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = new ArticleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawHistoryId_SpecifyDerivedReferrer_ArticleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "articleList", al, op);
    }
    public abstract String keepLawHistoryId_SpecifyDerivedReferrer_ArticleList(ArticleCQ sq);

    public void xsderiveLawContentList(String fn, SubQuery<LawContentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawContentCB cb = new LawContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawHistoryId_SpecifyDerivedReferrer_LawContentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawContentList", al, op);
    }
    public abstract String keepLawHistoryId_SpecifyDerivedReferrer_LawContentList(LawContentCQ sq);

    public void xsderiveLawTocList(String fn, SubQuery<LawTocCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTocCB cb = new LawTocCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawHistoryId_SpecifyDerivedReferrer_LawTocList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", pp, "lawTocList", al, op);
    }
    public abstract String keepLawHistoryId_SpecifyDerivedReferrer_LawTocList(LawTocCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedArticle()</span>.<span style="color: #CC4747">max</span>(articleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     articleCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     articleCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ArticleCB> derivedArticle() {
        return xcreateQDRFunctionArticleList();
    }
    protected HpQDRFunction<ArticleCB> xcreateQDRFunctionArticleList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveArticleList(fn, sq, rd, vl, op));
    }
    public void xqderiveArticleList(String fn, SubQuery<ArticleCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = new ArticleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawHistoryId_QueryDerivedReferrer_ArticleList(cb.query()); String prpp = keepLawHistoryId_QueryDerivedReferrer_ArticleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", sqpp, "articleList", rd, vl, prpp, op);
    }
    public abstract String keepLawHistoryId_QueryDerivedReferrer_ArticleList(ArticleCQ sq);
    public abstract String keepLawHistoryId_QueryDerivedReferrer_ArticleListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_CONTENT where ...)} <br>
     * (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawContent()</span>.<span style="color: #CC4747">max</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     contentCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawContentCB> derivedLawContent() {
        return xcreateQDRFunctionLawContentList();
    }
    protected HpQDRFunction<LawContentCB> xcreateQDRFunctionLawContentList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawContentList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawContentList(String fn, SubQuery<LawContentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawContentCB cb = new LawContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawHistoryId_QueryDerivedReferrer_LawContentList(cb.query()); String prpp = keepLawHistoryId_QueryDerivedReferrer_LawContentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", sqpp, "lawContentList", rd, vl, prpp, op);
    }
    public abstract String keepLawHistoryId_QueryDerivedReferrer_LawContentList(LawContentCQ sq);
    public abstract String keepLawHistoryId_QueryDerivedReferrer_LawContentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LAW_TOC where ...)} <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLawToc()</span>.<span style="color: #CC4747">max</span>(tocCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tocCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tocCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LawTocCB> derivedLawToc() {
        return xcreateQDRFunctionLawTocList();
    }
    protected HpQDRFunction<LawTocCB> xcreateQDRFunctionLawTocList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLawTocList(fn, sq, rd, vl, op));
    }
    public void xqderiveLawTocList(String fn, SubQuery<LawTocCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTocCB cb = new LawTocCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepLawHistoryId_QueryDerivedReferrer_LawTocList(cb.query()); String prpp = keepLawHistoryId_QueryDerivedReferrer_LawTocListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_HISTORY_ID", "LAW_HISTORY_ID", sqpp, "lawTocList", rd, vl, prpp, op);
    }
    public abstract String keepLawHistoryId_QueryDerivedReferrer_LawTocList(LawTocCQ sq);
    public abstract String keepLawHistoryId_QueryDerivedReferrer_LawTocListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawHistoryId_IsNull() { regLawHistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawHistoryId_IsNotNull() { regLawHistoryId(CK_ISNN, DOBJ); }

    protected void regLawHistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawHistoryId(), "LAW_HISTORY_ID"); }
    protected abstract ConditionValue xgetCValueLawHistoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_Equal(Integer lawId) {
        doSetLawId_Equal(lawId);
    }

    protected void doSetLawId_Equal(Integer lawId) {
        regLawId(CK_EQ, lawId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_NotEqual(Integer lawId) {
        doSetLawId_NotEqual(lawId);
    }

    protected void doSetLawId_NotEqual(Integer lawId) {
        regLawId(CK_NES, lawId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterThan(Integer lawId) {
        regLawId(CK_GT, lawId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessThan(Integer lawId) {
        regLawId(CK_LT, lawId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterEqual(Integer lawId) {
        regLawId(CK_GE, lawId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessEqual(Integer lawId) {
        regLawId(CK_LE, lawId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawId(), "LAW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawIdList The collection of lawId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawId_InScope(Collection<Integer> lawIdList) {
        doSetLawId_InScope(lawIdList);
    }

    protected void doSetLawId_InScope(Collection<Integer> lawIdList) {
        regINS(CK_INS, cTL(lawIdList), xgetCValueLawId(), "LAW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawIdList The collection of lawId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawId_NotInScope(Collection<Integer> lawIdList) {
        doSetLawId_NotInScope(lawIdList);
    }

    protected void doSetLawId_NotInScope(Collection<Integer> lawIdList) {
        regINS(CK_NINS, cTL(lawIdList), xgetCValueLawId(), "LAW_ID");
    }

    protected void regLawId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawId(), "LAW_ID"); }
    protected abstract ConditionValue xgetCValueLawId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_Equal(Integer amendLawId) {
        doSetAmendLawId_Equal(amendLawId);
    }

    protected void doSetAmendLawId_Equal(Integer amendLawId) {
        regAmendLawId(CK_EQ, amendLawId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_NotEqual(Integer amendLawId) {
        doSetAmendLawId_NotEqual(amendLawId);
    }

    protected void doSetAmendLawId_NotEqual(Integer amendLawId) {
        regAmendLawId(CK_NES, amendLawId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_GreaterThan(Integer amendLawId) {
        regAmendLawId(CK_GT, amendLawId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_LessThan(Integer amendLawId) {
        regAmendLawId(CK_LT, amendLawId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_GreaterEqual(Integer amendLawId) {
        regAmendLawId(CK_GE, amendLawId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawId The value of amendLawId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAmendLawId_LessEqual(Integer amendLawId) {
        regAmendLawId(CK_LE, amendLawId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param minNumber The min number of amendLawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of amendLawId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAmendLawId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAmendLawId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param minNumber The min number of amendLawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of amendLawId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAmendLawId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAmendLawId(), "AMEND_LAW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawIdList The collection of amendLawId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAmendLawId_InScope(Collection<Integer> amendLawIdList) {
        doSetAmendLawId_InScope(amendLawIdList);
    }

    protected void doSetAmendLawId_InScope(Collection<Integer> amendLawIdList) {
        regINS(CK_INS, cTL(amendLawIdList), xgetCValueAmendLawId(), "AMEND_LAW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     * @param amendLawIdList The collection of amendLawId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setAmendLawId_NotInScope(Collection<Integer> amendLawIdList) {
        doSetAmendLawId_NotInScope(amendLawIdList);
    }

    protected void doSetAmendLawId_NotInScope(Collection<Integer> amendLawIdList) {
        regINS(CK_NINS, cTL(amendLawIdList), xgetCValueAmendLawId(), "AMEND_LAW_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     */
    public void setAmendLawId_IsNull() { regAmendLawId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (改正法令ID)AMEND_LAW_ID: {IX, INT(10), FK to LAW}
     */
    public void setAmendLawId_IsNotNull() { regAmendLawId(CK_ISNN, DOBJ); }

    protected void regAmendLawId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAmendLawId(), "AMEND_LAW_ID"); }
    protected abstract ConditionValue xgetCValueAmendLawId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_Equal(Integer lawAmendVersion) {
        doSetLawAmendVersion_Equal(lawAmendVersion);
    }

    protected void doSetLawAmendVersion_Equal(Integer lawAmendVersion) {
        regLawAmendVersion(CK_EQ, lawAmendVersion);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_NotEqual(Integer lawAmendVersion) {
        doSetLawAmendVersion_NotEqual(lawAmendVersion);
    }

    protected void doSetLawAmendVersion_NotEqual(Integer lawAmendVersion) {
        regLawAmendVersion(CK_NES, lawAmendVersion);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_GreaterThan(Integer lawAmendVersion) {
        regLawAmendVersion(CK_GT, lawAmendVersion);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_LessThan(Integer lawAmendVersion) {
        regLawAmendVersion(CK_LT, lawAmendVersion);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_GreaterEqual(Integer lawAmendVersion) {
        regLawAmendVersion(CK_GE, lawAmendVersion);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersion The value of lawAmendVersion as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawAmendVersion_LessEqual(Integer lawAmendVersion) {
        regLawAmendVersion(CK_LE, lawAmendVersion);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of lawAmendVersion. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawAmendVersion. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawAmendVersion_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawAmendVersion_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of lawAmendVersion. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawAmendVersion. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawAmendVersion_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawAmendVersion(), "LAW_AMEND_VERSION", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersionList The collection of lawAmendVersion as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawAmendVersion_InScope(Collection<Integer> lawAmendVersionList) {
        doSetLawAmendVersion_InScope(lawAmendVersionList);
    }

    protected void doSetLawAmendVersion_InScope(Collection<Integer> lawAmendVersionList) {
        regINS(CK_INS, cTL(lawAmendVersionList), xgetCValueLawAmendVersion(), "LAW_AMEND_VERSION");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令改正バージョン)LAW_AMEND_VERSION: {+UQ, NotNull, INT(10)}
     * @param lawAmendVersionList The collection of lawAmendVersion as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawAmendVersion_NotInScope(Collection<Integer> lawAmendVersionList) {
        doSetLawAmendVersion_NotInScope(lawAmendVersionList);
    }

    protected void doSetLawAmendVersion_NotInScope(Collection<Integer> lawAmendVersionList) {
        regINS(CK_NINS, cTL(lawAmendVersionList), xgetCValueLawAmendVersion(), "LAW_AMEND_VERSION");
    }

    protected void regLawAmendVersion(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawAmendVersion(), "LAW_AMEND_VERSION"); }
    protected abstract ConditionValue xgetCValueLawAmendVersion();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg}
     * @param latestVersionFlg The value of latestVersionFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestVersionFlg_Equal(Boolean latestVersionFlg) {
        regLatestVersionFlg(CK_EQ, latestVersionFlg);
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (最新フラグ)LATEST_VERSION_FLG: {NotNull, BIT, classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLatestVersionFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetLatestVersionFlg_Equal(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setLatestVersionFlg_Equal_True() {
        doSetLatestVersionFlg_Equal(Boolean.valueOf(CDef.Flg.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setLatestVersionFlg_Equal_False() {
        doSetLatestVersionFlg_Equal(Boolean.valueOf(CDef.Flg.False.code()));
    }

    protected void doSetLatestVersionFlg_Equal(Boolean latestVersionFlg) {
        regLatestVersionFlg(CK_EQ, latestVersionFlg);
    }

    protected void regLatestVersionFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLatestVersionFlg(), "LATEST_VERSION_FLG"); }
    protected abstract ConditionValue xgetCValueLatestVersionFlg();

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
    public HpSLCFunction<LawHistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawHistoryCB.class);
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
    public HpSLCFunction<LawHistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawHistoryCB.class);
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
    public HpSLCFunction<LawHistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawHistoryCB.class);
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
    public HpSLCFunction<LawHistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawHistoryCB.class);
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
    public HpSLCFunction<LawHistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawHistoryCB&gt;() {
     *     public void query(LawHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawHistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawHistoryCQ sq);

    protected LawHistoryCB xcreateScalarConditionCB() {
        LawHistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawHistoryCB xcreateScalarConditionPartitionByCB() {
        LawHistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_HISTORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawHistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawHistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_HISTORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawHistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawHistoryCB cb = new LawHistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawHistoryCQ sq);

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
    protected LawHistoryCB newMyCB() {
        return new LawHistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
