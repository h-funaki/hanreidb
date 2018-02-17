/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.lastaflute.di.helper.beans.BeanDesc;
import org.lastaflute.di.helper.beans.PropertyDesc;
import org.lastaflute.di.helper.beans.factory.BeanDescFactory;
import org.lastaflute.web.exception.ExecuteMethodLonelyValidatorAnnotationException;
import org.lastaflute.web.ruts.config.ActionFormProperty;
import org.lastaflute.web.validation.ActionValidator;

/**
 * @author mito
 */
public class VerifyUtil {

    /**
     * 必要な validateメソッドが呼ばれているかを検証します。
     * Form 内に validate 用のアノテーションを使用しつつ、validate メソッドが呼ばれていない場合、エラーにします。
     *
     * @param form Action実行時のFormオブジェクト
     */
    public static void verifyValidateMethodCalled(Class<?> form) {
        Map<String, ActionFormProperty> map = setupProperties(form);
        if (mightBeValidatorAnnotated(map) && ActionValidator.certainlyValidatorNotCalled()) {
            throwLonelyValidatorAnnotationException(form);
        }
    }

    // @see ActionFormMeta#setupProperties
    private static Map<String, ActionFormProperty> setupProperties(Class<?> formType) {
        final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(formType);
        final int propertyDescSize = beanDesc.getPropertyDescSize();
        final Map<String, ActionFormProperty> map = new HashMap<String, ActionFormProperty>(propertyDescSize);
        for (int i = 0; i < propertyDescSize; i++) {
            final PropertyDesc pd = beanDesc.getPropertyDesc(i);
            if (pd.isReadable()) {
                final ActionFormProperty property = new ActionFormProperty(pd);
                map.put(property.getPropertyName(), property);
            }
        }
        return map;
    }

    // @see ActionFormMeta#mightBeValidatorAnnotated
    private static boolean mightBeValidatorAnnotated(Map<String, ActionFormProperty> propertyMap) {
        for (ActionFormProperty property : propertyMap.values()) {
            final Field field = property.getPropertyDesc().getField();
            if (field == null) { // not field property
                continue;
            }
            for (Annotation anno : field.getAnnotations()) {
                if (ActionValidator.isValidatorAnnotation(anno.annotationType())) {
                    return true; // first level only
                }
            }
        }
        return false;
    }

    // @see GodHandableAction#throwLonelyValidatorAnnotationException
    private static void throwLonelyValidatorAnnotationException(Object form) {
        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice("Lonely validator annotations, so call validate().");
        br.addItem("Advice");
        br.addElement("The validate() method should be called in execute method of action");
        br.addElement("because the validator annotations are specified in the form (or body).");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    @Execute");
        br.addElement("    public JsonResponse index(SeaForm form) { // *Bad");
        br.addElement("        return asJson(...);");
        br.addElement("    }");
        br.addElement("  (o):");
        br.addElement("    @Execute");
        br.addElement("    public JsonResponse index(SeaForm form) {");
        br.addElement("        validate(form, message -> {}); // Good");
        br.addElement("        return asJson(...);");
        br.addElement("    }");
        br.addElement("");
        br.addElement("Or remove validator annotations from the form (or body)");
        br.addElement("if the annotations are unneeded.");
        final String msg = br.buildExceptionMessage();
        throw new ExecuteMethodLonelyValidatorAnnotationException(msg);
    }
}
