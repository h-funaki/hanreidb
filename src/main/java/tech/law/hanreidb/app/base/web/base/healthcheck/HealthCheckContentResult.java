/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base.healthcheck;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.web.validation.Required;

import tech.law.hanreidb.app.base.web.response.result.ContentResult;

/**
 * @author mito
 */
public class HealthCheckContentResult implements ContentResult {

    /** MANIFEST.MF (NullAllowed: マニフェスト自体が存在しない場合) */
    @Valid
    public ManifestPart manifest;

    /** DBの状態 */
    @NotNull
    public ImmutableList<DatabasePart> database_list;

    /** KVSの状態 */
    @NotNull
    public ImmutableList<KvsPart> kvs_list;

    /**
     * @author mito
     */
    public static class ManifestPart {

        /** マニフェスト属性 */
        @NotNull
        public ImmutableList<ManifestAttributePart> attribute_list;

        /**
         * @author mito
         */
        public static class ManifestAttributePart {

            /** key e.g. build_timestamp */
            @Required
            public String key;

            /** value e.g. "2018-01-05T18:02:17.242" (NullAllowed: 何が入ってるかわからないので) */
            public String value;
        }
    }

    /**
     * @author mito
     */
    public static class DatabasePart {

        /** 接続先を表す名前 url かもしれない e.g. "jdbc:mysql://localhost:3306/laxampledb" */
        @Required
        public String name;

        /** 接続可能な場合は true */
        @Required
        public Boolean connect;
    }

    /**
     * @author mito
     */
    public static class KvsPart {

        /** 接続先を表す名前 url かもしれない e.g. "localhost:6390" */
        @Required
        public String name;

        /** 接続可能な場合は true e.g. true */
        @Required
        public Boolean connect;
    }
}
