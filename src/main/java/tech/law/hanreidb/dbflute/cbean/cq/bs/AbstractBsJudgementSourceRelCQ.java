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
 * The abstract condition-query of JUDGEMENT_SOURCE_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsJudgementSourceRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsJudgementSourceRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "JUDGEMENT_SOURCE_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_Equal(Long judgementSourceRelId) {
        doSetJudgementSourceRelId_Equal(judgementSourceRelId);
    }

    protected void doSetJudgementSourceRelId_Equal(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_EQ, judgementSourceRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_NotEqual(Long judgementSourceRelId) {
        doSetJudgementSourceRelId_NotEqual(judgementSourceRelId);
    }

    protected void doSetJudgementSourceRelId_NotEqual(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_NES, judgementSourceRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_GreaterThan(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_GT, judgementSourceRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_LessThan(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_LT, judgementSourceRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_GreaterEqual(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_GE, judgementSourceRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelId The value of judgementSourceRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementSourceRelId_LessEqual(Long judgementSourceRelId) {
        regJudgementSourceRelId(CK_LE, judgementSourceRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementSourceRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementSourceRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementSourceRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementSourceRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of judgementSourceRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementSourceRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementSourceRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementSourceRelId(), "JUDGEMENT_SOURCE_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelIdList The collection of judgementSourceRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceRelId_InScope(Collection<Long> judgementSourceRelIdList) {
        doSetJudgementSourceRelId_InScope(judgementSourceRelIdList);
    }

    protected void doSetJudgementSourceRelId_InScope(Collection<Long> judgementSourceRelIdList) {
        regINS(CK_INS, cTL(judgementSourceRelIdList), xgetCValueJudgementSourceRelId(), "JUDGEMENT_SOURCE_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param judgementSourceRelIdList The collection of judgementSourceRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceRelId_NotInScope(Collection<Long> judgementSourceRelIdList) {
        doSetJudgementSourceRelId_NotInScope(judgementSourceRelIdList);
    }

    protected void doSetJudgementSourceRelId_NotInScope(Collection<Long> judgementSourceRelIdList) {
        regINS(CK_NINS, cTL(judgementSourceRelIdList), xgetCValueJudgementSourceRelId(), "JUDGEMENT_SOURCE_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementSourceRelId_IsNull() { regJudgementSourceRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決取得元リレーションID)JUDGEMENT_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setJudgementSourceRelId_IsNotNull() { regJudgementSourceRelId(CK_ISNN, DOBJ); }

    protected void regJudgementSourceRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementSourceRelId(), "JUDGEMENT_SOURCE_REL_ID"); }
    protected abstract ConditionValue xgetCValueJudgementSourceRelId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_Equal(String sourceCode) {
        doSetSourceCode_Equal(fRES(sourceCode));
    }

    /**
     * Equal(=). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_Equal_AsSource(CDef.Source cdef) {
        doSetSourceCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_Equal_裁判所裁判例() {
        setSourceCode_Equal_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * Equal(=). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_Equal_Egov() {
        setSourceCode_Equal_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_Equal(String sourceCode) {
        regSourceCode(CK_EQ, sourceCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotEqual(String sourceCode) {
        doSetSourceCode_NotEqual(fRES(sourceCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceCode_NotEqual_AsSource(CDef.Source cdef) {
        doSetSourceCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 裁判所裁判例 (COURT). And OnlyOnceRegistered. <br>
     * 裁判所裁判例: 裁判所裁判例
     */
    public void setSourceCode_NotEqual_裁判所裁判例() {
        setSourceCode_NotEqual_AsSource(CDef.Source.裁判所裁判例);
    }

    /**
     * NotEqual(&lt;&gt;). As Egov (EGOV). And OnlyOnceRegistered. <br>
     * e-Gov: e-Gov
     */
    public void setSourceCode_NotEqual_Egov() {
        setSourceCode_NotEqual_AsSource(CDef.Source.Egov);
    }

    protected void doSetSourceCode_NotEqual(String sourceCode) {
        regSourceCode(CK_NES, sourceCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope(Collection<String> sourceCodeList) {
        doSetSourceCode_InScope(sourceCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_InScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_InScope(Collection<String> sourceCodeList) {
        regINS(CK_INS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope(Collection<String> sourceCodeList) {
        doSetSourceCode_NotInScope(sourceCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {UQ+, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope_AsSource(Collection<CDef.Source> cdefList) {
        doSetSourceCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSourceCode_NotInScope(Collection<String> sourceCodeList) {
        regINS(CK_NINS, cTL(sourceCodeList), xgetCValueSourceCode(), "SOURCE_CODE");
    }

    protected void regSourceCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceCode(), "SOURCE_CODE"); }
    protected abstract ConditionValue xgetCValueSourceCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceId The value of judgementSourceId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceId_Equal(String judgementSourceId) {
        doSetJudgementSourceId_Equal(fRES(judgementSourceId));
    }

    protected void doSetJudgementSourceId_Equal(String judgementSourceId) {
        regJudgementSourceId(CK_EQ, judgementSourceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceId The value of judgementSourceId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceId_NotEqual(String judgementSourceId) {
        doSetJudgementSourceId_NotEqual(fRES(judgementSourceId));
    }

    protected void doSetJudgementSourceId_NotEqual(String judgementSourceId) {
        regJudgementSourceId(CK_NES, judgementSourceId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceIdList The collection of judgementSourceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceId_InScope(Collection<String> judgementSourceIdList) {
        doSetJudgementSourceId_InScope(judgementSourceIdList);
    }

    protected void doSetJudgementSourceId_InScope(Collection<String> judgementSourceIdList) {
        regINS(CK_INS, cTL(judgementSourceIdList), xgetCValueJudgementSourceId(), "JUDGEMENT_SOURCE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceIdList The collection of judgementSourceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceId_NotInScope(Collection<String> judgementSourceIdList) {
        doSetJudgementSourceId_NotInScope(judgementSourceIdList);
    }

    protected void doSetJudgementSourceId_NotInScope(Collection<String> judgementSourceIdList) {
        regINS(CK_NINS, cTL(judgementSourceIdList), xgetCValueJudgementSourceId(), "JUDGEMENT_SOURCE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setJudgementSourceId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementSourceId The value of judgementSourceId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSourceId_LikeSearch(String judgementSourceId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSourceId_LikeSearch(judgementSourceId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setJudgementSourceId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementSourceId The value of judgementSourceId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementSourceId_LikeSearch(String judgementSourceId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementSourceId), xgetCValueJudgementSourceId(), "JUDGEMENT_SOURCE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceId The value of judgementSourceId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSourceId_NotLikeSearch(String judgementSourceId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSourceId_NotLikeSearch(judgementSourceId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決取得元ID)JUDGEMENT_SOURCE_ID: {+UQ, NotNull, VARCHAR(100)}
     * @param judgementSourceId The value of judgementSourceId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementSourceId_NotLikeSearch(String judgementSourceId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementSourceId), xgetCValueJudgementSourceId(), "JUDGEMENT_SOURCE_ID", likeSearchOption);
    }

    protected void regJudgementSourceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementSourceId(), "JUDGEMENT_SOURCE_ID"); }
    protected abstract ConditionValue xgetCValueJudgementSourceId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     * @param judgementSourceSentence The value of judgementSourceSentence as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementSourceSentence_Equal(String judgementSourceSentence) {
        doSetJudgementSourceSentence_Equal(fRES(judgementSourceSentence));
    }

    protected void doSetJudgementSourceSentence_Equal(String judgementSourceSentence) {
        regJudgementSourceSentence(CK_EQ, judgementSourceSentence);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementSourceSentence_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param judgementSourceSentence The value of judgementSourceSentence as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSourceSentence_LikeSearch(String judgementSourceSentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSourceSentence_LikeSearch(judgementSourceSentence, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)} <br>
     * <pre>e.g. setJudgementSourceSentence_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param judgementSourceSentence The value of judgementSourceSentence as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setJudgementSourceSentence_LikeSearch(String judgementSourceSentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(judgementSourceSentence), xgetCValueJudgementSourceSentence(), "JUDGEMENT_SOURCE_SENTENCE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     * @param judgementSourceSentence The value of judgementSourceSentence as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setJudgementSourceSentence_NotLikeSearch(String judgementSourceSentence, ConditionOptionCall<LikeSearchOption> opLambda) {
        setJudgementSourceSentence_NotLikeSearch(judgementSourceSentence, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     * @param judgementSourceSentence The value of judgementSourceSentence as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setJudgementSourceSentence_NotLikeSearch(String judgementSourceSentence, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(judgementSourceSentence), xgetCValueJudgementSourceSentence(), "JUDGEMENT_SOURCE_SENTENCE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     */
    public void setJudgementSourceSentence_IsNull() { regJudgementSourceSentence(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     */
    public void setJudgementSourceSentence_IsNullOrEmpty() { regJudgementSourceSentence(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決文)JUDGEMENT_SOURCE_SENTENCE: {TEXT(65535)}
     */
    public void setJudgementSourceSentence_IsNotNull() { regJudgementSourceSentence(CK_ISNN, DOBJ); }

    protected void regJudgementSourceSentence(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementSourceSentence(), "JUDGEMENT_SOURCE_SENTENCE"); }
    protected abstract ConditionValue xgetCValueJudgementSourceSentence();

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
    public HpSLCFunction<JudgementSourceRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, JudgementSourceRelCB.class);
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
    public HpSLCFunction<JudgementSourceRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, JudgementSourceRelCB.class);
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
    public HpSLCFunction<JudgementSourceRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, JudgementSourceRelCB.class);
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
    public HpSLCFunction<JudgementSourceRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, JudgementSourceRelCB.class);
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
    public HpSLCFunction<JudgementSourceRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, JudgementSourceRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;JudgementSourceRelCB&gt;() {
     *     public void query(JudgementSourceRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementSourceRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, JudgementSourceRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(JudgementSourceRelCQ sq);

    protected JudgementSourceRelCB xcreateScalarConditionCB() {
        JudgementSourceRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected JudgementSourceRelCB xcreateScalarConditionPartitionByCB() {
        JudgementSourceRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<JudgementSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JUDGEMENT_SOURCE_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(JudgementSourceRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<JudgementSourceRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(JudgementSourceRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JUDGEMENT_SOURCE_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(JudgementSourceRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<JudgementSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementSourceRelCB cb = new JudgementSourceRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(JudgementSourceRelCQ sq);

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
    protected JudgementSourceRelCB newMyCB() {
        return new JudgementSourceRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return JudgementSourceRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
