/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base.mailtemplate;

import org.lastaflute.web.validation.Required;

/**
 * 「メールテンプレート管理機能」で編集内容の確認に使用するための Body.
 * @author mito
 */
public class ManagedMailConfirmBaseContentResult {

    /** 送信先アドレス */
    @Required
    public String toAddress;

    /** 送信元アドレス */
    @Required
    public String fromAddress;

    /** タイトル */
    @Required
    public String subject;

    /** 本文 */
    @Required
    public String text;
}
