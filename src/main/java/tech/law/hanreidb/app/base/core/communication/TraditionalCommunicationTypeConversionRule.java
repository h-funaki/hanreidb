/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.communication;

import java.time.format.DateTimeFormatter;

import org.lastaflute.core.json.JsonMappingOption;

import tech.law.hanreidb.app.base.core.json.StandardJsonBinder;

/**
 * cms創成期から使われている伝統ルール。(1/0フラグ、スラッシュ区切り日付など)<br>
 *
 * <p>新しいプロジェクトで使うことは基本的にないが、リモートAPIで相手が古いAPIだと、このルールを使う必要がある。
 * 例えば、RemoteBaseBehavior を参考に。</p>
 * @author jflute
 * @author mito
 */
public class TraditionalCommunicationTypeConversionRule implements CommunicationTypeConversionRule { // state-less

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // #unext_standard traditional (e.g. CMS) type conversion of JSON property
    public static final String FLG_EXP_TRUE = "1";
    public static final String FLG_EXP_FALSE = "0";

    // 表示用日付を想定していた。でも実際には形が違うこともあって、これをパースして再変換なんてことも!?
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    // 例えば cms の classificationDefinitionMap.dfprop で利用されている名前
    public static final String CLS_FLG_PROPERTY = "jsonFlgExpression"; // but not only JSON...

    // ===================================================================================
    //                                                                               Date
    //                                                                              ======
    @Override
    public DateTimeFormatter getDateFormatter() {
        return DATE_FORMATTER;
    }

    @Override
    public DateTimeFormatter getDateTimeFormatter() {
        return DATETIME_FORMATTER;
    }

    // ===================================================================================
    //                                                                             Boolean
    //                                                                             =======
    @Override
    public String serializeBoolean(Boolean boo) {
        if (boo == null) {
            return null;
        }
        return boo ? FLG_EXP_TRUE : FLG_EXP_FALSE;
    }

    @Override
    public Boolean deserializeBoolean(Object exp) {
        if (exp == null) {
            return null;
        }
        return exp.toString().equals(FLG_EXP_TRUE);
    }

    // ===================================================================================
    //                                                                      Classification
    //                                                                      ==============
    @Override
    public String getClsJsonFlgProperty() {
        return CLS_FLG_PROPERTY;
    }

    // ===================================================================================
    //                                                                        JSON Mapping
    //                                                                        ============
    @Override
    public JsonMappingOption prepareJsonMappingOption() {
        // 基本的なU-NEXTの標準設定に加えて、伝統的な設定を追加・修正している by jflute (2018/01/18)
        // (けっこうあるでしょ。LastaFluteのオプションも、U-NEXTのために実装したという感じ)
        final JsonMappingOption option = StandardJsonBinder.setupBasicMapping(new JsonMappingOption());

        // 日付フォーマットやboolean表現は、そのままここでのルールをJSONでも使う by jflute (2018/01/18)
        // 一応、汎用的なマッピングとJSONでのマッピングを別に扱うようにしたけど、実質同じになるね...
        formatLocalDateBy(option, getDateFormatter());
        formatLocalDateTimeBy(option, getDateTimeFormatter());
        option.serializeBooleanBy(boo -> serializeBoolean(boo));
        option.deserializeBooleanBy(exp -> deserializeBoolean(exp));

        // nullは空文字だったり、全部クォートしたり by jflute (2018/01/18)
        option.asEmptyToNullReading().asNullToEmptyWriting().asEverywhereQuoteWriting();

        return option;
    }

    // -----------------------------------------------------
    //                                           Date Format
    //                                           -----------
    // formattingTriggerのためのオーバーライドができるようにメソッド化
    // (この日付フォーマットだったら、どうのこうのするって感じの処理が挟めるように: なんでだっけかな...) by jflute (2018/01/18)
    protected void formatLocalDateBy(JsonMappingOption option, DateTimeFormatter dateTimeFormatter) {
        option.formatLocalDateBy(dateTimeFormatter);
    }

    protected void formatLocalDateTimeBy(JsonMappingOption option, DateTimeFormatter dateTimeFormatter) {
        option.formatLocalDateTimeBy(dateTimeFormatter);
    }
}
