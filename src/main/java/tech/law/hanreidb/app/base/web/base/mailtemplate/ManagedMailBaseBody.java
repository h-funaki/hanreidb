/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base.mailtemplate;

import org.lastaflute.web.validation.Required;

import tech.law.hanreidb.app.base.mail.base.MailConfirmParam;

/**
 * 「メールテンプレート管理機能」で使用するための Body.
 *
 * @author mito
 */
public class ManagedMailBaseBody {

    /**
     * 編集中のパラメータ。
     *
     * メール送信時に、確認用として使用する要素と同じ（じゃなければいけない）なので同じクラスを使用する。
     */
    @Required
    public MailConfirmParam confirm;
}
