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
 * The referrer loader of ([区分値]事件カテゴリー)CLS_CASE_CATEGORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     CASE_CATEGORY_CODE
 *
 * [column]
 *     CASE_CATEGORY_CODE, CASE_CATEGORY_NAME, CASE_CATEGORY_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     CASE_MARK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     caseMarkList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfClsCaseCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ClsCaseCategory> _selectedList;
    protected BehaviorSelector _selector;
    protected ClsCaseCategoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfClsCaseCategory ready(List<ClsCaseCategory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ClsCaseCategoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ClsCaseCategoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<CaseMark> _referrerCaseMark;

    /**
     * Load referrer of caseMarkList by the set-upper of referrer. <br>
     * (事件符号)CASE_MARK by CASE_CATEGORY_CODE, named 'caseMarkList'.
     * <pre>
     * <span style="color: #0000C0">clsCaseCategoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsCaseCategoryList</span>, <span style="color: #553000">categoryLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">categoryLoader</span>.<span style="color: #CC4747">loadCaseMark</span>(<span style="color: #553000">markCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">markCB</span>.setupSelect...
     *         <span style="color: #553000">markCB</span>.query().set...
     *         <span style="color: #553000">markCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">markLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    markLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsCaseCategory clsCaseCategory : <span style="color: #553000">clsCaseCategoryList</span>) {
     *     ... = clsCaseCategory.<span style="color: #CC4747">getCaseMarkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCaseCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_CaseCategoryCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfCaseMark> loadCaseMark(ReferrerConditionSetupper<CaseMarkCB> refCBLambda) {
        myBhv().loadCaseMark(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerCaseMark = refLs);
        return hd -> hd.handle(new LoaderOfCaseMark().ready(_referrerCaseMark, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ClsCaseCategory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
