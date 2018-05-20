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
 * The referrer loader of (法令種別)LAW_TYPE as TABLE. <br>
 * <pre>
 * [primary key]
 *     LAW_TYPE_CODE
 *
 * [column]
 *     LAW_TYPE_CODE, LAW_TYPE_NAME, LAW_TYPE_ALIAS, DESCRIPTION, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     LAW
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     lawList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLawType {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LawType> _selectedList;
    protected BehaviorSelector _selector;
    protected LawTypeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLawType ready(List<LawType> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LawTypeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LawTypeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Law> _referrerLaw;

    /**
     * Load referrer of lawList by the set-upper of referrer. <br>
     * (法令)LAW by LAW_TYPE_CODE, named 'lawList'.
     * <pre>
     * <span style="color: #0000C0">lawTypeBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">lawTypeList</span>, <span style="color: #553000">typeLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeLoader</span>.<span style="color: #CC4747">loadLaw</span>(<span style="color: #553000">lawCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lawCB</span>.setupSelect...
     *         <span style="color: #553000">lawCB</span>.query().set...
     *         <span style="color: #553000">lawCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lawLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lawLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (LawType lawType : <span style="color: #553000">lawTypeList</span>) {
     *     ... = lawType.<span style="color: #CC4747">getLawList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLawTypeCode_InScope(pkList);
     * cb.query().addOrderBy_LawTypeCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfLaw> loadLaw(ReferrerConditionSetupper<LawCB> refCBLambda) {
        myBhv().loadLaw(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerLaw = refLs);
        return hd -> hd.handle(new LoaderOfLaw().ready(_referrerLaw, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LawType> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
