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
 * The abstract condition-query of LAW_TOC.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawTocCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawTocCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_TOC";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawTocId The value of lawTocId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_GreaterThan(Long lawTocId) {
        regLawTocId(CK_GT, lawTocId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawTocId The value of lawTocId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_LessThan(Long lawTocId) {
        regLawTocId(CK_LT, lawTocId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawTocId The value of lawTocId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_GreaterEqual(Long lawTocId) {
        regLawTocId(CK_GE, lawTocId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawTocId The value of lawTocId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawTocId_LessEqual(Long lawTocId) {
        regLawTocId(CK_LE, lawTocId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of lawTocId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawTocId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawTocId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawTocId(), "LAW_TOC_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawTocIdList The collection of lawTocId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawTocId_NotInScope(Collection<Long> lawTocIdList) {
        doSetLawTocId_NotInScope(lawTocIdList);
    }

    protected void doSetLawTocId_NotInScope(Collection<Long> lawTocIdList) {
        regINS(CK_NINS, cTL(lawTocIdList), xgetCValueLawTocId(), "LAW_TOC_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LAW_TOC_ID from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_TOC_ID, named 'articleAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawTocId_ExistsReferrer_ArticleList(cb.query());
        registerExistsReferrer(cb.query(), "LAW_TOC_ID", "LAW_TOC_ID", pp, "articleList");
    }
    public abstract String keepLawTocId_ExistsReferrer_ArticleList(ArticleCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LAW_TOC_ID from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_TOC_ID, named 'articleAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsArticle</span>(articleCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     articleCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LawTocId_NotExistsReferrer_ArticleList for 'not exists'. (NotNull)
     */
    public void notExistsArticle(SubQuery<ArticleCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ArticleCB cb = new ArticleCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepLawTocId_NotExistsReferrer_ArticleList(cb.query());
        registerNotExistsReferrer(cb.query(), "LAW_TOC_ID", "LAW_TOC_ID", pp, "articleList");
    }
    public abstract String keepLawTocId_NotExistsReferrer_ArticleList(ArticleCQ sq);

    public void xsderiveArticleList(String fn, SubQuery<ArticleCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ArticleCB cb = new ArticleCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepLawTocId_SpecifyDerivedReferrer_ArticleList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "LAW_TOC_ID", "LAW_TOC_ID", pp, "articleList", al, op);
    }
    public abstract String keepLawTocId_SpecifyDerivedReferrer_ArticleList(ArticleCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ARTICLE where ...)} <br>
     * (条文)ARTICLE by LAW_TOC_ID, named 'articleAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepLawTocId_QueryDerivedReferrer_ArticleList(cb.query()); String prpp = keepLawTocId_QueryDerivedReferrer_ArticleListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "LAW_TOC_ID", "LAW_TOC_ID", sqpp, "articleList", rd, vl, prpp, op);
    }
    public abstract String keepLawTocId_QueryDerivedReferrer_ArticleList(ArticleCQ sq);
    public abstract String keepLawTocId_QueryDerivedReferrer_ArticleListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawTocId_IsNull() { regLawTocId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令目次ID)LAW_TOC_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawTocId_IsNotNull() { regLawTocId(CK_ISNN, DOBJ); }

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_Equal(Integer partNumber) {
        doSetPartNumber_Equal(partNumber);
    }

    protected void doSetPartNumber_Equal(Integer partNumber) {
        regPartNumber(CK_EQ, partNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_NotEqual(Integer partNumber) {
        doSetPartNumber_NotEqual(partNumber);
    }

    protected void doSetPartNumber_NotEqual(Integer partNumber) {
        regPartNumber(CK_NES, partNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_GreaterThan(Integer partNumber) {
        regPartNumber(CK_GT, partNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_LessThan(Integer partNumber) {
        regPartNumber(CK_LT, partNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_GreaterEqual(Integer partNumber) {
        regPartNumber(CK_GE, partNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumber The value of partNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPartNumber_LessEqual(Integer partNumber) {
        regPartNumber(CK_LE, partNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param minNumber The min number of partNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPartNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPartNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param minNumber The min number of partNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of partNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPartNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePartNumber(), "PART_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumberList The collection of partNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartNumber_InScope(Collection<Integer> partNumberList) {
        doSetPartNumber_InScope(partNumberList);
    }

    protected void doSetPartNumber_InScope(Collection<Integer> partNumberList) {
        regINS(CK_INS, cTL(partNumberList), xgetCValuePartNumber(), "PART_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     * @param partNumberList The collection of partNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartNumber_NotInScope(Collection<Integer> partNumberList) {
        doSetPartNumber_NotInScope(partNumberList);
    }

    protected void doSetPartNumber_NotInScope(Collection<Integer> partNumberList) {
        regINS(CK_NINS, cTL(partNumberList), xgetCValuePartNumber(), "PART_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     */
    public void setPartNumber_IsNull() { regPartNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (編番号)PART_NUMBER: {INT(10)}
     */
    public void setPartNumber_IsNotNull() { regPartNumber(CK_ISNN, DOBJ); }

    protected void regPartNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartNumber(), "PART_NUMBER"); }
    protected abstract ConditionValue xgetCValuePartNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitle The value of partTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartTitle_Equal(String partTitle) {
        doSetPartTitle_Equal(fRES(partTitle));
    }

    protected void doSetPartTitle_Equal(String partTitle) {
        regPartTitle(CK_EQ, partTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitle The value of partTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartTitle_NotEqual(String partTitle) {
        doSetPartTitle_NotEqual(fRES(partTitle));
    }

    protected void doSetPartTitle_NotEqual(String partTitle) {
        regPartTitle(CK_NES, partTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitleList The collection of partTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartTitle_InScope(Collection<String> partTitleList) {
        doSetPartTitle_InScope(partTitleList);
    }

    protected void doSetPartTitle_InScope(Collection<String> partTitleList) {
        regINS(CK_INS, cTL(partTitleList), xgetCValuePartTitle(), "PART_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitleList The collection of partTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartTitle_NotInScope(Collection<String> partTitleList) {
        doSetPartTitle_NotInScope(partTitleList);
    }

    protected void doSetPartTitle_NotInScope(Collection<String> partTitleList) {
        regINS(CK_NINS, cTL(partTitleList), xgetCValuePartTitle(), "PART_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setPartTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param partTitle The value of partTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartTitle_LikeSearch(String partTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartTitle_LikeSearch(partTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setPartTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param partTitle The value of partTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPartTitle_LikeSearch(String partTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partTitle), xgetCValuePartTitle(), "PART_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitle The value of partTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartTitle_NotLikeSearch(String partTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartTitle_NotLikeSearch(partTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     * @param partTitle The value of partTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPartTitle_NotLikeSearch(String partTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partTitle), xgetCValuePartTitle(), "PART_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     */
    public void setPartTitle_IsNull() { regPartTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     */
    public void setPartTitle_IsNullOrEmpty() { regPartTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (編タイトル)PART_TITLE: {VARCHAR(100)}
     */
    public void setPartTitle_IsNotNull() { regPartTitle(CK_ISNN, DOBJ); }

    protected void regPartTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartTitle(), "PART_TITLE"); }
    protected abstract ConditionValue xgetCValuePartTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaption The value of partCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartCaption_Equal(String partCaption) {
        doSetPartCaption_Equal(fRES(partCaption));
    }

    protected void doSetPartCaption_Equal(String partCaption) {
        regPartCaption(CK_EQ, partCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaption The value of partCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartCaption_NotEqual(String partCaption) {
        doSetPartCaption_NotEqual(fRES(partCaption));
    }

    protected void doSetPartCaption_NotEqual(String partCaption) {
        regPartCaption(CK_NES, partCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaptionList The collection of partCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartCaption_InScope(Collection<String> partCaptionList) {
        doSetPartCaption_InScope(partCaptionList);
    }

    protected void doSetPartCaption_InScope(Collection<String> partCaptionList) {
        regINS(CK_INS, cTL(partCaptionList), xgetCValuePartCaption(), "PART_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaptionList The collection of partCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPartCaption_NotInScope(Collection<String> partCaptionList) {
        doSetPartCaption_NotInScope(partCaptionList);
    }

    protected void doSetPartCaption_NotInScope(Collection<String> partCaptionList) {
        regINS(CK_NINS, cTL(partCaptionList), xgetCValuePartCaption(), "PART_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setPartCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param partCaption The value of partCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartCaption_LikeSearch(String partCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartCaption_LikeSearch(partCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setPartCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param partCaption The value of partCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPartCaption_LikeSearch(String partCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partCaption), xgetCValuePartCaption(), "PART_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaption The value of partCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPartCaption_NotLikeSearch(String partCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPartCaption_NotLikeSearch(partCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     * @param partCaption The value of partCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPartCaption_NotLikeSearch(String partCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partCaption), xgetCValuePartCaption(), "PART_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     */
    public void setPartCaption_IsNull() { regPartCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     */
    public void setPartCaption_IsNullOrEmpty() { regPartCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (編見出し)PART_CAPTION: {VARCHAR(200)}
     */
    public void setPartCaption_IsNotNull() { regPartCaption(CK_ISNN, DOBJ); }

    protected void regPartCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePartCaption(), "PART_CAPTION"); }
    protected abstract ConditionValue xgetCValuePartCaption();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_Equal(Integer chapterNumber) {
        doSetChapterNumber_Equal(chapterNumber);
    }

    protected void doSetChapterNumber_Equal(Integer chapterNumber) {
        regChapterNumber(CK_EQ, chapterNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_NotEqual(Integer chapterNumber) {
        doSetChapterNumber_NotEqual(chapterNumber);
    }

    protected void doSetChapterNumber_NotEqual(Integer chapterNumber) {
        regChapterNumber(CK_NES, chapterNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_GreaterThan(Integer chapterNumber) {
        regChapterNumber(CK_GT, chapterNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_LessThan(Integer chapterNumber) {
        regChapterNumber(CK_LT, chapterNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_GreaterEqual(Integer chapterNumber) {
        regChapterNumber(CK_GE, chapterNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumber The value of chapterNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setChapterNumber_LessEqual(Integer chapterNumber) {
        regChapterNumber(CK_LE, chapterNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param minNumber The min number of chapterNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of chapterNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setChapterNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setChapterNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param minNumber The min number of chapterNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of chapterNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setChapterNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueChapterNumber(), "CHAPTER_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumberList The collection of chapterNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterNumber_InScope(Collection<Integer> chapterNumberList) {
        doSetChapterNumber_InScope(chapterNumberList);
    }

    protected void doSetChapterNumber_InScope(Collection<Integer> chapterNumberList) {
        regINS(CK_INS, cTL(chapterNumberList), xgetCValueChapterNumber(), "CHAPTER_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     * @param chapterNumberList The collection of chapterNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterNumber_NotInScope(Collection<Integer> chapterNumberList) {
        doSetChapterNumber_NotInScope(chapterNumberList);
    }

    protected void doSetChapterNumber_NotInScope(Collection<Integer> chapterNumberList) {
        regINS(CK_NINS, cTL(chapterNumberList), xgetCValueChapterNumber(), "CHAPTER_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     */
    public void setChapterNumber_IsNull() { regChapterNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (章番号)CHAPTER_NUMBER: {INT(10)}
     */
    public void setChapterNumber_IsNotNull() { regChapterNumber(CK_ISNN, DOBJ); }

    protected void regChapterNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChapterNumber(), "CHAPTER_NUMBER"); }
    protected abstract ConditionValue xgetCValueChapterNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitle The value of chapterTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterTitle_Equal(String chapterTitle) {
        doSetChapterTitle_Equal(fRES(chapterTitle));
    }

    protected void doSetChapterTitle_Equal(String chapterTitle) {
        regChapterTitle(CK_EQ, chapterTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitle The value of chapterTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterTitle_NotEqual(String chapterTitle) {
        doSetChapterTitle_NotEqual(fRES(chapterTitle));
    }

    protected void doSetChapterTitle_NotEqual(String chapterTitle) {
        regChapterTitle(CK_NES, chapterTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitleList The collection of chapterTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterTitle_InScope(Collection<String> chapterTitleList) {
        doSetChapterTitle_InScope(chapterTitleList);
    }

    protected void doSetChapterTitle_InScope(Collection<String> chapterTitleList) {
        regINS(CK_INS, cTL(chapterTitleList), xgetCValueChapterTitle(), "CHAPTER_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitleList The collection of chapterTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterTitle_NotInScope(Collection<String> chapterTitleList) {
        doSetChapterTitle_NotInScope(chapterTitleList);
    }

    protected void doSetChapterTitle_NotInScope(Collection<String> chapterTitleList) {
        regINS(CK_NINS, cTL(chapterTitleList), xgetCValueChapterTitle(), "CHAPTER_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setChapterTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param chapterTitle The value of chapterTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChapterTitle_LikeSearch(String chapterTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChapterTitle_LikeSearch(chapterTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setChapterTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param chapterTitle The value of chapterTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setChapterTitle_LikeSearch(String chapterTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(chapterTitle), xgetCValueChapterTitle(), "CHAPTER_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitle The value of chapterTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChapterTitle_NotLikeSearch(String chapterTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChapterTitle_NotLikeSearch(chapterTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     * @param chapterTitle The value of chapterTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setChapterTitle_NotLikeSearch(String chapterTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chapterTitle), xgetCValueChapterTitle(), "CHAPTER_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     */
    public void setChapterTitle_IsNull() { regChapterTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     */
    public void setChapterTitle_IsNullOrEmpty() { regChapterTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (章タイトル)CHAPTER_TITLE: {VARCHAR(100)}
     */
    public void setChapterTitle_IsNotNull() { regChapterTitle(CK_ISNN, DOBJ); }

    protected void regChapterTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChapterTitle(), "CHAPTER_TITLE"); }
    protected abstract ConditionValue xgetCValueChapterTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaption The value of chapterCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterCaption_Equal(String chapterCaption) {
        doSetChapterCaption_Equal(fRES(chapterCaption));
    }

    protected void doSetChapterCaption_Equal(String chapterCaption) {
        regChapterCaption(CK_EQ, chapterCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaption The value of chapterCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterCaption_NotEqual(String chapterCaption) {
        doSetChapterCaption_NotEqual(fRES(chapterCaption));
    }

    protected void doSetChapterCaption_NotEqual(String chapterCaption) {
        regChapterCaption(CK_NES, chapterCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaptionList The collection of chapterCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterCaption_InScope(Collection<String> chapterCaptionList) {
        doSetChapterCaption_InScope(chapterCaptionList);
    }

    protected void doSetChapterCaption_InScope(Collection<String> chapterCaptionList) {
        regINS(CK_INS, cTL(chapterCaptionList), xgetCValueChapterCaption(), "CHAPTER_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaptionList The collection of chapterCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setChapterCaption_NotInScope(Collection<String> chapterCaptionList) {
        doSetChapterCaption_NotInScope(chapterCaptionList);
    }

    protected void doSetChapterCaption_NotInScope(Collection<String> chapterCaptionList) {
        regINS(CK_NINS, cTL(chapterCaptionList), xgetCValueChapterCaption(), "CHAPTER_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setChapterCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param chapterCaption The value of chapterCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChapterCaption_LikeSearch(String chapterCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChapterCaption_LikeSearch(chapterCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setChapterCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param chapterCaption The value of chapterCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setChapterCaption_LikeSearch(String chapterCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(chapterCaption), xgetCValueChapterCaption(), "CHAPTER_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaption The value of chapterCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setChapterCaption_NotLikeSearch(String chapterCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setChapterCaption_NotLikeSearch(chapterCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     * @param chapterCaption The value of chapterCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setChapterCaption_NotLikeSearch(String chapterCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(chapterCaption), xgetCValueChapterCaption(), "CHAPTER_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     */
    public void setChapterCaption_IsNull() { regChapterCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     */
    public void setChapterCaption_IsNullOrEmpty() { regChapterCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (章見出し)CHAPTER_CAPTION: {VARCHAR(200)}
     */
    public void setChapterCaption_IsNotNull() { regChapterCaption(CK_ISNN, DOBJ); }

    protected void regChapterCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueChapterCaption(), "CHAPTER_CAPTION"); }
    protected abstract ConditionValue xgetCValueChapterCaption();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_Equal(Integer sectionNumber) {
        doSetSectionNumber_Equal(sectionNumber);
    }

    protected void doSetSectionNumber_Equal(Integer sectionNumber) {
        regSectionNumber(CK_EQ, sectionNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_NotEqual(Integer sectionNumber) {
        doSetSectionNumber_NotEqual(sectionNumber);
    }

    protected void doSetSectionNumber_NotEqual(Integer sectionNumber) {
        regSectionNumber(CK_NES, sectionNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_GreaterThan(Integer sectionNumber) {
        regSectionNumber(CK_GT, sectionNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_LessThan(Integer sectionNumber) {
        regSectionNumber(CK_LT, sectionNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_GreaterEqual(Integer sectionNumber) {
        regSectionNumber(CK_GE, sectionNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumber The value of sectionNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSectionNumber_LessEqual(Integer sectionNumber) {
        regSectionNumber(CK_LE, sectionNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param minNumber The min number of sectionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sectionNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSectionNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSectionNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param minNumber The min number of sectionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sectionNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSectionNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSectionNumber(), "SECTION_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumberList The collection of sectionNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionNumber_InScope(Collection<Integer> sectionNumberList) {
        doSetSectionNumber_InScope(sectionNumberList);
    }

    protected void doSetSectionNumber_InScope(Collection<Integer> sectionNumberList) {
        regINS(CK_INS, cTL(sectionNumberList), xgetCValueSectionNumber(), "SECTION_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     * @param sectionNumberList The collection of sectionNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionNumber_NotInScope(Collection<Integer> sectionNumberList) {
        doSetSectionNumber_NotInScope(sectionNumberList);
    }

    protected void doSetSectionNumber_NotInScope(Collection<Integer> sectionNumberList) {
        regINS(CK_NINS, cTL(sectionNumberList), xgetCValueSectionNumber(), "SECTION_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     */
    public void setSectionNumber_IsNull() { regSectionNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (節番号)SECTION_NUMBER: {INT(10)}
     */
    public void setSectionNumber_IsNotNull() { regSectionNumber(CK_ISNN, DOBJ); }

    protected void regSectionNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSectionNumber(), "SECTION_NUMBER"); }
    protected abstract ConditionValue xgetCValueSectionNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitle The value of sectionTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionTitle_Equal(String sectionTitle) {
        doSetSectionTitle_Equal(fRES(sectionTitle));
    }

    protected void doSetSectionTitle_Equal(String sectionTitle) {
        regSectionTitle(CK_EQ, sectionTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitle The value of sectionTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionTitle_NotEqual(String sectionTitle) {
        doSetSectionTitle_NotEqual(fRES(sectionTitle));
    }

    protected void doSetSectionTitle_NotEqual(String sectionTitle) {
        regSectionTitle(CK_NES, sectionTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitleList The collection of sectionTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionTitle_InScope(Collection<String> sectionTitleList) {
        doSetSectionTitle_InScope(sectionTitleList);
    }

    protected void doSetSectionTitle_InScope(Collection<String> sectionTitleList) {
        regINS(CK_INS, cTL(sectionTitleList), xgetCValueSectionTitle(), "SECTION_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitleList The collection of sectionTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionTitle_NotInScope(Collection<String> sectionTitleList) {
        doSetSectionTitle_NotInScope(sectionTitleList);
    }

    protected void doSetSectionTitle_NotInScope(Collection<String> sectionTitleList) {
        regINS(CK_NINS, cTL(sectionTitleList), xgetCValueSectionTitle(), "SECTION_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setSectionTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sectionTitle The value of sectionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSectionTitle_LikeSearch(String sectionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSectionTitle_LikeSearch(sectionTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setSectionTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sectionTitle The value of sectionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSectionTitle_LikeSearch(String sectionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sectionTitle), xgetCValueSectionTitle(), "SECTION_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitle The value of sectionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSectionTitle_NotLikeSearch(String sectionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSectionTitle_NotLikeSearch(sectionTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     * @param sectionTitle The value of sectionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSectionTitle_NotLikeSearch(String sectionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sectionTitle), xgetCValueSectionTitle(), "SECTION_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     */
    public void setSectionTitle_IsNull() { regSectionTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     */
    public void setSectionTitle_IsNullOrEmpty() { regSectionTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (節タイトル)SECTION_TITLE: {VARCHAR(100)}
     */
    public void setSectionTitle_IsNotNull() { regSectionTitle(CK_ISNN, DOBJ); }

    protected void regSectionTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSectionTitle(), "SECTION_TITLE"); }
    protected abstract ConditionValue xgetCValueSectionTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaption The value of sectionCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionCaption_Equal(String sectionCaption) {
        doSetSectionCaption_Equal(fRES(sectionCaption));
    }

    protected void doSetSectionCaption_Equal(String sectionCaption) {
        regSectionCaption(CK_EQ, sectionCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaption The value of sectionCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionCaption_NotEqual(String sectionCaption) {
        doSetSectionCaption_NotEqual(fRES(sectionCaption));
    }

    protected void doSetSectionCaption_NotEqual(String sectionCaption) {
        regSectionCaption(CK_NES, sectionCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaptionList The collection of sectionCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionCaption_InScope(Collection<String> sectionCaptionList) {
        doSetSectionCaption_InScope(sectionCaptionList);
    }

    protected void doSetSectionCaption_InScope(Collection<String> sectionCaptionList) {
        regINS(CK_INS, cTL(sectionCaptionList), xgetCValueSectionCaption(), "SECTION_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaptionList The collection of sectionCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSectionCaption_NotInScope(Collection<String> sectionCaptionList) {
        doSetSectionCaption_NotInScope(sectionCaptionList);
    }

    protected void doSetSectionCaption_NotInScope(Collection<String> sectionCaptionList) {
        regINS(CK_NINS, cTL(sectionCaptionList), xgetCValueSectionCaption(), "SECTION_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setSectionCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param sectionCaption The value of sectionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSectionCaption_LikeSearch(String sectionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSectionCaption_LikeSearch(sectionCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setSectionCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sectionCaption The value of sectionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSectionCaption_LikeSearch(String sectionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sectionCaption), xgetCValueSectionCaption(), "SECTION_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaption The value of sectionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSectionCaption_NotLikeSearch(String sectionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSectionCaption_NotLikeSearch(sectionCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     * @param sectionCaption The value of sectionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSectionCaption_NotLikeSearch(String sectionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sectionCaption), xgetCValueSectionCaption(), "SECTION_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSectionCaption_IsNull() { regSectionCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSectionCaption_IsNullOrEmpty() { regSectionCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (節見出し)SECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSectionCaption_IsNotNull() { regSectionCaption(CK_ISNN, DOBJ); }

    protected void regSectionCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSectionCaption(), "SECTION_CAPTION"); }
    protected abstract ConditionValue xgetCValueSectionCaption();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_Equal(Integer subsectionNumber) {
        doSetSubsectionNumber_Equal(subsectionNumber);
    }

    protected void doSetSubsectionNumber_Equal(Integer subsectionNumber) {
        regSubsectionNumber(CK_EQ, subsectionNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_NotEqual(Integer subsectionNumber) {
        doSetSubsectionNumber_NotEqual(subsectionNumber);
    }

    protected void doSetSubsectionNumber_NotEqual(Integer subsectionNumber) {
        regSubsectionNumber(CK_NES, subsectionNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_GreaterThan(Integer subsectionNumber) {
        regSubsectionNumber(CK_GT, subsectionNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_LessThan(Integer subsectionNumber) {
        regSubsectionNumber(CK_LT, subsectionNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_GreaterEqual(Integer subsectionNumber) {
        regSubsectionNumber(CK_GE, subsectionNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumber The value of subsectionNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSubsectionNumber_LessEqual(Integer subsectionNumber) {
        regSubsectionNumber(CK_LE, subsectionNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param minNumber The min number of subsectionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of subsectionNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSubsectionNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSubsectionNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param minNumber The min number of subsectionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of subsectionNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSubsectionNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSubsectionNumber(), "SUBSECTION_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumberList The collection of subsectionNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionNumber_InScope(Collection<Integer> subsectionNumberList) {
        doSetSubsectionNumber_InScope(subsectionNumberList);
    }

    protected void doSetSubsectionNumber_InScope(Collection<Integer> subsectionNumberList) {
        regINS(CK_INS, cTL(subsectionNumberList), xgetCValueSubsectionNumber(), "SUBSECTION_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     * @param subsectionNumberList The collection of subsectionNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionNumber_NotInScope(Collection<Integer> subsectionNumberList) {
        doSetSubsectionNumber_NotInScope(subsectionNumberList);
    }

    protected void doSetSubsectionNumber_NotInScope(Collection<Integer> subsectionNumberList) {
        regINS(CK_NINS, cTL(subsectionNumberList), xgetCValueSubsectionNumber(), "SUBSECTION_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     */
    public void setSubsectionNumber_IsNull() { regSubsectionNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (款番号)SUBSECTION_NUMBER: {INT(10)}
     */
    public void setSubsectionNumber_IsNotNull() { regSubsectionNumber(CK_ISNN, DOBJ); }

    protected void regSubsectionNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubsectionNumber(), "SUBSECTION_NUMBER"); }
    protected abstract ConditionValue xgetCValueSubsectionNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitle The value of subsectionTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionTitle_Equal(String subsectionTitle) {
        doSetSubsectionTitle_Equal(fRES(subsectionTitle));
    }

    protected void doSetSubsectionTitle_Equal(String subsectionTitle) {
        regSubsectionTitle(CK_EQ, subsectionTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitle The value of subsectionTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionTitle_NotEqual(String subsectionTitle) {
        doSetSubsectionTitle_NotEqual(fRES(subsectionTitle));
    }

    protected void doSetSubsectionTitle_NotEqual(String subsectionTitle) {
        regSubsectionTitle(CK_NES, subsectionTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitleList The collection of subsectionTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionTitle_InScope(Collection<String> subsectionTitleList) {
        doSetSubsectionTitle_InScope(subsectionTitleList);
    }

    protected void doSetSubsectionTitle_InScope(Collection<String> subsectionTitleList) {
        regINS(CK_INS, cTL(subsectionTitleList), xgetCValueSubsectionTitle(), "SUBSECTION_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitleList The collection of subsectionTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionTitle_NotInScope(Collection<String> subsectionTitleList) {
        doSetSubsectionTitle_NotInScope(subsectionTitleList);
    }

    protected void doSetSubsectionTitle_NotInScope(Collection<String> subsectionTitleList) {
        regINS(CK_NINS, cTL(subsectionTitleList), xgetCValueSubsectionTitle(), "SUBSECTION_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setSubsectionTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param subsectionTitle The value of subsectionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubsectionTitle_LikeSearch(String subsectionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubsectionTitle_LikeSearch(subsectionTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setSubsectionTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subsectionTitle The value of subsectionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSubsectionTitle_LikeSearch(String subsectionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subsectionTitle), xgetCValueSubsectionTitle(), "SUBSECTION_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitle The value of subsectionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubsectionTitle_NotLikeSearch(String subsectionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubsectionTitle_NotLikeSearch(subsectionTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     * @param subsectionTitle The value of subsectionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSubsectionTitle_NotLikeSearch(String subsectionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subsectionTitle), xgetCValueSubsectionTitle(), "SUBSECTION_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     */
    public void setSubsectionTitle_IsNull() { regSubsectionTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     */
    public void setSubsectionTitle_IsNullOrEmpty() { regSubsectionTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (款タイトル)SUBSECTION_TITLE: {VARCHAR(100)}
     */
    public void setSubsectionTitle_IsNotNull() { regSubsectionTitle(CK_ISNN, DOBJ); }

    protected void regSubsectionTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubsectionTitle(), "SUBSECTION_TITLE"); }
    protected abstract ConditionValue xgetCValueSubsectionTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaption The value of subsectionCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionCaption_Equal(String subsectionCaption) {
        doSetSubsectionCaption_Equal(fRES(subsectionCaption));
    }

    protected void doSetSubsectionCaption_Equal(String subsectionCaption) {
        regSubsectionCaption(CK_EQ, subsectionCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaption The value of subsectionCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionCaption_NotEqual(String subsectionCaption) {
        doSetSubsectionCaption_NotEqual(fRES(subsectionCaption));
    }

    protected void doSetSubsectionCaption_NotEqual(String subsectionCaption) {
        regSubsectionCaption(CK_NES, subsectionCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaptionList The collection of subsectionCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionCaption_InScope(Collection<String> subsectionCaptionList) {
        doSetSubsectionCaption_InScope(subsectionCaptionList);
    }

    protected void doSetSubsectionCaption_InScope(Collection<String> subsectionCaptionList) {
        regINS(CK_INS, cTL(subsectionCaptionList), xgetCValueSubsectionCaption(), "SUBSECTION_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaptionList The collection of subsectionCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSubsectionCaption_NotInScope(Collection<String> subsectionCaptionList) {
        doSetSubsectionCaption_NotInScope(subsectionCaptionList);
    }

    protected void doSetSubsectionCaption_NotInScope(Collection<String> subsectionCaptionList) {
        regINS(CK_NINS, cTL(subsectionCaptionList), xgetCValueSubsectionCaption(), "SUBSECTION_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setSubsectionCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param subsectionCaption The value of subsectionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubsectionCaption_LikeSearch(String subsectionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubsectionCaption_LikeSearch(subsectionCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setSubsectionCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param subsectionCaption The value of subsectionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setSubsectionCaption_LikeSearch(String subsectionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(subsectionCaption), xgetCValueSubsectionCaption(), "SUBSECTION_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaption The value of subsectionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setSubsectionCaption_NotLikeSearch(String subsectionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setSubsectionCaption_NotLikeSearch(subsectionCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     * @param subsectionCaption The value of subsectionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setSubsectionCaption_NotLikeSearch(String subsectionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(subsectionCaption), xgetCValueSubsectionCaption(), "SUBSECTION_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSubsectionCaption_IsNull() { regSubsectionCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSubsectionCaption_IsNullOrEmpty() { regSubsectionCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (款見出し)SUBSECTION_CAPTION: {VARCHAR(200)}
     */
    public void setSubsectionCaption_IsNotNull() { regSubsectionCaption(CK_ISNN, DOBJ); }

    protected void regSubsectionCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSubsectionCaption(), "SUBSECTION_CAPTION"); }
    protected abstract ConditionValue xgetCValueSubsectionCaption();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_Equal(Integer divisionNumber) {
        doSetDivisionNumber_Equal(divisionNumber);
    }

    protected void doSetDivisionNumber_Equal(Integer divisionNumber) {
        regDivisionNumber(CK_EQ, divisionNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_NotEqual(Integer divisionNumber) {
        doSetDivisionNumber_NotEqual(divisionNumber);
    }

    protected void doSetDivisionNumber_NotEqual(Integer divisionNumber) {
        regDivisionNumber(CK_NES, divisionNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_GreaterThan(Integer divisionNumber) {
        regDivisionNumber(CK_GT, divisionNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_LessThan(Integer divisionNumber) {
        regDivisionNumber(CK_LT, divisionNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_GreaterEqual(Integer divisionNumber) {
        regDivisionNumber(CK_GE, divisionNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumber The value of divisionNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDivisionNumber_LessEqual(Integer divisionNumber) {
        regDivisionNumber(CK_LE, divisionNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param minNumber The min number of divisionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of divisionNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDivisionNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDivisionNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param minNumber The min number of divisionNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of divisionNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDivisionNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDivisionNumber(), "DIVISION_NUMBER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumberList The collection of divisionNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionNumber_InScope(Collection<Integer> divisionNumberList) {
        doSetDivisionNumber_InScope(divisionNumberList);
    }

    protected void doSetDivisionNumber_InScope(Collection<Integer> divisionNumberList) {
        regINS(CK_INS, cTL(divisionNumberList), xgetCValueDivisionNumber(), "DIVISION_NUMBER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     * @param divisionNumberList The collection of divisionNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionNumber_NotInScope(Collection<Integer> divisionNumberList) {
        doSetDivisionNumber_NotInScope(divisionNumberList);
    }

    protected void doSetDivisionNumber_NotInScope(Collection<Integer> divisionNumberList) {
        regINS(CK_NINS, cTL(divisionNumberList), xgetCValueDivisionNumber(), "DIVISION_NUMBER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     */
    public void setDivisionNumber_IsNull() { regDivisionNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (目番号)DIVISION_NUMBER: {INT(10)}
     */
    public void setDivisionNumber_IsNotNull() { regDivisionNumber(CK_ISNN, DOBJ); }

    protected void regDivisionNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivisionNumber(), "DIVISION_NUMBER"); }
    protected abstract ConditionValue xgetCValueDivisionNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitle The value of divisionTitle as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionTitle_Equal(String divisionTitle) {
        doSetDivisionTitle_Equal(fRES(divisionTitle));
    }

    protected void doSetDivisionTitle_Equal(String divisionTitle) {
        regDivisionTitle(CK_EQ, divisionTitle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitle The value of divisionTitle as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionTitle_NotEqual(String divisionTitle) {
        doSetDivisionTitle_NotEqual(fRES(divisionTitle));
    }

    protected void doSetDivisionTitle_NotEqual(String divisionTitle) {
        regDivisionTitle(CK_NES, divisionTitle);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitleList The collection of divisionTitle as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionTitle_InScope(Collection<String> divisionTitleList) {
        doSetDivisionTitle_InScope(divisionTitleList);
    }

    protected void doSetDivisionTitle_InScope(Collection<String> divisionTitleList) {
        regINS(CK_INS, cTL(divisionTitleList), xgetCValueDivisionTitle(), "DIVISION_TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitleList The collection of divisionTitle as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionTitle_NotInScope(Collection<String> divisionTitleList) {
        doSetDivisionTitle_NotInScope(divisionTitleList);
    }

    protected void doSetDivisionTitle_NotInScope(Collection<String> divisionTitleList) {
        regINS(CK_NINS, cTL(divisionTitleList), xgetCValueDivisionTitle(), "DIVISION_TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setDivisionTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param divisionTitle The value of divisionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDivisionTitle_LikeSearch(String divisionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDivisionTitle_LikeSearch(divisionTitle, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)} <br>
     * <pre>e.g. setDivisionTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param divisionTitle The value of divisionTitle as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDivisionTitle_LikeSearch(String divisionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(divisionTitle), xgetCValueDivisionTitle(), "DIVISION_TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitle The value of divisionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDivisionTitle_NotLikeSearch(String divisionTitle, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDivisionTitle_NotLikeSearch(divisionTitle, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     * @param divisionTitle The value of divisionTitle as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDivisionTitle_NotLikeSearch(String divisionTitle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(divisionTitle), xgetCValueDivisionTitle(), "DIVISION_TITLE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     */
    public void setDivisionTitle_IsNull() { regDivisionTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     */
    public void setDivisionTitle_IsNullOrEmpty() { regDivisionTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (目タイトル)DIVISION_TITLE: {VARCHAR(100)}
     */
    public void setDivisionTitle_IsNotNull() { regDivisionTitle(CK_ISNN, DOBJ); }

    protected void regDivisionTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivisionTitle(), "DIVISION_TITLE"); }
    protected abstract ConditionValue xgetCValueDivisionTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaption The value of divisionCaption as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionCaption_Equal(String divisionCaption) {
        doSetDivisionCaption_Equal(fRES(divisionCaption));
    }

    protected void doSetDivisionCaption_Equal(String divisionCaption) {
        regDivisionCaption(CK_EQ, divisionCaption);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaption The value of divisionCaption as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionCaption_NotEqual(String divisionCaption) {
        doSetDivisionCaption_NotEqual(fRES(divisionCaption));
    }

    protected void doSetDivisionCaption_NotEqual(String divisionCaption) {
        regDivisionCaption(CK_NES, divisionCaption);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaptionList The collection of divisionCaption as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionCaption_InScope(Collection<String> divisionCaptionList) {
        doSetDivisionCaption_InScope(divisionCaptionList);
    }

    protected void doSetDivisionCaption_InScope(Collection<String> divisionCaptionList) {
        regINS(CK_INS, cTL(divisionCaptionList), xgetCValueDivisionCaption(), "DIVISION_CAPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaptionList The collection of divisionCaption as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDivisionCaption_NotInScope(Collection<String> divisionCaptionList) {
        doSetDivisionCaption_NotInScope(divisionCaptionList);
    }

    protected void doSetDivisionCaption_NotInScope(Collection<String> divisionCaptionList) {
        regINS(CK_NINS, cTL(divisionCaptionList), xgetCValueDivisionCaption(), "DIVISION_CAPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setDivisionCaption_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param divisionCaption The value of divisionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDivisionCaption_LikeSearch(String divisionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDivisionCaption_LikeSearch(divisionCaption, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)} <br>
     * <pre>e.g. setDivisionCaption_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param divisionCaption The value of divisionCaption as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDivisionCaption_LikeSearch(String divisionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(divisionCaption), xgetCValueDivisionCaption(), "DIVISION_CAPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaption The value of divisionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDivisionCaption_NotLikeSearch(String divisionCaption, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDivisionCaption_NotLikeSearch(divisionCaption, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     * @param divisionCaption The value of divisionCaption as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDivisionCaption_NotLikeSearch(String divisionCaption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(divisionCaption), xgetCValueDivisionCaption(), "DIVISION_CAPTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     */
    public void setDivisionCaption_IsNull() { regDivisionCaption(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     */
    public void setDivisionCaption_IsNullOrEmpty() { regDivisionCaption(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (目見出し)DIVISION_CAPTION: {VARCHAR(200)}
     */
    public void setDivisionCaption_IsNotNull() { regDivisionCaption(CK_ISNN, DOBJ); }

    protected void regDivisionCaption(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivisionCaption(), "DIVISION_CAPTION"); }
    protected abstract ConditionValue xgetCValueDivisionCaption();

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
    public HpSLCFunction<LawTocCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawTocCB.class);
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
    public HpSLCFunction<LawTocCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawTocCB.class);
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
    public HpSLCFunction<LawTocCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawTocCB.class);
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
    public HpSLCFunction<LawTocCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawTocCB.class);
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
    public HpSLCFunction<LawTocCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawTocCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawTocCB&gt;() {
     *     public void query(LawTocCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawTocCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawTocCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTocCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawTocCQ sq);

    protected LawTocCB xcreateScalarConditionCB() {
        LawTocCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawTocCB xcreateScalarConditionPartitionByCB() {
        LawTocCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawTocCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTocCB cb = new LawTocCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_TOC_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawTocCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawTocCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawTocCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawTocCB cb = new LawTocCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_TOC_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawTocCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawTocCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawTocCB cb = new LawTocCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawTocCQ sq);

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
    protected LawTocCB newMyCB() {
        return new LawTocCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawTocCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
