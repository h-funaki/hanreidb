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
 * The referrer loader of (取得元)SOURCE as TABLE. <br>
 * <pre>
 * [primary key]
 *     SOURCE_ID
 *
 * [column]
 *     SOURCE_ID, SOURCE_NAME, SOURCE_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SOURCE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT_SOURCE_REL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementSourceRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfSource {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Source> _selectedList;
    protected BehaviorSelector _selector;
    protected SourceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfSource ready(List<Source> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected SourceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(SourceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<JudgementSourceRel> _referrerJudgementSourceRel;

    /**
     * Load referrer of judgementSourceRelList by the set-upper of referrer. <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by SOURCE_ID, named 'judgementSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">sourceBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">sourceList</span>, <span style="color: #553000">sourceLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sourceLoader</span>.<span style="color: #CC4747">loadJudgementSourceRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Source source : <span style="color: #553000">sourceList</span>) {
     *     ... = source.<span style="color: #CC4747">getJudgementSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSourceId_InScope(pkList);
     * cb.query().addOrderBy_SourceId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementSourceRel> loadJudgementSourceRel(ReferrerConditionSetupper<JudgementSourceRelCB> refCBLambda) {
        myBhv().loadJudgementSourceRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementSourceRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementSourceRel().ready(_referrerJudgementSourceRel, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Source> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
