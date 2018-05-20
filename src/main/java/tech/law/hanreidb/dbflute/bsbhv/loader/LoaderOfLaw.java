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
 * The referrer loader of (法令)LAW as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_ID
 *
 * [column]
 *     LAW_ID, LAW_TYPE_CODE, LAW_PUBLIC_CODE, LAW_NAME, LAW_NUMBER, PROMULGATION_DATE, EFFECTIVE_DATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_TYPE
 *
 * [referrer table]
 *     LAW_ALIAS, LAW_CATEGORY_REL, LAW_HISTORY, LAW_SOURCE_REL, SOURCE_LAW_CATEGORY_REL
 *
 * [foreign property]
 *     lawType
 *
 * [referrer property]
 *     lawAliasList, lawCategoryRelList, lawHistoryByAmendLawIdList, lawHistoryByLawIdList, lawSourceRelList, sourceLawCategoryRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLaw {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Law> _selectedList;
    protected BehaviorSelector _selector;
    protected LawBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLaw ready(List<Law> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<LawAlias> _referrerLawAlias;

    /**
     * Load referrer of lawAliasList by the set-upper of referrer. <br>
     * (法令略称)LAW_ALIAS by LAW_ID, named 'lawAliasList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadLawAlias</span>(<span style="color: #553000">aliasCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">aliasCB</span>.setupSelect...
     *         <span style="color: #553000">aliasCB</span>.query().set...
     *         <span style="color: #553000">aliasCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">aliasLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    aliasLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawAliasList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawAlias> loadLawAlias(ReferrerConditionSetupper<LawAliasCB> refCBLambda) {
        myBhv().loadLawAlias(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawAlias = refLs);
        return hd -> hd.handle(new LoaderOfLawAlias().ready(_referrerLawAlias, _selector));
    }

    protected List<LawCategoryRel> _referrerLawCategoryRel;

    /**
     * Load referrer of lawCategoryRelList by the set-upper of referrer. <br>
     * (法令カテゴリーリレーション)LAW_CATEGORY_REL by LAW_ID, named 'lawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadLawCategoryRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawCategoryRel> loadLawCategoryRel(ReferrerConditionSetupper<LawCategoryRelCB> refCBLambda) {
        myBhv().loadLawCategoryRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawCategoryRel = refLs);
        return hd -> hd.handle(new LoaderOfLawCategoryRel().ready(_referrerLawCategoryRel, _selector));
    }

    protected List<LawHistory> _referrerLawHistoryByAmendLawId;

    /**
     * Load referrer of lawHistoryByAmendLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by AMEND_LAW_ID, named 'lawHistoryByAmendLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadLawHistoryByAmendLawId</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawHistoryByAmendLawIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAmendLawId_InScope(pkList);
     * cb.query().addOrderBy_AmendLawId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawHistory> loadLawHistoryByAmendLawId(ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        myBhv().loadLawHistoryByAmendLawId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawHistoryByAmendLawId = refLs);
        return hd -> hd.handle(new LoaderOfLawHistory().ready(_referrerLawHistoryByAmendLawId, _selector));
    }

    protected List<LawHistory> _referrerLawHistoryByLawId;

    /**
     * Load referrer of lawHistoryByLawIdList by the set-upper of referrer. <br>
     * (法令履歴)LAW_HISTORY by LAW_ID, named 'lawHistoryByLawIdList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadLawHistoryByLawId</span>(<span style="color: #553000">historyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">historyCB</span>.setupSelect...
     *         <span style="color: #553000">historyCB</span>.query().set...
     *         <span style="color: #553000">historyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">historyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    historyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawHistoryByLawIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawHistory> loadLawHistoryByLawId(ReferrerConditionSetupper<LawHistoryCB> refCBLambda) {
        myBhv().loadLawHistoryByLawId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawHistoryByLawId = refLs);
        return hd -> hd.handle(new LoaderOfLawHistory().ready(_referrerLawHistoryByLawId, _selector));
    }

    protected List<LawSourceRel> _referrerLawSourceRel;

    /**
     * Load referrer of lawSourceRelList by the set-upper of referrer. <br>
     * (法令取得元リレーション)LAW_SOURCE_REL by LAW_ID, named 'lawSourceRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadLawSourceRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getLawSourceRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawSourceRel> loadLawSourceRel(ReferrerConditionSetupper<LawSourceRelCB> refCBLambda) {
        myBhv().loadLawSourceRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawSourceRel = refLs);
        return hd -> hd.handle(new LoaderOfLawSourceRel().ready(_referrerLawSourceRel, _selector));
    }

    protected List<SourceLawCategoryRel> _referrerSourceLawCategoryRel;

    /**
     * Load referrer of sourceLawCategoryRelList by the set-upper of referrer. <br>
     * (取得元法令カテゴリーリレーション)SOURCE_LAW_CATEGORY_REL by LAW_ID, named 'sourceLawCategoryRelList'.
     * <pre>
     * <span style="color: #0000C0">lawBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawList</span>, <span style="color: #553000">lawLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lawLoader</span>.<span style="color: #CC4747">loadSourceLawCategoryRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Law law : <span style="color: #553000">lawList</span>) {
     *     ... = law.<span style="color: #CC4747">getSourceLawCategoryRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawId_InScope(pkList);
     * cb.query().addOrderBy_LawId_Asc();
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
    protected LoaderOfLawType _foreignLawTypeLoader;
    public LoaderOfLawType pulloutLawType() {
        if (_foreignLawTypeLoader == null)
        { _foreignLawTypeLoader = new LoaderOfLawType().ready(myBhv().pulloutLawType(_selectedList), _selector); }
        return _foreignLawTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Law> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
