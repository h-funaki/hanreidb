/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.swagger;

import java.io.File;
import java.util.Map;

import org.dbflute.optional.OptionalThing;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfStringUtil;
import org.lastaflute.doc.DocumentGenerator;
import org.lastaflute.doc.SwaggerGenerator;
import org.lastaflute.doc.meta.TypeDocMeta;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.util.MyAssertUtil;
import tech.law.hanreidb.app.base.web.version.AppVersionHandler;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;
import tech.law.hanreidb.app.base.web.version.SystemApplicationVersion;

/**
 * @author awane
 */
public class NxSwaggerGenerator extends SwaggerGenerator {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RequestManager requestManager;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NxSwaggerGenerator(RequestManager requestManager) {
        MyAssertUtil.assertNotNull("requestManager", requestManager);
        this.requestManager = requestManager;
    }

    @Override
    protected DocumentGenerator createDocumentGenerator() {
        DocumentGenerator generator = super.createDocumentGenerator();
        final String unextCommonDir = "../../unext-common/unext-common/src/main/java/";
        if (new File(unextCommonDir).exists()) {
            generator.addSrcDir(unextCommonDir);
        }
        return generator;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected OptionalThing<String> prepareApplicationVersion() {
        return getApplicationVersion();
    }

    @Override
    protected OptionalThing<Object> deriveDefaultValue(TypeDocMeta typeDocMeta) {
        if (Map.class.isAssignableFrom(typeDocMeta.getType())) {
            // java.util.Map<String, String> convert to [String, String]
            String[] keyValue =
                    DfStringUtil.substringFirstFront(DfStringUtil.substringFirstRear(typeDocMeta.getTypeName(), "<"), ">").split(",");
            String keyTypeName = keyValue[0].trim();
            String valueTypeName = keyValue[1].trim();

            return OptionalThing.ofNullable(deriveDefaultMapValueByComment(typeDocMeta.getComment(), keyTypeName, valueTypeName), () -> {
                throw new IllegalStateException("not found default value.");
            });
        }

        return super.deriveDefaultValue(typeDocMeta);
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    protected OptionalThing<String> getApplicationVersion() {
        ApplicationVersion applicationVersion = getRequestedAppVersion();
        if (applicationVersion == SystemApplicationVersion.UNKNOWN) {
            return OptionalThing.empty();
        }
        return OptionalThing.of(getRequestedAppVersion().getVersion());
    }

    protected ApplicationVersion getRequestedAppVersion() { // for sub class
        return AppVersionHandler.getRequestedAppVersion(requestManager);
    }

    protected Object deriveDefaultMapValueByComment(String comment, String keyTypeName, String valueTypeName) {
        if (DfStringUtil.is_NotNull_and_NotEmpty(comment)) {
            if (comment.contains("e.g. {")) {
                String defaultValue = DfStringUtil.substringFirstFront(DfStringUtil.substringFirstRear(comment, "e.g. {"), "}");
                Map<Object, Object> map = DfCollectionUtil.newHashMap();
                for (String keyValueEntry : defaultValue.split(",")) {
                    String[] entry = keyValueEntry.split(":");
                    Object key = entry[0];
                    Object value = entry[1];

                    if ("String".equals(keyTypeName)) {
                        key = egStringToJavaString(key.toString().trim());
                    }

                    if ("String".equals(valueTypeName)) {
                        value = egStringToJavaString(value.toString().trim());
                    }

                    map.put(key, value);
                }

                return map;
            }
        }

        return null;
    }

    private String egStringToJavaString(String egString) {
        if (egString.startsWith("\"") && egString.endsWith("\"")) {
            return egString.substring(1, egString.length() - 1);
        }

        return egString;
    }
}
