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
 * The referrer loader of (法令履歴)LAW_HISTORY as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_HISTORY_ID
 *
 * [column]
 *     LAW_HISTORY_ID, LAW_ID, AMEND_LAW_ID, LAW_AMEND_VERSION, LATEST_VERSION_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_HISTORY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW
 *
 * [referrer table]
 *     ARTICLE, LAW_CONTENT, LAW_TOC
 *
 * [foreign property]
 *     lawByAmendLawId, lawByLawId
 *
 * [referrer property]
 *     articleList, lawContentList, lawTocList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawHistory> _selectedList;
    protected BehaviorSelector _selector;
    protected LawHistoryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawHistory ready(List<LawHistory> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawHistoryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawHistoryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Article> _referrerArticle;

    /**
     * Load referrer of articleList by the set-upper of referrer. <br>
     * (条文)ARTICLE by LAW_HISTORY_ID, named 'articleList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawHistoryList</span>, <span style="color: #553000">historyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyLoader</span>.<span style="color: #CC4747">loadArticle</span>(<span style="color: #553000">articleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">articleCB</span>.setupSelect...
     *         <span style="color: #553000">articleCB</span>.query().set...
     *         <span style="color: #553000">articleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">articleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    articleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawHistory lawHistory : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = lawHistory.<span style="color: #CC4747">getArticleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfArticle> loadArticle(ReferrerConditionSetupper<ArticleCB> refCBLambda) {
        myBhv().loadArticle(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerArticle = refLs);
        return hd -> hd.handle(new LoaderOfArticle().ready(_referrerArticle, _selector));
    }

    protected List<LawContent> _referrerLawContent;

    /**
     * Load referrer of lawContentList by the set-upper of referrer. <br>
     * (法令内容)LAW_CONTENT by LAW_HISTORY_ID, named 'lawContentList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawHistoryList</span>, <span style="color: #553000">historyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyLoader</span>.<span style="color: #CC4747">loadLawContent</span>(<span style="color: #553000">contentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">contentCB</span>.setupSelect...
     *         <span style="color: #553000">contentCB</span>.query().set...
     *         <span style="color: #553000">contentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">contentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    contentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawHistory lawHistory : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = lawHistory.<span style="color: #CC4747">getLawContentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawContent> loadLawContent(ReferrerConditionSetupper<LawContentCB> refCBLambda) {
        myBhv().loadLawContent(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawContent = refLs);
        return hd -> hd.handle(new LoaderOfLawContent().ready(_referrerLawContent, _selector));
    }

    protected List<LawToc> _referrerLawToc;

    /**
     * Load referrer of lawTocList by the set-upper of referrer. <br>
     * (法令目次)LAW_TOC by LAW_HISTORY_ID, named 'lawTocList'.
     * <pre>
     * <span style="color: #0000C0">lawHistoryBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawHistoryList</span>, <span style="color: #553000">historyLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">historyLoader</span>.<span style="color: #CC4747">loadLawToc</span>(<span style="color: #553000">tocCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tocCB</span>.setupSelect...
     *         <span style="color: #553000">tocCB</span>.query().set...
     *         <span style="color: #553000">tocCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tocLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tocLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawHistory lawHistory : <span style="color: #553000">lawHistoryList</span>) {
     *     ... = lawHistory.<span style="color: #CC4747">getLawTocList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawHistoryId_InScope(pkList);
     * cb.query().addOrderBy_LawHistoryId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLawToc> loadLawToc(ReferrerConditionSetupper<LawTocCB> refCBLambda) {
        myBhv().loadLawToc(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLawToc = refLs);
        return hd -> hd.handle(new LoaderOfLawToc().ready(_referrerLawToc, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLaw _foreignLawByAmendLawIdLoader;
    public LoaderOfLaw pulloutLawByAmendLawId() {
        if (_foreignLawByAmendLawIdLoader == null)
        { _foreignLawByAmendLawIdLoader = new LoaderOfLaw().ready(myBhv().pulloutLawByAmendLawId(_selectedList), _selector); }
        return _foreignLawByAmendLawIdLoader;
    }

    protected LoaderOfLaw _foreignLawByLawIdLoader;
    public LoaderOfLaw pulloutLawByLawId() {
        if (_foreignLawByLawIdLoader == null)
        { _foreignLawByLawIdLoader = new LoaderOfLaw().ready(myBhv().pulloutLawByLawId(_selectedList), _selector); }
        return _foreignLawByLawIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawHistory> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
