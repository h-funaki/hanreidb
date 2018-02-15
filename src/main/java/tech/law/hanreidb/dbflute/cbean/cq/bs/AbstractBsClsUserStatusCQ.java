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
 * The abstract condition-query of CLS_USER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsClsUserStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsClsUserStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CLS_USER_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCode The value of userStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_Equal(String userStatusCode) {
        doSetUserStatusCode_Equal(fRES(userStatusCode));
    }

    protected void doSetUserStatusCode_Equal(String userStatusCode) {
        regUserStatusCode(CK_EQ, userStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCode The value of userStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_NotEqual(String userStatusCode) {
        doSetUserStatusCode_NotEqual(fRES(userStatusCode));
    }

    protected void doSetUserStatusCode_NotEqual(String userStatusCode) {
        regUserStatusCode(CK_NES, userStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCodeList The collection of userStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_InScope(Collection<String> userStatusCodeList) {
        doSetUserStatusCode_InScope(userStatusCodeList);
    }

    protected void doSetUserStatusCode_InScope(Collection<String> userStatusCodeList) {
        regINS(CK_INS, cTL(userStatusCodeList), xgetCValueUserStatusCode(), "USER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCodeList The collection of userStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusCode_NotInScope(Collection<String> userStatusCodeList) {
        doSetUserStatusCode_NotInScope(userStatusCodeList);
    }

    protected void doSetUserStatusCode_NotInScope(Collection<String> userStatusCodeList) {
        regINS(CK_NINS, cTL(userStatusCodeList), xgetCValueUserStatusCode(), "USER_STATUS_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userStatusCode The value of userStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusCode_LikeSearch(String userStatusCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusCode_LikeSearch(userStatusCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userStatusCode The value of userStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserStatusCode_LikeSearch(String userStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userStatusCode), xgetCValueUserStatusCode(), "USER_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCode The value of userStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusCode_NotLikeSearch(String userStatusCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusCode_NotLikeSearch(userStatusCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     * @param userStatusCode The value of userStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserStatusCode_NotLikeSearch(String userStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userStatusCode), xgetCValueUserStatusCode(), "USER_STATUS_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_STATUS_CODE from USER where ...)} <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUser</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserList for 'exists'. (NotNull)
     */
    public void existsUser(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserStatusCode_ExistsReferrer_UserList(cb.query());
        registerExistsReferrer(cb.query(), "USER_STATUS_CODE", "USER_STATUS_CODE", pp, "userList");
    }
    public abstract String keepUserStatusCode_ExistsReferrer_UserList(UserCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_NEW_STATUS_CODE from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserStatusCode_ExistsReferrer_UserStatusHistoryList(cb.query());
        registerExistsReferrer(cb.query(), "USER_STATUS_CODE", "USER_NEW_STATUS_CODE", pp, "userStatusHistoryList");
    }
    public abstract String keepUserStatusCode_ExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_STATUS_CODE from USER where ...)} <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUser</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserStatusCode_NotExistsReferrer_UserList for 'not exists'. (NotNull)
     */
    public void notExistsUser(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserStatusCode_NotExistsReferrer_UserList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_STATUS_CODE", "USER_STATUS_CODE", pp, "userList");
    }
    public abstract String keepUserStatusCode_NotExistsReferrer_UserList(UserCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_NEW_STATUS_CODE from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserStatusHistory</span>(historyCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     historyCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserStatusCode_NotExistsReferrer_UserStatusHistoryList for 'not exists'. (NotNull)
     */
    public void notExistsUserStatusHistory(SubQuery<UserStatusHistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserStatusCode_NotExistsReferrer_UserStatusHistoryList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_STATUS_CODE", "USER_NEW_STATUS_CODE", pp, "userStatusHistoryList");
    }
    public abstract String keepUserStatusCode_NotExistsReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    public void xsderiveUserList(String fn, SubQuery<UserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserStatusCode_SpecifyDerivedReferrer_UserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_STATUS_CODE", "USER_STATUS_CODE", pp, "userList", al, op);
    }
    public abstract String keepUserStatusCode_SpecifyDerivedReferrer_UserList(UserCQ sq);

    public void xsderiveUserStatusHistoryList(String fn, SubQuery<UserStatusHistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserStatusHistoryCB cb = new UserStatusHistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_STATUS_CODE", "USER_NEW_STATUS_CODE", pp, "userStatusHistoryList", al, op);
    }
    public abstract String keepUserStatusCode_SpecifyDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER where ...)} <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUser()</span>.<span style="color: #CC4747">max</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     userCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserCB> derivedUser() {
        return xcreateQDRFunctionUserList();
    }
    protected HpQDRFunction<UserCB> xcreateQDRFunctionUserList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserList(String fn, SubQuery<UserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserStatusCode_QueryDerivedReferrer_UserList(cb.query()); String prpp = keepUserStatusCode_QueryDerivedReferrer_UserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_STATUS_CODE", "USER_STATUS_CODE", sqpp, "userList", rd, vl, prpp, op);
    }
    public abstract String keepUserStatusCode_QueryDerivedReferrer_UserList(UserCQ sq);
    public abstract String keepUserStatusCode_QueryDerivedReferrer_UserListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_STATUS_HISTORY where ...)} <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_NEW_STATUS_CODE, named 'userStatusHistoryAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryList(cb.query()); String prpp = keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_STATUS_CODE", "USER_NEW_STATUS_CODE", sqpp, "userStatusHistoryList", rd, vl, prpp, op);
    }
    public abstract String keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryList(UserStatusHistoryCQ sq);
    public abstract String keepUserStatusCode_QueryDerivedReferrer_UserStatusHistoryListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     */
    public void setUserStatusCode_IsNull() { regUserStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ユーザーステータスコード)USER_STATUS_CODE: {PK, NotNull, VARCHAR(10)}
     */
    public void setUserStatusCode_IsNotNull() { regUserStatusCode(CK_ISNN, DOBJ); }

    protected void regUserStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusCode(), "USER_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueUserStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @param userStatusName The value of userStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusName_Equal(String userStatusName) {
        doSetUserStatusName_Equal(fRES(userStatusName));
    }

    protected void doSetUserStatusName_Equal(String userStatusName) {
        regUserStatusName(CK_EQ, userStatusName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userStatusName The value of userStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusName_LikeSearch(String userStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusName_LikeSearch(userStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userStatusName The value of userStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserStatusName_LikeSearch(String userStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userStatusName), xgetCValueUserStatusName(), "USER_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @param userStatusName The value of userStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusName_NotLikeSearch(String userStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusName_NotLikeSearch(userStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス名)USER_STATUS_NAME: {NotNull, VARCHAR(10)}
     * @param userStatusName The value of userStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserStatusName_NotLikeSearch(String userStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userStatusName), xgetCValueUserStatusName(), "USER_STATUS_NAME", likeSearchOption);
    }

    protected void regUserStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusName(), "USER_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueUserStatusName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAlias The value of userStatusAlias as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusAlias_Equal(String userStatusAlias) {
        doSetUserStatusAlias_Equal(fRES(userStatusAlias));
    }

    protected void doSetUserStatusAlias_Equal(String userStatusAlias) {
        regUserStatusAlias(CK_EQ, userStatusAlias);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAlias The value of userStatusAlias as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusAlias_NotEqual(String userStatusAlias) {
        doSetUserStatusAlias_NotEqual(fRES(userStatusAlias));
    }

    protected void doSetUserStatusAlias_NotEqual(String userStatusAlias) {
        regUserStatusAlias(CK_NES, userStatusAlias);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAliasList The collection of userStatusAlias as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusAlias_InScope(Collection<String> userStatusAliasList) {
        doSetUserStatusAlias_InScope(userStatusAliasList);
    }

    protected void doSetUserStatusAlias_InScope(Collection<String> userStatusAliasList) {
        regINS(CK_INS, cTL(userStatusAliasList), xgetCValueUserStatusAlias(), "USER_STATUS_ALIAS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAliasList The collection of userStatusAlias as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserStatusAlias_NotInScope(Collection<String> userStatusAliasList) {
        doSetUserStatusAlias_NotInScope(userStatusAliasList);
    }

    protected void doSetUserStatusAlias_NotInScope(Collection<String> userStatusAliasList) {
        regINS(CK_NINS, cTL(userStatusAliasList), xgetCValueUserStatusAlias(), "USER_STATUS_ALIAS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusAlias_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userStatusAlias The value of userStatusAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusAlias_LikeSearch(String userStatusAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusAlias_LikeSearch(userStatusAlias, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserStatusAlias_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userStatusAlias The value of userStatusAlias as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserStatusAlias_LikeSearch(String userStatusAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userStatusAlias), xgetCValueUserStatusAlias(), "USER_STATUS_ALIAS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAlias The value of userStatusAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserStatusAlias_NotLikeSearch(String userStatusAlias, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserStatusAlias_NotLikeSearch(userStatusAlias, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ユーザーステータス別名)USER_STATUS_ALIAS: {NotNull, VARCHAR(10)}
     * @param userStatusAlias The value of userStatusAlias as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserStatusAlias_NotLikeSearch(String userStatusAlias, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userStatusAlias), xgetCValueUserStatusAlias(), "USER_STATUS_ALIAS", likeSearchOption);
    }

    protected void regUserStatusAlias(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserStatusAlias(), "USER_STATUS_ALIAS"); }
    protected abstract ConditionValue xgetCValueUserStatusAlias();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (説明)DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (順番)DISPLAY_ORDER: {UQ, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

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
    public HpSLCFunction<ClsUserStatusCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ClsUserStatusCB.class);
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
    public HpSLCFunction<ClsUserStatusCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ClsUserStatusCB.class);
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
    public HpSLCFunction<ClsUserStatusCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ClsUserStatusCB.class);
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
    public HpSLCFunction<ClsUserStatusCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ClsUserStatusCB.class);
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
    public HpSLCFunction<ClsUserStatusCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ClsUserStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ClsUserStatusCB&gt;() {
     *     public void query(ClsUserStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ClsUserStatusCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ClsUserStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsUserStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ClsUserStatusCQ sq);

    protected ClsUserStatusCB xcreateScalarConditionCB() {
        ClsUserStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ClsUserStatusCB xcreateScalarConditionPartitionByCB() {
        ClsUserStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ClsUserStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsUserStatusCB cb = new ClsUserStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_STATUS_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ClsUserStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ClsUserStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ClsUserStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ClsUserStatusCB cb = new ClsUserStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ClsUserStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ClsUserStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ClsUserStatusCB cb = new ClsUserStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ClsUserStatusCQ sq);

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
    protected ClsUserStatusCB newMyCB() {
        return new ClsUserStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ClsUserStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
