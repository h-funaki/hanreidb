/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import org.assertj.core.api.Fail;
import org.dbflute.optional.OptionalThing;
import org.dbflute.utflute.core.binding.BoundResult;
import org.dbflute.utflute.lastaflute.mock.TestingJsonData;
import org.lastaflute.core.magic.ThreadCacheContext;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.unit.GenericTypeUtil;
import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.unit.util.VerifyUtil;

/**
 * @author mito
 * @author awaawa
 * @author jflute
 */
public interface ActionTester<ACTION, FORM> {

    default <RESULT extends Object> RESULT doAction(BiFunction<ACTION, FORM, JsonResponse<RESULT>> actionLambda) {
        FORM form = prepareForm();
        JsonResponse<RESULT> response;

        try {
            response = actionLambda.apply(prepareAction(), form);
        } finally {
            if (form != null) { // == e.g. index()
                showJson(form);
            }
        }

        if (form != null) { // == e.g. index()
            VerifyUtil.verifyValidateMethodCalled(form.getClass());
        }
        assertResponse(response);
        return response.getJsonResult();
    }

    default <T extends Throwable> T thrown(Class<T> throwableClass, BiConsumer<ACTION, FORM> actionLambda) {
        FORM form = prepareForm();
        try {
            actionLambda.accept(prepareAction(), form);

            if (form != null) { // == e.g. index()
                VerifyUtil.verifyValidateMethodCalled(form.getClass());
            }

            Fail.failBecauseExceptionWasNotThrown(throwableClass);
            // dummy
            return null;
        } catch (Throwable t) {
            assertThrowable(t, throwableClass);
            @SuppressWarnings("unchecked")
            T throwable = (T) t;
            return throwable;
        } finally {
            if (form != null) { // == e.g. index()
                showJson(form);
            }
        }
    }

    default void mockAction(ACTION action) {
        ThreadCacheContext.setObject(getClass().getName(), action);
    }

    default OptionalThing<ACTION> getMockAction() {
        return OptionalThing.ofNullable(ThreadCacheContext.getObject(getClass().getName()), () -> {
            throw new IllegalStateException("モックは設定されていないので使えません。");
        });
    }

    default ACTION prepareAction() {
        ACTION action = getMockAction().orElseGet(() -> {
            return GenericTypeUtil.getActualTypeInstance(this.getClass(), ActionTester.class, 0);
        });

        inject(action);
        return action;
    }

    default FORM prepareForm() {
        FORM form = GenericTypeUtil.getActualTypeInstance(this.getClass(), ActionTester.class, 1);
        return form;
    }

    // ===================================================================================
    //                                                                              Assert
    //                                                                              ======
    default void assertResponse(JsonResponse<?> response) {
        showJson(response);
        validateJsonData(response);
        Object jsonResult = response.getJsonResult();
        if (jsonResult instanceof WholeResult<?>) {
            jsonResult = ((WholeResult<?>) jsonResult).content;
        }
        if (jsonResult instanceof ContentResult) {
            // 基本アサートが通ってることを前提に個々のテストケースを実装したいので、ここでは独立したインスタンスで。
            NxSoftly softly = new NxSoftly();
            ((ContentResult) jsonResult).verifyFixedSpec(softly);
            softly.assertAll();
        }
    }

    default void assertThrowable(Throwable actualException, Class<?> expectedException) {
        if (!actualException.getClass().equals(expectedException)) {
            throw new AssertionError("\nExpected: " + expectedException.getName() + "\nActual: " + actualException.getClass().getName(),
                    actualException);
        }
    }

    // ===================================================================================
    //                                                         Override with NxWebTestCase
    //                                                                              ======
    abstract BoundResult inject(Object bean);

    abstract void showJson(Object response);

    abstract <RESULT> TestingJsonData<RESULT> validateJsonData(JsonResponse<RESULT> response);
}
