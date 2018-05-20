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
import tech.law.hanreidb.dbflute.exbhv.*;
import tech.law.hanreidb.dbflute.exentity.*;

/**
 * The referrer loader of (条文内容)ARTICLE_CONTENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     ARTICLE_CONTENT_ID
 *
 * [column]
 *     ARTICLE_CONTENT_ID, ARTICLE_ID, ARTICLE_CONTENT_RAW_XML, ARTICLE_CONTENT_VIEW_XML
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ARTICLE_CONTENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ARTICLE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     article
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfArticleContent {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ArticleContent> _selectedList;
    protected BehaviorSelector _selector;
    protected ArticleContentBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfArticleContent ready(List<ArticleContent> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ArticleContentBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ArticleContentBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfArticle _foreignArticleLoader;
    public LoaderOfArticle pulloutArticle() {
        if (_foreignArticleLoader == null)
        { _foreignArticleLoader = new LoaderOfArticle().ready(myBhv().pulloutArticle(_selectedList), _selector); }
        return _foreignArticleLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ArticleContent> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
