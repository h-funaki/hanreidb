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
 * The abstract condition-query of ARTICLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsArticleCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsArticleCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ARTICLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_Equal(Long articleId) {
        doSetArticleId_Equal(articleId);
    }

    protected void doSetArticleId_Equal(Long articleId) {
        regArticleId(CK_EQ, articleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_NotEqual(Long articleId) {
        doSetArticleId_NotEqual(articleId);
    }

    protected void doSetArticleId_NotEqual(Long articleId) {
        regArticleId(CK_NES, articleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterThan(Long articleId) {
        regArticleId(CK_GT, articleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessThan(Long articleId) {
        regArticleId(CK_LT, articleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterEqual(Long articleId) {
        regArticleId(CK_GE, articleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleId The value of articleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessEqual(Long articleId) {
        regArticleId(CK_LE, articleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of articleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArticleId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArticleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of articleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArticleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArticleId(), "ARTICLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleIdList The collection of articleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleId_InScope(Collection<Long> articleIdList) {
        doSetArticleId_InScope(articleIdList);
    }

    protected void doSetArticleId_InScope(Collection<Long> articleIdList) {
        regINS(CK_INS, cTL(articleIdList), xgetCValueArticleId(), "ARTICLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleIdList The collection of articleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleId_NotInScope(Collection<Long> articleIdList) {
        doSetArticleId_NotInScope(articleIdList);
    }

    protected void doSetArticleId_NotInScope(Collection<Long> articleIdList) {
        regINS(CK_NINS, cTL(articleIdList), xgetCValueArticleId(), "ARTICLE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ARTICLE_ID from ARTICLE_CONTENT where ...)} <br>
     * (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsArticleContent</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArticleContentList for 'exists'. (NotNull)
     */
    public void existsArticleContent(SubQuery<ArticleContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArticleId_ExistsReferrer_ArticleContentList(cb.query());
        registerExistsReferrer(cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "articleContentList");
    }
    public abstract String keepArticleId_ExistsReferrer_ArticleContentList(ArticleContentCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ARTICLE_ID from JUDGEMENT_ARTICLE_REL where ...)} <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementArticleRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementArticleRelList for 'exists'. (NotNull)
     */
    public void existsJudgementArticleRel(SubQuery<JudgementArticleRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArticleId_ExistsReferrer_JudgementArticleRelList(cb.query());
        registerExistsReferrer(cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "judgementArticleRelList");
    }
    public abstract String keepArticleId_ExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ARTICLE_ID from ARTICLE_CONTENT where ...)} <br>
     * (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsArticleContent</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArticleId_NotExistsReferrer_ArticleContentList for 'not exists'. (NotNull)
     */
    public void notExistsArticleContent(SubQuery<ArticleContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArticleId_NotExistsReferrer_ArticleContentList(cb.query());
        registerNotExistsReferrer(cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "articleContentList");
    }
    public abstract String keepArticleId_NotExistsReferrer_ArticleContentList(ArticleContentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ARTICLE_ID from JUDGEMENT_ARTICLE_REL where ...)} <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementArticleRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ArticleId_NotExistsReferrer_JudgementArticleRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementArticleRel(SubQuery<JudgementArticleRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepArticleId_NotExistsReferrer_JudgementArticleRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "judgementArticleRelList");
    }
    public abstract String keepArticleId_NotExistsReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq);

    public void xsderiveArticleContentList(String fn, SubQuery<ArticleContentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepArticleId_SpecifyDerivedReferrer_ArticleContentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "articleContentList", al, op);
    }
    public abstract String keepArticleId_SpecifyDerivedReferrer_ArticleContentList(ArticleContentCQ sq);

    public void xsderiveJudgementArticleRelList(String fn, SubQuery<JudgementArticleRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepArticleId_SpecifyDerivedReferrer_JudgementArticleRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ARTICLE_ID", "ARTICLE_ID", pp, "judgementArticleRelList", al, op);
    }
    public abstract String keepArticleId_SpecifyDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ARTICLE_CONTENT where ...)} <br>
     * (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedArticleContent()</span>.<span style="color: #CC4747">max</span>(contentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     contentCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     contentCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<ArticleContentCB> derivedArticleContent() {
        return xcreateQDRFunctionArticleContentList();
    }
    protected HpQDRFunction<ArticleContentCB> xcreateQDRFunctionArticleContentList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveArticleContentList(fn, sq, rd, vl, op));
    }
    public void xqderiveArticleContentList(String fn, SubQuery<ArticleContentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepArticleId_QueryDerivedReferrer_ArticleContentList(cb.query()); String prpp = keepArticleId_QueryDerivedReferrer_ArticleContentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ARTICLE_ID", "ARTICLE_ID", sqpp, "articleContentList", rd, vl, prpp, op);
    }
    public abstract String keepArticleId_QueryDerivedReferrer_ArticleContentList(ArticleContentCQ sq);
    public abstract String keepArticleId_QueryDerivedReferrer_ArticleContentListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_ARTICLE_REL where ...)} <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementArticleRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementArticleRelCB> derivedJudgementArticleRel() {
        return xcreateQDRFunctionJudgementArticleRelList();
    }
    protected HpQDRFunction<JudgementArticleRelCB> xcreateQDRFunctionJudgementArticleRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementArticleRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementArticleRelList(String fn, SubQuery<JudgementArticleRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepArticleId_QueryDerivedReferrer_JudgementArticleRelList(cb.query()); String prpp = keepArticleId_QueryDerivedReferrer_JudgementArticleRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ARTICLE_ID", "ARTICLE_ID", sqpp, "judgementArticleRelList", rd, vl, prpp, op);
    }
    public abstract String keepArticleId_QueryDerivedReferrer_JudgementArticleRelList(JudgementArticleRelCQ sq);
    public abstract String keepArticleId_QueryDerivedReferrer_JudgementArticleRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setArticleId_IsNull() { regArticleId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setArticleId_IsNotNull() { regArticleId(CK_ISNN, DOBJ); }

    protected void regArticleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleId(), "ARTICLE_ID"); }
    protected abstract ConditionValue xgetCValueArticleId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_Equal(Long lawTocId) {
        doSetLawTocId_Equal(lawTocId);
    }

    protected void doSetLawTocId_Equal(Long lawTocId) {
        regLawTocId(CK_EQ, lawTocId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_NotEqual(Long lawTocId) {
        doSetLawTocId_NotEqual(lawTocId);
    }

    protected void doSetLawTocId_NotEqual(Long lawTocId) {
        regLawTocId(CK_NES, lawTocId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_GreaterThan(Long lawTocId) {
        regLawTocId(CK_GT, lawTocId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_LessThan(Long lawTocId) {
        regLawTocId(CK_LT, lawTocId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_GreaterEqual(Long lawTocId) {
        regLawTocId(CK_GE, lawTocId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocId The value of lawTocId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_LessEqual(Long lawTocId) {
        regLawTocId(CK_LE, lawTocId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param minNumber The min number of lawTocId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawTocId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawTocId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawTocId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param minNumber The min number of lawTocId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawTocId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawTocId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawTocId(), "LAW_TOC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocIdList The collection of lawTocId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTocId_InScope(Collection<Long> lawTocIdList) {
        doSetLawTocId_InScope(lawTocIdList);
    }

    protected void doSetLawTocId_InScope(Collection<Long> lawTocIdList) {
        regINS(CK_INS, cTL(lawTocIdList), xgetCValueLawTocId(), "LAW_TOC_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {IX, NotNull, BIGINT(19), FK to LAW_TOC}
     * @param lawTocIdList The collection of lawTocId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTocId_NotInScope(Collection<Long> lawTocIdList) {
        doSetLawTocId_NotInScope(lawTocIdList);
    }

    protected void doSetLawTocId_NotInScope(Collection<Long> lawTocIdList) {
        regINS(CK_NINS, cTL(lawTocIdList), xgetCValueLawTocId(), "LAW_TOC_ID");
    }

    protected void regLawTocId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawTocId(), "LAW_TOC_ID"); }
    protected abstract ConditionValue xgetCValueLawTocId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
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
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
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
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param lawHistoryId The value of lawHistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_GreaterThan(Integer lawHistoryId) {
        regLawHistoryId(CK_GT, lawHistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param lawHistoryId The value of lawHistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_LessThan(Integer lawHistoryId) {
        regLawHistoryId(CK_LT, lawHistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param lawHistoryId The value of lawHistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_GreaterEqual(Integer lawHistoryId) {
        regLawHistoryId(CK_GE, lawHistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param lawHistoryId The value of lawHistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawHistoryId_LessEqual(Integer lawHistoryId) {
        regLawHistoryId(CK_LE, lawHistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
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
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param minNumber The min number of lawHistoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawHistoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawHistoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawHistoryId(), "LAW_HISTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
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
     * (法令履歴ID)LAW_HISTORY_ID: {IX, NotNull, INT(10), FK to LAW_HISTORY}
     * @param lawHistoryIdList The collection of lawHistoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawHistoryId_NotInScope(Collection<Integer> lawHistoryIdList) {
        doSetLawHistoryId_NotInScope(lawHistoryIdList);
    }

    protected void doSetLawHistoryId_NotInScope(Collection<Integer> lawHistoryIdList) {
        regINS(CK_NINS, cTL(lawHistoryIdList), xgetCValueLawHistoryId(), "LAW_HISTORY_ID");
    }

    protected void regLawHistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawHistoryId(), "LAW_HISTORY_ID"); }
    protected abstract ConditionValue xgetCValueLawHistoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumber The value of articleNumber as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleNumber_Equal(String articleNumber) {
        doSetArticleNumber_Equal(fRES(articleNumber));
    }

    protected void doSetArticleNumber_Equal(String articleNumber) {
        regArticleNumber(CK_EQ, articleNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumber The value of articleNumber as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleNumber_NotEqual(String articleNumber) {
        doSetArticleNumber_NotEqual(fRES(articleNumber));
    }

    protected void doSetArticleNumber_NotEqual(String articleNumber) {
        regArticleNumber(CK_NES, articleNumber);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumberList The collection of articleNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleNumber_InScope(Collection<String> articleNumberList) {
        doSetArticleNumber_InScope(articleNumberList);
    }

    protected void doSetArticleNumber_InScope(Collection<String> articleNumberList) {
        regINS(CK_INS, cTL(articleNumberList), xgetCValueArticleNumber(), "ARTICLE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumberList The collection of articleNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleNumber_NotInScope(Collection<String> articleNumberList) {
        doSetArticleNumber_NotInScope(articleNumberList);
    }

    protected void doSetArticleNumber_NotInScope(Collection<String> articleNumberList) {
        regINS(CK_NINS, cTL(articleNumberList), xgetCValueArticleNumber(), "ARTICLE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)} <br>
     * <pre>e.g. setArticleNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param articleNumber The value of articleNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleNumber_LikeSearch(String articleNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleNumber_LikeSearch(articleNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)} <br>
     * <pre>e.g. setArticleNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param articleNumber The value of articleNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArticleNumber_LikeSearch(String articleNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(articleNumber), xgetCValueArticleNumber(), "ARTICLE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumber The value of articleNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleNumber_NotLikeSearch(String articleNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleNumber_NotLikeSearch(articleNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     * @param articleNumber The value of articleNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArticleNumber_NotLikeSearch(String articleNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(articleNumber), xgetCValueArticleNumber(), "ARTICLE_NUMBER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     */
    public void setArticleNumber_IsNull() { regArticleNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     */
    public void setArticleNumber_IsNullOrEmpty() { regArticleNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (条文番号)ARTICLE_NUMBER: {VARCHAR(20)}
     */
    public void setArticleNumber_IsNotNull() { regArticleNumber(CK_ISNN, DOBJ); }

    protected void regArticleNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleNumber(), "ARTICLE_NUMBER"); }
    protected abstract ConditionValue xgetCValueArticleNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaption The value of articleCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleCaption_Equal(String articleCaption) {
        doSetArticleCaption_Equal(fRES(articleCaption));
    }

    protected void doSetArticleCaption_Equal(String articleCaption) {
        regArticleCaption(CK_EQ, articleCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaption The value of articleCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleCaption_NotEqual(String articleCaption) {
        doSetArticleCaption_NotEqual(fRES(articleCaption));
    }

    protected void doSetArticleCaption_NotEqual(String articleCaption) {
        regArticleCaption(CK_NES, articleCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaptionList The collection of articleCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleCaption_InScope(Collection<String> articleCaptionList) {
        doSetArticleCaption_InScope(articleCaptionList);
    }

    protected void doSetArticleCaption_InScope(Collection<String> articleCaptionList) {
        regINS(CK_INS, cTL(articleCaptionList), xgetCValueArticleCaption(), "ARTICLE_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaptionList The collection of articleCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleCaption_NotInScope(Collection<String> articleCaptionList) {
        doSetArticleCaption_NotInScope(articleCaptionList);
    }

    protected void doSetArticleCaption_NotInScope(Collection<String> articleCaptionList) {
        regINS(CK_NINS, cTL(articleCaptionList), xgetCValueArticleCaption(), "ARTICLE_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setArticleCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param articleCaption The value of articleCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleCaption_LikeSearch(String articleCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleCaption_LikeSearch(articleCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setArticleCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param articleCaption The value of articleCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArticleCaption_LikeSearch(String articleCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(articleCaption), xgetCValueArticleCaption(), "ARTICLE_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaption The value of articleCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleCaption_NotLikeSearch(String articleCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleCaption_NotLikeSearch(articleCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     * @param articleCaption The value of articleCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArticleCaption_NotLikeSearch(String articleCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(articleCaption), xgetCValueArticleCaption(), "ARTICLE_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     */
    public void setArticleCaption_IsNull() { regArticleCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     */
    public void setArticleCaption_IsNullOrEmpty() { regArticleCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (条文見出し)ARTICLE_CAPTION: {VARCHAR(200)}
     */
    public void setArticleCaption_IsNotNull() { regArticleCaption(CK_ISNN, DOBJ); }

    protected void regArticleCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleCaption(), "ARTICLE_CAPTION"); }
    protected abstract ConditionValue xgetCValueArticleCaption();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitle The value of articleTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleTitle_Equal(String articleTitle) {
        doSetArticleTitle_Equal(fRES(articleTitle));
    }

    protected void doSetArticleTitle_Equal(String articleTitle) {
        regArticleTitle(CK_EQ, articleTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitle The value of articleTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleTitle_NotEqual(String articleTitle) {
        doSetArticleTitle_NotEqual(fRES(articleTitle));
    }

    protected void doSetArticleTitle_NotEqual(String articleTitle) {
        regArticleTitle(CK_NES, articleTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitleList The collection of articleTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleTitle_InScope(Collection<String> articleTitleList) {
        doSetArticleTitle_InScope(articleTitleList);
    }

    protected void doSetArticleTitle_InScope(Collection<String> articleTitleList) {
        regINS(CK_INS, cTL(articleTitleList), xgetCValueArticleTitle(), "ARTICLE_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitleList The collection of articleTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleTitle_NotInScope(Collection<String> articleTitleList) {
        doSetArticleTitle_NotInScope(articleTitleList);
    }

    protected void doSetArticleTitle_NotInScope(Collection<String> articleTitleList) {
        regINS(CK_NINS, cTL(articleTitleList), xgetCValueArticleTitle(), "ARTICLE_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setArticleTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param articleTitle The value of articleTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleTitle_LikeSearch(String articleTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleTitle_LikeSearch(articleTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setArticleTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param articleTitle The value of articleTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArticleTitle_LikeSearch(String articleTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(articleTitle), xgetCValueArticleTitle(), "ARTICLE_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitle The value of articleTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleTitle_NotLikeSearch(String articleTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleTitle_NotLikeSearch(articleTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     * @param articleTitle The value of articleTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArticleTitle_NotLikeSearch(String articleTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(articleTitle), xgetCValueArticleTitle(), "ARTICLE_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     */
    public void setArticleTitle_IsNull() { regArticleTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     */
    public void setArticleTitle_IsNullOrEmpty() { regArticleTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (条文タイトル)ARTICLE_TITLE: {VARCHAR(100)}
     */
    public void setArticleTitle_IsNotNull() { regArticleTitle(CK_ISNN, DOBJ); }

    protected void regArticleTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleTitle(), "ARTICLE_TITLE"); }
    protected abstract ConditionValue xgetCValueArticleTitle();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_Equal(Integer articleDisplayOrder) {
        doSetArticleDisplayOrder_Equal(articleDisplayOrder);
    }

    protected void doSetArticleDisplayOrder_Equal(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_EQ, articleDisplayOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_NotEqual(Integer articleDisplayOrder) {
        doSetArticleDisplayOrder_NotEqual(articleDisplayOrder);
    }

    protected void doSetArticleDisplayOrder_NotEqual(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_NES, articleDisplayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_GreaterThan(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_GT, articleDisplayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_LessThan(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_LT, articleDisplayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_GreaterEqual(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_GE, articleDisplayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrder The value of articleDisplayOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleDisplayOrder_LessEqual(Integer articleDisplayOrder) {
        regArticleDisplayOrder(CK_LE, articleDisplayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of articleDisplayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleDisplayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArticleDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArticleDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of articleDisplayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleDisplayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArticleDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArticleDisplayOrder(), "ARTICLE_DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrderList The collection of articleDisplayOrder as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleDisplayOrder_InScope(Collection<Integer> articleDisplayOrderList) {
        doSetArticleDisplayOrder_InScope(articleDisplayOrderList);
    }

    protected void doSetArticleDisplayOrder_InScope(Collection<Integer> articleDisplayOrderList) {
        regINS(CK_INS, cTL(articleDisplayOrderList), xgetCValueArticleDisplayOrder(), "ARTICLE_DISPLAY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文整列順)ARTICLE_DISPLAY_ORDER: {NotNull, INT(10)}
     * @param articleDisplayOrderList The collection of articleDisplayOrder as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleDisplayOrder_NotInScope(Collection<Integer> articleDisplayOrderList) {
        doSetArticleDisplayOrder_NotInScope(articleDisplayOrderList);
    }

    protected void doSetArticleDisplayOrder_NotInScope(Collection<Integer> articleDisplayOrderList) {
        regINS(CK_NINS, cTL(articleDisplayOrderList), xgetCValueArticleDisplayOrder(), "ARTICLE_DISPLAY_ORDER");
    }

    protected void regArticleDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleDisplayOrder(), "ARTICLE_DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueArticleDisplayOrder();

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
    public HpSLCFunction<ArticleCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ArticleCB.class);
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
    public HpSLCFunction<ArticleCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ArticleCB.class);
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
    public HpSLCFunction<ArticleCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ArticleCB.class);
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
    public HpSLCFunction<ArticleCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ArticleCB.class);
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
    public HpSLCFunction<ArticleCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ArticleCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ArticleCB&gt;() {
     *     public void query(ArticleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArticleCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ArticleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ArticleCQ sq);

    protected ArticleCB xcreateScalarConditionCB() {
        ArticleCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ArticleCB xcreateScalarConditionPartitionByCB() {
        ArticleCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ArticleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = new ArticleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARTICLE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ArticleCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ArticleCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ArticleCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = new ArticleCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARTICLE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ArticleCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ArticleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleCB cb = new ArticleCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ArticleCQ sq);

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
    protected ArticleCB newMyCB() {
        return new ArticleCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ArticleCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
