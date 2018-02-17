/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.util.DfReflectionUtil;
import org.lastaflute.web.response.JsonResponse;

public class JsonResponseReturnTypePolice extends AbstractJavaPolice<JsonResponseReturnTypePolice> {

    private static final String RESULT_SUFFIX = "ContentResult";

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (isTargetMethod(method)) {
                if (!validateResultName(method)) {
                    String message = String.format("%s#%s", clazz.getName(), method.getName());
                    return Optional.of(message);
                }
            }
        }

        return Optional.empty();
    }

    private boolean isTargetMethod(Method method) {
        if (method.getName().startsWith("lambda")) { // lambda は拾わないように
            return false;
        }

        return JsonResponse.class.isAssignableFrom(method.getReturnType());
    }

    protected boolean validateResultName(Method method) {
        Type type = DfReflectionUtil.getGenericParameterTypes(method.getGenericReturnType())[0];
        String typeName = type.getTypeName();

        if (typeName.contains("Void")) {
            return true; // e.g. JsonResponse<Void>, JsonResponse<WholeResult<Void>>
        }

        if (typeName.contains("WholeResult")) {
            // e.g. JsonResponse<WholeResult<XxxContentResult>> -> XxxContentResult
            String resultName = typeName.substring(typeName.lastIndexOf(".") + 1, typeName.length() - 1);
            return resultName.endsWith(RESULT_SUFFIX);
        }

        // e.g. JsonResponse<XxxContentResult> -> XxxContentResult
        String resultName = typeName.substring(typeName.lastIndexOf(".") + 1, typeName.length());
        return resultName.endsWith(RESULT_SUFFIX);
    }

    @Override
    protected String getExceptionNotice() {
        return "JsonResult にサフィックスが ContentResult になっていないクラスを使用しているメソッドが見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public JsonResponse<XxxBean> index()");
        br.addElement("    public JsonResponse<WholeResult<XxxData>> index()");
        br.addElement("  (o):");
        br.addElement("    public JsonResponse<XxxContentResult> index()");
        br.addElement("    public JsonResponse<WholeResult<XxxContentResult>> index()");
    }
}
