/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;

/**
 * プリミティブ型のフィールドの使用を禁止します。
 * @author mito
 */
public class PrimitiveFieldPolice extends AbstractJavaPolice<PrimitiveFieldPolice> {

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getType().isPrimitive() && !Modifier.isStatic(field.getModifiers())) {
                return Optional.of(field.getName());
            }
        }

        return Optional.empty();
    }

    @Override
    protected boolean isValidateInnerClass() {
        return true;
    }

    @Override
    protected boolean isTargetClass(Class<?> clazz) {
        String name = clazz.getSimpleName();
        return name.endsWith("Form") || name.endsWith("Body") || name.endsWith("ContentResult") || name.endsWith("Part");
    }

    @Override
    protected String getExceptionNotice() {
        return "プリミティブ型のフィールドを発見しました。\nこのクラス内でフィールドにプリミティブ型を使用する事は出来ません。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public int user_id;");
        br.addElement("    public boolean success_flg;");
        br.addElement("  (o):");
        br.addElement("    public Integer user_id;");
        br.addElement("    public Boolean success_flg");
    }
}
