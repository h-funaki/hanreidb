/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.exception.app;

import org.lastaflute.core.exception.LaApplicationException;

/**
 * U-NEXTにおける (基本的な) 業務例外の基底クラス。
 *
 * <p>LastaFluteの業務例外を継承しているので、LastaFluteの業務例外として認識される。
 * クラス作成時点(2016年)では特別処理はないが、いざ必要になったときの吸収層として。</p>
 *
 * <p>ただ、MessagingApplicationExceptionを継承する場合は、このクラスは利用できないので、
 * わざわざ基底クラスを作るメリットはちょと薄いが、
 * そもそもU-NEXTだと業務例外の扱いが統一的 (BizResponseApplicationException) なので、
 * MessagingApplicationExceptionを継承することもそんなにないはず。</p>
 *
 * <p>【追記】Failure統一パターンもちょっとずつ導入するようになったので、
 * MessagingApplicationExceptionを使うケースも出てきて、
 * このクラスは統一の基底という扱いにはならなくなった。</p>
 * @author jflute
 */
public abstract class NxApplicationException extends LaApplicationException {

    private static final long serialVersionUID = 1L;

    /**
     * @param debugMsg ログに出力されるデバッグメッセージ、クライアント向けではない (NullAllowed: Java標準に合わせるが、でも null は非推奨)
     */
    public NxApplicationException(String debugMsg) {
        super(debugMsg);
    }

    /**
     * @param debugMsg ログに出力されるデバッグメッセージ、クライアント向けではない (NullAllowed: Java標準に合わせるが、でも null は非推奨)
     * @param cause 業務例外となった原因の例外 (NullAllowed: Java標準に合わせるが、でも null は非推奨。nullだったら別のコンストラクタ呼んで)
     */
    public NxApplicationException(String debugMsg, Throwable cause) {
        super(debugMsg, cause);
    }
}
