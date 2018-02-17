/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.exception;

import org.lastaflute.core.message.UserMessages;
import org.lastaflute.web.exception.Forced400BadRequestException;

/**
 * アプリケーションバージョン無効例外。
 * @author awane
 * @author jflute
 */
public class BizApplicationVersionInvalidException extends Forced400BadRequestException {

    private static final long serialVersionUID = 1L;

    public BizApplicationVersionInvalidException(String msg) {
        super(msg, UserMessages.empty());
    }

    public BizApplicationVersionInvalidException(String msg, Throwable cause) {
        super(msg, UserMessages.empty());
    }
}
