/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.util;

import java.util.Collection;

import org.eclipse.collections.api.RichIterable;

/**
 * コレクションに関する処理のちょっとした補完クラス。(継承とかも何もない)<br>
 * ディベロッパーは UnextStaticImportUtil を経由するので、実質的に表には出てこない。<br>
 * フレームワーク用のクラスと言ってもいいかも。
 * @author mito AF-35 新規作成(CMSからコピー)
 * @author jflute
 */
public class MyCollectionUtil {

    /**
     * 指定されたリストが "空っぽ" (nullもしくは空っぽ)か？
     * @param list 判定されるリスト (NullAllowed: if null, returns true)
     * @return 空っぽなら true
     */
    public static boolean isEmpty(Collection<?> list) {
        return list == null || list.isEmpty();
    }

    /**
     * 指定されたリストが "空っぽ" (nullもしくは空っぽ)か？
     * @param list 判定されるリスト (NullAllowed: if null, returns true)
     * @return 空っぽなら true
     */
    public static boolean isEmpty(RichIterable<?> list) {
        return list == null || list.isEmpty();
    }

    /**
     * 指定されたリストが "空ではない" (nullもしくは空っぽではない) か？
     * @param list 判定されるリスト (NullAllowed: if null, returns false)
     * @return 空っぽでなければ true
     */
    public static boolean isNotEmpty(Collection<?> list) {
        return !isEmpty(list);
    }

    /**
     * 指定されたリストが "空ではない" (nullもしくは空っぽではない) か？
     * @param list 判定されるリスト (NullAllowed: if null, returns false)
     * @return 空っぽでなければ true
     */
    public static boolean isNotEmpty(RichIterable<?> list) {
        return !isEmpty(list);
    }
}
