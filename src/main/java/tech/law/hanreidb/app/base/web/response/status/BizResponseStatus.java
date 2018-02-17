/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.status;

import org.dbflute.optional.OptionalThing;

/**
 * U-NEXTで伝統的に採用している共通ヘッダーパターンの result 部分の status に表現するインターフェース。<br>
 * 共通ヘッダーパターンについてはこちら: <a href="http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsondesign.html">JSON APIのJSONデザイン</a> <br>
 * ステータスコードは、全部数値で構成されていて、HTTP Status ライクではあるが、厳密には同じではない。
 * @author jflute
 */
public interface BizResponseStatus {

    Object[] EMPTY_PARAMS = new Object[] {};

    int statusCode();

    OptionalThing<String> messageKey();

    default Object[] messageParams() { // for compatible
        return EMPTY_PARAMS;
    }
}
