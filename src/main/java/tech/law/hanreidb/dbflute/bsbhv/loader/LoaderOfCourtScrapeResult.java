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
 * The referrer loader of (裁判所スクレイピング結果)COURT_SCRAPE_RESULT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [column]
 *     COURT_SCRAPE_RESULT_ID, CASE_NUMBER, CASE_NAME, JUDGEMENT_DATE, COURT_NAME, JUDGEMENT_TYPE, JUDGEMENT_RESULT, PRECEDENT_REPORTS, ORIGINAL_COURT_NAME, ORIGINAL_CASE_NUMBER, ORIGINAL_JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_RESULT, JUDGEMENT_CONTENT, JUDGEMENT_SUMMARY, LAW, TEXT_URL, HIGH_COURT_REPORTS, JUDGEMENT_CONTENT_SUMMARY, RIGHT_TYPE, LAWSUIT_TYPE, CASE_CATEGORY, SOURCE_ORIGINAL_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_SCRAPE_RESULT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCourtScrapeResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CourtScrapeResult> _selectedList;
    protected BehaviorSelector _selector;
    protected CourtScrapeResultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCourtScrapeResult ready(List<CourtScrapeResult> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CourtScrapeResultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CourtScrapeResultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CourtScrapeResult> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
