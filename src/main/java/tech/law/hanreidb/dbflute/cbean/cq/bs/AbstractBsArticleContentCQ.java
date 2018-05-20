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
 * The abstract condition-query of ARTICLE_CONTENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsArticleContentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsArticleContentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "ARTICLE_CONTENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_Equal(Long articleContentId) {
        doSetArticleContentId_Equal(articleContentId);
    }

    protected void doSetArticleContentId_Equal(Long articleContentId) {
        regArticleContentId(CK_EQ, articleContentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_NotEqual(Long articleContentId) {
        doSetArticleContentId_NotEqual(articleContentId);
    }

    protected void doSetArticleContentId_NotEqual(Long articleContentId) {
        regArticleContentId(CK_NES, articleContentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_GreaterThan(Long articleContentId) {
        regArticleContentId(CK_GT, articleContentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_LessThan(Long articleContentId) {
        regArticleContentId(CK_LT, articleContentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_GreaterEqual(Long articleContentId) {
        regArticleContentId(CK_GE, articleContentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentId The value of articleContentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleContentId_LessEqual(Long articleContentId) {
        regArticleContentId(CK_LE, articleContentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of articleContentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleContentId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArticleContentId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArticleContentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of articleContentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleContentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArticleContentId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArticleContentId(), "ARTICLE_CONTENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentIdList The collection of articleContentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleContentId_InScope(Collection<Long> articleContentIdList) {
        doSetArticleContentId_InScope(articleContentIdList);
    }

    protected void doSetArticleContentId_InScope(Collection<Long> articleContentIdList) {
        regINS(CK_INS, cTL(articleContentIdList), xgetCValueArticleContentId(), "ARTICLE_CONTENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param articleContentIdList The collection of articleContentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleContentId_NotInScope(Collection<Long> articleContentIdList) {
        doSetArticleContentId_NotInScope(articleContentIdList);
    }

    protected void doSetArticleContentId_NotInScope(Collection<Long> articleContentIdList) {
        regINS(CK_NINS, cTL(articleContentIdList), xgetCValueArticleContentId(), "ARTICLE_CONTENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setArticleContentId_IsNull() { regArticleContentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (条文内容ID)ARTICLE_CONTENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setArticleContentId_IsNotNull() { regArticleContentId(CK_ISNN, DOBJ); }

    protected void regArticleContentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleContentId(), "ARTICLE_CONTENT_ID"); }
    protected abstract ConditionValue xgetCValueArticleContentId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
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
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
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
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterThan(Long articleId) {
        regArticleId(CK_GT, articleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessThan(Long articleId) {
        regArticleId(CK_LT, articleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterEqual(Long articleId) {
        regArticleId(CK_GE, articleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessEqual(Long articleId) {
        regArticleId(CK_LE, articleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
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
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param minNumber The min number of articleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArticleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArticleId(), "ARTICLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
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
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleIdList The collection of articleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleId_NotInScope(Collection<Long> articleIdList) {
        doSetArticleId_NotInScope(articleIdList);
    }

    protected void doSetArticleId_NotInScope(Collection<Long> articleIdList) {
        regINS(CK_NINS, cTL(articleIdList), xgetCValueArticleId(), "ARTICLE_ID");
    }

    protected void regArticleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleId(), "ARTICLE_ID"); }
    protected abstract ConditionValue xgetCValueArticleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param articleContentRawXml The value of articleContentRawXml as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleContentRawXml_Equal(String articleContentRawXml) {
        doSetArticleContentRawXml_Equal(fRES(articleContentRawXml));
    }

    protected void doSetArticleContentRawXml_Equal(String articleContentRawXml) {
        regArticleContentRawXml(CK_EQ, articleContentRawXml);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setArticleContentRawXml_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param articleContentRawXml The value of articleContentRawXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleContentRawXml_LikeSearch(String articleContentRawXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleContentRawXml_LikeSearch(articleContentRawXml, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setArticleContentRawXml_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param articleContentRawXml The value of articleContentRawXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArticleContentRawXml_LikeSearch(String articleContentRawXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(articleContentRawXml), xgetCValueArticleContentRawXml(), "ARTICLE_CONTENT_RAW_XML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param articleContentRawXml The value of articleContentRawXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleContentRawXml_NotLikeSearch(String articleContentRawXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleContentRawXml_NotLikeSearch(articleContentRawXml, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容加工前XML)ARTICLE_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param articleContentRawXml The value of articleContentRawXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArticleContentRawXml_NotLikeSearch(String articleContentRawXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(articleContentRawXml), xgetCValueArticleContentRawXml(), "ARTICLE_CONTENT_RAW_XML", likeSearchOption);
    }

    protected void regArticleContentRawXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleContentRawXml(), "ARTICLE_CONTENT_RAW_XML"); }
    protected abstract ConditionValue xgetCValueArticleContentRawXml();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param articleContentViewXml The value of articleContentViewXml as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleContentViewXml_Equal(String articleContentViewXml) {
        doSetArticleContentViewXml_Equal(fRES(articleContentViewXml));
    }

    protected void doSetArticleContentViewXml_Equal(String articleContentViewXml) {
        regArticleContentViewXml(CK_EQ, articleContentViewXml);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setArticleContentViewXml_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param articleContentViewXml The value of articleContentViewXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleContentViewXml_LikeSearch(String articleContentViewXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleContentViewXml_LikeSearch(articleContentViewXml, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setArticleContentViewXml_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param articleContentViewXml The value of articleContentViewXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setArticleContentViewXml_LikeSearch(String articleContentViewXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(articleContentViewXml), xgetCValueArticleContentViewXml(), "ARTICLE_CONTENT_VIEW_XML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param articleContentViewXml The value of articleContentViewXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setArticleContentViewXml_NotLikeSearch(String articleContentViewXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setArticleContentViewXml_NotLikeSearch(articleContentViewXml, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (条文内容画面用XML)ARTICLE_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param articleContentViewXml The value of articleContentViewXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setArticleContentViewXml_NotLikeSearch(String articleContentViewXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(articleContentViewXml), xgetCValueArticleContentViewXml(), "ARTICLE_CONTENT_VIEW_XML", likeSearchOption);
    }

    protected void regArticleContentViewXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleContentViewXml(), "ARTICLE_CONTENT_VIEW_XML"); }
    protected abstract ConditionValue xgetCValueArticleContentViewXml();

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
    public HpSLCFunction<ArticleContentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ArticleContentCB.class);
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
    public HpSLCFunction<ArticleContentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ArticleContentCB.class);
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
    public HpSLCFunction<ArticleContentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ArticleContentCB.class);
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
    public HpSLCFunction<ArticleContentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ArticleContentCB.class);
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
    public HpSLCFunction<ArticleContentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ArticleContentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ArticleContentCB&gt;() {
     *     public void query(ArticleContentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ArticleContentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ArticleContentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleContentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ArticleContentCQ sq);

    protected ArticleContentCB xcreateScalarConditionCB() {
        ArticleContentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ArticleContentCB xcreateScalarConditionPartitionByCB() {
        ArticleContentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ArticleContentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ARTICLE_CONTENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ArticleContentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ArticleContentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ArticleContentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ARTICLE_CONTENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ArticleContentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ArticleContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleContentCB cb = new ArticleContentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ArticleContentCQ sq);

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
    protected ArticleContentCB newMyCB() {
        return new ArticleContentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ArticleContentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
