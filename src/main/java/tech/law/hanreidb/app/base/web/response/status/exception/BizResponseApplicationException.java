/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.status.exception;

import tech.law.hanreidb.app.base.core.exception.app.NxApplicationException;
import tech.law.hanreidb.app.base.util.MyAssertUtil;
import tech.law.hanreidb.app.base.web.response.status.BizResponseStatus;
import tech.law.hanreidb.app.base.web.response.status.SwitchableMessageResponseStatus;

/**
 * <p>そもそも業務例外とは？: <a href="http://dbflute.seasar.org/ja/lastaflute/howto/architecture/exceptionhandling.html">開拓の例外ハンドリング (Exception Handling)</a></p>
 *
 * <p>U-NEXTではこんな感じに捉えている: <a href="https://unextastb.backlog.jp/view/DFH-209">【アーキテクチャ】u-nextにおける業務例外のハンドリングについて</a></p>
 *
 * がっつり、この例外クラスの使い方:
 * <pre>
 * *基本編*
 *
 * 業務例外は種類を Enum で管理し、BizResponseApplicationException で返します。
 *
 * プロジェクト単位なのか、サブプロジェクト単位なのかで記述するファイルやクラスが異なります。
 * 下記は laxample-plaza だけで使う例外を追加する手順として作成しています。
 * （もし laxample-batch にも使うという場合は plaza を laxample と置き換えて下さい）
 *
 * （１）例外用のメッセージを作成します。
 *
 * plaza_message.properteis を編集し、追加する例外用のキーと値を追記します。
 *
 * ```
 * errors.app.sakuhin.list.not.found = お探しの作品は存在しません。
 * ```
 *
 * 追加後、 12:freegen を叩き、PlazaMessages.java に自動生成でメソッドを追記します。
 *
 *
 * （２）例外用の Enum を追加します。
 *
 * PlazaResponseStatus に Enum を追記します。（名前は自由です）
 *
 * ```
 * SAKUHIN_NOT_FOUND(333, PlazaMessages.ERROR_APP_SAKUHIN_LIST_NOT_FOUND)
 * ```
 *
 * 第一引数は「業務ステータスコード」、
 * 第二引数は（１）で作成したメッセージを指定します。
 *
 * 例外の準備は以上です。
 *
 *
 * （３）例外を発生させる
 *
 * 返したいところで作成した Enum を BizResponseApplicationException に入れて throw するだけです。
 *
 * ```
 * throw new BizResponseApplicationException("デバッグ用メッセージ", PlazaResponseStatus.SAKUHIN_NOT_FOUND);
 * ```
 *
 * 第一引数のメッセージは必須です。
 * 発生原因など、デバッグする時に必要な情報を入れて下さい。
 *
 *
 *  *応用編*
 *
 * メッセージが引数を受け取る場合や、
 * 業務ステータスコードは同じだけどメッセージだけ変えたい場合は、
 * BizResponseApplicationException#overrideMessage を使用します。
 *
 * ```
 * errors.app.sakuhin.list.not.found = お探しの作品は存在しません。 sakuhin_public_code= {0}
 * ```
 *
 * のように可変になる文字列を含む場合は、作成する（１）、（２）の手順は変わらないのですが、
 * overrideMessage メソッドで明示的にメッセージを指定する必要があります。
 *
 * ```
 * BizResponseApplicationException ex = new BizResponseApplicationException("テスト目的だけ", PlazaResponseStatus.SAKUHIN_NOT_FOUND);
 * ex.overrideMessage(PlazaMessages.ERRORS_SWITCABLE_MESSAGE, "P00001");
 * throw ex;
 * ```
 *
 * "デバッグ用メッセージ" と 可変長引数 の住み分けは、
 * 前者は送信元に返さない（ログに出力するだけ）
 * 後者は送信元に返したいものとして下さい。
 * 通常は前者のみの選択となると思います。
 *
 * *テスト編*
 *
 * ```
 * // ## Act ##
 * BizResponseApplicationException exception = thrown(
 *     BizResponseApplicationException.class,
 *     (action, form) -> action.index()
 * );
 * ```
 *
 * doAction ではなく、thrown を使用します。
 * 第一引数に期待値となる Exception を渡し、
 * 第二引数に action, form を持つ BiConsumer を渡します。（doAction と違い return は不要です）
 *
 * ```
 * // ## Assert ##
 * softly.then(exception.getStatus()).as("業務ステータスコード").isEqualTo(PlazaResponseStatus.SAKUHIN_NOT_FOUND);
 * ```
 *
 * アサートは、getStatus で宣言した Enum が取れるので、そちらを比較します。
 * thrown の中で第一引数の例外が発生しているかアサートしてますので、別途 isNotNull などの確認は不要です。
 *
 * ちなみに、
 * 可変長引数を持つメッセージの場合、実体は SwitchableMessageResponseStatus ですが、
 * NxSoftly 内でよしなに BizResponseStatus を抽出しています。
 * SwitchableMessageResponseStatus を意識して書きたい場合はキャストして取り出して下さい。
 *
 * e.g.
 * ```
 * softly.then(((SwitchableMessageResponseStatus) exception.getStatus()).statusCode())
 *        .as("業務ステータスコード")
 *        .isEqualTo(PlazaResponseStatus.SAKUHIN_NOT_FOUND.statusCode());
 * </pre>
 * @author jflute
 * @author mito
 */
