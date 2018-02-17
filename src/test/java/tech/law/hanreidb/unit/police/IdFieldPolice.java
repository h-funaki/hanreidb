/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.lang.reflect.Field;

import org.dbflute.helper.message.ExceptionMessageBuilder;

/**
 * フィールドが _id で終了しているものをチェックします。
 *
 * @see https://unextastb.backlog.jp/view/DFH-324
 * @author mito
 */
public class IdFieldPolice extends AbstractFiledTypePolice {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public IdFieldPolice() {
        targetClassSuffixList = defaultTargetClassSuffixList;
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected boolean isTargetField(Field field) {
        return field.getName().endsWith("_id");
    }

    @Override
    protected boolean validateFieldType(Field field) {
        return Number.class.isAssignableFrom(field.getType());
    }

    @Override
    protected String getExceptionNotice() {
        return "_id なのに Number じゃないフィールドが見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public String user_id");
        br.addElement("  (o):");
        br.addElement("    public Integer user_id");
        br.addElement("    public Number user_id");
    }
}
