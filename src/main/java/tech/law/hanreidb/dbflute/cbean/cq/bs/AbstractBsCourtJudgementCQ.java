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
 * The abstract condition-query of COURT_JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCourtJudgementCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCourtJudgementCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COURT_JUDGEMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_Equal(Long courtJudgementId) {
        doSetCourtJudgementId_Equal(courtJudgementId);
    }

    protected void doSetCourtJudgementId_Equal(Long courtJudgementId) {
        regCourtJudgementId(CK_EQ, courtJudgementId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_NotEqual(Long courtJudgementId) {
        doSetCourtJudgementId_NotEqual(courtJudgementId);
    }

    protected void doSetCourtJudgementId_NotEqual(Long courtJudgementId) {
        regCourtJudgementId(CK_NES, courtJudgementId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_GreaterThan(Long courtJudgementId) {
        regCourtJudgementId(CK_GT, courtJudgementId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_LessThan(Long courtJudgementId) {
        regCourtJudgementId(CK_LT, courtJudgementId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_GreaterEqual(Long courtJudgementId) {
        regCourtJudgementId(CK_GE, courtJudgementId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementId The value of courtJudgementId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCourtJudgementId_LessEqual(Long courtJudgementId) {
        regCourtJudgementId(CK_LE, courtJudgementId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of courtJudgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of courtJudgementId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCourtJudgementId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCourtJudgementId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of courtJudgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of courtJudgementId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCourtJudgementId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCourtJudgementId(), "COURT_JUDGEMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementIdList The collection of courtJudgementId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtJudgementId_InScope(Collection<Long> courtJudgementIdList) {
        doSetCourtJudgementId_InScope(courtJudgementIdList);
    }

    protected void doSetCourtJudgementId_InScope(Collection<Long> courtJudgementIdList) {
        regINS(CK_INS, cTL(courtJudgementIdList), xgetCValueCourtJudgementId(), "COURT_JUDGEMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param courtJudgementIdList The collection of courtJudgementId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtJudgementId_NotInScope(Collection<Long> courtJudgementIdList) {
        doSetCourtJudgementId_NotInScope(courtJudgementIdList);
    }

    protected void doSetCourtJudgementId_NotInScope(Collection<Long> courtJudgementIdList) {
        regINS(CK_NINS, cTL(courtJudgementIdList), xgetCValueCourtJudgementId(), "COURT_JUDGEMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setCourtJudgementId_IsNull() { regCourtJudgementId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判所判決ID)COURT_JUDGEMENT_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setCourtJudgementId_IsNotNull() { regCourtJudgementId(CK_ISNN, DOBJ); }

    protected void regCourtJudgementId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtJudgementId(), "COURT_JUDGEMENT_ID"); }
    protected abstract ConditionValue xgetCValueCourtJudgementId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumber The value of caseNumber as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumber_Equal(String caseNumber) {
        doSetCaseNumber_Equal(fRES(caseNumber));
    }

    protected void doSetCaseNumber_Equal(String caseNumber) {
        regCaseNumber(CK_EQ, caseNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumber The value of caseNumber as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumber_NotEqual(String caseNumber) {
        doSetCaseNumber_NotEqual(fRES(caseNumber));
    }

    protected void doSetCaseNumber_NotEqual(String caseNumber) {
        regCaseNumber(CK_NES, caseNumber);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumberList The collection of caseNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumber_InScope(Collection<String> caseNumberList) {
        doSetCaseNumber_InScope(caseNumberList);
    }

    protected void doSetCaseNumber_InScope(Collection<String> caseNumberList) {
        regINS(CK_INS, cTL(caseNumberList), xgetCValueCaseNumber(), "CASE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumberList The collection of caseNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseNumber_NotInScope(Collection<String> caseNumberList) {
        doSetCaseNumber_NotInScope(caseNumberList);
    }

    protected void doSetCaseNumber_NotInScope(Collection<String> caseNumberList) {
        regINS(CK_NINS, cTL(caseNumberList), xgetCValueCaseNumber(), "CASE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setCaseNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseNumber The value of caseNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseNumber_LikeSearch(String caseNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseNumber_LikeSearch(caseNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setCaseNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseNumber The value of caseNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseNumber_LikeSearch(String caseNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseNumber), xgetCValueCaseNumber(), "CASE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumber The value of caseNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseNumber_NotLikeSearch(String caseNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseNumber_NotLikeSearch(caseNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件番号)CASE_NUMBER: {NotNull, VARCHAR(50)}
     * @param caseNumber The value of caseNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseNumber_NotLikeSearch(String caseNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseNumber), xgetCValueCaseNumber(), "CASE_NUMBER", likeSearchOption);
    }

    protected void regCaseNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseNumber(), "CASE_NUMBER"); }
    protected abstract ConditionValue xgetCValueCaseNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseName_Equal(String caseName) {
        doSetCaseName_Equal(fRES(caseName));
    }

    protected void doSetCaseName_Equal(String caseName) {
        regCaseName(CK_EQ, caseName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)} <br>
     * <pre>e.g. setCaseName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseName The value of caseName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseName_LikeSearch(String caseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseName_LikeSearch(caseName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)} <br>
     * <pre>e.g. setCaseName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseName The value of caseName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseName_LikeSearch(String caseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseName), xgetCValueCaseName(), "CASE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseName_NotLikeSearch(String caseName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseName_NotLikeSearch(caseName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     * @param caseName The value of caseName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseName_NotLikeSearch(String caseName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseName), xgetCValueCaseName(), "CASE_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNull() { regCaseName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNullOrEmpty() { regCaseName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件名)CASE_NAME: {TEXT(65535)}
     */
    public void setCaseName_IsNotNull() { regCaseName(CK_ISNN, DOBJ); }

    protected void regCaseName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseName(), "CASE_NAME"); }
    protected abstract ConditionValue xgetCValueCaseName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDate The value of judgementDate as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementDate_Equal(String judgementDate) {
        doSetJudgementDate_Equal(fRES(judgementDate));
    }

    protected void doSetJudgementDate_Equal(String judgementDate) {
        regJudgementDate(CK_EQ, judgementDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDate The value of judgementDate as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementDate_NotEqual(String judgementDate) {
        doSetJudgementDate_NotEqual(fRES(judgementDate));
    }

    protected void doSetJudgementDate_NotEqual(String judgementDate) {
        regJudgementDate(CK_NES, judgementDate);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDateList The collection of judgementDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementDate_InScope(Collection<String> judgementDateList) {
        doSetJudgementDate_InScope(judgementDateList);
    }

    protected void doSetJudgementDate_InScope(Collection<String> judgementDateList) {
        regINS(CK_INS, cTL(judgementDateList), xgetCValueJudgementDate(), "JUDGEMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDateList The collection of judgementDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementDate_NotInScope(Collection<String> judgementDateList) {
        doSetJudgementDate_NotInScope(judgementDateList);
    }

    protected void doSetJudgementDate_NotInScope(Collection<String> judgementDateList) {
        regINS(CK_NINS, cTL(judgementDateList), xgetCValueJudgementDate(), "JUDGEMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementDate_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementDate The value of judgementDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementDate_LikeSearch(String judgementDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementDate_LikeSearch(judgementDate, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementDate The value of judgementDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementDate_LikeSearch(String judgementDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementDate), xgetCValueJudgementDate(), "JUDGEMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDate The value of judgementDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementDate_NotLikeSearch(String judgementDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementDate_NotLikeSearch(judgementDate, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     * @param judgementDate The value of judgementDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementDate_NotLikeSearch(String judgementDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementDate), xgetCValueJudgementDate(), "JUDGEMENT_DATE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setJudgementDate_IsNull() { regJudgementDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setJudgementDate_IsNullOrEmpty() { regJudgementDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判年月日)JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setJudgementDate_IsNotNull() { regJudgementDate(CK_ISNN, DOBJ); }

    protected void regJudgementDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementDate(), "JUDGEMENT_DATE"); }
    protected abstract ConditionValue xgetCValueJudgementDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @param courtName The value of courtName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCourtName_Equal(String courtName) {
        doSetCourtName_Equal(fRES(courtName));
    }

    protected void doSetCourtName_Equal(String courtName) {
        regCourtName(CK_EQ, courtName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setCourtName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param courtName The value of courtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtName_LikeSearch(String courtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtName_LikeSearch(courtName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setCourtName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param courtName The value of courtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCourtName_LikeSearch(String courtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(courtName), xgetCValueCourtName(), "COURT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @param courtName The value of courtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCourtName_NotLikeSearch(String courtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCourtName_NotLikeSearch(courtName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     * @param courtName The value of courtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCourtName_NotLikeSearch(String courtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(courtName), xgetCValueCourtName(), "COURT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     */
    public void setCourtName_IsNull() { regCourtName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     */
    public void setCourtName_IsNullOrEmpty() { regCourtName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判所名)COURT_NAME: {VARCHAR(50)}
     */
    public void setCourtName_IsNotNull() { regCourtName(CK_ISNN, DOBJ); }

    protected void regCourtName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCourtName(), "COURT_NAME"); }
    protected abstract ConditionValue xgetCValueCourtName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementType The value of judgementType as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementType_Equal(String judgementType) {
        doSetJudgementType_Equal(fRES(judgementType));
    }

    protected void doSetJudgementType_Equal(String judgementType) {
        regJudgementType(CK_EQ, judgementType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementType The value of judgementType as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementType_NotEqual(String judgementType) {
        doSetJudgementType_NotEqual(fRES(judgementType));
    }

    protected void doSetJudgementType_NotEqual(String judgementType) {
        regJudgementType(CK_NES, judgementType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementTypeList The collection of judgementType as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementType_InScope(Collection<String> judgementTypeList) {
        doSetJudgementType_InScope(judgementTypeList);
    }

    protected void doSetJudgementType_InScope(Collection<String> judgementTypeList) {
        regINS(CK_INS, cTL(judgementTypeList), xgetCValueJudgementType(), "JUDGEMENT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementTypeList The collection of judgementType as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementType_NotInScope(Collection<String> judgementTypeList) {
        doSetJudgementType_NotInScope(judgementTypeList);
    }

    protected void doSetJudgementType_NotInScope(Collection<String> judgementTypeList) {
        regINS(CK_NINS, cTL(judgementTypeList), xgetCValueJudgementType(), "JUDGEMENT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementType The value of judgementType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementType_LikeSearch(String judgementType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementType_LikeSearch(judgementType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementType The value of judgementType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementType_LikeSearch(String judgementType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementType), xgetCValueJudgementType(), "JUDGEMENT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementType The value of judgementType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementType_NotLikeSearch(String judgementType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementType_NotLikeSearch(judgementType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     * @param judgementType The value of judgementType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementType_NotLikeSearch(String judgementType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementType), xgetCValueJudgementType(), "JUDGEMENT_TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     */
    public void setJudgementType_IsNull() { regJudgementType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     */
    public void setJudgementType_IsNullOrEmpty() { regJudgementType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判種別)JUDGEMENT_TYPE: {VARCHAR(50)}
     */
    public void setJudgementType_IsNotNull() { regJudgementType(CK_ISNN, DOBJ); }

    protected void regJudgementType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementType(), "JUDGEMENT_TYPE"); }
    protected abstract ConditionValue xgetCValueJudgementType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResult The value of judgementResult as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResult_Equal(String judgementResult) {
        doSetJudgementResult_Equal(fRES(judgementResult));
    }

    protected void doSetJudgementResult_Equal(String judgementResult) {
        regJudgementResult(CK_EQ, judgementResult);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResult The value of judgementResult as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResult_NotEqual(String judgementResult) {
        doSetJudgementResult_NotEqual(fRES(judgementResult));
    }

    protected void doSetJudgementResult_NotEqual(String judgementResult) {
        regJudgementResult(CK_NES, judgementResult);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResultList The collection of judgementResult as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResult_InScope(Collection<String> judgementResultList) {
        doSetJudgementResult_InScope(judgementResultList);
    }

    protected void doSetJudgementResult_InScope(Collection<String> judgementResultList) {
        regINS(CK_INS, cTL(judgementResultList), xgetCValueJudgementResult(), "JUDGEMENT_RESULT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResultList The collection of judgementResult as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementResult_NotInScope(Collection<String> judgementResultList) {
        doSetJudgementResult_NotInScope(judgementResultList);
    }

    protected void doSetJudgementResult_NotInScope(Collection<String> judgementResultList) {
        regINS(CK_NINS, cTL(judgementResultList), xgetCValueJudgementResult(), "JUDGEMENT_RESULT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementResult_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementResult The value of judgementResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementResult_LikeSearch(String judgementResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementResult_LikeSearch(judgementResult, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)} <br>
     * <pre>e.g. setJudgementResult_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementResult The value of judgementResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementResult_LikeSearch(String judgementResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementResult), xgetCValueJudgementResult(), "JUDGEMENT_RESULT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResult The value of judgementResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementResult_NotLikeSearch(String judgementResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementResult_NotLikeSearch(judgementResult, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     * @param judgementResult The value of judgementResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementResult_NotLikeSearch(String judgementResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementResult), xgetCValueJudgementResult(), "JUDGEMENT_RESULT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     */
    public void setJudgementResult_IsNull() { regJudgementResult(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     */
    public void setJudgementResult_IsNullOrEmpty() { regJudgementResult(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (結果)JUDGEMENT_RESULT: {VARCHAR(50)}
     */
    public void setJudgementResult_IsNotNull() { regJudgementResult(CK_ISNN, DOBJ); }

    protected void regJudgementResult(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementResult(), "JUDGEMENT_RESULT"); }
    protected abstract ConditionValue xgetCValueJudgementResult();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReports The value of precedentReports as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReports_Equal(String precedentReports) {
        doSetPrecedentReports_Equal(fRES(precedentReports));
    }

    protected void doSetPrecedentReports_Equal(String precedentReports) {
        regPrecedentReports(CK_EQ, precedentReports);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReports The value of precedentReports as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReports_NotEqual(String precedentReports) {
        doSetPrecedentReports_NotEqual(fRES(precedentReports));
    }

    protected void doSetPrecedentReports_NotEqual(String precedentReports) {
        regPrecedentReports(CK_NES, precedentReports);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReportsList The collection of precedentReports as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReports_InScope(Collection<String> precedentReportsList) {
        doSetPrecedentReports_InScope(precedentReportsList);
    }

    protected void doSetPrecedentReports_InScope(Collection<String> precedentReportsList) {
        regINS(CK_INS, cTL(precedentReportsList), xgetCValuePrecedentReports(), "PRECEDENT_REPORTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReportsList The collection of precedentReports as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPrecedentReports_NotInScope(Collection<String> precedentReportsList) {
        doSetPrecedentReports_NotInScope(precedentReportsList);
    }

    protected void doSetPrecedentReports_NotInScope(Collection<String> precedentReportsList) {
        regINS(CK_NINS, cTL(precedentReportsList), xgetCValuePrecedentReports(), "PRECEDENT_REPORTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)} <br>
     * <pre>e.g. setPrecedentReports_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param precedentReports The value of precedentReports as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrecedentReports_LikeSearch(String precedentReports, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrecedentReports_LikeSearch(precedentReports, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)} <br>
     * <pre>e.g. setPrecedentReports_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param precedentReports The value of precedentReports as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPrecedentReports_LikeSearch(String precedentReports, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(precedentReports), xgetCValuePrecedentReports(), "PRECEDENT_REPORTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReports The value of precedentReports as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrecedentReports_NotLikeSearch(String precedentReports, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrecedentReports_NotLikeSearch(precedentReports, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     * @param precedentReports The value of precedentReports as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPrecedentReports_NotLikeSearch(String precedentReports, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(precedentReports), xgetCValuePrecedentReports(), "PRECEDENT_REPORTS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     */
    public void setPrecedentReports_IsNull() { regPrecedentReports(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     */
    public void setPrecedentReports_IsNullOrEmpty() { regPrecedentReports(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集)PRECEDENT_REPORTS: {VARCHAR(50)}
     */
    public void setPrecedentReports_IsNotNull() { regPrecedentReports(CK_ISNN, DOBJ); }

    protected void regPrecedentReports(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrecedentReports(), "PRECEDENT_REPORTS"); }
    protected abstract ConditionValue xgetCValuePrecedentReports();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @param originalCourtName The value of originalCourtName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalCourtName_Equal(String originalCourtName) {
        doSetOriginalCourtName_Equal(fRES(originalCourtName));
    }

    protected void doSetOriginalCourtName_Equal(String originalCourtName) {
        regOriginalCourtName(CK_EQ, originalCourtName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalCourtName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param originalCourtName The value of originalCourtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalCourtName_LikeSearch(String originalCourtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalCourtName_LikeSearch(originalCourtName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalCourtName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalCourtName The value of originalCourtName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setOriginalCourtName_LikeSearch(String originalCourtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalCourtName), xgetCValueOriginalCourtName(), "ORIGINAL_COURT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @param originalCourtName The value of originalCourtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalCourtName_NotLikeSearch(String originalCourtName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalCourtName_NotLikeSearch(originalCourtName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     * @param originalCourtName The value of originalCourtName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setOriginalCourtName_NotLikeSearch(String originalCourtName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalCourtName), xgetCValueOriginalCourtName(), "ORIGINAL_COURT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     */
    public void setOriginalCourtName_IsNull() { regOriginalCourtName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     */
    public void setOriginalCourtName_IsNullOrEmpty() { regOriginalCourtName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (原審裁判所名)ORIGINAL_COURT_NAME: {VARCHAR(50)}
     */
    public void setOriginalCourtName_IsNotNull() { regOriginalCourtName(CK_ISNN, DOBJ); }

    protected void regOriginalCourtName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalCourtName(), "ORIGINAL_COURT_NAME"); }
    protected abstract ConditionValue xgetCValueOriginalCourtName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumber The value of originalCaseNumber as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalCaseNumber_Equal(String originalCaseNumber) {
        doSetOriginalCaseNumber_Equal(fRES(originalCaseNumber));
    }

    protected void doSetOriginalCaseNumber_Equal(String originalCaseNumber) {
        regOriginalCaseNumber(CK_EQ, originalCaseNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumber The value of originalCaseNumber as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalCaseNumber_NotEqual(String originalCaseNumber) {
        doSetOriginalCaseNumber_NotEqual(fRES(originalCaseNumber));
    }

    protected void doSetOriginalCaseNumber_NotEqual(String originalCaseNumber) {
        regOriginalCaseNumber(CK_NES, originalCaseNumber);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumberList The collection of originalCaseNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalCaseNumber_InScope(Collection<String> originalCaseNumberList) {
        doSetOriginalCaseNumber_InScope(originalCaseNumberList);
    }

    protected void doSetOriginalCaseNumber_InScope(Collection<String> originalCaseNumberList) {
        regINS(CK_INS, cTL(originalCaseNumberList), xgetCValueOriginalCaseNumber(), "ORIGINAL_CASE_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumberList The collection of originalCaseNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalCaseNumber_NotInScope(Collection<String> originalCaseNumberList) {
        doSetOriginalCaseNumber_NotInScope(originalCaseNumberList);
    }

    protected void doSetOriginalCaseNumber_NotInScope(Collection<String> originalCaseNumberList) {
        regINS(CK_NINS, cTL(originalCaseNumberList), xgetCValueOriginalCaseNumber(), "ORIGINAL_CASE_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalCaseNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param originalCaseNumber The value of originalCaseNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalCaseNumber_LikeSearch(String originalCaseNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalCaseNumber_LikeSearch(originalCaseNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalCaseNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalCaseNumber The value of originalCaseNumber as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setOriginalCaseNumber_LikeSearch(String originalCaseNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalCaseNumber), xgetCValueOriginalCaseNumber(), "ORIGINAL_CASE_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumber The value of originalCaseNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalCaseNumber_NotLikeSearch(String originalCaseNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalCaseNumber_NotLikeSearch(originalCaseNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     * @param originalCaseNumber The value of originalCaseNumber as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setOriginalCaseNumber_NotLikeSearch(String originalCaseNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalCaseNumber), xgetCValueOriginalCaseNumber(), "ORIGINAL_CASE_NUMBER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     */
    public void setOriginalCaseNumber_IsNull() { regOriginalCaseNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     */
    public void setOriginalCaseNumber_IsNullOrEmpty() { regOriginalCaseNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (原審事件番号)ORIGINAL_CASE_NUMBER: {VARCHAR(50)}
     */
    public void setOriginalCaseNumber_IsNotNull() { regOriginalCaseNumber(CK_ISNN, DOBJ); }

    protected void regOriginalCaseNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalCaseNumber(), "ORIGINAL_CASE_NUMBER"); }
    protected abstract ConditionValue xgetCValueOriginalCaseNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDate The value of originalJudgementDate as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementDate_Equal(String originalJudgementDate) {
        doSetOriginalJudgementDate_Equal(fRES(originalJudgementDate));
    }

    protected void doSetOriginalJudgementDate_Equal(String originalJudgementDate) {
        regOriginalJudgementDate(CK_EQ, originalJudgementDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDate The value of originalJudgementDate as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementDate_NotEqual(String originalJudgementDate) {
        doSetOriginalJudgementDate_NotEqual(fRES(originalJudgementDate));
    }

    protected void doSetOriginalJudgementDate_NotEqual(String originalJudgementDate) {
        regOriginalJudgementDate(CK_NES, originalJudgementDate);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDateList The collection of originalJudgementDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementDate_InScope(Collection<String> originalJudgementDateList) {
        doSetOriginalJudgementDate_InScope(originalJudgementDateList);
    }

    protected void doSetOriginalJudgementDate_InScope(Collection<String> originalJudgementDateList) {
        regINS(CK_INS, cTL(originalJudgementDateList), xgetCValueOriginalJudgementDate(), "ORIGINAL_JUDGEMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDateList The collection of originalJudgementDate as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementDate_NotInScope(Collection<String> originalJudgementDateList) {
        doSetOriginalJudgementDate_NotInScope(originalJudgementDateList);
    }

    protected void doSetOriginalJudgementDate_NotInScope(Collection<String> originalJudgementDateList) {
        regINS(CK_NINS, cTL(originalJudgementDateList), xgetCValueOriginalJudgementDate(), "ORIGINAL_JUDGEMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalJudgementDate_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param originalJudgementDate The value of originalJudgementDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalJudgementDate_LikeSearch(String originalJudgementDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalJudgementDate_LikeSearch(originalJudgementDate, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)} <br>
     * <pre>e.g. setOriginalJudgementDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalJudgementDate The value of originalJudgementDate as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setOriginalJudgementDate_LikeSearch(String originalJudgementDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalJudgementDate), xgetCValueOriginalJudgementDate(), "ORIGINAL_JUDGEMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDate The value of originalJudgementDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalJudgementDate_NotLikeSearch(String originalJudgementDate, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalJudgementDate_NotLikeSearch(originalJudgementDate, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     * @param originalJudgementDate The value of originalJudgementDate as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setOriginalJudgementDate_NotLikeSearch(String originalJudgementDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalJudgementDate), xgetCValueOriginalJudgementDate(), "ORIGINAL_JUDGEMENT_DATE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setOriginalJudgementDate_IsNull() { regOriginalJudgementDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setOriginalJudgementDate_IsNullOrEmpty() { regOriginalJudgementDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (原審裁判年月日)ORIGINAL_JUDGEMENT_DATE: {VARCHAR(50)}
     */
    public void setOriginalJudgementDate_IsNotNull() { regOriginalJudgementDate(CK_ISNN, DOBJ); }

    protected void regOriginalJudgementDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalJudgementDate(), "ORIGINAL_JUDGEMENT_DATE"); }
    protected abstract ConditionValue xgetCValueOriginalJudgementDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResult The value of originalJudgementResult as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementResult_Equal(String originalJudgementResult) {
        doSetOriginalJudgementResult_Equal(fRES(originalJudgementResult));
    }

    protected void doSetOriginalJudgementResult_Equal(String originalJudgementResult) {
        regOriginalJudgementResult(CK_EQ, originalJudgementResult);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResult The value of originalJudgementResult as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementResult_NotEqual(String originalJudgementResult) {
        doSetOriginalJudgementResult_NotEqual(fRES(originalJudgementResult));
    }

    protected void doSetOriginalJudgementResult_NotEqual(String originalJudgementResult) {
        regOriginalJudgementResult(CK_NES, originalJudgementResult);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResultList The collection of originalJudgementResult as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementResult_InScope(Collection<String> originalJudgementResultList) {
        doSetOriginalJudgementResult_InScope(originalJudgementResultList);
    }

    protected void doSetOriginalJudgementResult_InScope(Collection<String> originalJudgementResultList) {
        regINS(CK_INS, cTL(originalJudgementResultList), xgetCValueOriginalJudgementResult(), "ORIGINAL_JUDGEMENT_RESULT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResultList The collection of originalJudgementResult as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOriginalJudgementResult_NotInScope(Collection<String> originalJudgementResultList) {
        doSetOriginalJudgementResult_NotInScope(originalJudgementResultList);
    }

    protected void doSetOriginalJudgementResult_NotInScope(Collection<String> originalJudgementResultList) {
        regINS(CK_NINS, cTL(originalJudgementResultList), xgetCValueOriginalJudgementResult(), "ORIGINAL_JUDGEMENT_RESULT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)} <br>
     * <pre>e.g. setOriginalJudgementResult_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param originalJudgementResult The value of originalJudgementResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalJudgementResult_LikeSearch(String originalJudgementResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalJudgementResult_LikeSearch(originalJudgementResult, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)} <br>
     * <pre>e.g. setOriginalJudgementResult_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param originalJudgementResult The value of originalJudgementResult as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setOriginalJudgementResult_LikeSearch(String originalJudgementResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(originalJudgementResult), xgetCValueOriginalJudgementResult(), "ORIGINAL_JUDGEMENT_RESULT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResult The value of originalJudgementResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setOriginalJudgementResult_NotLikeSearch(String originalJudgementResult, ConditionOptionCall<LikeSearchOption> opLambda) {
        setOriginalJudgementResult_NotLikeSearch(originalJudgementResult, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     * @param originalJudgementResult The value of originalJudgementResult as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setOriginalJudgementResult_NotLikeSearch(String originalJudgementResult, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(originalJudgementResult), xgetCValueOriginalJudgementResult(), "ORIGINAL_JUDGEMENT_RESULT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     */
    public void setOriginalJudgementResult_IsNull() { regOriginalJudgementResult(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     */
    public void setOriginalJudgementResult_IsNullOrEmpty() { regOriginalJudgementResult(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (原審結果)ORIGINAL_JUDGEMENT_RESULT: {VARCHAR(100)}
     */
    public void setOriginalJudgementResult_IsNotNull() { regOriginalJudgementResult(CK_ISNN, DOBJ); }

    protected void regOriginalJudgementResult(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOriginalJudgementResult(), "ORIGINAL_JUDGEMENT_RESULT"); }
    protected abstract ConditionValue xgetCValueOriginalJudgementResult();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     * @param judgementContent The value of judgementContent as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementContent_Equal(String judgementContent) {
        doSetJudgementContent_Equal(fRES(judgementContent));
    }

    protected void doSetJudgementContent_Equal(String judgementContent) {
        regJudgementContent(CK_EQ, judgementContent);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementContent_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementContent The value of judgementContent as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementContent_LikeSearch(String judgementContent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementContent_LikeSearch(judgementContent, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementContent_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementContent The value of judgementContent as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementContent_LikeSearch(String judgementContent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementContent), xgetCValueJudgementContent(), "JUDGEMENT_CONTENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     * @param judgementContent The value of judgementContent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementContent_NotLikeSearch(String judgementContent, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementContent_NotLikeSearch(judgementContent, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     * @param judgementContent The value of judgementContent as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementContent_NotLikeSearch(String judgementContent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementContent), xgetCValueJudgementContent(), "JUDGEMENT_CONTENT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     */
    public void setJudgementContent_IsNull() { regJudgementContent(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     */
    public void setJudgementContent_IsNullOrEmpty() { regJudgementContent(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判示事項)JUDGEMENT_CONTENT: {TEXT(65535)}
     */
    public void setJudgementContent_IsNotNull() { regJudgementContent(CK_ISNN, DOBJ); }

    protected void regJudgementContent(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementContent(), "JUDGEMENT_CONTENT"); }
    protected abstract ConditionValue xgetCValueJudgementContent();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     * @param judgementSummary The value of judgementSummary as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSummary_Equal(String judgementSummary) {
        doSetJudgementSummary_Equal(fRES(judgementSummary));
    }

    protected void doSetJudgementSummary_Equal(String judgementSummary) {
        regJudgementSummary(CK_EQ, judgementSummary);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementSummary_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementSummary The value of judgementSummary as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSummary_LikeSearch(String judgementSummary, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSummary_LikeSearch(judgementSummary, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementSummary The value of judgementSummary as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementSummary_LikeSearch(String judgementSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementSummary), xgetCValueJudgementSummary(), "JUDGEMENT_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     * @param judgementSummary The value of judgementSummary as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSummary_NotLikeSearch(String judgementSummary, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSummary_NotLikeSearch(judgementSummary, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     * @param judgementSummary The value of judgementSummary as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementSummary_NotLikeSearch(String judgementSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementSummary), xgetCValueJudgementSummary(), "JUDGEMENT_SUMMARY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementSummary_IsNull() { regJudgementSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementSummary_IsNullOrEmpty() { regJudgementSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (裁判要旨)JUDGEMENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementSummary_IsNotNull() { regJudgementSummary(CK_ISNN, DOBJ); }

    protected void regJudgementSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementSummary(), "JUDGEMENT_SUMMARY"); }
    protected abstract ConditionValue xgetCValueJudgementSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     * @param law The value of law as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLaw_Equal(String law) {
        doSetLaw_Equal(fRES(law));
    }

    protected void doSetLaw_Equal(String law) {
        regLaw(CK_EQ, law);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)} <br>
     * <pre>e.g. setLaw_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param law The value of law as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLaw_LikeSearch(String law, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLaw_LikeSearch(law, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)} <br>
     * <pre>e.g. setLaw_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param law The value of law as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLaw_LikeSearch(String law, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(law), xgetCValueLaw(), "LAW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     * @param law The value of law as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLaw_NotLikeSearch(String law, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLaw_NotLikeSearch(law, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     * @param law The value of law as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLaw_NotLikeSearch(String law, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(law), xgetCValueLaw(), "LAW", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     */
    public void setLaw_IsNull() { regLaw(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     */
    public void setLaw_IsNullOrEmpty() { regLaw(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (参照法条)LAW: {TEXT(65535)}
     */
    public void setLaw_IsNotNull() { regLaw(CK_ISNN, DOBJ); }

    protected void regLaw(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLaw(), "LAW"); }
    protected abstract ConditionValue xgetCValueLaw();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrl The value of textUrl as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTextUrl_Equal(String textUrl) {
        doSetTextUrl_Equal(fRES(textUrl));
    }

    protected void doSetTextUrl_Equal(String textUrl) {
        regTextUrl(CK_EQ, textUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrl The value of textUrl as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setTextUrl_NotEqual(String textUrl) {
        doSetTextUrl_NotEqual(fRES(textUrl));
    }

    protected void doSetTextUrl_NotEqual(String textUrl) {
        regTextUrl(CK_NES, textUrl);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrlList The collection of textUrl as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTextUrl_InScope(Collection<String> textUrlList) {
        doSetTextUrl_InScope(textUrlList);
    }

    protected void doSetTextUrl_InScope(Collection<String> textUrlList) {
        regINS(CK_INS, cTL(textUrlList), xgetCValueTextUrl(), "TEXT_URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrlList The collection of textUrl as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTextUrl_NotInScope(Collection<String> textUrlList) {
        doSetTextUrl_NotInScope(textUrlList);
    }

    protected void doSetTextUrl_NotInScope(Collection<String> textUrlList) {
        regINS(CK_NINS, cTL(textUrlList), xgetCValueTextUrl(), "TEXT_URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)} <br>
     * <pre>e.g. setTextUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param textUrl The value of textUrl as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTextUrl_LikeSearch(String textUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTextUrl_LikeSearch(textUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)} <br>
     * <pre>e.g. setTextUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param textUrl The value of textUrl as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTextUrl_LikeSearch(String textUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(textUrl), xgetCValueTextUrl(), "TEXT_URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrl The value of textUrl as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTextUrl_NotLikeSearch(String textUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTextUrl_NotLikeSearch(textUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     * @param textUrl The value of textUrl as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTextUrl_NotLikeSearch(String textUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(textUrl), xgetCValueTextUrl(), "TEXT_URL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     */
    public void setTextUrl_IsNull() { regTextUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     */
    public void setTextUrl_IsNullOrEmpty() { regTextUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (全文URL)TEXT_URL: {VARCHAR(150)}
     */
    public void setTextUrl_IsNotNull() { regTextUrl(CK_ISNN, DOBJ); }

    protected void regTextUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTextUrl(), "TEXT_URL"); }
    protected abstract ConditionValue xgetCValueTextUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReports The value of highCourtReports as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setHighCourtReports_Equal(String highCourtReports) {
        doSetHighCourtReports_Equal(fRES(highCourtReports));
    }

    protected void doSetHighCourtReports_Equal(String highCourtReports) {
        regHighCourtReports(CK_EQ, highCourtReports);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReports The value of highCourtReports as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setHighCourtReports_NotEqual(String highCourtReports) {
        doSetHighCourtReports_NotEqual(fRES(highCourtReports));
    }

    protected void doSetHighCourtReports_NotEqual(String highCourtReports) {
        regHighCourtReports(CK_NES, highCourtReports);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReportsList The collection of highCourtReports as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHighCourtReports_InScope(Collection<String> highCourtReportsList) {
        doSetHighCourtReports_InScope(highCourtReportsList);
    }

    protected void doSetHighCourtReports_InScope(Collection<String> highCourtReportsList) {
        regINS(CK_INS, cTL(highCourtReportsList), xgetCValueHighCourtReports(), "HIGH_COURT_REPORTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReportsList The collection of highCourtReports as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setHighCourtReports_NotInScope(Collection<String> highCourtReportsList) {
        doSetHighCourtReports_NotInScope(highCourtReportsList);
    }

    protected void doSetHighCourtReports_NotInScope(Collection<String> highCourtReportsList) {
        regINS(CK_NINS, cTL(highCourtReportsList), xgetCValueHighCourtReports(), "HIGH_COURT_REPORTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)} <br>
     * <pre>e.g. setHighCourtReports_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param highCourtReports The value of highCourtReports as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHighCourtReports_LikeSearch(String highCourtReports, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHighCourtReports_LikeSearch(highCourtReports, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)} <br>
     * <pre>e.g. setHighCourtReports_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param highCourtReports The value of highCourtReports as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHighCourtReports_LikeSearch(String highCourtReports, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(highCourtReports), xgetCValueHighCourtReports(), "HIGH_COURT_REPORTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReports The value of highCourtReports as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHighCourtReports_NotLikeSearch(String highCourtReports, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHighCourtReports_NotLikeSearch(highCourtReports, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     * @param highCourtReports The value of highCourtReports as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHighCourtReports_NotLikeSearch(String highCourtReports, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(highCourtReports), xgetCValueHighCourtReports(), "HIGH_COURT_REPORTS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     */
    public void setHighCourtReports_IsNull() { regHighCourtReports(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     */
    public void setHighCourtReports_IsNullOrEmpty() { regHighCourtReports(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (高裁判例集)HIGH_COURT_REPORTS: {VARCHAR(50)}
     */
    public void setHighCourtReports_IsNotNull() { regHighCourtReports(CK_ISNN, DOBJ); }

    protected void regHighCourtReports(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHighCourtReports(), "HIGH_COURT_REPORTS"); }
    protected abstract ConditionValue xgetCValueHighCourtReports();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     * @param judgementContentSummary The value of judgementContentSummary as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementContentSummary_Equal(String judgementContentSummary) {
        doSetJudgementContentSummary_Equal(fRES(judgementContentSummary));
    }

    protected void doSetJudgementContentSummary_Equal(String judgementContentSummary) {
        regJudgementContentSummary(CK_EQ, judgementContentSummary);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementContentSummary_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementContentSummary The value of judgementContentSummary as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementContentSummary_LikeSearch(String judgementContentSummary, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementContentSummary_LikeSearch(judgementContentSummary, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementContentSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementContentSummary The value of judgementContentSummary as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementContentSummary_LikeSearch(String judgementContentSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementContentSummary), xgetCValueJudgementContentSummary(), "JUDGEMENT_CONTENT_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     * @param judgementContentSummary The value of judgementContentSummary as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementContentSummary_NotLikeSearch(String judgementContentSummary, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementContentSummary_NotLikeSearch(judgementContentSummary, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     * @param judgementContentSummary The value of judgementContentSummary as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementContentSummary_NotLikeSearch(String judgementContentSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementContentSummary), xgetCValueJudgementContentSummary(), "JUDGEMENT_CONTENT_SUMMARY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementContentSummary_IsNull() { regJudgementContentSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementContentSummary_IsNullOrEmpty() { regJudgementContentSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判示事項の要旨)JUDGEMENT_CONTENT_SUMMARY: {TEXT(65535)}
     */
    public void setJudgementContentSummary_IsNotNull() { regJudgementContentSummary(CK_ISNN, DOBJ); }

    protected void regJudgementContentSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementContentSummary(), "JUDGEMENT_CONTENT_SUMMARY"); }
    protected abstract ConditionValue xgetCValueJudgementContentSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     * @param rightType The value of rightType as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRightType_Equal(String rightType) {
        doSetRightType_Equal(fRES(rightType));
    }

    protected void doSetRightType_Equal(String rightType) {
        regRightType(CK_EQ, rightType);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)} <br>
     * <pre>e.g. setRightType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param rightType The value of rightType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRightType_LikeSearch(String rightType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRightType_LikeSearch(rightType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)} <br>
     * <pre>e.g. setRightType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rightType The value of rightType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRightType_LikeSearch(String rightType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rightType), xgetCValueRightType(), "RIGHT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     * @param rightType The value of rightType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRightType_NotLikeSearch(String rightType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRightType_NotLikeSearch(rightType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     * @param rightType The value of rightType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRightType_NotLikeSearch(String rightType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rightType), xgetCValueRightType(), "RIGHT_TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     */
    public void setRightType_IsNull() { regRightType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     */
    public void setRightType_IsNullOrEmpty() { regRightType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (権利種別)RIGHT_TYPE: {TEXT(65535)}
     */
    public void setRightType_IsNotNull() { regRightType(CK_ISNN, DOBJ); }

    protected void regRightType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRightType(), "RIGHT_TYPE"); }
    protected abstract ConditionValue xgetCValueRightType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitType The value of lawsuitType as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawsuitType_Equal(String lawsuitType) {
        doSetLawsuitType_Equal(fRES(lawsuitType));
    }

    protected void doSetLawsuitType_Equal(String lawsuitType) {
        regLawsuitType(CK_EQ, lawsuitType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitType The value of lawsuitType as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawsuitType_NotEqual(String lawsuitType) {
        doSetLawsuitType_NotEqual(fRES(lawsuitType));
    }

    protected void doSetLawsuitType_NotEqual(String lawsuitType) {
        regLawsuitType(CK_NES, lawsuitType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitTypeList The collection of lawsuitType as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawsuitType_InScope(Collection<String> lawsuitTypeList) {
        doSetLawsuitType_InScope(lawsuitTypeList);
    }

    protected void doSetLawsuitType_InScope(Collection<String> lawsuitTypeList) {
        regINS(CK_INS, cTL(lawsuitTypeList), xgetCValueLawsuitType(), "LAWSUIT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitTypeList The collection of lawsuitType as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawsuitType_NotInScope(Collection<String> lawsuitTypeList) {
        doSetLawsuitType_NotInScope(lawsuitTypeList);
    }

    protected void doSetLawsuitType_NotInScope(Collection<String> lawsuitTypeList) {
        regINS(CK_NINS, cTL(lawsuitTypeList), xgetCValueLawsuitType(), "LAWSUIT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)} <br>
     * <pre>e.g. setLawsuitType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawsuitType The value of lawsuitType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawsuitType_LikeSearch(String lawsuitType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawsuitType_LikeSearch(lawsuitType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)} <br>
     * <pre>e.g. setLawsuitType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawsuitType The value of lawsuitType as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawsuitType_LikeSearch(String lawsuitType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawsuitType), xgetCValueLawsuitType(), "LAWSUIT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitType The value of lawsuitType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawsuitType_NotLikeSearch(String lawsuitType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawsuitType_NotLikeSearch(lawsuitType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     * @param lawsuitType The value of lawsuitType as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawsuitType_NotLikeSearch(String lawsuitType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawsuitType), xgetCValueLawsuitType(), "LAWSUIT_TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     */
    public void setLawsuitType_IsNull() { regLawsuitType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     */
    public void setLawsuitType_IsNullOrEmpty() { regLawsuitType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (訴訟類型)LAWSUIT_TYPE: {VARCHAR(200)}
     */
    public void setLawsuitType_IsNotNull() { regLawsuitType(CK_ISNN, DOBJ); }

    protected void regLawsuitType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawsuitType(), "LAWSUIT_TYPE"); }
    protected abstract ConditionValue xgetCValueLawsuitType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategory The value of caseCategory as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategory_Equal(String caseCategory) {
        doSetCaseCategory_Equal(fRES(caseCategory));
    }

    protected void doSetCaseCategory_Equal(String caseCategory) {
        regCaseCategory(CK_EQ, caseCategory);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategory The value of caseCategory as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategory_NotEqual(String caseCategory) {
        doSetCaseCategory_NotEqual(fRES(caseCategory));
    }

    protected void doSetCaseCategory_NotEqual(String caseCategory) {
        regCaseCategory(CK_NES, caseCategory);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategoryList The collection of caseCategory as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategory_InScope(Collection<String> caseCategoryList) {
        doSetCaseCategory_InScope(caseCategoryList);
    }

    protected void doSetCaseCategory_InScope(Collection<String> caseCategoryList) {
        regINS(CK_INS, cTL(caseCategoryList), xgetCValueCaseCategory(), "CASE_CATEGORY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategoryList The collection of caseCategory as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCaseCategory_NotInScope(Collection<String> caseCategoryList) {
        doSetCaseCategory_NotInScope(caseCategoryList);
    }

    protected void doSetCaseCategory_NotInScope(Collection<String> caseCategoryList) {
        regINS(CK_NINS, cTL(caseCategoryList), xgetCValueCaseCategory(), "CASE_CATEGORY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)} <br>
     * <pre>e.g. setCaseCategory_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param caseCategory The value of caseCategory as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategory_LikeSearch(String caseCategory, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategory_LikeSearch(caseCategory, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)} <br>
     * <pre>e.g. setCaseCategory_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseCategory The value of caseCategory as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCaseCategory_LikeSearch(String caseCategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseCategory), xgetCValueCaseCategory(), "CASE_CATEGORY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategory The value of caseCategory as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCaseCategory_NotLikeSearch(String caseCategory, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCaseCategory_NotLikeSearch(caseCategory, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     * @param caseCategory The value of caseCategory as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCaseCategory_NotLikeSearch(String caseCategory, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseCategory), xgetCValueCaseCategory(), "CASE_CATEGORY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     */
    public void setCaseCategory_IsNull() { regCaseCategory(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     */
    public void setCaseCategory_IsNullOrEmpty() { regCaseCategory(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (事件分野)CASE_CATEGORY: {VARCHAR(100)}
     */
    public void setCaseCategory_IsNotNull() { regCaseCategory(CK_ISNN, DOBJ); }

    protected void regCaseCategory(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseCategory(), "CASE_CATEGORY"); }
    protected abstract ConditionValue xgetCValueCaseCategory();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_Equal(Integer sourceOriginalId) {
        doSetSourceOriginalId_Equal(sourceOriginalId);
    }

    protected void doSetSourceOriginalId_Equal(Integer sourceOriginalId) {
        regSourceOriginalId(CK_EQ, sourceOriginalId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_NotEqual(Integer sourceOriginalId) {
        doSetSourceOriginalId_NotEqual(sourceOriginalId);
    }

    protected void doSetSourceOriginalId_NotEqual(Integer sourceOriginalId) {
        regSourceOriginalId(CK_NES, sourceOriginalId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_GreaterThan(Integer sourceOriginalId) {
        regSourceOriginalId(CK_GT, sourceOriginalId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_LessThan(Integer sourceOriginalId) {
        regSourceOriginalId(CK_LT, sourceOriginalId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_GreaterEqual(Integer sourceOriginalId) {
        regSourceOriginalId(CK_GE, sourceOriginalId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalId The value of sourceOriginalId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceOriginalId_LessEqual(Integer sourceOriginalId) {
        regSourceOriginalId(CK_LE, sourceOriginalId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of sourceOriginalId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceOriginalId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSourceOriginalId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSourceOriginalId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of sourceOriginalId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceOriginalId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSourceOriginalId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourceOriginalId(), "SOURCE_ORIGINAL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalIdList The collection of sourceOriginalId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceOriginalId_InScope(Collection<Integer> sourceOriginalIdList) {
        doSetSourceOriginalId_InScope(sourceOriginalIdList);
    }

    protected void doSetSourceOriginalId_InScope(Collection<Integer> sourceOriginalIdList) {
        regINS(CK_INS, cTL(sourceOriginalIdList), xgetCValueSourceOriginalId(), "SOURCE_ORIGINAL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元ID)SOURCE_ORIGINAL_ID: {UQ, NotNull, INT UNSIGNED(10)}
     * @param sourceOriginalIdList The collection of sourceOriginalId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceOriginalId_NotInScope(Collection<Integer> sourceOriginalIdList) {
        doSetSourceOriginalId_NotInScope(sourceOriginalIdList);
    }

    protected void doSetSourceOriginalId_NotInScope(Collection<Integer> sourceOriginalIdList) {
        regINS(CK_NINS, cTL(sourceOriginalIdList), xgetCValueSourceOriginalId(), "SOURCE_ORIGINAL_ID");
    }

    protected void regSourceOriginalId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceOriginalId(), "SOURCE_ORIGINAL_ID"); }
    protected abstract ConditionValue xgetCValueSourceOriginalId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     * @param memo The value of memo as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemo_Equal(String memo) {
        doSetMemo_Equal(fRES(memo));
    }

    protected void doSetMemo_Equal(String memo) {
        regMemo(CK_EQ, memo);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (備考)MEMO: {TEXT(65535)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memo The value of memo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_LikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_LikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (備考)MEMO: {TEXT(65535)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memo The value of memo as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMemo_LikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memo), xgetCValueMemo(), "MEMO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     * @param memo The value of memo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_NotLikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_NotLikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     * @param memo The value of memo as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMemo_NotLikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memo), xgetCValueMemo(), "MEMO", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     */
    public void setMemo_IsNull() { regMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     */
    public void setMemo_IsNullOrEmpty() { regMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (備考)MEMO: {TEXT(65535)}
     */
    public void setMemo_IsNotNull() { regMemo(CK_ISNN, DOBJ); }

    protected void regMemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemo(), "MEMO"); }
    protected abstract ConditionValue xgetCValueMemo();

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
    public HpSLCFunction<CourtJudgementCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CourtJudgementCB.class);
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
    public HpSLCFunction<CourtJudgementCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CourtJudgementCB.class);
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
    public HpSLCFunction<CourtJudgementCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CourtJudgementCB.class);
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
    public HpSLCFunction<CourtJudgementCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CourtJudgementCB.class);
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
    public HpSLCFunction<CourtJudgementCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CourtJudgementCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CourtJudgementCB&gt;() {
     *     public void query(CourtJudgementCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CourtJudgementCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CourtJudgementCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtJudgementCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CourtJudgementCQ sq);

    protected CourtJudgementCB xcreateScalarConditionCB() {
        CourtJudgementCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CourtJudgementCB xcreateScalarConditionPartitionByCB() {
        CourtJudgementCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CourtJudgementCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtJudgementCB cb = new CourtJudgementCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COURT_JUDGEMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CourtJudgementCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CourtJudgementCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CourtJudgementCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CourtJudgementCB cb = new CourtJudgementCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COURT_JUDGEMENT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CourtJudgementCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CourtJudgementCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CourtJudgementCB cb = new CourtJudgementCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CourtJudgementCQ sq);

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
    protected CourtJudgementCB newMyCB() {
        return new CourtJudgementCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CourtJudgementCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