public class BizResponseApplicationException extends NxApplicationException {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BizResponseStatus status; // not null, may be overridden

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // memo:
    // 開拓の例外ハンドリング (Exception Handling)
    // http://dbflute.seasar.org/ja/lastaflute/howto/architecture/exceptionhandling.html
    //
    // 【アーキテクチャ】u-nextにおける業務例外のハンドリングについて
    // https://unextastb.backlog.jp/view/DFH-209
    // _/_/_/_/_/_/_/_/_/_/
    /**
     * すごい詳しくは、クラスの方のJavaDocを参照。(ここはコンストラクタのJavaDoc) <br>
     * BizResponseStatusを指定した業務例外を生成する。ApiFailureHookでcatchされる想定。<br>
     * 第一引数は、デバッグ用のメッセージということで、ログファイルに出力されるだけのもの。<br>
     * いざその業務例外に対して何か対応が必要になったときのために、状況判断できる値などを入れましょう。<br>
     * 業務例外とはなんぞや？っていう人は、こちらのページを読みましょう: <br>
     * <a href="http://dbflute.seasar.org/ja/lastaflute/howto/architecture/exceptionhandling.html">開拓の例外ハンドリング (Exception Handling)</a>
     * @param debugMsg ログファイルに出力されるデバッグ用のメッセージ、丁寧でなくていいので状況がわかるもの (NullAllowed: Java標準に合わせてるけど、まあnullはやめよう)
     * @param status [App]ResponseStatusで定義されている業務レスポンスステータス、それぞれのステータスにメッセージが紐付く (NotNull)
     */
    public BizResponseApplicationException(String debugMsg, BizResponseStatus status) {
        super(status + ": " + debugMsg);
        MyAssertUtil.assertNotNull("status", status);
        this.status = status;
    }

    /**
     * すごい詳しくは、クラスの方のJavaDocを参照。(ここはコンストラクタのJavaDoc) <br>
     * BizResponseStatusを指定した業務例外を生成する。ApiFailureHookでcatchされる想定。<br>
     * 第一引数は、デバッグ用のメッセージということで、ログファイルに出力されるだけのもの。<br>
     * いざその業務例外に対して何か対応が必要になったときのために、状況判断できる値などを入れましょう。<br>
     * 業務例外とはなんぞや？っていう人は、こちらのページを読みましょう: <br>
     * <a href="http://dbflute.seasar.org/ja/lastaflute/howto/architecture/exceptionhandling.html">開拓の例外ハンドリング (Exception Handling)</a>
     * @param debugMsg ログファイルに出力されるデバッグ用のメッセージ、丁寧でなくていいので状況がわかるもの (NullAllowed: Java標準に合わせてるけど、まあnullはやめよう)
     * @param status [App]ResponseStatusで定義されている業務レスポンスステータス、それぞれのステータスにメッセージが紐付く (NotNull)
     * @param cause この業務例外のなったきっかけの例外 (NullAllowed: Java標準に合わせるが、でも null は非推奨。nullだったら別のコンストラクタ呼んで)
     */
    public BizResponseApplicationException(String debugMsg, BizResponseStatus status, Throwable cause) {
        super(status + ": " + debugMsg, cause);
        MyAssertUtil.assertNotNull("status", status);
        this.status = status;
    }

    // ===================================================================================
    //                                                                             Message
    //                                                                             =======
    /**
     * ステータスに対応するメッセージを上書きする。<br>
     * ただ、Backlog (<a href="https://unextastb.backlog.jp/view/DFH-209">【アーキテクチャ】u-nextにおける業務例外のハンドリングについて</a>) の通り、<br>
     * メッセージに業務的な意味があまりないので、ほとんど使われることはないのかなぁと想定している。
     * @param messageKey [app]_message.propertiesに定義されているキー、FreeGenで自動生成された[App]Messsagesを使いましょう (NotNull)
     * @param params そのメッセージに埋め込む値たち (NotNull, EmptyAllowed)
     */
    public void overrideMessage(String messageKey, Object... params) {
        MyAssertUtil.assertNotNull("messageKey", messageKey);
        MyAssertUtil.assertNotNull("params", params);
        this.status = new SwitchableMessageResponseStatus(status, messageKey, params);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * 指定された業務レスポンスステータスを取得する。
     * @return 業務レスポンスステータス (NotNull)
     */
    public BizResponseStatus getStatus() {
        return status;
    }
}
