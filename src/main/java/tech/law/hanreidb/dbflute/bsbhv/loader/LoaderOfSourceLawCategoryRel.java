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
 * The referrer loader of (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOURCE_LAW_CATEGORY_REL_ID
 *
 * [column]
 *     SOURCE_LAW_CATEGORY_REL_ID, LAW_ID, SOURCE_LAW_CATEGORY_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOURCE_LAW_CATEGORY_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW, SOURCE_LAW_CATEGORY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     law, sourceLawCategory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSourceLawCategoryRel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SourceLawCategoryRel> _selectedList;
    protected BehaviorSelector _selector;
    protected SourceLawCategoryRelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSourceLawCategoryRel ready(List<SourceLawCategoryRel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SourceLawCategoryRelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SourceLawCategoryRelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLaw _foreignLawLoader;
    public LoaderOfLaw pulloutLaw() {
        if (_foreignLawLoader == null)
        { _foreignLawLoader = new LoaderOfLaw().ready(myBhv().pulloutLaw(_selectedList), _selector); }
        return _foreignLawLoader;
    }

    protected LoaderOfSourceLawCategory _foreignSourceLawCategoryLoader;
    public LoaderOfSourceLawCategory pulloutSourceLawCategory() {
        if (_foreignSourceLawCategoryLoader == null)
        { _foreignSourceLawCategoryLoader = new LoaderOfSourceLawCategory().ready(myBhv().pulloutSourceLawCategory(_selectedList), _selector); }
        return _foreignSourceLawCategoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<SourceLawCategoryRel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
