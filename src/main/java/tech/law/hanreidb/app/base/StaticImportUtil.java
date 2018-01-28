package tech.law.hanreidb.app.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dbflute.optional.OptionalThing;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfStringUtil;
import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.factory.Maps;
import org.eclipse.collections.impl.factory.Sets;

import tech.law.hanreidb.app.base.CompareUtil.BasicCompare;

/**
 * static import を許可するメソッドを定義するクラス。<br>
 * このクラスは直接利用するのではなく、static import 経由で利用することを想定。<br>
 * <ul>
 *   <li>(x): ... = UnextStaticImportUtil.toImmutable(...).collect(....)</li>
 *   <li>(o): ... = toImmutable().collect(....)</li>
 * </ul>
 * Eclipse の Preferences の Java - Editor - Content Assist - Favorites にて、<br>
 * "jp.unext.common.util.UnextStaticImportUtil" を指定すると、<br>
 * クラス名を指定しなくても ctrl+space の補完でこのクラスのメソッドが利用できる。
 * @author mito
 * @author jflute
 */
public class StaticImportUtil {

    // #hope JavaDoc入れておいたけど、ちょっと整理しないとだね。よく使うクラスが散らかってると良くない by jflute (2017/05/09)
    // あんまり使われてないものはいっそ削除しちゃった方がいいかなと。このクラスが肥大化すると使う側が把握できなくて本末転倒になる。
    // ===================================================================================
    //                                                                     new・・・初期化
    //                                                                     ===============
    /**
     * {@link ArrayList} で実装された空の {@link List} を作成します。
     * @return {@link List} (NotNull, AlwaysEmpty)
     */
    public static <ELEMENT> List<ELEMENT> newArrayList() {
        return DfCollectionUtil.newArrayList();
    }

    /**
     * {@link HashMap} で実装された空の {@link Map} を作成します。
     * @return {@link Map} (NotNull, AlwaysEmpty)
     */
    public static <KEY, VALUE> Map<KEY, VALUE> newHashMap() {
        return DfCollectionUtil.newHashMap();
    }

    /**
     * {@link LinkedHashMap} で実装された空の {@link Map} を作成します。
     * @return {@link Map} (NotNull, AlwaysEmpty)
     */
    public static <KEY, VALUE> Map<KEY, VALUE> newLinkedHashMap() {
        return DfCollectionUtil.newLinkedHashMap();
    }

    /**
     * 空の {@link MutableList} を作成します。
     * @return {@link MutableList} (NotNull, AlwaysEmpty)
     */
    public static <ELEMENT> MutableList<ELEMENT> newMutableList() {
        return Lists.mutable.empty();
    }

    @SafeVarargs
    public static <ELEMENT> ImmutableList<ELEMENT> newImmutableList(ELEMENT... elements) {
        return Lists.immutable.with(elements);
    }

    @SafeVarargs
    public static <ELEMENT> ImmutableSet<ELEMENT> newImmutableSet(ELEMENT... elements) {
        return Sets.immutable.with(elements);
    }

    // ===================================================================================
    //                                                                        is・・・判定
    //                                                                        ============
    /**
     * null または 空の場合 true.
     *
     * <pre>
     * isEmpty(null)      = true
     * isEmpty("")        = true
     * isEmpty(" ")       = false
     * isEmpty("bob")     = false
     * isEmpty("  bob  ") = false
     * </pre>
     *
     * @param str チェック対象文字列 (NullAllowed: if null, returns true)
     * @return null または 空の場合 true.
     */
    public static boolean isEmpty(String str) {
        return DfStringUtil.is_Null_or_Empty(str);
    }

