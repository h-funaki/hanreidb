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
 * The abstract condition-query of USER_STATUS_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserStatusHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserStatusHistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "USER_STATUS_HISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_Equal(Long userStatusHistoryId) {
        doSetUserStatusHistoryId_Equal(userStatusHistoryId);
    }

    protected void doSetUserStatusHistoryId_Equal(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_EQ, userStatusHistoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_NotEqual(Long userStatusHistoryId) {
        doSetUserStatusHistoryId_NotEqual(userStatusHistoryId);
    }

    protected void doSetUserStatusHistoryId_NotEqual(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_NES, userStatusHistoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_GreaterThan(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_GT, userStatusHistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_LessThan(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_LT, userStatusHistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_GreaterEqual(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_GE, userStatusHistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryId The value of userStatusHistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusHistoryId_LessEqual(Long userStatusHistoryId) {
        regUserStatusHistoryId(CK_LE, userStatusHistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of userStatusHistoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userStatusHistoryId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserStatusHistoryId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserStatusHistoryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param minNumber The min number of userStatusHistoryId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userStatusHistoryId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserStatusHistoryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserStatusHistoryId(), "USER_STATUS_HISTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryIdList The collection of userStatusHistoryId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusHistoryId_InScope(Collection<Long> userStatusHistoryIdList) {
        doSetUserStatusHistoryId_InScope(userStatusHistoryIdList);
    }

    protected void doSetUserStatusHistoryId_InScope(Collection<Long> userStatusHistoryIdList) {
        regINS(CK_INS, cTL(userStatusHistoryIdList), xgetCValueUserStatusHistoryId(), "USER_STATUS_HISTORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     * @param userStatusHistoryIdList The collection of userStatusHistoryId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusHistoryId_NotInScope(Collection<Long> userStatusHistoryIdList) {
        doSetUserStatusHistoryId_NotInScope(userStatusHistoryIdList);
    }

    protected void doSetUserStatusHistoryId_NotInScope(Collection<Long> userStatusHistoryIdList) {
        regINS(CK_NINS, cTL(userStatusHistoryIdList), xgetCValueUserStatusHistoryId(), "USER_STATUS_HISTORY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setUserStatusHistoryId_IsNull() { regUserStatusHistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ユーザーステータス履歴ID)USER_STATUS_HISTORY_ID: {PK, ID, NotNull, BIGINT UNSIGNED(20)}
     */
    public void setUserStatusHistoryId_IsNotNull() { regUserStatusHistoryId(CK_ISNN, DOBJ); }

    protected void regUserStatusHistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusHistoryId(), "USER_STATUS_HISTORY_ID"); }
    protected abstract ConditionValue xgetCValueUserStatusHistoryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーID)USER_ID: {IX, NotNull, INT UNSIGNED(10), FK to USER}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userNewStatusCode The value of userNewStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_Equal(String userNewStatusCode) {
        doSetUserNewStatusCode_Equal(fRES(userNewStatusCode));
    }

    /**
     * Equal(=). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserNewStatusCode_Equal_AsUserStatus(CDef.UserStatus cdef) {
        doSetUserNewStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 契約中 (ACTIVE). And OnlyOnceRegistered. <br>
     * 契約中: 契約中
     */
    public void setUserNewStatusCode_Equal_契約中() {
        setUserNewStatusCode_Equal_AsUserStatus(CDef.UserStatus.契約中);
    }

    /**
     * Equal(=). As 解約済 (UNSUBSCRIBE). And OnlyOnceRegistered. <br>
     * 解約済: 解約済
     */
    public void setUserNewStatusCode_Equal_解約済() {
        setUserNewStatusCode_Equal_AsUserStatus(CDef.UserStatus.解約済);
    }

    protected void doSetUserNewStatusCode_Equal(String userNewStatusCode) {
        regUserNewStatusCode(CK_EQ, userNewStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userNewStatusCode The value of userNewStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_NotEqual(String userNewStatusCode) {
        doSetUserNewStatusCode_NotEqual(fRES(userNewStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserNewStatusCode_NotEqual_AsUserStatus(CDef.UserStatus cdef) {
        doSetUserNewStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 契約中 (ACTIVE). And OnlyOnceRegistered. <br>
     * 契約中: 契約中
     */
    public void setUserNewStatusCode_NotEqual_契約中() {
        setUserNewStatusCode_NotEqual_AsUserStatus(CDef.UserStatus.契約中);
    }

    /**
     * NotEqual(&lt;&gt;). As 解約済 (UNSUBSCRIBE). And OnlyOnceRegistered. <br>
     * 解約済: 解約済
     */
    public void setUserNewStatusCode_NotEqual_解約済() {
        setUserNewStatusCode_NotEqual_AsUserStatus(CDef.UserStatus.解約済);
    }

    protected void doSetUserNewStatusCode_NotEqual(String userNewStatusCode) {
        regUserNewStatusCode(CK_NES, userNewStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userNewStatusCodeList The collection of userNewStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_InScope(Collection<String> userNewStatusCodeList) {
        doSetUserNewStatusCode_InScope(userNewStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_InScope_AsUserStatus(Collection<CDef.UserStatus> cdefList) {
        doSetUserNewStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetUserNewStatusCode_InScope(Collection<String> userNewStatusCodeList) {
        regINS(CK_INS, cTL(userNewStatusCodeList), xgetCValueUserNewStatusCode(), "USER_NEW_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userNewStatusCodeList The collection of userNewStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_NotInScope(Collection<String> userNewStatusCodeList) {
        doSetUserNewStatusCode_NotInScope(userNewStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザー新ステータスコード)USER_NEW_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUserNewStatusCode_NotInScope_AsUserStatus(Collection<CDef.UserStatus> cdefList) {
        doSetUserNewStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUserNewStatusCode_NotInScope(Collection<String> userNewStatusCodeList) {
        regINS(CK_NINS, cTL(userNewStatusCodeList), xgetCValueUserNewStatusCode(), "USER_NEW_STATUS_CODE");
    }

    protected void regUserNewStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserNewStatusCode(), "USER_NEW_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueUserNewStatusCode();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param userStatusUpdateDatetime The value of userStatusUpdateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusUpdateDatetime_Equal(java.time.LocalDateTime userStatusUpdateDatetime) {
        regUserStatusUpdateDatetime(CK_EQ,  userStatusUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param userStatusUpdateDatetime The value of userStatusUpdateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusUpdateDatetime_GreaterThan(java.time.LocalDateTime userStatusUpdateDatetime) {
        regUserStatusUpdateDatetime(CK_GT,  userStatusUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param userStatusUpdateDatetime The value of userStatusUpdateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusUpdateDatetime_LessThan(java.time.LocalDateTime userStatusUpdateDatetime) {
        regUserStatusUpdateDatetime(CK_LT,  userStatusUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param userStatusUpdateDatetime The value of userStatusUpdateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusUpdateDatetime_GreaterEqual(java.time.LocalDateTime userStatusUpdateDatetime) {
        regUserStatusUpdateDatetime(CK_GE,  userStatusUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param userStatusUpdateDatetime The value of userStatusUpdateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusUpdateDatetime_LessEqual(java.time.LocalDateTime userStatusUpdateDatetime) {
        regUserStatusUpdateDatetime(CK_LE, userStatusUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUserStatusUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of userStatusUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of userStatusUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUserStatusUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUserStatusUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス更新日時)USER_STATUS_UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUserStatusUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of userStatusUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of userStatusUpdateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUserStatusUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "USER_STATUS_UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUserStatusUpdateDatetime(), nm, op);
    }

    protected void regUserStatusUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusUpdateDatetime(), "USER_STATUS_UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUserStatusUpdateDatetime();

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
    public HpSLCFunction<UserStatusHistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserStatusHistoryCB.class);
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
    public HpSLCFunction<UserStatusHistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserStatusHistoryCB.class);
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
    public HpSLCFunction<UserStatusHistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserStatusHistoryCB.class);
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
    public HpSLCFunction<UserStatusHistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserStatusHistoryCB.class);
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
    public HpSLCFunction<UserStatusHistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserStatusHistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserStatusHistoryCB&gt;() {
     *     public void query(UserStatusHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserStatusHistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserStatusHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserStatusHistoryCQ sq);

    protected UserStatusHistoryCB xcreateScalarConditionCB() {
        UserStatusHistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserStatusHistoryCB xcreateScalarConditionPartitionByCB() {
        UserStatusHistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserStatusHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_STATUS_HISTORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserStatusHistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserStatusHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserStatusHistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_STATUS_HISTORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserStatusHistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserStatusHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserStatusHistoryCQ sq);

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
    protected UserStatusHistoryCB newMyCB() {
        return new UserStatusHistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserStatusHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
