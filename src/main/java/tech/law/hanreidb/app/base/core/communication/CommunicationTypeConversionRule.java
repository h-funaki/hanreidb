/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.communication;

import java.time.format.DateTimeFormatter;

import org.lastaflute.core.json.JsonMappingOption;

/**
 * JSONなど、データ転送するときの変換ルール。<br>
 * 日付フォーマットとか、Booleanなど。<br>
 * JsonMappingOption や RemoteApi でのマッピングなどで利用される。
 *
 * <p>cmsでは長らく伝統的な変換ルールが使われていたが、Laxampleを使ったプロジェクトから改善。
 * PHPのAPIゲートウェイ側との調整で、伝統的な変換ルールにとらわれる必要がないということがわかり踏み切った。
 * とはいえ、まだまだ既存APIは伝統的な変換ルールなので、インターフェースで切り替えられるようにしてある。</p>
 *
 * <p>実装クラスは、スレッドセーフであることが求められる。(状態を持たないように)</p>
 * @author jflute
 */
public interface CommunicationTypeConversionRule {

    // not use optional for performance
    // ===================================================================================
    //                                                                               Date
    //                                                                              ======
    /**
     * @return 日付のフォーマッター (NullAllowed: if null, use default format that is ISO)
     */
    DateTimeFormatter getDateFormatter(); // null allowed if default

    /**
     * @return 日時のフォーマッター (NullAllowed: if null, use default format that is ISO)
     */
    DateTimeFormatter getDateTimeFormatter(); // null allowed if default

    // ===================================================================================
    //                                                                             Boolean
    //                                                                             =======
    // 例えば cms だと、JSON上は0/1でboolean表現してたりするので抽象化している by jflute (2018/01/18)
    /**
     * @param boo Boolean型の値 (NullAllowed: if null, returns null)
     * @return Booleanの文字列表現 (NullAllowed: if argument is null)
     */
    String serializeBoolean(Boolean boo); // null allowed

    /**
     * @param boo Booleanの文字列表現 (NullAllowed: if null, returns null)
     * @return Boolean型の値 (NullAllowed: if argument is null)
     */
    Boolean deserializeBoolean(Object exp); // null allowed

    // ===================================================================================
    //                                                                      Classification
    //                                                                      ==============
    /**
     * JSON上の FLG を変換するための区分値のsisterCodeのプロパティ名を取得する。<br>
     * cmsでは、JSON上で1/0フラグ方式だったので、sisterCodeに指定していた。<br>
     * laxample以降は止めたので、使わないことが想定される。(そもそもBoolean統一でCDef.Flg自体を作らない!?) <br>
     * <a href="https://unextastb.backlog.jp/view/DFH-268">DFH-268 【アーキテクチャ】Boolean か CDef.Flg か</a>
     * @return 区分値のsisterCodeに指定するプロパティ名 (NullAllowed: if null, unused)
     */
    String getClsJsonFlgProperty(); // null allowed if unused

    // ===================================================================================
    //                                                                        JSON Mapping
    //                                                                        ============
    /**
     * cmsだとめっちゃ色々なオプション指定しまくり。<br>
     * ただ、laxampleでも Eclipse Collections などの対応を入れたりと利用が想定される。
     * @return LastaFluteのJSONマッピングのオプション (NullAllowed: if null, unused)
     */
    JsonMappingOption prepareJsonMappingOption(); // null allowed if unused
}