    /**
     * null ではなく、かつ空でも無い場合 true.
     *
     * <pre>
     * isNotEmpty(null)      = false
     * isNotEmpty("")        = false
     * isNotEmpty(" ")       = true
     * isNotEmpty("bob")     = true
     * isNotEmpty("  bob  ") = true
     * </pre>
     *
     * @param str チェック対象文字列 (NullAllowed: if null, returns false)
     * @return null ではなく、かつ空でも無い場合 true.
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * null または 空、空文字のみで構成されている場合 true.
     *
     * <pre>
     * isBlank(null)      = true
     * isBlank("")        = true
     * isBlank(" ")       = true
     * isBlank("bob")     = false
     * isBlank("  bob  ") = false
     * </pre>
     *
     * @param str チェック対象文字列 (NullAllowed: if null, returns true)
     * @return null または 空、空文字のみで構成されている場合 true.
     */
    public static boolean isBlank(String str) {
        return DfStringUtil.is_Null_or_TrimmedEmpty(str);
    }

    /**
     * null ではなく、かつ 空でも、空文字のみでもない場合 true.
     *
     * <pre>
     * isNotBlank(null)      = false
     * isNotBlank("")        = false
     * isNotBlank(" ")       = false
     * isNotBlank("bob")     = true
     * isNotBlank("  bob  ") = true
     * </pre>
     * @param str チェック対象文字列 (NullAllowed: if null, returns false)
     * @return null ではなく、かつ 空でも、空文字のみでもない場合 true.
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * null または 空の場合 true.
     *
     * <pre>
     * isEmpty(null)                = true
     * isEmpty(newArrayList())      = true
     * isEmpty(Arrays.asList("1"))  = false
     * </pre>
     *
     * @param collection チェック対象Collection (NullAllowed: if null, returns true)
     * @return null または 空の場合 true.
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtil.isEmpty(collection);
    }

    /**
     * null または 空の場合 true.
     *
     * <pre>
     * isEmpty(null)                  = true
     * isEmpty(newImmutableList())    = true
     * isEmpty(newImmutableList("1")) = false
     * </pre>
     *
     * @param collection チェック対象EclipseCollection (NullAllowed: if null, returns true)
     * @return null または 空の場合 true.
     */
    public static boolean isEmpty(RichIterable<?> collection) {
        return CollectionUtil.isEmpty(collection);
    }

    /**
     * null ではなく、かつ空でも無い場合 true.
     *
     * <pre>
     * isNotEmpty(null)                = false
     * isNotEmpty(newArrayList())      = false
     * isNotEmpty(Arrays.asList("1"))  = true
     * </pre>
     *
     * @param collection チェック対象Collection (NullAllowed: if null, returns false)
     * @return null ではなく、かつ空でも無い場合 true.
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * null ではなく、かつ空でも無い場合 true.
     *
     * <pre>
     * isNotEmpty(null)                = false
     * isNotEmpty(newImmutableList())  = false
     * isEmpty(newImmutableList("1"))  = true
     * </pre>
     *
     * @param collection チェック対象EclipseCollection (NullAllowed: if null, returns false)
     * @return null ではなく、かつ空でも無い場合 true.
     */
    public static boolean isNotEmpty(RichIterable<?> collection) {
        return !isEmpty(collection);
    }

    // ===================================================================================
    //                                                                if・・・判定して処理
    //                                                                ====================
    /**
     * {@link OptionalThing} にラップされた value を返します。
     * 値が null の場合 空の {@link OptionalThing} を返します。
     *
     * @param value チェックする値 (NullAllowed: if null, returns empty)
     * @return {@link OptionalThing} にラップされた value. (NotNull: if argument is null, returns empty)
     */
    public static <T> OptionalThing<T> ifNotNull(T value) {
        return value == null ? OptionalThing.empty() : OptionalThing.of(value);
    }

    /**
     * {@link OptionalThing} にラップされた str を返します。
     * 値が null または空場合、空の {@link OptionalThing} を返します。
     *
     * String str = ifNotEmpty("true").orElse("false");  // true
     * String str = ifNotEmpty(null).orElse("false");    // false
     * String str = ifNotEmpty("").orElse("false");      // false
     * String str = ifNotEmpty("  ").orElse("false");    // "  "
     *
     * @param str チェックする文字列 (NullAllowed: if null, returns empty)
     * @return {@link OptionalThing} にラップされた value. (NotNull: if argument is null, returns empty)
     */
    public static OptionalThing<String> ifNotEmpty(String str) {
        return isEmpty(str) ? OptionalThing.empty() : OptionalThing.of(str);
    }

