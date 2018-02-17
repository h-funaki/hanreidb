/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.optional;

import static org.assertj.core.error.OptionalShouldBePresent.shouldBePresent;
import static org.assertj.core.util.Preconditions.checkArgument;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.error.BasicErrorMessageFactory;
import org.assertj.core.internal.ComparisonStrategy;
import org.assertj.core.internal.StandardComparisonStrategy;
import org.dbflute.optional.OptionalThing;

/**
 * AbstractOptionalAssert のものまね。
 * @param <SELF> The type of this.
 * @param <VALUE> The type of optional value.
 * @author jflute
 */
public abstract class AbstractOptionalThingAssert<SELF extends AbstractOptionalThingAssert<SELF, VALUE>, VALUE>
        extends AbstractAssert<SELF, OptionalThing<VALUE>> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final ComparisonStrategy optionalValueComparisonStrategy;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractOptionalThingAssert(OptionalThing<VALUE> actual, Class<?> selfType) {
        super(actual, selfType);
        this.optionalValueComparisonStrategy = StandardComparisonStrategy.instance();
    }

    // ===================================================================================
    //                                                                        Check Method
    //                                                                        ============
    // #hope 他にも色々とメソッドがあるようだが、ひとまず基本的なものだけ。必要に応じてちょっとずつ追加していく感じで by jflute (2017/06/02)
    /**
     * check: 存在しているはず。<br>
     * OptionalAssert のものと同じ。
     * @return this. (NotNull)
     */
    public SELF isPresent() {
        assertValueIsPresent();
        return myself;
    }

    /**
     * check: 存在していないはず(emptyのはず)。<br>
     * OptionalAssert のものと同じ。
     * @return this. (NotNull)
     */
    public SELF isEmpty() {
        isNotNull();
        if (actual.isPresent()) {
            throwAssertionError(OptionalThingShouldBeEmpty.shouldBeEmpty(actual));
        }
        return myself;
    }

    /**
     * check: 指定された値が含まれているはず。(内包されている値と完全一致するか？) <br>
     * 文字列を指定しても、文字列の "含まれている" にはならない。あくまで Optional に "含まれている" かどうか。<br>
     * OptionalAssert のものと同じ。
     * @param expectedValue 含まれているはずの値 (NotNull)
     * @return this. (NotNull)
     */
    public SELF contains(VALUE expectedValue) {
        isNotNull();
        checkNotNull(expectedValue);
        if (!actual.isPresent()) {
            throwAssertionError(OptionalThingShouldContain.shouldContain(expectedValue));
        }
        if (!optionalValueComparisonStrategy.areEqual(actual.get(), expectedValue)) {
            throwAssertionError(OptionalThingShouldContain.shouldContain(actual, expectedValue));
        }
        return myself;
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private void checkNotNull(Object expectedValue) {
        checkArgument(expectedValue != null, "The expected value should not be <null>.");
    }

    private void assertValueIsPresent() {
        isNotNull();
        if (!actual.isPresent()) {
            throwAssertionError(shouldBePresent(actual));
        }
    }

    // ===================================================================================
    //                                                                     Message Factory
    //                                                                     ===============
    // このぐらいであれば独立させなくてもいいかなと思ってひとまずインナークラス by jflute (2017/06/02)
    public static class OptionalThingShouldBeEmpty extends BasicErrorMessageFactory {

        private OptionalThingShouldBeEmpty(Class<?> optionalClass, Object optionalValue) {
            super("%nExpecting an empty " + optionalClass.getSimpleName() + " but was containing value: <%s>.", optionalValue);
        }

        public static <VALUE> OptionalThingShouldBeEmpty shouldBeEmpty(OptionalThing<VALUE> optional) {
            return new OptionalThingShouldBeEmpty(optional.getClass(), optional.get());
        }
    }

    public static class OptionalThingShouldContain extends BasicErrorMessageFactory {

        private static final String EXPECTING_TO_CONTAIN = "%nExpecting:%n  <%s>%nto contain:%n  <%s>%nbut did not.";

        private OptionalThingShouldContain(String message, Object actual, Object expected) {
            super(message, actual, expected);
        }

        private OptionalThingShouldContain(Object expected) {
            super("%nExpecting Optional to contain:%n  <%s>%nbut was empty.", expected);
        }

        public static <VALUE> OptionalThingShouldContain shouldContain(OptionalThing<VALUE> optional, VALUE expectedValue) {
            return optional.isPresent() ? new OptionalThingShouldContain(EXPECTING_TO_CONTAIN, optional, expectedValue)
                    : shouldContain(expectedValue);
        }

        public static OptionalThingShouldContain shouldContain(Object expectedValue) {
            return new OptionalThingShouldContain(expectedValue);
        }
    }
}
