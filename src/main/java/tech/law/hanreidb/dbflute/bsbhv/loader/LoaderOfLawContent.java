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
 * The referrer loader of (法令内容)LAW_CONTENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_CONTENT_ID
 *
 * [column]
 *     LAW_CONTENT_ID, LAW_HISTORY_ID, LAW_CONTENT_RAW_XML, LAW_CONTENT_SEARCH_TEXT, LAW_CONTENT_VIEW_XML, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CONTENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     lawHistory
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawContent {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawContent> _selectedList;
    protected BehaviorSelector _selector;
    protected LawContentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawContent ready(List<LawContent> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawContentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawContentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLawHistory _foreignLawHistoryLoader;
    public LoaderOfLawHistory pulloutLawHistory() {
        if (_foreignLawHistoryLoader == null)
        { _foreignLawHistoryLoader = new LoaderOfLawHistory().ready(myBhv().pulloutLawHistory(_selectedList), _selector); }
        return _foreignLawHistoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawContent> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
