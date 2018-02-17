/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.utflute.core.policestory.javaclass.PoliceStoryJavaClassHandler;

/**
 * ContentResult の階層が存在する場合、 Part のみになっているかを調べます。
 * @author mito
 */
public class ContentResultHierarchyPolice implements PoliceStoryJavaClassHandler {

    @Override
    public void handle(File srcFile, Class<?> clazz) {
        if (!isTargetClsss(clazz)) {
            return;
        }

        // Part かどうか
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            handleInnerClass(innerClass);
        }
    }

    protected boolean isTargetClsss(Class<?> clazz) {
        return clazz.getSimpleName().endsWith("ContentResult");
    }

    protected void handleInnerClass(Class<?> clazz) {
        if (!validate(clazz)) {
            throwException(clazz.getName());
        }

        // ネストのネストとかを再帰で根こそぎ
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            handleInnerClass(innerClass);
        }
    }

    protected boolean validate(Class<?> clazz) {
        return clazz.getSimpleName().endsWith("Part");
    }

    protected void throwException(String message) {
        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice("ContentResult の階層に Part 以外のクラスが見つかりました。");
        br.addItem("Method");
        br.addElement(message);
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public XxxContentResult implements ContentResult {");
        br.addElement("      ...");
        br.addElement("      public static class XxxBean {}");
        br.addElement("    }");
        br.addElement("  (o):");
        br.addElement("    public XxxContentResult implements ContentResult {");
        br.addElement("      ...");
        br.addElement("      public static class XxxPart {}");
        br.addElement("    }");

        final String msg = br.buildExceptionMessage();
        throw new IllegalStateException(msg);
    }

}
