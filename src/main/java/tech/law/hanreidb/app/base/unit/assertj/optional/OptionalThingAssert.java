/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.optional;

import org.dbflute.optional.OptionalThing;

/**
 * OptionalAssert のものまね。
 * @param <VALUE> The type of optional value.
 * @author jflute
 */
public class OptionalThingAssert<VALUE> extends AbstractOptionalThingAssert<OptionalThingAssert<VALUE>, VALUE> {

    protected OptionalThingAssert(OptionalThing<VALUE> actual) {
        super(actual, OptionalThingAssert.class);
    }
}
