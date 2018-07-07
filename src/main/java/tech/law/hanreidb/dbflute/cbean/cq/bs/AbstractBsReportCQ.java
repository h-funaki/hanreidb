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
 * The abstract condition-query of REPORT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsReportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "REPORT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_Equal(Integer reportId) {
        doSetReportId_Equal(reportId);
    }

    protected void doSetReportId_Equal(Integer reportId) {
        regReportId(CK_EQ, reportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_NotEqual(Integer reportId) {
        doSetReportId_NotEqual(reportId);
    }

    protected void doSetReportId_NotEqual(Integer reportId) {
        regReportId(CK_NES, reportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterThan(Integer reportId) {
        regReportId(CK_GT, reportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessThan(Integer reportId) {
        regReportId(CK_LT, reportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterEqual(Integer reportId) {
        regReportId(CK_GE, reportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportId The value of reportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessEqual(Integer reportId) {
        regReportId(CK_LE, reportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of reportId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReportId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReportId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of reportId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReportId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportId(), "REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportIdList The collection of reportId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportId_InScope(Collection<Integer> reportIdList) {
        doSetReportId_InScope(reportIdList);
    }

    protected void doSetReportId_InScope(Collection<Integer> reportIdList) {
        regINS(CK_INS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param reportIdList The collection of reportId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportId_NotInScope(Collection<Integer> reportIdList) {
        doSetReportId_NotInScope(reportIdList);
    }

    protected void doSetReportId_NotInScope(Collection<Integer> reportIdList) {
        regINS(CK_NINS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPORT_ID from JUDGEMENT_REPORT_REL where ...)} <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementReportRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementReportRelList for 'exists'. (NotNull)
     */
    public void existsJudgementReportRel(SubQuery<JudgementReportRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportId_ExistsReferrer_JudgementReportRelList(cb.query());
        registerExistsReferrer(cb.query(), "REPORT_ID", "REPORT_ID", pp, "judgementReportRelList");
    }
    public abstract String keepReportId_ExistsReferrer_JudgementReportRelList(JudgementReportRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPORT_ID from JUDGEMENT_REPORT_REL where ...)} <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementReportRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReportId_NotExistsReferrer_JudgementReportRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementReportRel(SubQuery<JudgementReportRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReportId_NotExistsReferrer_JudgementReportRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "REPORT_ID", "REPORT_ID", pp, "judgementReportRelList");
    }
    public abstract String keepReportId_NotExistsReferrer_JudgementReportRelList(JudgementReportRelCQ sq);

    public void xsderiveJudgementReportRelList(String fn, SubQuery<JudgementReportRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReportId_SpecifyDerivedReferrer_JudgementReportRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REPORT_ID", "REPORT_ID", pp, "judgementReportRelList", al, op);
    }
    public abstract String keepReportId_SpecifyDerivedReferrer_JudgementReportRelList(JudgementReportRelCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_REPORT_REL where ...)} <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementReportRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementReportRelCB> derivedJudgementReportRel() {
        return xcreateQDRFunctionJudgementReportRelList();
    }
    protected HpQDRFunction<JudgementReportRelCB> xcreateQDRFunctionJudgementReportRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementReportRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementReportRelList(String fn, SubQuery<JudgementReportRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReportId_QueryDerivedReferrer_JudgementReportRelList(cb.query()); String prpp = keepReportId_QueryDerivedReferrer_JudgementReportRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REPORT_ID", "REPORT_ID", sqpp, "judgementReportRelList", rd, vl, prpp, op);
    }
    public abstract String keepReportId_QueryDerivedReferrer_JudgementReportRelList(JudgementReportRelCQ sq);
    public abstract String keepReportId_QueryDerivedReferrer_JudgementReportRelListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setReportId_IsNull() { regReportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setReportId_IsNotNull() { regReportId(CK_ISNN, DOBJ); }

    protected void regReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportId(), "REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param reportName The value of reportName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportName_Equal(String reportName) {
        doSetReportName_Equal(fRES(reportName));
    }

    protected void doSetReportName_Equal(String reportName) {
        regReportName(CK_EQ, reportName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setReportName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param reportName The value of reportName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReportName_LikeSearch(String reportName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReportName_LikeSearch(reportName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setReportName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportName The value of reportName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReportName_LikeSearch(String reportName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportName), xgetCValueReportName(), "REPORT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param reportName The value of reportName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReportName_NotLikeSearch(String reportName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReportName_NotLikeSearch(reportName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集名)REPORT_NAME: {UQ, NotNull, VARCHAR(50)}
     * @param reportName The value of reportName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReportName_NotLikeSearch(String reportName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportName), xgetCValueReportName(), "REPORT_NAME", likeSearchOption);
    }

    protected void regReportName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportName(), "REPORT_NAME"); }
    protected abstract ConditionValue xgetCValueReportName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAlias The value of reportAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportAlias_Equal(String reportAlias) {
        doSetReportAlias_Equal(fRES(reportAlias));
    }

    protected void doSetReportAlias_Equal(String reportAlias) {
        regReportAlias(CK_EQ, reportAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAlias The value of reportAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportAlias_NotEqual(String reportAlias) {
        doSetReportAlias_NotEqual(fRES(reportAlias));
    }

    protected void doSetReportAlias_NotEqual(String reportAlias) {
        regReportAlias(CK_NES, reportAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAliasList The collection of reportAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportAlias_InScope(Collection<String> reportAliasList) {
        doSetReportAlias_InScope(reportAliasList);
    }

    protected void doSetReportAlias_InScope(Collection<String> reportAliasList) {
        regINS(CK_INS, cTL(reportAliasList), xgetCValueReportAlias(), "REPORT_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAliasList The collection of reportAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportAlias_NotInScope(Collection<String> reportAliasList) {
        doSetReportAlias_NotInScope(reportAliasList);
    }

    protected void doSetReportAlias_NotInScope(Collection<String> reportAliasList) {
        regINS(CK_NINS, cTL(reportAliasList), xgetCValueReportAlias(), "REPORT_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setReportAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param reportAlias The value of reportAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReportAlias_LikeSearch(String reportAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReportAlias_LikeSearch(reportAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setReportAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportAlias The value of reportAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setReportAlias_LikeSearch(String reportAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportAlias), xgetCValueReportAlias(), "REPORT_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAlias The value of reportAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setReportAlias_NotLikeSearch(String reportAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setReportAlias_NotLikeSearch(reportAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集別名)REPORT_ALIAS: {UQ, NotNull, VARCHAR(50)}
     * @param reportAlias The value of reportAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setReportAlias_NotLikeSearch(String reportAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportAlias), xgetCValueReportAlias(), "REPORT_ALIAS", likeSearchOption);
    }

    protected void regReportAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportAlias(), "REPORT_ALIAS"); }
    protected abstract ConditionValue xgetCValueReportAlias();

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
    public HpSLCFunction<ReportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ReportCB.class);
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
    public HpSLCFunction<ReportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ReportCB.class);
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
    public HpSLCFunction<ReportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ReportCB.class);
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
    public HpSLCFunction<ReportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ReportCB.class);
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
    public HpSLCFunction<ReportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ReportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ReportCB&gt;() {
     *     public void query(ReportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ReportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ReportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ReportCQ sq);

    protected ReportCB xcreateScalarConditionCB() {
        ReportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ReportCB xcreateScalarConditionPartitionByCB() {
        ReportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ReportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportCB cb = new ReportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "REPORT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ReportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ReportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ReportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ReportCB cb = new ReportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "REPORT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ReportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ReportCB cb = new ReportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ReportCQ sq);

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
    protected ReportCB newMyCB() {
        return new ReportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ReportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
