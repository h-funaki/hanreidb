/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.status;

import org.dbflute.optional.OptionalThing;

/**
 * @author jflute
 */
public enum NxResponseStatus implements BizResponseStatus {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    SUCCESS(200, null) // OK
    , SERVER_ERROR(500, null) // internal server error
    ;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final int statusCode;
    private final String messageKey; // for result.message, mainly 4xx, null allowed

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private NxResponseStatus(int statusCode, String messageKey) {
        this.statusCode = statusCode;
        this.messageKey = messageKey;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return name() + "(" + statusCode + ")";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int statusCode() {
        return statusCode;
    }

    public OptionalThing<String> messageKey() {
        return OptionalThing.ofNullable(messageKey, () -> {
            throw new IllegalStateException("Not found the message key for the status: " + statusCode);
        });
    }
}
