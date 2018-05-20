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
 * The referrer loader of (条文)ARTICLE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ARTICLE_ID
 *
 * [column]
 *     ARTICLE_ID, LAW_TOC_ID, LAW_HISTORY_ID, ARTICLE_NUMBER, ARTICLE_CAPTION, ARTICLE_TITLE, ARTICLE_DISPLAY_ORDER, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARTICLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     LAW_HISTORY, LAW_TOC
 *
 * [referrer table]
 *     ARTICLE_CONTENT, JUDGEMENT_ARTICLE_REL
 *
 * [foreign property]
 *     lawHistory, lawToc
 *
 * [referrer property]
 *     articleContentList, judgementArticleRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfArticle {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Article> _selectedList;
    protected BehaviorSelector _selector;
    protected ArticleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfArticle ready(List<Article> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ArticleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ArticleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ArticleContent> _referrerArticleContent;

    /**
     * Load referrer of articleContentList by the set-upper of referrer. <br>
     * (条文内容)ARTICLE_CONTENT by ARTICLE_ID, named 'articleContentList'.
     * <pre>
     * <span style="color: #0000C0">articleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">articleList</span>, <span style="color: #553000">articleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">articleLoader</span>.<span style="color: #CC4747">loadArticleContent</span>(<span style="color: #553000">contentCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">contentCB</span>.setupSelect...
     *         <span style="color: #553000">contentCB</span>.query().set...
     *         <span style="color: #553000">contentCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">contentLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    contentLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Article article : <span style="color: #553000">articleList</span>) {
     *     ... = article.<span style="color: #CC4747">getArticleContentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setArticleId_InScope(pkList);
     * cb.query().addOrderBy_ArticleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfArticleContent> loadArticleContent(ReferrerConditionSetupper<ArticleContentCB> refCBLambda) {
        myBhv().loadArticleContent(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerArticleContent = refLs);
        return hd -> hd.handle(new LoaderOfArticleContent().ready(_referrerArticleContent, _selector));
    }

    protected List<JudgementArticleRel> _referrerJudgementArticleRel;

    /**
     * Load referrer of judgementArticleRelList by the set-upper of referrer. <br>
     * (判決条文リレーション)JUDGEMENT_ARTICLE_REL by ARTICLE_ID, named 'judgementArticleRelList'.
     * <pre>
     * <span style="color: #0000C0">articleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">articleList</span>, <span style="color: #553000">articleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">articleLoader</span>.<span style="color: #CC4747">loadJudgementArticleRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Article article : <span style="color: #553000">articleList</span>) {
     *     ... = article.<span style="color: #CC4747">getJudgementArticleRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setArticleId_InScope(pkList);
     * cb.query().addOrderBy_ArticleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementArticleRel> loadJudgementArticleRel(ReferrerConditionSetupper<JudgementArticleRelCB> refCBLambda) {
        myBhv().loadJudgementArticleRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementArticleRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementArticleRel().ready(_referrerJudgementArticleRel, _selector));
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

    protected LoaderOfLawToc _foreignLawTocLoader;
    public LoaderOfLawToc pulloutLawToc() {
        if (_foreignLawTocLoader == null)
        { _foreignLawTocLoader = new LoaderOfLawToc().ready(myBhv().pulloutLawToc(_selectedList), _selector); }
        return _foreignLawTocLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Article> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
