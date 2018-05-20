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
 * The abstract condition-query of LAW_CONTENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawContentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawContentCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_CONTENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_Equal(Integer lawContentId) {
        doSetLawContentId_Equal(lawContentId);
    }

    protected void doSetLawContentId_Equal(Integer lawContentId) {
        regLawContentId(CK_EQ, lawContentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_NotEqual(Integer lawContentId) {
        doSetLawContentId_NotEqual(lawContentId);
    }

    protected void doSetLawContentId_NotEqual(Integer lawContentId) {
        regLawContentId(CK_NES, lawContentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_GreaterThan(Integer lawContentId) {
        regLawContentId(CK_GT, lawContentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_LessThan(Integer lawContentId) {
        regLawContentId(CK_LT, lawContentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_GreaterEqual(Integer lawContentId) {
        regLawContentId(CK_GE, lawContentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentId The value of lawContentId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawContentId_LessEqual(Integer lawContentId) {
        regLawContentId(CK_LE, lawContentId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawContentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawContentId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawContentId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawContentId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of lawContentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawContentId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawContentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawContentId(), "LAW_CONTENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentIdList The collection of lawContentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawContentId_InScope(Collection<Integer> lawContentIdList) {
        doSetLawContentId_InScope(lawContentIdList);
    }

    protected void doSetLawContentId_InScope(Collection<Integer> lawContentIdList) {
        regINS(CK_INS, cTL(lawContentIdList), xgetCValueLawContentId(), "LAW_CONTENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     * @param lawContentIdList The collection of lawContentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawContentId_NotInScope(Collection<Integer> lawContentIdList) {
        doSetLawContentId_NotInScope(lawContentIdList);
    }

    protected void doSetLawContentId_NotInScope(Collection<Integer> lawContentIdList) {
        regINS(CK_NINS, cTL(lawContentIdList), xgetCValueLawContentId(), "LAW_CONTENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawContentId_IsNull() { regLawContentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令内容ID)LAW_CONTENT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setLawContentId_IsNotNull() { regLawContentId(CK_ISNN, DOBJ); }

    protected void regLawContentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawContentId(), "LAW_CONTENT_ID"); }
    protected abstract ConditionValue xgetCValueLawContentId();

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
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param lawContentRawXml The value of lawContentRawXml as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawContentRawXml_Equal(String lawContentRawXml) {
        doSetLawContentRawXml_Equal(fRES(lawContentRawXml));
    }

    protected void doSetLawContentRawXml_Equal(String lawContentRawXml) {
        regLawContentRawXml(CK_EQ, lawContentRawXml);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentRawXml_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawContentRawXml The value of lawContentRawXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentRawXml_LikeSearch(String lawContentRawXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentRawXml_LikeSearch(lawContentRawXml, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentRawXml_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawContentRawXml The value of lawContentRawXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawContentRawXml_LikeSearch(String lawContentRawXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawContentRawXml), xgetCValueLawContentRawXml(), "LAW_CONTENT_RAW_XML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param lawContentRawXml The value of lawContentRawXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentRawXml_NotLikeSearch(String lawContentRawXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentRawXml_NotLikeSearch(lawContentRawXml, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容加工前XML)LAW_CONTENT_RAW_XML: {NotNull, TEXT(65535)}
     * @param lawContentRawXml The value of lawContentRawXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawContentRawXml_NotLikeSearch(String lawContentRawXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawContentRawXml), xgetCValueLawContentRawXml(), "LAW_CONTENT_RAW_XML", likeSearchOption);
    }

    protected void regLawContentRawXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawContentRawXml(), "LAW_CONTENT_RAW_XML"); }
    protected abstract ConditionValue xgetCValueLawContentRawXml();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)}
     * @param lawContentSearchText The value of lawContentSearchText as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawContentSearchText_Equal(String lawContentSearchText) {
        doSetLawContentSearchText_Equal(fRES(lawContentSearchText));
    }

    protected void doSetLawContentSearchText_Equal(String lawContentSearchText) {
        regLawContentSearchText(CK_EQ, lawContentSearchText);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentSearchText_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawContentSearchText The value of lawContentSearchText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentSearchText_LikeSearch(String lawContentSearchText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentSearchText_LikeSearch(lawContentSearchText, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentSearchText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawContentSearchText The value of lawContentSearchText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawContentSearchText_LikeSearch(String lawContentSearchText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawContentSearchText), xgetCValueLawContentSearchText(), "LAW_CONTENT_SEARCH_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)}
     * @param lawContentSearchText The value of lawContentSearchText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentSearchText_NotLikeSearch(String lawContentSearchText, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentSearchText_NotLikeSearch(lawContentSearchText, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容検索全文)LAW_CONTENT_SEARCH_TEXT: {NotNull, TEXT(65535)}
     * @param lawContentSearchText The value of lawContentSearchText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawContentSearchText_NotLikeSearch(String lawContentSearchText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawContentSearchText), xgetCValueLawContentSearchText(), "LAW_CONTENT_SEARCH_TEXT", likeSearchOption);
    }

    protected void regLawContentSearchText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawContentSearchText(), "LAW_CONTENT_SEARCH_TEXT"); }
    protected abstract ConditionValue xgetCValueLawContentSearchText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param lawContentViewXml The value of lawContentViewXml as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawContentViewXml_Equal(String lawContentViewXml) {
        doSetLawContentViewXml_Equal(fRES(lawContentViewXml));
    }

    protected void doSetLawContentViewXml_Equal(String lawContentViewXml) {
        regLawContentViewXml(CK_EQ, lawContentViewXml);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentViewXml_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawContentViewXml The value of lawContentViewXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentViewXml_LikeSearch(String lawContentViewXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentViewXml_LikeSearch(lawContentViewXml, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setLawContentViewXml_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawContentViewXml The value of lawContentViewXml as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawContentViewXml_LikeSearch(String lawContentViewXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawContentViewXml), xgetCValueLawContentViewXml(), "LAW_CONTENT_VIEW_XML", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param lawContentViewXml The value of lawContentViewXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawContentViewXml_NotLikeSearch(String lawContentViewXml, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawContentViewXml_NotLikeSearch(lawContentViewXml, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令内容画面用XML)LAW_CONTENT_VIEW_XML: {NotNull, TEXT(65535)}
     * @param lawContentViewXml The value of lawContentViewXml as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawContentViewXml_NotLikeSearch(String lawContentViewXml, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawContentViewXml), xgetCValueLawContentViewXml(), "LAW_CONTENT_VIEW_XML", likeSearchOption);
    }

    protected void regLawContentViewXml(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawContentViewXml(), "LAW_CONTENT_VIEW_XML"); }
    protected abstract ConditionValue xgetCValueLawContentViewXml();

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
    public HpSLCFunction<LawContentCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawContentCB.class);
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
    public HpSLCFunction<LawContentCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawContentCB.class);
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
    public HpSLCFunction<LawContentCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawContentCB.class);
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
    public HpSLCFunction<LawContentCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawContentCB.class);
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
    public HpSLCFunction<LawContentCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawContentCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawContentCB&gt;() {
     *     public void query(LawContentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawContentCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawContentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawContentCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawContentCQ sq);

    protected LawContentCB xcreateScalarConditionCB() {
        LawContentCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawContentCB xcreateScalarConditionPartitionByCB() {
        LawContentCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawContentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawContentCB cb = new LawContentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_CONTENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawContentCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawContentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawContentCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawContentCB cb = new LawContentCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_CONTENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawContentCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawContentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawContentCB cb = new LawContentCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawContentCQ sq);

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
    protected LawContentCB newMyCB() {
        return new LawContentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawContentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
