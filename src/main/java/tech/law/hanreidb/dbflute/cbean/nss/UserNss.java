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

import tech.law.hanreidb.dbflute.cbean.cq.UserCQ;

/**
 * The nest select set-upper of USER.
 * @author DBFlute(AutoGenerator)
 */
public class UserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserCQ _query;
    public UserNss(UserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ([区分値]ユーザーステータス)CLS_USER_STATUS by my USER_STATUS_CODE, named 'clsUserStatus'.
     */
    public void withClsUserStatus() {
        _query.xdoNss(() -> _query.queryClsUserStatus());
    }
}
