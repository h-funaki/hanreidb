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

import tech.law.hanreidb.dbflute.cbean.cq.JudgementUserFavoriteRelCQ;

/**
 * The nest select set-upper of JUDGEMENT_USER_FAVORITE_REL.
 * @author DBFlute(AutoGenerator)
 */
public class JudgementUserFavoriteRelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final JudgementUserFavoriteRelCQ _query;
    public JudgementUserFavoriteRelNss(JudgementUserFavoriteRelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (判決)JUDGEMENT by my JUDGEMENT_ID, named 'judgement'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public JudgementNss withJudgement() {
        _query.xdoNss(() -> _query.queryJudgement());
        return new JudgementNss(_query.queryJudgement());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (ユーザー)USER by my USER_ID, named 'user'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public UserNss withUser() {
        _query.xdoNss(() -> _query.queryUser());
        return new UserNss(_query.queryUser());
    }
}
