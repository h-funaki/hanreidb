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
 * The abstract condition-query of JUDGEMENT_REPORT_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsJudgementReportRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsJudgementReportRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "JUDGEMENT_REPORT_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_Equal(Long judgementReportsRelId) {
        doSetJudgementReportsRelId_Equal(judgementReportsRelId);
    }

    protected void doSetJudgementReportsRelId_Equal(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_EQ, judgementReportsRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_NotEqual(Long judgementReportsRelId) {
        doSetJudgementReportsRelId_NotEqual(judgementReportsRelId);
    }

    protected void doSetJudgementReportsRelId_NotEqual(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_NES, judgementReportsRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_GreaterThan(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_GT, judgementReportsRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_LessThan(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_LT, judgementReportsRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_GreaterEqual(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_GE, judgementReportsRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelId The value of judgementReportsRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementReportsRelId_LessEqual(Long judgementReportsRelId) {
        regJudgementReportsRelId(CK_LE, judgementReportsRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementReportsRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementReportsRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementReportsRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementReportsRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementReportsRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementReportsRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementReportsRelId(), "JUDGEMENT_REPORTS_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelIdList The collection of judgementReportsRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsRelId_InScope(Collection<Long> judgementReportsRelIdList) {
        doSetJudgementReportsRelId_InScope(judgementReportsRelIdList);
    }

    protected void doSetJudgementReportsRelId_InScope(Collection<Long> judgementReportsRelIdList) {
        regINS(CK_INS, cTL(judgementReportsRelIdList), xgetCValueJudgementReportsRelId(), "JUDGEMENT_REPORTS_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementReportsRelIdList The collection of judgementReportsRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementReportsRelId_NotInScope(Collection<Long> judgementReportsRelIdList) {
        doSetJudgementReportsRelId_NotInScope(judgementReportsRelIdList);
    }

    protected void doSetJudgementReportsRelId_NotInScope(Collection<Long> judgementReportsRelIdList) {
        regINS(CK_NINS, cTL(judgementReportsRelIdList), xgetCValueJudgementReportsRelId(), "JUDGEMENT_REPORTS_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementReportsRelId_IsNull() { regJudgementReportsRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決判例集リレーションID)JUDGEMENT_REPORTS_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementReportsRelId_IsNotNull() { regJudgementReportsRelId(CK_ISNN, DOBJ); }

    protected void regJudgementReportsRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementReportsRelId(), "JUDGEMENT_REPORTS_REL_ID"); }
    protected abstract ConditionValue xgetCValueJudgementReportsRelId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_Equal(Long judgementId) {
        doSetJudgementId_Equal(judgementId);
    }

    protected void doSetJudgementId_Equal(Long judgementId) {
        regJudgementId(CK_EQ, judgementId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_NotEqual(Long judgementId) {
        doSetJudgementId_NotEqual(judgementId);
    }

    protected void doSetJudgementId_NotEqual(Long judgementId) {
        regJudgementId(CK_NES, judgementId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_GreaterThan(Long judgementId) {
        regJudgementId(CK_GT, judgementId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_LessThan(Long judgementId) {
        regJudgementId(CK_LT, judgementId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_GreaterEqual(Long judgementId) {
        regJudgementId(CK_GE, judgementId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementId The value of judgementId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementId_LessEqual(Long judgementId) {
        regJudgementId(CK_LE, judgementId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param minNumber The min number of judgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param minNumber The min number of judgementId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementId(), "JUDGEMENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementIdList The collection of judgementId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementId_InScope(Collection<Long> judgementIdList) {
        doSetJudgementId_InScope(judgementIdList);
    }

    protected void doSetJudgementId_InScope(Collection<Long> judgementIdList) {
        regINS(CK_INS, cTL(judgementIdList), xgetCValueJudgementId(), "JUDGEMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決ID)JUDGEMENT_ID: {IX, NotNull, BIGINT UNSIGNED(20), FK to JUDGEMENT}
     * @param judgementIdList The collection of judgementId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementId_NotInScope(Collection<Long> judgementIdList) {
        doSetJudgementId_NotInScope(judgementIdList);
    }

    protected void doSetJudgementId_NotInScope(Collection<Long> judgementIdList) {
        regINS(CK_NINS, cTL(judgementIdList), xgetCValueJudgementId(), "JUDGEMENT_ID");
    }

    protected void regJudgementId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementId(), "JUDGEMENT_ID"); }
    protected abstract ConditionValue xgetCValueJudgementId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
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
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
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
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param reportId The value of reportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterThan(Integer reportId) {
        regReportId(CK_GT, reportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param reportId The value of reportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessThan(Integer reportId) {
        regReportId(CK_LT, reportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param reportId The value of reportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterEqual(Integer reportId) {
        regReportId(CK_GE, reportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param reportId The value of reportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessEqual(Integer reportId) {
        regReportId(CK_LE, reportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
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
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param minNumber The min number of reportId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReportId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportId(), "REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
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
     * (判例集ID)REPORT_ID: {IX, NotNull, INT UNSIGNED(10), FK to REPORT}
     * @param reportIdList The collection of reportId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportId_NotInScope(Collection<Integer> reportIdList) {
        doSetReportId_NotInScope(reportIdList);
    }

    protected void doSetReportId_NotInScope(Collection<Integer> reportIdList) {
        regINS(CK_NINS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    protected void regReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportId(), "REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReportId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_Equal(Integer reportKan) {
        doSetReportKan_Equal(reportKan);
    }

    protected void doSetReportKan_Equal(Integer reportKan) {
        regReportKan(CK_EQ, reportKan);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_NotEqual(Integer reportKan) {
        doSetReportKan_NotEqual(reportKan);
    }

    protected void doSetReportKan_NotEqual(Integer reportKan) {
        regReportKan(CK_NES, reportKan);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_GreaterThan(Integer reportKan) {
        regReportKan(CK_GT, reportKan);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_LessThan(Integer reportKan) {
        regReportKan(CK_LT, reportKan);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_GreaterEqual(Integer reportKan) {
        regReportKan(CK_GE, reportKan);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKan The value of reportKan as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKan_LessEqual(Integer reportKan) {
        regReportKan(CK_LE, reportKan);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportKan. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportKan. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReportKan_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReportKan_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportKan. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportKan. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReportKan_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportKan(), "REPORT_KAN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKanList The collection of reportKan as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportKan_InScope(Collection<Integer> reportKanList) {
        doSetReportKan_InScope(reportKanList);
    }

    protected void doSetReportKan_InScope(Collection<Integer> reportKanList) {
        regINS(CK_INS, cTL(reportKanList), xgetCValueReportKan(), "REPORT_KAN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     * @param reportKanList The collection of reportKan as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportKan_NotInScope(Collection<Integer> reportKanList) {
        doSetReportKan_NotInScope(reportKanList);
    }

    protected void doSetReportKan_NotInScope(Collection<Integer> reportKanList) {
        regINS(CK_NINS, cTL(reportKanList), xgetCValueReportKan(), "REPORT_KAN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     */
    public void setReportKan_IsNull() { regReportKan(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集巻)REPORT_KAN: {INT UNSIGNED(10)}
     */
    public void setReportKan_IsNotNull() { regReportKan(CK_ISNN, DOBJ); }

    protected void regReportKan(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportKan(), "REPORT_KAN"); }
    protected abstract ConditionValue xgetCValueReportKan();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_Equal(Integer reportGo) {
        doSetReportGo_Equal(reportGo);
    }

    protected void doSetReportGo_Equal(Integer reportGo) {
        regReportGo(CK_EQ, reportGo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_NotEqual(Integer reportGo) {
        doSetReportGo_NotEqual(reportGo);
    }

    protected void doSetReportGo_NotEqual(Integer reportGo) {
        regReportGo(CK_NES, reportGo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_GreaterThan(Integer reportGo) {
        regReportGo(CK_GT, reportGo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_LessThan(Integer reportGo) {
        regReportGo(CK_LT, reportGo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_GreaterEqual(Integer reportGo) {
        regReportGo(CK_GE, reportGo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGo The value of reportGo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportGo_LessEqual(Integer reportGo) {
        regReportGo(CK_LE, reportGo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportGo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReportGo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReportGo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportGo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportGo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReportGo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportGo(), "REPORT_GO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGoList The collection of reportGo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportGo_InScope(Collection<Integer> reportGoList) {
        doSetReportGo_InScope(reportGoList);
    }

    protected void doSetReportGo_InScope(Collection<Integer> reportGoList) {
        regINS(CK_INS, cTL(reportGoList), xgetCValueReportGo(), "REPORT_GO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     * @param reportGoList The collection of reportGo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportGo_NotInScope(Collection<Integer> reportGoList) {
        doSetReportGo_NotInScope(reportGoList);
    }

    protected void doSetReportGo_NotInScope(Collection<Integer> reportGoList) {
        regINS(CK_NINS, cTL(reportGoList), xgetCValueReportGo(), "REPORT_GO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     */
    public void setReportGo_IsNull() { regReportGo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集号)REPORT_GO: {INT UNSIGNED(10)}
     */
    public void setReportGo_IsNotNull() { regReportGo(CK_ISNN, DOBJ); }

    protected void regReportGo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportGo(), "REPORT_GO"); }
    protected abstract ConditionValue xgetCValueReportGo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_Equal(Integer reportKo) {
        doSetReportKo_Equal(reportKo);
    }

    protected void doSetReportKo_Equal(Integer reportKo) {
        regReportKo(CK_EQ, reportKo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_NotEqual(Integer reportKo) {
        doSetReportKo_NotEqual(reportKo);
    }

    protected void doSetReportKo_NotEqual(Integer reportKo) {
        regReportKo(CK_NES, reportKo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_GreaterThan(Integer reportKo) {
        regReportKo(CK_GT, reportKo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_LessThan(Integer reportKo) {
        regReportKo(CK_LT, reportKo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_GreaterEqual(Integer reportKo) {
        regReportKo(CK_GE, reportKo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKo The value of reportKo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportKo_LessEqual(Integer reportKo) {
        regReportKo(CK_LE, reportKo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportKo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setReportKo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setReportKo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param minNumber The min number of reportKo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reportKo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setReportKo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportKo(), "REPORT_KO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKoList The collection of reportKo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportKo_InScope(Collection<Integer> reportKoList) {
        doSetReportKo_InScope(reportKoList);
    }

    protected void doSetReportKo_InScope(Collection<Integer> reportKoList) {
        regINS(CK_INS, cTL(reportKoList), xgetCValueReportKo(), "REPORT_KO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     * @param reportKoList The collection of reportKo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setReportKo_NotInScope(Collection<Integer> reportKoList) {
        doSetReportKo_NotInScope(reportKoList);
    }

    protected void doSetReportKo_NotInScope(Collection<Integer> reportKoList) {
        regINS(CK_NINS, cTL(reportKoList), xgetCValueReportKo(), "REPORT_KO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     */
    public void setReportKo_IsNull() { regReportKo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判例集頁)REPORT_KO: {INT UNSIGNED(10)}
     */
    public void setReportKo_IsNotNull() { regReportKo(CK_ISNN, DOBJ); }

    protected void regReportKo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportKo(), "REPORT_KO"); }
    protected abstract ConditionValue xgetCValueReportKo();

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
    public HpSLCFunction<JudgementReportRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, JudgementReportRelCB.class);
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
    public HpSLCFunction<JudgementReportRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, JudgementReportRelCB.class);
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
    public HpSLCFunction<JudgementReportRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, JudgementReportRelCB.class);
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
    public HpSLCFunction<JudgementReportRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, JudgementReportRelCB.class);
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
    public HpSLCFunction<JudgementReportRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, JudgementReportRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;JudgementReportRelCB&gt;() {
     *     public void query(JudgementReportRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementReportRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, JudgementReportRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementReportRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(JudgementReportRelCQ sq);

    protected JudgementReportRelCB xcreateScalarConditionCB() {
        JudgementReportRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected JudgementReportRelCB xcreateScalarConditionPartitionByCB() {
        JudgementReportRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<JudgementReportRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JUDGEMENT_REPORTS_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(JudgementReportRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<JudgementReportRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(JudgementReportRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JUDGEMENT_REPORTS_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(JudgementReportRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<JudgementReportRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementReportRelCB cb = new JudgementReportRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(JudgementReportRelCQ sq);

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
    protected JudgementReportRelCB newMyCB() {
        return new JudgementReportRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return JudgementReportRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
