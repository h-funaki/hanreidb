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
 * The referrer loader of (法令カテゴリー)LAW_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_CATEGORY_ID
 *
 * [column]
 *     LAW_CATEGORY_ID, LAW_CATEGORY_NAME, LAW_CATEGORY_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_CATEGORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     LAW_CATEGORY_REL, SOURCE_LAW_CATEGORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     lawCategoryRelList, sourceLawCategoryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected LawCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawCategory ready(List<LawCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LawCategoryRel> _referrerLawCategoryRel;

    /**
     * Load referrer of lawCategoryRelList by the set-upper of referrer. <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_CATEGORY_ID, named 'lawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadLawCategoryRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawCategory lawCategory : <span style="color: #553000">lawCategoryList</span>) {
     *     ... = lawCategory.<span style="color: #CC4747">getLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawCategoryId_InScope(pkList);
     * cb.query().addOrderBy_LawCategoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawCategoryRel> loadLawCategoryRel(ReferrerConditionSetupper<LawCategoryRelCB> refCBLambda) {
        myBhv().loadLawCategoryRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawCategoryRel = refLs);
        return hd -> hd.handle(new LoaderOfLawCategoryRel().ready(_referrerLawCategoryRel, _selector));
    }

    protected List<SourceLawCategory> _referrerSourceLawCategory;

    /**
     * Load referrer of sourceLawCategoryList by the set-upper of referrer. <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by LAW_CATEGORY_ID, named 'sourceLawCategoryList'.
     * <pre>
     * <span style="color: #0000C0">lawCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadSourceLawCategory</span>(<span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">categoryCB</span>.setupSelect...
     *         <span style="color: #553000">categoryCB</span>.query().set...
     *         <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">categoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    categoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawCategory lawCategory : <span style="color: #553000">lawCategoryList</span>) {
     *     ... = lawCategory.<span style="color: #CC4747">getSourceLawCategoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawCategoryId_InScope(pkList);
     * cb.query().addOrderBy_LawCategoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfSourceLawCategory> loadSourceLawCategory(ReferrerConditionSetupper<SourceLawCategoryCB> refCBLambda) {
        myBhv().loadSourceLawCategory(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerSourceLawCategory = refLs);
        return hd -> hd.handle(new LoaderOfSourceLawCategory().ready(_referrerSourceLawCategory, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
