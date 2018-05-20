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
 * The abstract condition-query of LAW_CATEGORY_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLawCategoryRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLawCategoryRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LAW_CATEGORY_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_Equal(Long lawCategoryRelId) {
        doSetLawCategoryRelId_Equal(lawCategoryRelId);
    }

    protected void doSetLawCategoryRelId_Equal(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_EQ, lawCategoryRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_NotEqual(Long lawCategoryRelId) {
        doSetLawCategoryRelId_NotEqual(lawCategoryRelId);
    }

    protected void doSetLawCategoryRelId_NotEqual(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_NES, lawCategoryRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_GreaterThan(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_GT, lawCategoryRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_LessThan(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_LT, lawCategoryRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_GreaterEqual(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_GE, lawCategoryRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelId The value of lawCategoryRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryRelId_LessEqual(Long lawCategoryRelId) {
        regLawCategoryRelId(CK_LE, lawCategoryRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of lawCategoryRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawCategoryRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawCategoryRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of lawCategoryRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawCategoryRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawCategoryRelId(), "LAW_CATEGORY_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelIdList The collection of lawCategoryRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryRelId_InScope(Collection<Long> lawCategoryRelIdList) {
        doSetLawCategoryRelId_InScope(lawCategoryRelIdList);
    }

    protected void doSetLawCategoryRelId_InScope(Collection<Long> lawCategoryRelIdList) {
        regINS(CK_INS, cTL(lawCategoryRelIdList), xgetCValueLawCategoryRelId(), "LAW_CATEGORY_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param lawCategoryRelIdList The collection of lawCategoryRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryRelId_NotInScope(Collection<Long> lawCategoryRelIdList) {
        doSetLawCategoryRelId_NotInScope(lawCategoryRelIdList);
    }

    protected void doSetLawCategoryRelId_NotInScope(Collection<Long> lawCategoryRelIdList) {
        regINS(CK_NINS, cTL(lawCategoryRelIdList), xgetCValueLawCategoryRelId(), "LAW_CATEGORY_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawCategoryRelId_IsNull() { regLawCategoryRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (法令カテゴリーリレーションID)LAW_CATEGORY_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLawCategoryRelId_IsNotNull() { regLawCategoryRelId(CK_ISNN, DOBJ); }

    protected void regLawCategoryRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryRelId(), "LAW_CATEGORY_REL_ID"); }
    protected abstract ConditionValue xgetCValueLawCategoryRelId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterThan(Integer lawId) {
        regLawId(CK_GT, lawId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessThan(Integer lawId) {
        regLawId(CK_LT, lawId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_GreaterEqual(Integer lawId) {
        regLawId(CK_GE, lawId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param lawId The value of lawId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawId_LessEqual(Integer lawId) {
        regLawId(CK_LE, lawId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
     * @param minNumber The min number of lawId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawId(), "LAW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
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
     * (法令ID)LAW_ID: {UQ+, NotNull, INT(10), FK to LAW}
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
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_Equal(Integer lawCategoryId) {
        doSetLawCategoryId_Equal(lawCategoryId);
    }

    protected void doSetLawCategoryId_Equal(Integer lawCategoryId) {
        regLawCategoryId(CK_EQ, lawCategoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_NotEqual(Integer lawCategoryId) {
        doSetLawCategoryId_NotEqual(lawCategoryId);
    }

    protected void doSetLawCategoryId_NotEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_NES, lawCategoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterThan(Integer lawCategoryId) {
        regLawCategoryId(CK_GT, lawCategoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessThan(Integer lawCategoryId) {
        regLawCategoryId(CK_LT, lawCategoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_GreaterEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_GE, lawCategoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryId The value of lawCategoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLawCategoryId_LessEqual(Integer lawCategoryId) {
        regLawCategoryId(CK_LE, lawCategoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLawCategoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param minNumber The min number of lawCategoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of lawCategoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLawCategoryId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryIdList The collection of lawCategoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_InScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_InScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_INS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (法令カテゴリーID)LAW_CATEGORY_ID: {+UQ, IX, NotNull, INT(10), FK to LAW_CATEGORY}
     * @param lawCategoryIdList The collection of lawCategoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        doSetLawCategoryId_NotInScope(lawCategoryIdList);
    }

    protected void doSetLawCategoryId_NotInScope(Collection<Integer> lawCategoryIdList) {
        regINS(CK_NINS, cTL(lawCategoryIdList), xgetCValueLawCategoryId(), "LAW_CATEGORY_ID");
    }

    protected void regLawCategoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLawCategoryId(), "LAW_CATEGORY_ID"); }
    protected abstract ConditionValue xgetCValueLawCategoryId();

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
    public HpSLCFunction<LawCategoryRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LawCategoryRelCB.class);
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
    public HpSLCFunction<LawCategoryRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LawCategoryRelCB.class);
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
    public HpSLCFunction<LawCategoryRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LawCategoryRelCB.class);
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
    public HpSLCFunction<LawCategoryRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LawCategoryRelCB.class);
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
    public HpSLCFunction<LawCategoryRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LawCategoryRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LawCategoryRelCB&gt;() {
     *     public void query(LawCategoryRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LawCategoryRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LawCategoryRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LawCategoryRelCQ sq);

    protected LawCategoryRelCB xcreateScalarConditionCB() {
        LawCategoryRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LawCategoryRelCB xcreateScalarConditionPartitionByCB() {
        LawCategoryRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LawCategoryRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LAW_CATEGORY_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LawCategoryRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LawCategoryRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LawCategoryRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LAW_CATEGORY_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LawCategoryRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LawCategoryRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LawCategoryRelCB cb = new LawCategoryRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LawCategoryRelCQ sq);

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
    protected LawCategoryRelCB newMyCB() {
        return new LawCategoryRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LawCategoryRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
