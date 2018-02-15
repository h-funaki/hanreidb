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
import tech.law.hanreidb.dbflute.exbhv.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The referrer loader of (ユーザーステータス履歴)USER_STATUS_HISTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_STATUS_HISTORY_ID
 *
 * [column]
 *     USER_STATUS_HISTORY_ID, USER_ID, USER_NEW_STATUS_CODE, USER_STATUS_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_STATUS_HISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     USER, CLS_USER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     user, clsUserStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserStatusHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserStatusHistory> _selectedList;
    protected BehaviorSelector _selector;
    protected UserStatusHistoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserStatusHistory ready(List<UserStatusHistory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserStatusHistoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserStatusHistoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    protected LoaderOfClsUserStatus _foreignClsUserStatusLoader;
    public LoaderOfClsUserStatus pulloutClsUserStatus() {
        if (_foreignClsUserStatusLoader == null)
        { _foreignClsUserStatusLoader = new LoaderOfClsUserStatus().ready(myBhv().pulloutClsUserStatus(_selectedList), _selector); }
        return _foreignClsUserStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserStatusHistory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
