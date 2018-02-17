/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.exception.app;

import org.lastaflute.core.message.UserMessages;
import org.lastaflute.core.message.exception.MessagingApplicationException;

/**
 * Failure 統一パターンにおける業務例外を表すクラス。<br>
 * 参考リンク: <a href="http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsondesign.html#jsonerrorexp">Failure 統一パターン | LastaFlute</a>
 *
 * <p>Failure統一パターンを意識した名前になってない汎用的なものになっているが、
 * Failure統一パターンに関連するクラスの方をスタンダードな名前にしようという方向性になっているため。
 * 理想的にはFailure統一パターンに統一したいという思いから。ただ、さすがにそれは無理かな... by jflute (2018/01/19)</p>
 *
 * <p>cause の BUSINESS_ERROR を意識した名前ではあるが、ApplicationException はすべて BUSINESS_ERROR なので、
 * 特別、ApiFailureHook でこの例外を意識して制御しているわけではない。by jflute (2018/01/19)</p>
 *
 * @author mito
 * @author jflute
 */
public class NxBusinessErrorException extends MessagingApplicationException {

    private static final long serialVersionUID = 1L;

    public NxBusinessErrorException(String debugMsg, UserMessages messages) {
        super(debugMsg, messages);
    }

    public NxBusinessErrorException(String debugMsg, UserMessages messages, Throwable cause) {
        super(debugMsg, messages, cause);
    }
}