    /**
     * {@link OptionalThing} にラップされた str を返します。
     * 値が null または空、空文字のみでの構成の場合、空の {@link OptionalThing} を返します。
     *
     * String str = ifNotBlank("true").orElse("false");  // true
     * String str = ifNotBlank(null).orElse("false");    // false
     * String str = ifNotBlank("").orElse("false");      // false
     * String str = ifNotBlank("  ").orElse("false");    // false
     *
     * @param str チェックする文字列 (NullAllowed: if null, returns empty)
     * @return {@link OptionalThing} にラップされた value. (NotNull: if argument is null, returns empty)
     */
    public static OptionalThing<String> ifNotBlank(String str) {
        return isBlank(str) ? OptionalThing.empty() : OptionalThing.of(str);
    }

    /**
     * {@link OptionalThing} にラップされたCollectionを返します。(空リストならempty)
     * @param collection チェックするCollection (NullAllowed: if null, returns empty)
     * @return {@link OptionalThing} にラップされたCollection. (NotNull: if argument is null, returns empty)
     */
    public static <T extends Collection<?>> OptionalThing<T> ifNotEmpty(T collection) {
        return isEmpty(collection) ? OptionalThing.empty() : OptionalThing.of(collection);
    }

    /**
     * {@link OptionalThing} にラップされたEclipseCollectionを返します。(空リストならempty)
     * @param collection チェックするEclipseCollection (NullAllowed: if null, returns empty)
     * @return {@link OptionalThing} にラップされたEclipseCollection. (NotNull: if argument is null, returns empty)
     */
    public static <T extends RichIterable<?>> OptionalThing<T> ifNotEmpty(T collection) {
        return isEmpty(collection) ? OptionalThing.empty() : OptionalThing.of(collection);
    }

    // ===================================================================================
    //                                                                       to・・・変換
    //                                                                       =============
    /**
     * boolean へ変換します。(nullを吸収して変換できるメソッド: nullならfalse)
     * @param flg 変換元 (NullAllowed: if null, returns false)
     * @return 値が存在し true の場合のみ true.
     */
    public static boolean toBoolean(Boolean flg) {
        return flg != null && flg;
    }

    /**
     * {@link ImmutableList} へ変換します。
     * @param list 変換元 (NullAllowed: if null, returns empty)
     * @return 値を保持した{@link ImmutableList} (NotNull: if argument is null, returns empty)
     */
    public static <T> ImmutableList<T> toImmutable(List<T> list) {
        return Lists.immutable.withAll(list);
    }

    /**
     * {@link ImmutableSet} へ変換します。
     * @param set 変換元 (NullAllowed: if null, returns empty)
     * @return 値を保持した{@link ImmutableSet} (NotNull: if argument is null, returns empty)
     */
    public static <T> ImmutableSet<T> toImmutable(Set<T> set) {
        return Sets.immutable.withAll(set);
    }

    /**
     * {@link ImmutableMap} へ変換します。
     * @param map 変換元 (NullAllowed: if null, returns empty)
     * @return 値を保持した{@link ImmutableMap} (NotNull: if argument is null, returns empty)
     */
    public static <K, V> ImmutableMap<K, V> toImmutable(Map<K, V> map) {
        return Maps.immutable.withAll(map);
    }

    /**
     * {@link MutableList} へ変換します。
     * @param list 変換元 (NullAllowed: if null, returns empty)
     * @return 値を保持した{@link MutableList} (NotNull: if argument is null, returns empty)
     */
    public static <T> MutableList<T> toMutable(List<T> list) {
        return Lists.mutable.withAll(list);
    }

    // ===================================================================================
    //                                                                   compare・・・比較
    //                                                                   =================
    /**
     * {@link Comparable} を実装したクラスの比較方法を提供します。
     * @param left 比較元. (NotNull)
     * @return 比較方法 (NotNull)
     */
    public static <T extends Comparable<? super T>> BasicCompare<T> compare(T left) {
        return CompareUtil.compare(left);
    }
}