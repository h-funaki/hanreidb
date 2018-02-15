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
package tech.law.hanreidb.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import tech.law.hanreidb.dbflute.exbhv.*;
import tech.law.hanreidb.dbflute.exentity.*;
import tech.law.hanreidb.dbflute.cbean.*;

/**
 * The referrer loader of (ユーザー)USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, MAIL_ADDRESS, PASSWORD, USER_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_USER_STATUS
 *
 * [referrer table]
 *     JUDGEMENT_USER_FAVORITE_REL, LOGIN_HISTORY, USER_STATUS_HISTORY
 *
 * [foreign property]
 *     clsUserStatus
 *
 * [referrer property]
 *     judgementUserFavoriteRelList, loginHistoryList, userStatusHistoryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<JudgementUserFavoriteRel> _referrerJudgementUserFavoriteRel;

    /**
     * Load referrer of judgementUserFavoriteRelList by the set-upper of referrer. <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by USER_ID, named 'judgementUserFavoriteRelList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadJudgementUserFavoriteRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getJudgementUserFavoriteRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementUserFavoriteRel> loadJudgementUserFavoriteRel(ReferrerConditionSetupper<JudgementUserFavoriteRelCB> refCBLambda) {
        myBhv().loadJudgementUserFavoriteRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementUserFavoriteRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementUserFavoriteRel().ready(_referrerJudgementUserFavoriteRel, _selector));
    }

    protected List<LoginHistory> _referrerLoginHistory;

    /**
     * Load referrer of loginHistoryList by the set-upper of referrer. <br>
     * (ログイン履歴)LOGIN_HISTORY by USER_ID, named 'loginHistoryList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadLoginHistory</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getLoginHistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLoginHistory> loadLoginHistory(ReferrerConditionSetupper<LoginHistoryCB> refCBLambda) {
        myBhv().loadLoginHistory(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLoginHistory = refLs);
        return hd -> hd.handle(new LoaderOfLoginHistory().ready(_referrerLoginHistory, _selector));
    }

    protected List<UserStatusHistory> _referrerUserStatusHistory;

    /**
     * Load referrer of userStatusHistoryList by the set-upper of referrer. <br>
     * (ユーザーステータス履歴)USER_STATUS_HISTORY by USER_ID, named 'userStatusHistoryList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserStatusHistory</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserStatusHistoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserStatusHistory> loadUserStatusHistory(ReferrerConditionSetupper<UserStatusHistoryCB> refCBLambda) {
        myBhv().loadUserStatusHistory(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserStatusHistory = refLs);
        return hd -> hd.handle(new LoaderOfUserStatusHistory().ready(_referrerUserStatusHistory, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfClsUserStatus _foreignClsUserStatusLoader;
    public LoaderOfClsUserStatus pulloutClsUserStatus() {
        if (_foreignClsUserStatusLoader == null)
        { _foreignClsUserStatusLoader = new LoaderOfClsUserStatus().ready(myBhv().pulloutClsUserStatus(_selectedList), _selector); }
        return _foreignClsUserStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
