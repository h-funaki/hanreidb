/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.version;

/**
 * @author awane
 * @author jflute
 */
public interface ApplicationVersion {

    /** リクエスト属性に乗っけるときのキー (NotNull) */
    String KEY = ApplicationVersion.class.getName();

    /** 無効なバージョンの例外をリクエスト属性に乗っけるときのキー (NotNull) */
    String INVALID_MESSAGE_KEY = ApplicationVersion.class.getName() + ":invalidMessage";

    /**
     * アプリケーションのバージョンを戻す。
     * @return バージョン文字列 e.g. v00001 (NotNull)
     */
    String getVersion();

    /**
     * そのバージョンの動作がサポートされているかどうか？
     * @return サポートされている場合は {@code true}、そうでない場合は {@code false}
     */
    boolean isSupported();

    // Java8から導入されたデフォルトメソッドである
    /**
     * 指定されたアプリバージョンよりも、古いバージョンかどうか？
     * @param appVersion アプリバージョン (NotNull)
     * @return 指定されたものより古ければ {@code true} (同じは {@code false})
     */
    default boolean isOlderThan(ApplicationVersion appVersion) {
        return getVersion().compareTo(appVersion.getVersion()) < 0;
    }
}
