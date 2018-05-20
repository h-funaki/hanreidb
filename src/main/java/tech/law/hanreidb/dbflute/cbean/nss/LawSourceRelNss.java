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

import tech.law.hanreidb.dbflute.cbean.cq.LawSourceRelCQ;

/**
 * The nest select set-upper of LAW_SOURCE_REL.
 * @author DBFlute(AutoGenerator)
 */
public class LawSourceRelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LawSourceRelCQ _query;
    public LawSourceRelNss(LawSourceRelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (法令)LAW by my LAW_ID, named 'law'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public LawNss withLaw() {
        _query.xdoNss(() -> _query.queryLaw());
        return new LawNss(_query.queryLaw());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]取得元)CLS_SOURCE by my SOURCE_CODE, named 'clsSource'.
     */
    public void withClsSource() {
        _query.xdoNss(() -> _query.queryClsSource());
    }
}
