/*
u * Copyright 2015-2017 the original author or authors.
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
package tech.law.hanreidb.dbflute.exentity;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.util.List;

import tech.law.hanreidb.dbflute.bsentity.BsLaw;

/**
 * The entity of LAW.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Law extends BsLaw {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    public List<String> getLawAliasListAsStringList() {
        List<String> lawAliasList = newArrayList();
        for (LawAlias lawAlias : getLawAliasList()) {
            lawAliasList.add(lawAlias.getLawAlias());
        }
        return lawAliasList;
    }
}
