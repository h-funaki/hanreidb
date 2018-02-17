/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

/**
 * メール管理システムでシステム側で設定する（できる）項目。
 * @author mito
 */
public interface ManagedMailTemplate {

    /**
     * 送信するメールに使用する送信先メールアドレスを取得します。
     * @return 送信先メールアドレス (NotNull)
     */
    String getFromAddress();

    /**
     * 送信するメールに使用する送信先メールアドレスの表示名を取得します。
     * @return 送信先メールアドレスの表示名 (NotNull)
     */
    String getFromDisplayName();

    /**
     * 送信するメール本文の元となる MailFlute のテンプレート形式の本文を取得します。
     * @return MailFlute のテンプレート (NotNull)
     */
    String getTemplate();
}
