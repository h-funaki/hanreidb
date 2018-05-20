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
 * The abstract condition-query of SOURCE_LAW_CATEGORY_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSourceLawCategoryRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSourceLawCategoryRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "SOURCE_LAW_CATEGORY_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_Equal(Long sourceLawCategoryRelId) {
        doSetSourceLawCategoryRelId_Equal(sourceLawCategoryRelId);
    }

    protected void doSetSourceLawCategoryRelId_Equal(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_EQ, sourceLawCategoryRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_NotEqual(Long sourceLawCategoryRelId) {
        doSetSourceLawCategoryRelId_NotEqual(sourceLawCategoryRelId);
    }

    protected void doSetSourceLawCategoryRelId_NotEqual(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_NES, sourceLawCategoryRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_GreaterThan(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_GT, sourceLawCategoryRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_LessThan(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_LT, sourceLawCategoryRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_GreaterEqual(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_GE, sourceLawCategoryRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelId The value of sourceLawCategoryRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryRelId_LessEqual(Long sourceLawCategoryRelId) {
        regSourceLawCategoryRelId(CK_LE, sourceLawCategoryRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of sourceLawCategoryRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSourceLawCategoryRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSourceLawCategoryRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of sourceLawCategoryRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSourceLawCategoryRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourceLawCategoryRelId(), "SOURCE_LAW_CATEGORY_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelIdList The collection of sourceLawCategoryRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryRelId_InScope(Collection<Long> sourceLawCategoryRelIdList) {
        doSetSourceLawCategoryRelId_InScope(sourceLawCategoryRelIdList);
    }

    protected void doSetSourceLawCategoryRelId_InScope(Collection<Long> sourceLawCategoryRelIdList) {
        regINS(CK_INS, cTL(sourceLawCategoryRelIdList), xgetCValueSourceLawCategoryRelId(), "SOURCE_LAW_CATEGORY_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param sourceLawCategoryRelIdList The collection of sourceLawCategoryRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryRelId_NotInScope(Collection<Long> sourceLawCategoryRelIdList) {
        doSetSourceLawCategoryRelId_NotInScope(sourceLawCategoryRelIdList);
    }

    protected void doSetSourceLawCategoryRelId_NotInScope(Collection<Long> sourceLawCategoryRelIdList) {
        regINS(CK_NINS, cTL(sourceLawCategoryRelIdList), xgetCValueSourceLawCategoryRelId(), "SOURCE_LAW_CATEGORY_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSourceLawCategoryRelId_IsNull() { regSourceLawCategoryRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーリレーションID)SOURCE_LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSourceLawCategoryRelId_IsNotNull() { regSourceLawCategoryRelId(CK_ISNN, DOBJ); }

    protected void regSourceLawCategoryRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceLawCategoryRelId(), "SOURCE_LAW_CATEGORY_REL_ID"); }
    protected abstract ConditionValue xgetCValueSourceLawCategoryRelId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_Equal(Integer sourceLawCategoryId) {
        doSetSourceLawCategoryId_Equal(sourceLawCategoryId);
    }

    protected void doSetSourceLawCategoryId_Equal(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_EQ, sourceLawCategoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_NotEqual(Integer sourceLawCategoryId) {
        doSetSourceLawCategoryId_NotEqual(sourceLawCategoryId);
    }

    protected void doSetSourceLawCategoryId_NotEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_NES, sourceLawCategoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_GreaterThan(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_GT, sourceLawCategoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_LessThan(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_LT, sourceLawCategoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_GreaterEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_GE, sourceLawCategoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryId The value of sourceLawCategoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSourceLawCategoryId_LessEqual(Integer sourceLawCategoryId) {
        regSourceLawCategoryId(CK_LE, sourceLawCategoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param minNumber The min number of sourceLawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSourceLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSourceLawCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param minNumber The min number of sourceLawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of sourceLawCategoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSourceLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryIdList The collection of sourceLawCategoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryId_InScope(Collection<Integer> sourceLawCategoryIdList) {
        doSetSourceLawCategoryId_InScope(sourceLawCategoryIdList);
    }

    protected void doSetSourceLawCategoryId_InScope(Collection<Integer> sourceLawCategoryIdList) {
        regINS(CK_INS, cTL(sourceLawCategoryIdList), xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (取得元法令カテゴリーID)SOURCE_LAW_CATEGORY_ID: {IX, NotNull, INT(10), FK to SOURCE_LAW_CATEGORY}
     * @param sourceLawCategoryIdList The collection of sourceLawCategoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSourceLawCategoryId_NotInScope(Collection<Integer> sourceLawCategoryIdList) {
        doSetSourceLawCategoryId_NotInScope(sourceLawCategoryIdList);
    }

    protected void doSetSourceLawCategoryId_NotInScope(Collection<Integer> sourceLawCategoryIdList) {
        regINS(CK_NINS, cTL(sourceLawCategoryIdList), xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID");
    }

    protected void regSourceLawCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSourceLawCategoryId(), "SOURCE_LAW_CATEGORY_ID"); }
    protected abstract ConditionValue xgetCValueSourceLawCategoryId();

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
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, SourceLawCategoryRelCB.class);
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
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, SourceLawCategoryRelCB.class);
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
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, SourceLawCategoryRelCB.class);
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
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, SourceLawCategoryRelCB.class);
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
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, SourceLawCategoryRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SourceLawCategoryRelCB&gt;() {
     *     public void query(SourceLawCategoryRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<SourceLawCategoryRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, SourceLawCategoryRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(SourceLawCategoryRelCQ sq);

    protected SourceLawCategoryRelCB xcreateScalarConditionCB() {
        SourceLawCategoryRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected SourceLawCategoryRelCB xcreateScalarConditionPartitionByCB() {
        SourceLawCategoryRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<SourceLawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOURCE_LAW_CATEGORY_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(SourceLawCategoryRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SourceLawCategoryRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(SourceLawCategoryRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOURCE_LAW_CATEGORY_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(SourceLawCategoryRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<SourceLawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        SourceLawCategoryRelCB cb = new SourceLawCategoryRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(SourceLawCategoryRelCQ sq);

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
    protected SourceLawCategoryRelCB newMyCB() {
        return new SourceLawCategoryRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return SourceLawCategoryRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
