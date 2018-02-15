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
 * The referrer loader of (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     JUDGEMENT_USER_FAVORITE_REL_ID
 *
 * [column]
 *     JUDGEMENT_USER_FAVORITE_REL_ID, JUDGEMENT_ID, USER_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_USER_FAVORITE_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     JUDGEMENT, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     judgement, user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfJudgementUserFavoriteRel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<JudgementUserFavoriteRel> _selectedList;
    protected BehaviorSelector _selector;
    protected JudgementUserFavoriteRelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfJudgementUserFavoriteRel ready(List<JudgementUserFavoriteRel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected JudgementUserFavoriteRelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(JudgementUserFavoriteRelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfJudgement _foreignJudgementLoader;
    public LoaderOfJudgement pulloutJudgement() {
        if (_foreignJudgementLoader == null)
        { _foreignJudgementLoader = new LoaderOfJudgement().ready(myBhv().pulloutJudgement(_selectedList), _selector); }
        return _foreignJudgementLoader;
    }

    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<JudgementUserFavoriteRel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
