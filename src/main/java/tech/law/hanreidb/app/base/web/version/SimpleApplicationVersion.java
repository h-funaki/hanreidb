/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.version;

/**
 * @author jflute
 */
public class SimpleApplicationVersion implements ApplicationVersion {

    /** バージョン文字列 e.g. v00001 (NotNull) */
    private final String _version;

    /**
     * アプリケーションバージョンを生成します。
     * @param version バージョン (NotNull)
     */
    public SimpleApplicationVersion(String version) {
        _version = version;
    }

    @Override
    public String toString() {
        return _version;
    }

    @Override
    public String getVersion() {
        return _version;
    }

    @Override
    public boolean isSupported() {
        return true;
    }
}
