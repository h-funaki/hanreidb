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
 * The referrer loader of (法令取得元リレーション)LAW_SOURCE_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_SOURCE_REL_ID
 *
 * [column]
 *     LAW_SOURCE_REL_ID, LAW_ID, SOURCE_CODE, LAW_SOURCE_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_SOURCE_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW, CLS_SOURCE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     law, clsSource
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawSourceRel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawSourceRel> _selectedList;
    protected BehaviorSelector _selector;
    protected LawSourceRelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawSourceRel ready(List<LawSourceRel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawSourceRelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawSourceRelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLaw _foreignLawLoader;
    public LoaderOfLaw pulloutLaw() {
        if (_foreignLawLoader == null)
        { _foreignLawLoader = new LoaderOfLaw().ready(myBhv().pulloutLaw(_selectedList), _selector); }
        return _foreignLawLoader;
    }

    protected LoaderOfClsSource _foreignClsSourceLoader;
    public LoaderOfClsSource pulloutClsSource() {
        if (_foreignClsSourceLoader == null)
        { _foreignClsSourceLoader = new LoaderOfClsSource().ready(myBhv().pulloutClsSource(_selectedList), _selector); }
        return _foreignClsSourceLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawSourceRel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
