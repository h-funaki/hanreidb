/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mail.base;

import java.util.function.Consumer;
import java.util.function.Function;

import org.dbflute.mail.CardView;
import org.dbflute.mail.send.embedded.receptionist.SMailDynamicDataResource;
import org.dbflute.mail.send.embedded.receptionist.SMailDynamicPropAcceptor;
import org.dbflute.mail.send.embedded.receptionist.SMailDynamicPropResource;
import org.dbflute.mail.send.embedded.receptionist.SMailDynamicTextResource;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.magic.ThreadCacheContext;
import org.lastaflute.core.mail.LaThreadCachedDynamicTextAssist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MailFlute のファイルテンプレートを、{@link ManagedMailTemplate} を実装したクラスから読み込むように拡張します。
 *
 * @author mito
 */
public class ManagedMailDbTemplateAssist extends LaThreadCachedDynamicTextAssist {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final String THREAD_CACHE_KEY = "SMailDbTemplateAssist_THREAD_CACHE_KEY";
    private static final Logger logger = LoggerFactory.getLogger(ManagedMailDbTemplateAssist.class);
    private final Function<SMailDynamicDataResource, ManagedMailTemplate> managedTemplateFunc;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ManagedMailDbTemplateAssist(Function<SMailDynamicDataResource, ManagedMailTemplate> templateLambda) {
        managedTemplateFunc = templateLambda;
    }

    /** {@inheritDoc}*/
    @Override
    protected OptionalThing<? extends Object> loadDynamicData(SMailDynamicDataResource resource) {
        return OptionalThing.of(managedTemplateFunc.apply(resource));
    }

    /** {@inheritDoc}*/
    @Override
    public void accept(SMailDynamicPropResource resource, SMailDynamicPropAcceptor dynamicPropAcceptor) {
        if (isDryRunWithGivenFrom(resource)) {
            return; // 送信ではなく確認画面用として実行された場合
        }

        getEditorObject().ifPresent(param -> {
            // スレッドキャッシュにある場合はテスト送信なのでスレッドキャッシュに設定された値を使う
            dynamicPropAcceptor.acceptFrom(param.from, param.fromAlias);
        }).orElse(() -> {
            // スレッドキャッシュに無ければ本送信なので関数(実態はDBとか)から取得する
            ManagedMailTemplate managedTemplate = (ManagedMailTemplate) resource.getDynamicData();
            dynamicPropAcceptor.acceptFrom(managedTemplate.getFromAddress(), managedTemplate.getFromDisplayName());
        });
    }

    // 送信確認状態の場合 true. 確認状態＝ dryrun で from が設定されている場合。
    private boolean isDryRunWithGivenFrom(SMailDynamicPropResource resource) {
        CardView cardView = resource.getCardView();
        return cardView.isDryrun() && cardView.getFrom().isPresent();
    }

    /** {@inheritDoc}*/
    @Override
    public OptionalThing<String> assist(SMailDynamicTextResource resource) {
        OptionalThing<EditorParam> param = getEditorObject();
        if (param.isPresent()) {
            return OptionalThing.of(param.get().createTemplateText());
        }

        ManagedMailTemplate managedTemplate = (ManagedMailTemplate) resource.getDynamicData();

        return OptionalThing.of(managedTemplate.getTemplate());
    }

    // ===================================================================================
    //                                                                              Editor
    //                                                                              ======
    /*
     * 管理用WEBアプリにはメールテンプレート編集機能があり、
     * そこからテンプレートごとに編集中の内容でメールを送信したい時に使用します。
     * （DB テンプレートを使用している場合、編集中の値をDBに保存してしまうわけにはいかないので）
     */
    public static void setEditorObject(Consumer<EditorParam> paramLambda) {
        EditorParam param = new EditorParam();
        paramLambda.accept(param);

        ThreadCacheContext.setObject(THREAD_CACHE_KEY, param);
    }

    /**
     * スレッドキャッシュに登録されている編集情報を取得します。
     * @return スレッドキャッシュに登録されている編集情報 (NotNull)
     */
    public OptionalThing<EditorParam> getEditorObject() {
        Object object = ThreadCacheContext.getObject(THREAD_CACHE_KEY);
        if (object == null) {
            return OptionalThing.empty();
        }

        if (object instanceof EditorParam) {
            return OptionalThing.of((EditorParam) object);
        } else {
            // まさかのキーかぶりも発見できるようにログは出しておく。
            logger.warn("テスト用のメール送信に用意されたスレッドキャッシュ用のキー [%s] が他のオブジェクトで使用されています。", THREAD_CACHE_KEY);
            return OptionalThing.empty();
        }
    }

    /**
     * 送信時に優先して設定されるクラス
     * @author mito
     */
    public static class EditorParam {

        /** タイトル (NotNull) */
        public String subject;

        /** 本文 (NotNull) */
        public String text;

        /** fromのアドレス (NotNull) */
        public String from;

        /** fromの表示名 (NotNull) */
        public String fromAlias;

        /**
         * subject と text を使って、MailFlute のテンプレートの形式を作成します。
         * @return テンプレート
         */
        public String createTemplateText() {
            return new StringBuilder("/*[]test*/").append("\nsubject:").append(subject).append("\n>>>\n").append(text).toString();
        }
    }
}
