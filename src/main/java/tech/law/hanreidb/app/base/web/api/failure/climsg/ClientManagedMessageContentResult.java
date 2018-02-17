/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.api.failure.climsg;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.lastaflute.web.validation.Required;

import tech.law.hanreidb.app.base.web.response.result.ContentResult;

/**
 * @author awane
 * @author jflute
 */
public class ClientManagedMessageContentResult implements ContentResult {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // [Reference Site]
    // http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsonfaicli.html
    // *not unified-failure pattern but client-managed message
    // _/_/_/_/_/_/_/_/_/_/

    @NotNull
    @Valid
    public final List<ClientFailureErrorPart> errors;

    public static class ClientFailureErrorPart {

        /** エラーとなった要素 e.g. account_id */
        @Required
        public final String field;

        /** エラー要因 e.g. MAX */
        @Required
        public final String code;

        /** エラーとなった要因の詳細 e.g. {"max": 100} */
        @NotNull
        public final Map<String, Object> data;

        public ClientFailureErrorPart(String field, String code, Map<String, Object> data) {
            this.field = field;
            this.code = code;
            this.data = data;
        }
    }

    public ClientManagedMessageContentResult(List<ClientFailureErrorPart> errors) {
        this.errors = errors;
    }
}
