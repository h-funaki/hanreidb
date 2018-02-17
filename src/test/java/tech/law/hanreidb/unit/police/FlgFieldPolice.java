/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.lang.reflect.Field;

import org.dbflute.helper.message.ExceptionMessageBuilder;

/**
 * フィールドが _flg で終了しているものをチェックします。
 * @author mito
 */
public class FlgFieldPolice extends AbstractFiledTypePolice {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FlgFieldPolice() {
        targetClassSuffixList = defaultTargetClassSuffixList;
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected boolean isTargetField(Field field) {
        return field.getName().endsWith("_flg");
    }

    @Override
    protected boolean validateFieldType(Field field) {
        return Boolean.class.isAssignableFrom(field.getType());
    }

    @Override
    protected String getExceptionNotice() {
        return "_flg なのに Boolean になっていないフィールドが見つかりました。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    public Integer access_flg");
        br.addElement("    public boolean access_flg");
        br.addElement("  (o):");
        br.addElement("    public Boolean access_flg");
    }
}
