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
package tech.law.hanreidb.dbflute.cbean.nss;

import tech.law.hanreidb.dbflute.cbean.cq.JudgementCQ;

/**
 * The nest select set-upper of JUDGEMENT.
 * @author DBFlute(AutoGenerator)
 */
public class JudgementNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final JudgementCQ _query;
    public JudgementNss(JudgementCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]法廷種別)CLS_BENCH by my BENCH_CODE, named 'clsBench'.
     */
    public void withClsBench() {
        _query.xdoNss(() -> _query.queryClsBench());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (事件符号)CASE_MARK by my CASE_MARK_ID, named 'caseMark'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CaseMarkNss withCaseMark() {
        _query.xdoNss(() -> _query.queryCaseMark());
        return new CaseMarkNss(_query.queryCaseMark());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]元号)CLS_ERA by my CASE_NUMBER_ERA_CODE, named 'clsEra'.
     */
    public void withClsEra() {
        _query.xdoNss(() -> _query.queryClsEra());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (裁判所)COURT by my COURT_ID, named 'court'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CourtNss withCourt() {
        _query.xdoNss(() -> _query.queryCourt());
        return new CourtNss(_query.queryCourt());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]判決結果)CLS_JUDGEMENT_RESULT by my JUDGEMENT_RESULT_CODE, named 'clsJudgementResult'.
     */
    public void withClsJudgementResult() {
        _query.xdoNss(() -> _query.queryClsJudgementResult());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]判決種別)CLS_JUDGEMENT_TYPE by my JUDGEMENT_TYPE_CODE, named 'clsJudgementType'.
     */
    public void withClsJudgementType() {
        _query.xdoNss(() -> _query.queryClsJudgementType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (判決)JUDGEMENT by my ORIGINAL_JUDGEMENT_ID, named 'judgementSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public JudgementNss withJudgementSelf() {
        _query.xdoNss(() -> _query.queryJudgementSelf());
        return new JudgementNss(_query.queryJudgementSelf());
    }
}
