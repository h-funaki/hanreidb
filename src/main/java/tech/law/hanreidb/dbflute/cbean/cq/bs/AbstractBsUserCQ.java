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
 * The abstract condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsJudgementUserFavoriteRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of JudgementUserFavoriteRelList for 'exists'. (NotNull)
     */
    public void existsJudgementUserFavoriteRel(SubQuery<JudgementUserFavoriteRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_JudgementUserFavoriteRelList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "judgementUserFavoriteRelList");
    }
    public abstract String keepUserId_ExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from LOGIN_HISTORY where ...)} <br>
     * (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsLoginHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of LoginHistoryList for 'exists'. (NotNull)
     */
    public void existsLoginHistory(SubQuery<LoginHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LoginHistoryCB cb = new LoginHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_LoginHistoryList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "loginHistoryList");
    }
    public abstract String keepUserId_ExistsReferrer_LoginHistoryList(LoginHistoryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserStatusHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserStatusHistoryList for 'exists'. (NotNull)
     */
    public void existsUserStatusHistory(SubQuery<UserStatusHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserStatusHistoryList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "userStatusHistoryList");
    }
    public abstract String keepUserId_ExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsJudgementUserFavoriteRel</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_JudgementUserFavoriteRelList for 'not exists'. (NotNull)
     */
    public void notExistsJudgementUserFavoriteRel(SubQuery<JudgementUserFavoriteRelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_JudgementUserFavoriteRelList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "judgementUserFavoriteRelList");
    }
    public abstract String keepUserId_NotExistsReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from LOGIN_HISTORY where ...)} <br>
     * (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsLoginHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_LoginHistoryList for 'not exists'. (NotNull)
     */
    public void notExistsLoginHistory(SubQuery<LoginHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LoginHistoryCB cb = new LoginHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_LoginHistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "loginHistoryList");
    }
    public abstract String keepUserId_NotExistsReferrer_LoginHistoryList(LoginHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserStatusHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserStatusHistoryList for 'not exists'. (NotNull)
     */
    public void notExistsUserStatusHistory(SubQuery<UserStatusHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserStatusHistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "userStatusHistoryList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    public void xsderiveJudgementUserFavoriteRelList(String fn, SubQuery<JudgementUserFavoriteRelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "judgementUserFavoriteRelList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);

    public void xsderiveLoginHistoryList(String fn, SubQuery<LoginHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LoginHistoryCB cb = new LoginHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_LoginHistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "loginHistoryList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_LoginHistoryList(LoginHistoryCQ sq);

    public void xsderiveUserStatusHistoryList(String fn, SubQuery<UserStatusHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserStatusHistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "userStatusHistoryList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from JUDGEMENT_USER_FAVORITE_REL where ...)} <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedJudgementUserFavoriteRel()</span>.<span style="color: #CC4747">max</span>(relCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     relCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     relCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<JudgementUserFavoriteRelCB> derivedJudgementUserFavoriteRel() {
        return xcreateQDRFunctionJudgementUserFavoriteRelList();
    }
    protected HpQDRFunction<JudgementUserFavoriteRelCB> xcreateQDRFunctionJudgementUserFavoriteRelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveJudgementUserFavoriteRelList(fn, sq, rd, vl, op));
    }
    public void xqderiveJudgementUserFavoriteRelList(String fn, SubQuery<JudgementUserFavoriteRelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        JudgementUserFavoriteRelCB cb = new JudgementUserFavoriteRelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "judgementUserFavoriteRelList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelList(JudgementUserFavoriteRelCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_JudgementUserFavoriteRelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from LOGIN_HISTORY where ...)} <br>
     * (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedLoginHistory()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<LoginHistoryCB> derivedLoginHistory() {
        return xcreateQDRFunctionLoginHistoryList();
    }
    protected HpQDRFunction<LoginHistoryCB> xcreateQDRFunctionLoginHistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveLoginHistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveLoginHistoryList(String fn, SubQuery<LoginHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LoginHistoryCB cb = new LoginHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_LoginHistoryList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_LoginHistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "loginHistoryList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_LoginHistoryList(LoginHistoryCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_LoginHistoryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserStatusHistory()</span>.<span style="color: #CC4747">max</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     historyCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserStatusHistoryCB> derivedUserStatusHistory() {
        return xcreateQDRFunctionUserStatusHistoryList();
    }
    protected HpQDRFunction<UserStatusHistoryCB> xcreateQDRFunctionUserStatusHistoryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserStatusHistoryList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserStatusHistoryList(String fn, SubQuery<UserStatusHistoryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserStatusHistoryList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserStatusHistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "userStatusHistoryList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserStatusHistoryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ユーザーID)USER_ID: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddressList The collection of mailAddress as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    protected void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddressList The collection of mailAddress as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    protected void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), xgetCValueMailAddress(), "MAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_LikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setMailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mailAddress The value of mailAddress as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMailAddress_NotLikeSearch(mailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)MAIL_ADDRESS: {UQ, NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), xgetCValueMailAddress(), "MAIL_ADDRESS", likeSearchOption);
    }

    protected void regMailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMailAddress(), "MAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userStatusCode The value of userStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_Equal(String userStatusCode) {
        doSetUserStatusCode_Equal(fRES(userStatusCode));
    }

    /**
     * Equal(=). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusCode_Equal_AsUserStatus(CDef.UserStatus cdef) {
        doSetUserStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 契約中 (ACTIVE). And OnlyOnceRegistered. <br>
     * 契約中: 契約中
     */
    public void setUserStatusCode_Equal_契約中() {
        setUserStatusCode_Equal_AsUserStatus(CDef.UserStatus.契約中);
    }

    /**
     * Equal(=). As 解約済 (UNSUBSCRIBE). And OnlyOnceRegistered. <br>
     * 解約済: 解約済
     */
    public void setUserStatusCode_Equal_解約済() {
        setUserStatusCode_Equal_AsUserStatus(CDef.UserStatus.解約済);
    }

    protected void doSetUserStatusCode_Equal(String userStatusCode) {
        regUserStatusCode(CK_EQ, userStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userStatusCode The value of userStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_NotEqual(String userStatusCode) {
        doSetUserStatusCode_NotEqual(fRES(userStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As UserStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setUserStatusCode_NotEqual_AsUserStatus(CDef.UserStatus cdef) {
        doSetUserStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 契約中 (ACTIVE). And OnlyOnceRegistered. <br>
     * 契約中: 契約中
     */
    public void setUserStatusCode_NotEqual_契約中() {
        setUserStatusCode_NotEqual_AsUserStatus(CDef.UserStatus.契約中);
    }

    /**
     * NotEqual(&lt;&gt;). As 解約済 (UNSUBSCRIBE). And OnlyOnceRegistered. <br>
     * 解約済: 解約済
     */
    public void setUserStatusCode_NotEqual_解約済() {
        setUserStatusCode_NotEqual_AsUserStatus(CDef.UserStatus.解約済);
    }

    protected void doSetUserStatusCode_NotEqual(String userStatusCode) {
        regUserStatusCode(CK_NES, userStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userStatusCodeList The collection of userStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_InScope(Collection<String> userStatusCodeList) {
        doSetUserStatusCode_InScope(userStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_InScope_AsUserStatus(Collection<CDef.UserStatus> cdefList) {
        doSetUserStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetUserStatusCode_InScope(Collection<String> userStatusCodeList) {
        regINS(CK_INS, cTL(userStatusCodeList), xgetCValueUserStatusCode(), "USER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus}
     * @param userStatusCodeList The collection of userStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_NotInScope(Collection<String> userStatusCodeList) {
        doSetUserStatusCode_NotInScope(userStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As UserStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {IX, NotNull, VARCHAR(20), FK to CLS_USER_STATUS, classification=UserStatus} <br>
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_NotInScope_AsUserStatus(Collection<CDef.UserStatus> cdefList) {
        doSetUserStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetUserStatusCode_NotInScope(Collection<String> userStatusCodeList) {
        regINS(CK_NINS, cTL(userStatusCodeList), xgetCValueUserStatusCode(), "USER_STATUS_CODE");
    }

    protected void regUserStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusCode(), "USER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueUserStatusCode();

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
    public HpSLCFunction<UserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserCQ sq);

    protected UserCB xcreateScalarConditionCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserCB xcreateScalarConditionPartitionByCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserCQ sq);

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
    protected UserCB newMyCB() {
        return new UserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
