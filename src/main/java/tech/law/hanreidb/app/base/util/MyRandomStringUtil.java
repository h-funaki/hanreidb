/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.util;

import org.apache.commons.text.CharacterPredicate;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

/**
 * ランダムな〇〇を生成するメソッドを提供するクラス。
 * @author mito
 */
public class MyRandomStringUtil {

    private static final RandomStringGenerator.Builder builder = new RandomStringGenerator.Builder().withinRange('0', 'z');

    /**
     * 指定された文字数分の半角英字のみの文字列を取得します。
     * @param count 文字数
     * @return ランダムな半角英字のみの文字列
     */
    public static String randomAlphabetic(final int count) {
        return randomString(count, CharacterPredicates.LETTERS);
    }

    /**
     * 指定された文字数分の半角数字のみの文字列を取得します。
     * @param count 文字数
     * @return ランダムな半角数字のみの文字列
     */
    public static String randomNumeric(final int count) {
        return randomString(count, CharacterPredicates.DIGITS);
    }

    /**
     * 指定された文字数分の半角英数字のみの文字列を取得します。
     * @param count 文字数
     * @return ランダムな半角英数字のみの文字列
     */
    public static String randomAlphanumeric(final int count) {
        return randomString(count, CharacterPredicates.LETTERS, CharacterPredicates.DIGITS);
    }

    /**
     * 指定された文字数分のランダムな文字列を取得します。
     * @param count 文字数
     * @param filters 制限するパターン
     * @return ランダムな文字列
     */
    public static String randomString(final int count, CharacterPredicate... filters) {
        return builder.filteredBy(filters).build().generate(count);
    }
}
