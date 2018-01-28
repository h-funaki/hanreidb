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
 * The abstract condition-query of SOURCE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSourceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSourceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SOURCE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_Equal(Integer sourceId) {
        doSetSourceId_Equal(sourceId);
    }

    protected void doSetSourceId_Equal(Integer sourceId) {
        regSourceId(CK_EQ, sourceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_NotEqual(Integer sourceId) {
        doSetSourceId_NotEqual(sourceId);
    }

    protected void doSetSourceId_NotEqual(Integer sourceId) {
        regSourceId(CK_NES, sourceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_GreaterThan(Integer sourceId) {
        regSourceId(CK_GT, sourceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_LessThan(Integer sourceId) {
        regSourceId(CK_LT, sourceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_GreaterEqual(Integer sourceId) {
        regSourceId(CK_GE, sourceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceId The value of sourceId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceId_LessEqual(Integer sourceId) {
        regSourceId(CK_LE, sourceId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of sourceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSourceId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSourceId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of sourceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSourceId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourceId(), "SOURCE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceIdList The collection of sourceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceId_InScope(Collection<Integer> sourceIdList) {
        doSetSourceId_InScope(sourceIdList);
    }

    protected void doSetSourceId_InScope(Collection<Integer> sourceIdList) {
        regINS(CK_INS, cTL(sourceIdList), xgetCValueSourceId(), "SOURCE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param sourceIdList The collection of sourceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceId_NotInScope(Collection<Integer> sourceIdList) {
        doSetSourceId_NotInScope(sourceIdList);
    }

    protected void doSetSourceId_NotInScope(Collection<Integer> sourceIdList) {
        regINS(CK_NINS, cTL(sourceIdList), xgetCValueSourceId(), "SOURCE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SOURCE_ID from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceId_ExistsReferrer_JudgementSourceRelList(cb.query());
        registerExistsReferrer(cb.query(), "SOURCE_ID", "SOURCE_ID", pp, "judgementSourceRelList");
    }
    public abstract String keepSourceId_ExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SOURCE_ID from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementSourceRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SourceId_NotExistsReferrer_JudgementSourceRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementSourceRel(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSourceId_NotExistsReferrer_JudgementSourceRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "SOURCE_ID", "SOURCE_ID", pp, "judgementSourceRelList");
    }
    public abstract String keepSourceId_NotExistsReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    public void xsderiveJudgementSourceRelList(String fn, SubQuery<JudgementSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSourceId_SpecifyDerivedReferrer_JudgementSourceRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SOURCE_ID", "SOURCE_ID", pp, "judgementSourceRelList", al, op);
    }
    public abstract String keepSourceId_SpecifyDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_SOURCE_REL where ...)} <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSourceId_QueryDerivedReferrer_JudgementSourceRelList(cb.query()); String prpp = keepSourceId_QueryDerivedReferrer_JudgementSourceRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SOURCE_ID", "SOURCE_ID", sqpp, "judgementSourceRelList", rd, vl, prpp, op);
    }
    public abstract String keepSourceId_QueryDerivedReferrer_JudgementSourceRelList(JudgementSourceRelCQ sq);
    public abstract String keepSourceId_QueryDerivedReferrer_JudgementSourceRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSourceId_IsNull() { regSourceId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSourceId_IsNotNull() { regSourceId(CK_ISNN, DOBJ); }

    protected void regSourceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceId(), "SOURCE_ID"); }
    protected abstract ConditionValue xgetCValueSourceId();

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
    public HpSLCFunction<SourceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SourceCB.class);
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
    public HpSLCFunction<SourceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SourceCB.class);
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
    public HpSLCFunction<SourceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SourceCB.class);
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
    public HpSLCFunction<SourceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SourceCB.class);
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
    public HpSLCFunction<SourceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SourceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SourceCB&gt;() {
     *     public void query(SourceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SourceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SourceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SourceCQ sq);

    protected SourceCB xcreateScalarConditionCB() {
        SourceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SourceCB xcreateScalarConditionPartitionByCB() {
        SourceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SourceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceCB cb = new SourceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOURCE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SourceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SourceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SourceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceCB cb = new SourceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOURCE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SourceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SourceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceCB cb = new SourceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SourceCQ sq);

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
    protected SourceCB newMyCB() {
        return new SourceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SourceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
