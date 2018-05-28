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
 * The referrer loader of (法令目次)LAW_TOC as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_TOC_ID
 *
 * [column]
 *     LAW_TOC_ID, LAW_HISTORY_ID, PART_NUMBER, PART_TITLE, PART_CAPTION, CHAPTER_NUMBER, CHAPTER_TITLE, CHAPTER_CAPTION, SECTION_NUMBER, SECTION_TITLE, SECTION_CAPTION, SUBSECTION_NUMBER, SUBSECTION_TITLE, SUBSECTION_CAPTION, DIVISION_NUMBER, DIVISION_TITLE, DIVISION_CAPTION, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LAW_TOC_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY
 *
 * [referrer table]
 *     ARTICLE
 *
 * [foreign property]
 *     lawHistory
 *
 * [referrer property]
 *     articleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawToc {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawToc> _selectedList;
    protected BehaviorSelector _selector;
    protected LawTocBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawToc ready(List<LawToc> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawTocBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawTocBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Article> _referrerArticle;

    /**
     * Load referrer of articleList by the set-upper of referrer. <br>
     * (条文)ARTICLE by LAW_TOC_ID, named 'articleList'.
     * <pre>
     * <span style="color: #0000C0">lawTocBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawTocList</span>, <span style="color: #553000">tocLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">tocLoader</span>.<span style="color: #CC4747">loadArticle</span>(<span style="color: #553000">articleCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">articleCB</span>.setupSelect...
     *         <span style="color: #553000">articleCB</span>.query().set...
     *         <span style="color: #553000">articleCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">articleLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    articleLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawToc lawToc : <span style="color: #553000">lawTocList</span>) {
     *     ... = lawToc.<span style="color: #CC4747">getArticleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawTocId_InScope(pkList);
     * cb.query().addOrderBy_LawTocId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfArticle> loadArticle(ReferrerConditionSetupper<ArticleCB> refCBLambda) {
        myBhv().loadArticle(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerArticle = refLs);
        return hd -> hd.handle(new LoaderOfArticle().ready(_referrerArticle, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLawHistory _foreignLawHistoryLoader;
    public LoaderOfLawHistory pulloutLawHistory() {
        if (_foreignLawHistoryLoader == null)
        { _foreignLawHistoryLoader = new LoaderOfLawHistory().ready(myBhv().pulloutLawHistory(_selectedList), _selector); }
        return _foreignLawHistoryLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawToc> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
