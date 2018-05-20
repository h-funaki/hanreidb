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
 * The abstract condition-query of JUDGEMENT_ARTICLE_REL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsJudgementArticleRelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsJudgementArticleRelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "JUDGEMENT_ARTICLE_REL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_Equal(Long judgementArticleRelId) {
        doSetJudgementArticleRelId_Equal(judgementArticleRelId);
    }

    protected void doSetJudgementArticleRelId_Equal(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_EQ, judgementArticleRelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_NotEqual(Long judgementArticleRelId) {
        doSetJudgementArticleRelId_NotEqual(judgementArticleRelId);
    }

    protected void doSetJudgementArticleRelId_NotEqual(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_NES, judgementArticleRelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_GreaterThan(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_GT, judgementArticleRelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_LessThan(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_LT, judgementArticleRelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_GreaterEqual(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_GE, judgementArticleRelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelId The value of judgementArticleRelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setJudgementArticleRelId_LessEqual(Long judgementArticleRelId) {
        regJudgementArticleRelId(CK_LE, judgementArticleRelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of judgementArticleRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementArticleRelId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setJudgementArticleRelId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setJudgementArticleRelId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of judgementArticleRelId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of judgementArticleRelId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setJudgementArticleRelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueJudgementArticleRelId(), "JUDGEMENT_ARTICLE_REL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelIdList The collection of judgementArticleRelId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementArticleRelId_InScope(Collection<Long> judgementArticleRelIdList) {
        doSetJudgementArticleRelId_InScope(judgementArticleRelIdList);
    }

    protected void doSetJudgementArticleRelId_InScope(Collection<Long> judgementArticleRelIdList) {
        regINS(CK_INS, cTL(judgementArticleRelIdList), xgetCValueJudgementArticleRelId(), "JUDGEMENT_ARTICLE_REL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param judgementArticleRelIdList The collection of judgementArticleRelId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setJudgementArticleRelId_NotInScope(Collection<Long> judgementArticleRelIdList) {
        doSetJudgementArticleRelId_NotInScope(judgementArticleRelIdList);
    }

    protected void doSetJudgementArticleRelId_NotInScope(Collection<Long> judgementArticleRelIdList) {
        regINS(CK_NINS, cTL(judgementArticleRelIdList), xgetCValueJudgementArticleRelId(), "JUDGEMENT_ARTICLE_REL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setJudgementArticleRelId_IsNull() { regJudgementArticleRelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (判決法令リレーションID)JUDGEMENT_ARTICLE_REL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setJudgementArticleRelId_IsNotNull() { regJudgementArticleRelId(CK_ISNN, DOBJ); }

    protected void regJudgementArticleRelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJudgementArticleRelId(), "JUDGEMENT_ARTICLE_REL_ID"); }
    protected abstract ConditionValue xgetCValueJudgementArticleRelId();

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
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_Equal(Long articleId) {
        doSetArticleId_Equal(articleId);
    }

    protected void doSetArticleId_Equal(Long articleId) {
        regArticleId(CK_EQ, articleId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_NotEqual(Long articleId) {
        doSetArticleId_NotEqual(articleId);
    }

    protected void doSetArticleId_NotEqual(Long articleId) {
        regArticleId(CK_NES, articleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterThan(Long articleId) {
        regArticleId(CK_GT, articleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessThan(Long articleId) {
        regArticleId(CK_LT, articleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_GreaterEqual(Long articleId) {
        regArticleId(CK_GE, articleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleId The value of articleId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setArticleId_LessEqual(Long articleId) {
        regArticleId(CK_LE, articleId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param minNumber The min number of articleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setArticleId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setArticleId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param minNumber The min number of articleId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of articleId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setArticleId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueArticleId(), "ARTICLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleIdList The collection of articleId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleId_InScope(Collection<Long> articleIdList) {
        doSetArticleId_InScope(articleIdList);
    }

    protected void doSetArticleId_InScope(Collection<Long> articleIdList) {
        regINS(CK_INS, cTL(articleIdList), xgetCValueArticleId(), "ARTICLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (条文ID)ARTICLE_ID: {IX, NotNull, BIGINT(19), FK to ARTICLE}
     * @param articleIdList The collection of articleId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setArticleId_NotInScope(Collection<Long> articleIdList) {
        doSetArticleId_NotInScope(articleIdList);
    }

    protected void doSetArticleId_NotInScope(Collection<Long> articleIdList) {
        regINS(CK_NINS, cTL(articleIdList), xgetCValueArticleId(), "ARTICLE_ID");
    }

    protected void regArticleId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArticleId(), "ARTICLE_ID"); }
    protected abstract ConditionValue xgetCValueArticleId();

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
    public HpSLCFunction<JudgementArticleRelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, JudgementArticleRelCB.class);
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
    public HpSLCFunction<JudgementArticleRelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, JudgementArticleRelCB.class);
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
    public HpSLCFunction<JudgementArticleRelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, JudgementArticleRelCB.class);
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
    public HpSLCFunction<JudgementArticleRelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, JudgementArticleRelCB.class);
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
    public HpSLCFunction<JudgementArticleRelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, JudgementArticleRelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;JudgementArticleRelCB&gt;() {
     *     public void query(JudgementArticleRelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<JudgementArticleRelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, JudgementArticleRelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementArticleRelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(JudgementArticleRelCQ sq);

    protected JudgementArticleRelCB xcreateScalarConditionCB() {
        JudgementArticleRelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected JudgementArticleRelCB xcreateScalarConditionPartitionByCB() {
        JudgementArticleRelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<JudgementArticleRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "JUDGEMENT_ARTICLE_REL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(JudgementArticleRelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<JudgementArticleRelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(JudgementArticleRelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "JUDGEMENT_ARTICLE_REL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(JudgementArticleRelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<JudgementArticleRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementArticleRelCB cb = new JudgementArticleRelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(JudgementArticleRelCQ sq);

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
    protected JudgementArticleRelCB newMyCB() {
        return new JudgementArticleRelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return JudgementArticleRelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
