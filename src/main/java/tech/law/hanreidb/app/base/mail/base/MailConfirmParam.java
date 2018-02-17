/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

import tech.law.hanreidb.app.base.util.NxAssertions;

/**
 * メール内容確認時必須パラメータ(＝編集可能パラメータ)。
 * @author mito
 */
public class MailConfirmParam {

    /** 送信先アドレス (NotNull) */
    public String toAddress;

    /** メールタイトル (NotNull) */
    public String subject;

    /** form に使用するアドレス (NotNull) */
    public String fromAddress;

    /** form の表示名 (NotNull) */
    public String fromAlias;

    /** テンプレート (NotNull) */
    public String templateText;

    // TODO mito まだアノテーション方式が無いのでこれで (2017/06/18)
    /**
     * バリデーション
     */
    public void validate() {
        NxAssertions.assertThat(this).isInstanceOfSatisfying(MailConfirmParam.class, param -> {
            NxAssertions.assertThat(param.toAddress).as("toAddress").isNotNull();
            NxAssertions.assertThat(param.subject).as("subject").isNotNull();
            NxAssertions.assertThat(param.fromAddress).as("fromAddress").isNotNull();
            NxAssertions.assertThat(param.fromAlias).as("fromAlias").isNotNull();
            NxAssertions.assertThat(param.templateText).as("templateText").isNotNull();
        });
    }
}
