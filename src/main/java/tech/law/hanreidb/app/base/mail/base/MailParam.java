/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

import tech.law.hanreidb.app.base.util.NxAssertions;

/**
 * メール送信時必須パラメータ。
 * @author mito
 */
public class MailParam {

    /** 送信先メールアドレス (NotNull) */
    public String toAddress;

    // TODO mito まだアノテーション方式が無いのでこれで (2017/06/18)
    /**
     * バリデーション
     */
    public void validate() {
        NxAssertions.assertThat(this).isInstanceOfSatisfying(MailParam.class, param -> {
            NxAssertions.assertThat(param.toAddress).as("toAddress").isNotNull();
        });
    }
}