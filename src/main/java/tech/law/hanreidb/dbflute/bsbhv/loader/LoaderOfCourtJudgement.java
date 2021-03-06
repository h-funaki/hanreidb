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
 * The referrer loader of (裁判所判決)COURT_JUDGEMENT as TABLE. <br>
 * <pre>
 * [primary key]
 *     COURT_JUDGEMENT_ID
 *
 * [column]
 *     COURT_JUDGEMENT_ID, CASE_NUMBER, CASE_NAME, JUDGEMENT_DATE, COURT_NAME, JUDGEMENT_TYPE, JUDGEMENT_RESULT, PRECEDENT_REPORTS, ORIGINAL_COURT_NAME, ORIGINAL_CASE_NUMBER, ORIGINAL_JUDGEMENT_DATE, ORIGINAL_JUDGEMENT_RESULT, JUDGEMENT_CONTENT, JUDGEMENT_SUMMARY, LAW, TEXT_URL, HIGH_COURT_REPORTS, JUDGEMENT_CONTENT_SUMMARY, RIGHT_TYPE, LAWSUIT_TYPE, CASE_CATEGORY, SOURCE_ORIGINAL_ID, MEMO, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COURT_JUDGEMENT_ID
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
public class LoaderOfCourtJudgement {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<CourtJudgement> _selectedList;
    protected BehaviorSelector _selector;
    protected CourtJudgementBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCourtJudgement ready(List<CourtJudgement> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CourtJudgementBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CourtJudgementBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<CourtJudgement> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
