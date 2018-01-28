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
 * The referrer loader of ([区分値]法廷種別)CLS_BENCH as TABLE. <br>
 * <pre>
 * [primary key]
 *     BENCH_CODE
 *
 * [column]
 *     BENCH_CODE, BENCH_NAME, BENCH_ALIAS, DESCRIPTION, DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     JUDGEMENT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfClsBench {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ClsBench> _selectedList;
    protected BehaviorSelector _selector;
    protected ClsBenchBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfClsBench ready(List<ClsBench> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ClsBenchBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ClsBenchBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Judgement> _referrerJudgement;

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by BENCH_CODE, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">clsBenchBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">clsBenchList</span>, <span style="color: #553000">benchLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">benchLoader</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">judgementCB</span>.setupSelect...
     *         <span style="color: #553000">judgementCB</span>.query().set...
     *         <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">judgementLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    judgementLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ClsBench clsBench : <span style="color: #553000">clsBenchList</span>) {
     *     ... = clsBench.<span style="color: #CC4747">getJudgementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBenchCode_InScope(pkList);
     * cb.query().addOrderBy_BenchCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgement> loadJudgement(ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        myBhv().loadJudgement(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgement = refLs);
        return hd -> hd.handle(new LoaderOfJudgement().ready(_referrerJudgement, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ClsBench> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
