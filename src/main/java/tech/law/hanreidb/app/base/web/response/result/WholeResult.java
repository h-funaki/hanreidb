/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.result;

import javax.validation.Valid;

import org.lastaflute.web.validation.Required;

import tech.law.hanreidb.app.base.web.response.status.BizResponseStatus;

/**
 * @param <CONTENT> contentを表すResultの型
 * @author jflute
 */
public class WholeResult<CONTENT extends ContentResult> { // short name for action definition view

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 共通ヘッダーのresult要素に対応。*/
    @Required
    @Valid
    public MetaResultPart result;

    public static class MetaResultPart { // resultとうい言葉が紛らわしいので、nagahoriくん案を採用してMeta付けた

        // JSONは文字列だけでなく数値を許すので、ここではIntegerも使っている。
        // また、null なら null と出力されるが、nullも許されている。(see Wikipedia)
        /** リクエストされたアプリバージョン。サーバー側の現在のバージョンではない。バージョンエラー時はunknown。 e.g. v00001 */
        @Required
        public String version;

        /** レスポンスの状態を表すステータスコード。404とか500とかHTTPっぽいが、独自である。 e.g. 200 */
        @Required
        public Integer status;

        /** フロントに戻すメッセージ。画面に表示されるわけではなく、フロントへのデバッグメッセージのようなもの。 e.g. エラーが発生した時のみ、その内容 (NullAllowed: or default) */
        public String message;

        /** ページングの総レコード数 (NullAllowed: or default) e.g. null */
        public Integer count;

        /** サーバー側のシステム日時 e.g. 20141203100000 */
        @Required
        public String system_date;

        @Override
        public String toString() {
            return "result:{" + version + ", " + status + ", " + message + ", " + count + ", " + system_date + "}";
        }
    }

    /** それぞれの業務情報のcontent要素に対応。*/
    @Required
    @Valid
    public CONTENT content;

    // ===================================================================================
    //                                                                      Result Setting
    //                                                                      ==============
    public WholeResult<CONTENT> status(BizResponseStatus status) {
        result.status = status.statusCode();
        return this;
    }

    public WholeResult<CONTENT> message(String message) {
        result.message = message;
        return this;
    }

    public WholeResult<CONTENT> count(int count) {
        result.count = count;
        return this;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "whole:{" + result + ", " + content + "}";
    }
}
