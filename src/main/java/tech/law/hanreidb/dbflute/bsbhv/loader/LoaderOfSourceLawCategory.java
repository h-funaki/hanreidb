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
 * The referrer loader of (取得元法令カテゴリー)SOURCE_LAW_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOURCE_LAW_CATEGORY_ID
 *
 * [column]
 *     SOURCE_LAW_CATEGORY_ID, SOURCE_CODE, LAW_CATEGORY_ID, SOURCE_LAW_CATEGORY_NAME, SOURCE_LAW_CATEGORY_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOURCE_LAW_CATEGORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_CATEGORY, CLS_SOURCE
 *
 * [referrer table]
 *     SOURCE_LAW_CATEGORY_REL
 *
 * [foreign property]
 *     lawCategory, clsSource
 *
 * [referrer property]
 *     sourceLawCategoryRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSourceLawCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<SourceLawCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected SourceLawCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSourceLawCategory ready(List<SourceLawCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SourceLawCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SourceLawCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<SourceLawCategoryRel> _referrerSourceLawCategoryRel;

    /**
     * Load referrer of sourceLawCategoryRelList by the set-upper of referrer. <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by SOURCE_LAW_CATEGORY_ID, named 'sourceLawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">sourceLawCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">sourceLawCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadSourceLawCategoryRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (SourceLawCategory sourceLawCategory : <span style="color: #553000">sourceLawCategoryList</span>) {
     *     ... = sourceLawCategory.<span style="color: #CC4747">getSourceLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSourceLawCategoryId_InScope(pkList);
     * cb.query().addOrderBy_SourceLawCategoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSourceLawCategoryRel> loadSourceLawCategoryRel(ReferrerConditionSetupper<SourceLawCategoryRelCB> refCBLambda) {
        myBhv().loadSourceLawCategoryRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSourceLawCategoryRel = refLs);
        return hd -> hd.handle(new LoaderOfSourceLawCategoryRel().ready(_referrerSourceLawCategoryRel, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLawCategory _foreignLawCategoryLoader;
    public LoaderOfLawCategory pulloutLawCategory() {
        if (_foreignLawCategoryLoader == null)
        { _foreignLawCategoryLoader = new LoaderOfLawCategory().ready(myBhv().pulloutLawCategory(_selectedList), _selector); }
        return _foreignLawCategoryLoader;
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
    public List<SourceLawCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
