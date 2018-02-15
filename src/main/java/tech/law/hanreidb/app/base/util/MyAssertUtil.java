package tech.law.hanreidb.app.base.util;

/**
 * アサートに関する処理のちょっとした補完クラス。(継承とかも何もない)<br>
 * ディベロッパーは NxAssertions を経由するので、実質的に表には出てこない。<br>
 * フレームワーク用のクラスと言ってもいいかも。
 * @author h-funaki
 */
public class MyAssertUtil {

    /**
     * その値、NotNullだよね！
     * @param title ダメだったときのメッセージのタイトル、基本的に引数名 (NotNull)
     * @param obj 検証する値 (NotNull: if null, exception)
     * @throws IllegalArgumentException nullだったら
     */
    public static void assertNotNull(String title, Object obj) {
        assertTitleNotEmpty(title);
        if (obj == null) {
            throw new IllegalArgumentException("The argument '" + title + "' should not be null.");
        }
    }

    /**
     * その文字列、NotNull で NotEmpty だよね！(空白は許可)
     * @param title ダメだったときのメッセージのタイトル、基本的に引数名 (NotNull)
     * @param str 検証する文字列 (NotNull: if null or empty, exception)
     * @throws IllegalArgumentException nullだったら
     */
    public static void assertStringNotEmpty(String title, String str) {
        assertTitleNotEmpty(title);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The argument '" + title + "' should not be null or empty: " + str);
        }
    }

    protected static void assertTitleNotEmpty(String title) {
        if (title == null || title.trim().length() == 0) {
            throw new IllegalArgumentException("The argument 'title' should not be null or empty: " + title);
        }
    }

    /**
     * equals()で比較して、その二つの値、一緒だよね！ <br>
     * ちなみに、JUnitと合わせるなら assertEquals() じゃない？(まあ、いいかもう) by jflute (2017/05/08) <br>
     * あと、expected は null 許さないけど、actual は null 許すという若干中途半端な実装だよん。<br>
     * 使ってないのであれば削除しちゃいたいが... by jflute (2017/05/08)
     * @param expected ダメだったときのメッセージのタイトル、基本的に引数名 (NotNull)
     * @param actual 検証する文字列 (NotNull: if null or empty, exception)
     * @deprecated アプリでは NxAssertions を使ってくださいませ、どのみち中途半端なメソッドだし...
     */
    public static <T> void assertEqual(T expected, T actual) {
        if (!expected.equals(actual)) {
            throw new IllegalArgumentException("The argument shuold be '" + expected + "' but actual is '" + actual + "'");
        }
    }
}
