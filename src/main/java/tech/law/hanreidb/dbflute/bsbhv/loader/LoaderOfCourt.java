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
 * The referrer loader of (裁判所)COURT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COURT_ID
 *
 * [column]
 *     COURT_ID, COURT_NAME, COURT_ALIAS, COURT_TYPE_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     CLS_COURT_TYPE
 *
 * [referrer table]
 *     JUDGEMENT
 *
 * [foreign property]
 *     clsCourtType
 *
 * [referrer property]
 *     judgementList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCourt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Court> _selectedList;
    protected BehaviorSelector _selector;
    protected CourtBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCourt ready(List<Court> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CourtBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CourtBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Judgement> _referrerJudgement;

    /**
     * Load referrer of judgementList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by COURT_ID, named 'judgementList'.
     * <pre>
     * <span style="color: #0000C0">courtBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">courtList</span>, <span style="color: #553000">courtLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courtLoader</span>.<span style="color: #CC4747">loadJudgement</span>(<span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">judgementCB</span>.setupSelect...
     *         <span style="color: #553000">judgementCB</span>.query().set...
     *         <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">judgementLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    judgementLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Court court : <span style="color: #553000">courtList</span>) {
     *     ... = court.<span style="color: #CC4747">getJudgementList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCourtId_InScope(pkList);
     * cb.query().addOrderBy_CourtId_Asc();
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
    protected LoaderOfClsCourtType _foreignClsCourtTypeLoader;
    public LoaderOfClsCourtType pulloutClsCourtType() {
        if (_foreignClsCourtTypeLoader == null)
        { _foreignClsCourtTypeLoader = new LoaderOfClsCourtType().ready(myBhv().pulloutClsCourtType(_selectedList), _selector); }
        return _foreignClsCourtTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Court> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
