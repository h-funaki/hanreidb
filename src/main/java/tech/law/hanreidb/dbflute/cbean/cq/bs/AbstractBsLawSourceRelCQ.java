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
 * The abstract condition-query of LAW_SOURCE_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawSourceRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawSourceRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_SOURCE_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_Equal(Long lawSourceRelId) {
        doSetLawSourceRelId_Equal(lawSourceRelId);
    }

    protected void doSetLawSourceRelId_Equal(Long lawSourceRelId) {
        regLawSourceRelId(CK_EQ, lawSourceRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_NotEqual(Long lawSourceRelId) {
        doSetLawSourceRelId_NotEqual(lawSourceRelId);
    }

    protected void doSetLawSourceRelId_NotEqual(Long lawSourceRelId) {
        regLawSourceRelId(CK_NES, lawSourceRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_GreaterThan(Long lawSourceRelId) {
        regLawSourceRelId(CK_GT, lawSourceRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_LessThan(Long lawSourceRelId) {
        regLawSourceRelId(CK_LT, lawSourceRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_GreaterEqual(Long lawSourceRelId) {
        regLawSourceRelId(CK_GE, lawSourceRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelId The value of lawSourceRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawSourceRelId_LessEqual(Long lawSourceRelId) {
        regLawSourceRelId(CK_LE, lawSourceRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of lawSourceRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawSourceRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawSourceRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawSourceRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of lawSourceRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawSourceRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawSourceRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawSourceRelId(), "LAW_SOURCE_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelIdList The collection of lawSourceRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceRelId_InScope(Collection<Long> lawSourceRelIdList) {
        doSetLawSourceRelId_InScope(lawSourceRelIdList);
    }

    protected void doSetLawSourceRelId_InScope(Collection<Long> lawSourceRelIdList) {
        regINS(CK_INS, cTL(lawSourceRelIdList), xgetCValueLawSourceRelId(), "LAW_SOURCE_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawSourceRelIdList The collection of lawSourceRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceRelId_NotInScope(Collection<Long> lawSourceRelIdList) {
        doSetLawSourceRelId_NotInScope(lawSourceRelIdList);
    }

    protected void doSetLawSourceRelId_NotInScope(Collection<Long> lawSourceRelIdList) {
        regINS(CK_NINS, cTL(lawSourceRelIdList), xgetCValueLawSourceRelId(), "LAW_SOURCE_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawSourceRelId_IsNull() { regLawSourceRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令取得元リレーションID)LAW_SOURCE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawSourceRelId_IsNotNull() { regLawSourceRelId(CK_ISNN, DOBJ); }

    protected void regLawSourceRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawSourceRelId(), "LAW_SOURCE_REL_ID"); }
    protected abstract ConditionValue xgetCValueLawSourceRelId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterThan(Integer lawId) {
        regLawId(CK_GT, lawId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessThan(Integer lawId) {
        regLawId(CK_LT, lawId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterEqual(Integer lawId) {
        regLawId(CK_GE, lawId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessEqual(Integer lawId) {
        regLawId(CK_LE, lawId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawId(), "LAW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {IX, NotNull, INT(10), FK to LAW}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_Equal(String sourceCode) {
        doSetSourceCode_Equal(fRES(sourceCode));
    }

    /**
     * Equal(=). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
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
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCode The value of sourceCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotEqual(String sourceCode) {
        doSetSourceCode_NotEqual(fRES(sourceCode));
    }

    /**
     * NotEqual(&lt;&gt;). As Source. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
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
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_InScope(Collection<String> sourceCodeList) {
        doSetSourceCode_InScope(sourceCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
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
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source}
     * @param sourceCodeList The collection of sourceCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceCode_NotInScope(Collection<String> sourceCodeList) {
        doSetSourceCode_NotInScope(sourceCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Source. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (取得元コード)SOURCE_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_SOURCE, classification=Source} <br>
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
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceId The value of lawSourceId as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceId_Equal(String lawSourceId) {
        doSetLawSourceId_Equal(fRES(lawSourceId));
    }

    protected void doSetLawSourceId_Equal(String lawSourceId) {
        regLawSourceId(CK_EQ, lawSourceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceId The value of lawSourceId as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceId_NotEqual(String lawSourceId) {
        doSetLawSourceId_NotEqual(fRES(lawSourceId));
    }

    protected void doSetLawSourceId_NotEqual(String lawSourceId) {
        regLawSourceId(CK_NES, lawSourceId);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceIdList The collection of lawSourceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceId_InScope(Collection<String> lawSourceIdList) {
        doSetLawSourceId_InScope(lawSourceIdList);
    }

    protected void doSetLawSourceId_InScope(Collection<String> lawSourceIdList) {
        regINS(CK_INS, cTL(lawSourceIdList), xgetCValueLawSourceId(), "LAW_SOURCE_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceIdList The collection of lawSourceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawSourceId_NotInScope(Collection<String> lawSourceIdList) {
        doSetLawSourceId_NotInScope(lawSourceIdList);
    }

    protected void doSetLawSourceId_NotInScope(Collection<String> lawSourceIdList) {
        regINS(CK_NINS, cTL(lawSourceIdList), xgetCValueLawSourceId(), "LAW_SOURCE_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setLawSourceId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lawSourceId The value of lawSourceId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawSourceId_LikeSearch(String lawSourceId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawSourceId_LikeSearch(lawSourceId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setLawSourceId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lawSourceId The value of lawSourceId as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLawSourceId_LikeSearch(String lawSourceId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lawSourceId), xgetCValueLawSourceId(), "LAW_SOURCE_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceId The value of lawSourceId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLawSourceId_NotLikeSearch(String lawSourceId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLawSourceId_NotLikeSearch(lawSourceId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (法令取得元ID)LAW_SOURCE_ID: {NotNull, VARCHAR(100)}
     * @param lawSourceId The value of lawSourceId as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLawSourceId_NotLikeSearch(String lawSourceId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lawSourceId), xgetCValueLawSourceId(), "LAW_SOURCE_ID", likeSearchOption);
    }

    protected void regLawSourceId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawSourceId(), "LAW_SOURCE_ID"); }
    protected abstract ConditionValue xgetCValueLawSourceId();

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
    public HpSLCFunction<LawSourceRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawSourceRelCB.class);
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
    public HpSLCFunction<LawSourceRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawSourceRelCB.class);
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
    public HpSLCFunction<LawSourceRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawSourceRelCB.class);
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
    public HpSLCFunction<LawSourceRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawSourceRelCB.class);
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
    public HpSLCFunction<LawSourceRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawSourceRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawSourceRelCB&gt;() {
     *     public void query(LawSourceRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawSourceRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawSourceRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawSourceRelCQ sq);

    protected LawSourceRelCB xcreateScalarConditionCB() {
        LawSourceRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawSourceRelCB xcreateScalarConditionPartitionByCB() {
        LawSourceRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawSourceRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_SOURCE_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawSourceRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawSourceRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawSourceRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_SOURCE_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawSourceRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawSourceRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawSourceRelCB cb = new LawSourceRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawSourceRelCQ sq);

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
    protected LawSourceRelCB newMyCB() {
        return new LawSourceRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawSourceRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
