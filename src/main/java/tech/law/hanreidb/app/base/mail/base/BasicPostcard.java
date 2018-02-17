/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

/**
 * postcard の共通項目
 * @author mito
 */
public interface BasicPostcard {

    /**
     * 送信先のメールアドレスを追加します。
     * @param to メールアドレス
     */
    void addTo(String to);

    /**
     * 送信元のメールアドレスを設定します。
     * @param from メールアドレス
     * @param personal 表示名
     */
    void setFrom(String from, String personal);
}
