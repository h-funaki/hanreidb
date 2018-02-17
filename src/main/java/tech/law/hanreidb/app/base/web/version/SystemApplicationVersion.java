/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.version;

/**
 * システムで必要となる特殊なアプリバージョン。<br>
 * 例えば、バージョン運用対象外プロジェクトやバージョンエラーのときに利用する Unknown など。
 * @author jflute
 */
public enum SystemApplicationVersion implements ApplicationVersion {

    /**
     * バージョン運用対象外プロジェクトやバージョンエラーのときに利用する。<br>
     * 参考: https://unextastb.backlog.jp/view/CMS_DEV-103?#comment-2469813
     */
    UNKNOWN("unknown");

    /** バージョン。 */
    private final String _version;

    /**
     * サーバアプリケーションバージョンを生成する。
     * @param version バージョン (NotNull)
     */
    private SystemApplicationVersion(String version) {
        _version = version;
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
