package tech.law.hanreidb.app.base.exception;

/**
 * U-NEXTにおけるシステム例外の基底クラス。このクラス自身throwもできる。<br>
 *
 * <p>特に、LastaFluteのシステム例外との関わりはない。
 * LaSystemExceptionは "LastaFluteの例外" を示す意味合いにして、
 * アプリで発生させる例外は別と捉えられるようにする。
 * どのみち、その辺のシステム例外の種別を細かく識別することはない。</p>
 * @author mito
 * @author jflute
 */
public class HanreidbSystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
         * @param debugMsg ログに出力されるデバッグメッセージ、クライアント向けではない (NullAllowed: Java標準に合わせるが、でも null は非推奨)
         */
    public HanreidbSystemException(String debugMsg) {
        super(debugMsg);
    }

    /**
         * @param debugMsg ログに出力されるデバッグメッセージ、クライアント向けではない (NullAllowed: Java標準に合わせるが、でも null は非推奨)
         * @param cause システム例外となった原因の例外 (NullAllowed: Java標準に合わせるが、でも null は非推奨。nullだったら別のコンストラクタ呼んで)
         */
    public HanreidbSystemException(String debugMsg, Throwable cause) {
        super(debugMsg, cause);
    }
}
