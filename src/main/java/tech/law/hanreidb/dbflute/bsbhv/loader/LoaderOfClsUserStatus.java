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
 * The referrer loader of ([区分値]ユーザーステータス)CLS_USER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_STATUS_CODE
 *
 * [column]
 *     USER_STATUS_CODE, USER_STATUS_NAME, USER_STATUS_ALIAS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     USER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfClsUserStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ClsUserStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ClsUserStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfClsUserStatus ready(List<ClsUserStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ClsUserStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ClsUserStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<User> _referrerUser;

    /**
     * Load referrer of userList by the set-upper of referrer. <br>
     * (ユーザー)USER by USER_STATUS_CODE, named 'userList'.
     * <pre>
     * <span style="color: #0000C0">clsUserStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsUserStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadUser</span>(<span style="color: #553000">userCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">userCB</span>.setupSelect...
     *         <span style="color: #553000">userCB</span>.query().set...
     *         <span style="color: #553000">userCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">userLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    userLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsUserStatus clsUserStatus : <span style="color: #553000">clsUserStatusList</span>) {
     *     ... = clsUserStatus.<span style="color: #CC4747">getUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserStatusCode_InScope(pkList);
     * cb.query().addOrderBy_UserStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUser> loadUser(ReferrerConditionSetupper<UserCB> refCBLambda) {
        myBhv().loadUser(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUser = refLs);
        return hd -> hd.handle(new LoaderOfUser().ready(_referrerUser, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ClsUserStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
