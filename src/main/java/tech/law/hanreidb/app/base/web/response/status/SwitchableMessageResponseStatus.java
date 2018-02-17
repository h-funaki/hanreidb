/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.status;

import java.util.Arrays;

import org.dbflute.optional.OptionalThing;

/**
 * @author jflute
 * @author mito
 */
public class SwitchableMessageResponseStatus implements BizResponseStatus {

    protected final BizResponseStatus wrappedStatus; // not null
    protected final String actualMessageKey; // not null
    protected final Object[] actualMessageParams; // not null, empty allowed

    public SwitchableMessageResponseStatus(BizResponseStatus wrappedStatus, String actualMessageKey, Object... actualMessageParams) {
        this.wrappedStatus = wrappedStatus;
        this.actualMessageKey = actualMessageKey;
        this.actualMessageParams = actualMessageParams;
    }

    @Override
    public String toString() {
        final String params = actualMessageParams != null ? Arrays.asList(actualMessageParams).toString() : null;
        return "switchable:{" + wrappedStatus + ", " + actualMessageKey + ", " + params + "}";
    }

    public BizResponseStatus getStatus() {
        return wrappedStatus;
    }

    @Override
    public int statusCode() {
        return wrappedStatus.statusCode();
    }

    @Override
    public OptionalThing<String> messageKey() {
        return OptionalThing.of(actualMessageKey);
    }

    @Override
    public Object[] messageParams() {
        return actualMessageParams != null ? actualMessageParams : EMPTY_PARAMS;
    }
}
