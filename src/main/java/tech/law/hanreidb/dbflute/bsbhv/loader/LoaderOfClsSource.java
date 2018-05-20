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
 * The referrer loader of ([区分値]取得元)CLS_SOURCE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOURCE_CODE
 *
 * [column]
 *     SOURCE_CODE, SOURCE_NAME, SOURCE_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT_SOURCE_REL, LAW_SOURCE_REL, SOURCE_LAW_CATEGORY
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementSourceRelList, lawSourceRelList, sourceLawCategoryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfClsSource {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ClsSource> _selectedList;
    protected BehaviorSelector _selector;
    protected ClsSourceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfClsSource ready(List<ClsSource> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ClsSourceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ClsSourceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<JudgementSourceRel> _referrerJudgementSourceRel;

    /**
     * Load referrer of judgementSourceRelList by the set-upper of referrer. <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_CODE, named 'judgementSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">clsSourceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsSourceList</span>, <span style="color: #553000">sourceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sourceLoader</span>.<span style="color: #CC4747">loadJudgementSourceRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsSource clsSource : <span style="color: #553000">clsSourceList</span>) {
     *     ... = clsSource.<span style="color: #CC4747">getJudgementSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSourceCode_InScope(pkList);
     * cb.query().addOrderBy_SourceCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementSourceRel> loadJudgementSourceRel(ReferrerConditionSetupper<JudgementSourceRelCB> refCBLambda) {
        myBhv().loadJudgementSourceRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementSourceRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementSourceRel().ready(_referrerJudgementSourceRel, _selector));
    }

    protected List<LawSourceRel> _referrerLawSourceRel;

    /**
     * Load referrer of lawSourceRelList by the set-upper of referrer. <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by SOURCE_CODE, named 'lawSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">clsSourceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsSourceList</span>, <span style="color: #553000">sourceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sourceLoader</span>.<span style="color: #CC4747">loadLawSourceRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsSource clsSource : <span style="color: #553000">clsSourceList</span>) {
     *     ... = clsSource.<span style="color: #CC4747">getLawSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSourceCode_InScope(pkList);
     * cb.query().addOrderBy_SourceCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawSourceRel> loadLawSourceRel(ReferrerConditionSetupper<LawSourceRelCB> refCBLambda) {
        myBhv().loadLawSourceRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawSourceRel = refLs);
        return hd -> hd.handle(new LoaderOfLawSourceRel().ready(_referrerLawSourceRel, _selector));
    }

    protected List<SourceLawCategory> _referrerSourceLawCategory;

    /**
     * Load referrer of sourceLawCategoryList by the set-upper of referrer. <br>
     * (取得元法令カテゴリー)SOURCE_LAW_CATEGORY by SOURCE_CODE, named 'sourceLawCategoryList'.
     * <pre>
     * <span style="color: #0000C0">clsSourceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsSourceList</span>, <span style="color: #553000">sourceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sourceLoader</span>.<span style="color: #CC4747">loadSourceLawCategory</span>(<span style="color: #553000">categoryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">categoryCB</span>.setupSelect...
     *         <span style="color: #553000">categoryCB</span>.query().set...
     *         <span style="color: #553000">categoryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">categoryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    categoryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsSource clsSource : <span style="color: #553000">clsSourceList</span>) {
     *     ... = clsSource.<span style="color: #CC4747">getSourceLawCategoryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSourceCode_InScope(pkList);
     * cb.query().addOrderBy_SourceCode_Asc();
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
    public List<ClsSource> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
