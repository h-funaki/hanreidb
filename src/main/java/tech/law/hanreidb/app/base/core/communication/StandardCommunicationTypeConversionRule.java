/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.communication;

import java.time.format.DateTimeFormatter;

import org.lastaflute.core.json.JsonMappingOption;

import tech.law.hanreidb.app.base.core.json.StandardJsonBinder;

/**
 * 標準的なデータ転送時の変換ルール。<br>
 * 新しいルールは、ほとんど "デフォルト" なので、ここではあまり処理がない。
 * @author jflute
 * @author mito
 */
public class StandardCommunicationTypeConversionRule implements CommunicationTypeConversionRule { // state-less

    // #unext_standard basically according to LastaFlute default
    // ===================================================================================
    //                                                                               Date
    //                                                                              ======
    public DateTimeFormatter getDateFormatter() {
        return null; // uses default
    }

    public DateTimeFormatter getDateTimeFormatter() {
        return null; // uses default
    }

    // ===================================================================================
    //                                                                             Boolean
    //                                                                             =======
    // simple conversion, for e.g. form parameter
    public String serializeBoolean(Boolean boo) {
        return boo != null ? boo.toString() : null; // e.g. "true", "false"
    }

    public Boolean deserializeBoolean(Object exp) {
        return exp != null ? Boolean.valueOf(exp.toString()) : null; // expects "true" or not
    }

    // ===================================================================================
    //                                                                      Classification
    //                                                                      ==============
    public String getClsJsonFlgProperty() {
        return null; // means unused
    }

    // ===================================================================================
    //                                                                        JSON Mapping
    //                                                                        ============
    public JsonMappingOption prepareJsonMappingOption() {
        return StandardJsonBinder.setupBasicMapping(new JsonMappingOption()); // 基本的なものは再利用している
    }
}
