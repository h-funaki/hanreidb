/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import javax.annotation.Resource;

import org.dbflute.mail.send.supplement.SMailPostingDiscloser;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.mail.LaTypicalPostcard;
import org.lastaflute.core.mail.Postbox;

import tech.law.hanreidb.app.base.unit.GenericTypeUtil;
import tech.law.hanreidb.app.base.util.NxAssertions;

/**
 * MailFlute を使った送信を行うクラスに、管理しやすい実装方法を提供するクラスです。
 *
 * <pre>
 * テンプレート(Postcard) に対して１：１での実装になり、
 * 必須の実装はテンプレート内の動的項目に値を紐づけるメソッド {@link #mappingToPostcard(MailParam, LaTypicalPostcard)} のみです。
 *
 *
 * "送信" と "内容の確認" の呼び出し方は統一的な呼び出し方をします。（メソッドの変更は不可）
 *
 * 送信
 *
 * sendMail(param -> {
 *     param.xxx = xxx;
 *     param.yyy = yyy;
 *     ...
 * });
 *
 * 確認
 *
 * confirmMail((param, confirm) -> {
 *     param.xxx = xxx;
 *     param.yyy = yyy;
 *     ...
 *
 *     confirm.form = "from@example.com";
 *     confirm.subject = "subject";
 *     ...
 * });
 *
 * </pre>
 *
 * @author mito
 * @param <POSTCARD> 送信するメールの種別
 * @param <MAILPARAM> 送信するメールの本文に使用したいデータを取り出すために必要なパラメータ
 * @param <MATERIAL> メール本文の動的項目に必要なパラメータ
 */
public abstract class ManagedMailBaseLogic<POSTCARD extends LaTypicalPostcard, MAILPARAM extends MailParam> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private Postbox postbox;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * メールを送信します。
     * @param paramLambda メール本文に必要な情報 (NotNull)
     * @return 送信できた場合、true
     */
    public void sendMail(Consumer<MAILPARAM> paramLambda) {
        NxAssertions.assertThat(paramLambda).as("paramLambda").isNotNull();

        MAILPARAM param = newMailParam();
        paramLambda.accept(param);
        param.validate();

        send(param);

        // TODO mito 不達の処理が必要だけど、boolean では収まらないので Exception で検討 https://unextastb.backlog.jp/view/DFH-316#comment-39265466　(2017/07/03)
    }

    /**
     * メール内容を確認します。
     * @param mailConfirmLambda ＜メール本文に必要な情報、編集項目＞ (NotNull)
     * @return この条件で作成されたメール情報 (NotNull)
     */
    public OptionalThing<SMailPostingDiscloser> confirmMail(BiConsumer<MAILPARAM, MailConfirmParam> mailConfirmLambda) {
        NxAssertions.assertThat(mailConfirmLambda).as("mailConfirmLambda").isNotNull();

        MAILPARAM param = newMailParam();
        MailConfirmParam confirm = new MailConfirmParam();
        mailConfirmLambda.accept(param, confirm);
        param.validate();

        return send(param, OptionalThing.of(confirm)).getPostingDiscloser();
    }

    /**
     * メールを送信します。
     * @param toAddress 送信する to のアドレス (NotNull)
     * @param param メール本文に必要な情報 (NotNull)
     * @return この条件で送信されたメール情報 (NotNull)
     */
    protected POSTCARD send(MAILPARAM param) {
        return send(param, OptionalThing.empty());
    }

    /**
     * メールを送信します。
     * confirmParam の値が存在する場合、
     * 実際の送信は行わず、{@link MailConfirmParam} に従った編集内容に書き換えた値でメールを作成します。
     *
     * @param param メール送信に必要な情報 (NotNull)
     * @param confirmParam メール本文以外を編集する情報 (NotNull)
     * @return この条件で送信されたメール情報 (NotNull)
     */
    protected POSTCARD send(MAILPARAM param, OptionalThing<MailConfirmParam> confirmParam) {
        POSTCARD postcard = newPostcard();
        BasicPostcard basic = (BasicPostcard) postcard;

        basic.addTo(param.toAddress);
        mappingToPostcard(param, postcard);

        confirmParam.ifPresent(confirm -> {
            // 確認のため、テンプレートを書き換え、送信もしない。
            basic.setFrom(confirm.fromAddress, confirm.fromAlias);
            postcard.dryrunByGivenText(confirm.subject, confirm.templateText);
        });

        postbox.post(postcard);

        return postcard;
    }

    // ===================================================================================
    //                                                                        new instance
    //                                                                        ============
    protected POSTCARD newPostcard() {
        return GenericTypeUtil.getActualTypeInstance(this.getClass(), 0);
    }

    /**
     * MAILPARAM のインスタンスを取得する。
     *
     * テストケースなどで new XxxAssist() {} で継承する場合、このメソッドも継承する必要がある。
     * @return MAILPARAM (NotNull)
     */
    protected MAILPARAM newMailParam() {
        return GenericTypeUtil.getActualTypeInstance(this.getClass(), 1);
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    /**
     * メールテンプレートの可変部分に値を設定します。
     * @param param logic に渡されたパラメータ
     * @param postcard 送信メール可変部分の設定先 (NotNull)
     */
    protected abstract void mappingToPostcard(MAILPARAM param, POSTCARD postcard);
}