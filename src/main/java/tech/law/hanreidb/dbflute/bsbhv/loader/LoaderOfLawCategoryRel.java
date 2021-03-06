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
 * The referrer loader of (法令カテゴリーリレーション)LAW_CATEGORY_REL as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_CATEGORY_REL_ID
 *
 * [column]
 *     LAW_CATEGORY_REL_ID, LAW_ID, LAW_CATEGORY_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CATEGORY_REL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_CATEGORY, LAW
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     lawCategory, law
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawCategoryRel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawCategoryRel> _selectedList;
    protected BehaviorSelector _selector;
    protected LawCategoryRelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawCategoryRel ready(List<LawCategoryRel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawCategoryRelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawCategoryRelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLawCategory _foreignLawCategoryLoader;
    public LoaderOfLawCategory pulloutLawCategory() {
        if (_foreignLawCategoryLoader == null)
        { _foreignLawCategoryLoader = new LoaderOfLawCategory().ready(myBhv().pulloutLawCategory(_selectedList), _selector); }
        return _foreignLawCategoryLoader;
    }

    protected LoaderOfLaw _foreignLawLoader;
    public LoaderOfLaw pulloutLaw() {
        if (_foreignLawLoader == null)
        { _foreignLawLoader = new LoaderOfLaw().ready(myBhv().pulloutLaw(_selectedList), _selector); }
        return _foreignLawLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawCategoryRel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
