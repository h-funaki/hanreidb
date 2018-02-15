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
 * The referrer loader of (判決)JUDGEMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     JUDGEMENT_ID
 *
 * [column]
 *     JUDGEMENT_ID, JUDGEMENT_PUBLIC_CODE, CASE_NAME, PRECEDENT_REPORTS_KAN, PRECEDENT_REPORTS_GO, PRECEDENT_REPORTS_KO, JUDGEMENT_REPORTS_GO, JUDGEMENT_REPORTS_KO, JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_ID, CASE_NUMBER_ERA_CODE, CASE_NUMBER_YEAR, CASE_MARK_ID, CASE_NUMBER_SERIAL_NUMBER, COURT_ID, BENCH_CODE, JUDGEMENT_RESULT_CODE, JUDGEMENT_TYPE_CODE, SENTENCE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     JUDGEMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     CLS_BENCH, CASE_MARK, CLS_ERA, COURT, CLS_JUDGEMENT_RESULT, CLS_JUDGEMENT_TYPE, JUDGEMENT
 *
 * [referrer table]
 *     JUDGEMENT, JUDGEMENT_SOURCE_REL, JUDGEMENT_USER_FAVORITE_REL
 *
 * [foreign property]
 *     clsBench, caseMark, clsEra, court, clsJudgementResult, clsJudgementType, judgementSelf
 *
 * [referrer property]
 *     judgementSelfList, judgementSourceRelList, judgementUserFavoriteRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfJudgement {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Judgement> _selectedList;
    protected BehaviorSelector _selector;
    protected JudgementBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfJudgement ready(List<Judgement> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected JudgementBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(JudgementBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Judgement> _referrerJudgementSelf;

    /**
     * Load referrer of judgementSelfList by the set-upper of referrer. <br>
     * (判決)JUDGEMENT by ORIGINAL_JUDGEMENT_ID, named 'judgementSelfList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">judgementLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementLoader</span>.<span style="color: #CC4747">loadJudgementSelf</span>(<span style="color: #553000">judgementCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">judgementCB</span>.setupSelect...
     *         <span style="color: #553000">judgementCB</span>.query().set...
     *         <span style="color: #553000">judgementCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">judgementLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    judgementLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOriginalJudgementId_InScope(pkList);
     * cb.query().addOrderBy_OriginalJudgementId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgement> loadJudgementSelf(ReferrerConditionSetupper<JudgementCB> refCBLambda) {
        myBhv().loadJudgementSelf(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementSelf = refLs);
        return hd -> hd.handle(new LoaderOfJudgement().ready(_referrerJudgementSelf, _selector));
    }

    protected List<JudgementSourceRel> _referrerJudgementSourceRel;

    /**
     * Load referrer of judgementSourceRelList by the set-upper of referrer. <br>
     * (判決取得元リレーション)JUDGEMENT_SOURCE_REL by JUDGEMENT_ID, named 'judgementSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">judgementLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementLoader</span>.<span style="color: #CC4747">loadJudgementSourceRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementSourceRel> loadJudgementSourceRel(ReferrerConditionSetupper<JudgementSourceRelCB> refCBLambda) {
        myBhv().loadJudgementSourceRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementSourceRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementSourceRel().ready(_referrerJudgementSourceRel, _selector));
    }

    protected List<JudgementUserFavoriteRel> _referrerJudgementUserFavoriteRel;

    /**
     * Load referrer of judgementUserFavoriteRelList by the set-upper of referrer. <br>
     * (判決ユーザーお気に入りリレーション)JUDGEMENT_USER_FAVORITE_REL by JUDGEMENT_ID, named 'judgementUserFavoriteRelList'.
     * <pre>
     * <span style="color: #0000C0">judgementBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">judgementList</span>, <span style="color: #553000">judgementLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">judgementLoader</span>.<span style="color: #CC4747">loadJudgementUserFavoriteRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Judgement judgement : <span style="color: #553000">judgementList</span>) {
     *     ... = judgement.<span style="color: #CC4747">getJudgementUserFavoriteRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setJudgementId_InScope(pkList);
     * cb.query().addOrderBy_JudgementId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementUserFavoriteRel> loadJudgementUserFavoriteRel(ReferrerConditionSetupper<JudgementUserFavoriteRelCB> refCBLambda) {
        myBhv().loadJudgementUserFavoriteRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementUserFavoriteRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementUserFavoriteRel().ready(_referrerJudgementUserFavoriteRel, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfClsBench _foreignClsBenchLoader;
    public LoaderOfClsBench pulloutClsBench() {
        if (_foreignClsBenchLoader == null)
        { _foreignClsBenchLoader = new LoaderOfClsBench().ready(myBhv().pulloutClsBench(_selectedList), _selector); }
        return _foreignClsBenchLoader;
    }

    protected LoaderOfCaseMark _foreignCaseMarkLoader;
    public LoaderOfCaseMark pulloutCaseMark() {
        if (_foreignCaseMarkLoader == null)
        { _foreignCaseMarkLoader = new LoaderOfCaseMark().ready(myBhv().pulloutCaseMark(_selectedList), _selector); }
        return _foreignCaseMarkLoader;
    }

    protected LoaderOfClsEra _foreignClsEraLoader;
    public LoaderOfClsEra pulloutClsEra() {
        if (_foreignClsEraLoader == null)
        { _foreignClsEraLoader = new LoaderOfClsEra().ready(myBhv().pulloutClsEra(_selectedList), _selector); }
        return _foreignClsEraLoader;
    }

    protected LoaderOfCourt _foreignCourtLoader;
    public LoaderOfCourt pulloutCourt() {
        if (_foreignCourtLoader == null)
        { _foreignCourtLoader = new LoaderOfCourt().ready(myBhv().pulloutCourt(_selectedList), _selector); }
        return _foreignCourtLoader;
    }

    protected LoaderOfClsJudgementResult _foreignClsJudgementResultLoader;
    public LoaderOfClsJudgementResult pulloutClsJudgementResult() {
        if (_foreignClsJudgementResultLoader == null)
        { _foreignClsJudgementResultLoader = new LoaderOfClsJudgementResult().ready(myBhv().pulloutClsJudgementResult(_selectedList), _selector); }
        return _foreignClsJudgementResultLoader;
    }

    protected LoaderOfClsJudgementType _foreignClsJudgementTypeLoader;
    public LoaderOfClsJudgementType pulloutClsJudgementType() {
        if (_foreignClsJudgementTypeLoader == null)
        { _foreignClsJudgementTypeLoader = new LoaderOfClsJudgementType().ready(myBhv().pulloutClsJudgementType(_selectedList), _selector); }
        return _foreignClsJudgementTypeLoader;
    }

    protected LoaderOfJudgement _foreignJudgementSelfLoader;
    public LoaderOfJudgement pulloutJudgementSelf() {
        if (_foreignJudgementSelfLoader == null)
        { _foreignJudgementSelfLoader = new LoaderOfJudgement().ready(myBhv().pulloutJudgementSelf(_selectedList), _selector); }
        return _foreignJudgementSelfLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Judgement> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
