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
 * The referrer loader of (判例集)REPORT as TABLE. <br>
 * <pre>
 * [primary key]
 *     REPORT_ID
 *
 * [column]
 *     REPORT_ID, REPORT_NAME, REPORT_ALIAS, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     REPORT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     JUDGEMENT_REPORT_REL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     judgementReportRelList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Report> _selectedList;
    protected BehaviorSelector _selector;
    protected ReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfReport ready(List<Report> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<JudgementReportRel> _referrerJudgementReportRel;

    /**
     * Load referrer of judgementReportRelList by the set-upper of referrer. <br>
     * (判決判例集リレーション)JUDGEMENT_REPORT_REL by REPORT_ID, named 'judgementReportRelList'.
     * <pre>
     * <span style="color: #0000C0">reportBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">reportList</span>, <span style="color: #553000">reportLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">reportLoader</span>.<span style="color: #CC4747">loadJudgementReportRel</span>(<span style="color: #553000">relCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">relCB</span>.setupSelect...
     *         <span style="color: #553000">relCB</span>.query().set...
     *         <span style="color: #553000">relCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">relLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    relLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Report report : <span style="color: #553000">reportList</span>) {
     *     ... = report.<span style="color: #CC4747">getJudgementReportRelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReportId_InScope(pkList);
     * cb.query().addOrderBy_ReportId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfJudgementReportRel> loadJudgementReportRel(ReferrerConditionSetupper<JudgementReportRelCB> refCBLambda) {
        myBhv().loadJudgementReportRel(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerJudgementReportRel = refLs);
        return hd -> hd.handle(new LoaderOfJudgementReportRel().ready(_referrerJudgementReportRel, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Report> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
