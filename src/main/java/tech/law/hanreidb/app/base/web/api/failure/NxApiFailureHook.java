/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.api.failure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.message.MessageManager;
import org.lastaflute.web.api.ApiFailureHook;
import org.lastaflute.web.api.ApiFailureResource;
import org.lastaflute.web.api.BusinessFailureMapping;
import org.lastaflute.web.exception.Forced400BadRequestException;
import org.lastaflute.web.exception.Forced403ForbiddenException;
import org.lastaflute.web.exception.Forced404NotFoundException;
import org.lastaflute.web.login.exception.LoginFailureException;
import org.lastaflute.web.login.exception.LoginRequiredException;
import org.lastaflute.web.response.ApiResponse;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.web.api.failure.climsg.ClientManagedMessageProcessor;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.EmptyContentResult;
import tech.law.hanreidb.app.base.web.response.result.ResponseResultBuilder;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.BizResponseStatus;
import tech.law.hanreidb.app.base.web.response.status.NxResponseStatus;
import tech.law.hanreidb.app.base.web.response.status.exception.BizResponseApplicationException;
import tech.law.hanreidb.app.base.web.version.AppVersionHandler;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;

/**
 * LastaFluteのApiFailureHookのU-NEXT実装。<br>
 * アプリのApiFailureHookはこれを必ず継承すること。<br>
 * U-NEXTにおけるAPIのエラー表現のルールが、がっつり実装されているのではちゃめちゃ大事。<br>
 * U-NEXTのエラー表現のデザインは、大昔に決められてしまって変えられない。<br>
 * <a href="http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsondesign.html#jsonerrorexp">JSON APIのJSONデザイン - B. エラー表現 (Failure統一？共通ヘッダー？)</a>
 * @author jflute
 * @author awaawa
 * @author mito
 * @author nagahori
 */
public abstract class NxApiFailureHook implements ApiFailureHook { // #change_it for handling API failure

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // [正常系]
    // HTTPステータス : 200
    // 業務ステータス  : 200
    //
    // [クライアントエラー系] JSON戻し、サーバーにログが残る e.g. バリデーションエラー、ログイン失敗、JSONおかしい
    // HTTPステータス : 200
    // 業務ステータス  : 4xx
    //
    // [システムエラー系] JSON戻し、サーバーにログが残る e.g. システム例外
    // HTTPステータス : 200
    // 業務ステータス  : 500
    //
    // [そもそもないじゃん系] 空レスポンス、サーバーにログが残る(はず) e.g. URL間違ってるとか
    // HTTPステータス : 404 ※救えない
    // 業務ステータス  : none
    //
    // [仕組みレベルで落ちた系] 空レスポンス、サーバーにログが残る(はず) e.g. フレームワーク例外
    // HTTPステータス : 500 ※救えない
    // 業務ステータス  : none
    // _/_/_/_/_/_/_/_/_/_/
    protected static final int HTTP_SUCCESS = 200;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BusinessFailureMapping<BizResponseStatus> failureTypeMapping; // for application exception

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NxApiFailureHook() {
        failureTypeMapping = new BusinessFailureMapping<BizResponseStatus>(failureMap -> {
            setupFailureMap(failureMap);
        });
    }

    protected void setupFailureMap(Map<Class<?>, BizResponseStatus> failureMap) {
        // application exception
        failureMap.put(EntityAlreadyDeletedException.class, getStatusOfEntityDeleted());
        failureMap.put(EntityAlreadyUpdatedException.class, getStatusOfEntityUpdated());
        failureMap.put(EntityAlreadyExistsException.class, getStatusOfEntityExists());
        failureMap.put(LoginFailureException.class, getStatusOfLoginFailure());
        failureMap.put(LoginRequiredException.class, getStatusOfLoginRequired());

        // client exception
        failureMap.put(Forced400BadRequestException.class, getStatusOfBadRequest());
        failureMap.put(Forced403ForbiddenException.class, getStatusOfForbidden());
        failureMap.put(Forced404NotFoundException.class, getStatusOfNotFound());
    }

    // ===================================================================================
    //                                                                    Business Failure
    //                                                                    ================
    @Override
    public ApiResponse handleValidationError(ApiFailureResource resource) {
        final BizResponseStatus status = getStatusOfValidationError();
        return asJson(toWholeResult(resource, status, toMessage(resource, status))).httpStatus(HTTP_SUCCESS);
    }

    @Override
    public ApiResponse handleApplicationException(ApiFailureResource resource, RuntimeException cause) {
        final BizResponseStatus status = chooseApplicationExceptionStatus(resource, cause);
        return asJson(toWholeResult(resource, status, toMessage(resource, status))).httpStatus(HTTP_SUCCESS);
    }

    protected BizResponseStatus chooseApplicationExceptionStatus(ApiFailureResource resource, RuntimeException cause) {
        return failureTypeMapping.findAssignable(cause).orElseGet(() -> {
            return findNonMappingApplicationExceptionStatus(cause);
        });
    }

    protected BizResponseStatus findNonMappingApplicationExceptionStatus(RuntimeException cause) {
        if (cause instanceof BizResponseApplicationException) { // 独自の業務例外は大抵はこれで吸収するぞ
            return extractSpecifiedApplicationExceptionStatus(cause);
        } else {
            return getStatusOfAppException();
        }
    }

    protected BizResponseStatus extractSpecifiedApplicationExceptionStatus(RuntimeException cause) {
        return ((BizResponseApplicationException) cause).getStatus();
    }

    // ===================================================================================
    //                                                                      System Failure
    //                                                                      ==============
    @Override
    public OptionalThing<ApiResponse> handleClientException(ApiFailureResource resource, RuntimeException cause) {
        final BizResponseStatus status = chooseClientExceptionStatus(resource, cause);
        final String message = buildErrorMessage("Client", cause);
        return OptionalThing.of(asJson(toWholeResult(resource, status, message)).httpStatus(HTTP_SUCCESS));
    }

    protected BizResponseStatus chooseClientExceptionStatus(ApiFailureResource resource, RuntimeException cause) {
        return failureTypeMapping.findAssignable(cause).orElseGet(() -> {
            return getStatusOfBadRequest(); // as default
        });
    }

    @Override
    public OptionalThing<ApiResponse> handleServerException(ApiFailureResource resource, Throwable cause) {
        final String message = buildErrorMessage("Server", cause);
        final BizResponseStatus status = getStatusOfServerError();
        return OptionalThing.of(asJson(toWholeResult(resource, status, message)).httpStatus(HTTP_SUCCESS));
    }

    protected String buildErrorMessage(String title, Throwable cause) {
        final String causeMsg = isDevelopmentHere() ? cause.getMessage() : "*see log";
        final String delimiter = causeMsg != null && causeMsg.contains("\n") ? "\n" : " ";
        return "[" + title + " Error]:" + delimiter + (causeMsg != null ? causeMsg : "*no message");
    }

    // ===================================================================================
    //                                                                    Framework Status
    //                                                                    ================
    protected abstract BizResponseStatus getStatusOfAppException();

    protected abstract BizResponseStatus getStatusOfEntityDeleted();

    protected abstract BizResponseStatus getStatusOfEntityUpdated();

    protected abstract BizResponseStatus getStatusOfEntityExists();

    protected abstract BizResponseStatus getStatusOfValidationError();

    protected abstract BizResponseStatus getStatusOfLoginFailure();

    protected abstract BizResponseStatus getStatusOfLoginRequired();

    protected abstract BizResponseStatus getStatusOfBadRequest();

    protected abstract BizResponseStatus getStatusOfForbidden();

    protected abstract BizResponseStatus getStatusOfNotFound();

    protected BizResponseStatus getStatusOfServerError() {
        return NxResponseStatus.SERVER_ERROR;
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    // -----------------------------------------------------
    //                                          Whole Result
    //                                          ------------
    // この辺は大切なので、しっかり緊急オーバーライドしやすいように徹底してメソッド化
    protected WholeResult<? extends ContentResult> toWholeResult(ApiFailureResource resource, BizResponseStatus status, String message) {
        final ResponseResultBuilder builder = createResponseResultBuilder(resource, status);
        final ApplicationVersion appVersion = getRequestedAppVersion(resource.getRequestManager());
        final MetaResultPart metaResult = builder.createResultPart(appVersion, status, message, null);
        final ContentResult content = prepareFailureContent(resource, status);
        return builder.createWholeResult(metaResult, content);
    }

    protected ResponseResultBuilder createResponseResultBuilder(ApiFailureResource resource, BizResponseStatus status) {
        return new ResponseResultBuilder(resource.getRequestManager().getTimeManager());
    }

    protected ContentResult prepareFailureContent(ApiFailureResource resource, BizResponseStatus status) {
        if (mayBeClientManagedMessageWay(resource, status) && isUseClientManagedMessageWay(resource, status)) {
            return createClientManagedMessageProcessor(resource, status).createClientManagedMessageContent(resource, status);
        } else {
            return createDefaultFailureContent(resource, status);
        }
    }

    protected boolean mayBeClientManagedMessageWay(ApiFailureResource resource, BizResponseStatus status) {
        return getStatusOfValidationError().equals(status); // u-nextではバリデーションエラーだけ (業務例外はすでに共通ヘッダーで表現しているため)
    }

    protected boolean isUseClientManagedMessageWay(ApiFailureResource resource, BizResponseStatus status) {
        // クライアントメッセージ管理方式を使いたかったらオーバーライドしてtrue
        // 参考: http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsondesign.html
        return false;
    }

    protected ClientManagedMessageProcessor createClientManagedMessageProcessor(ApiFailureResource resource, BizResponseStatus status) {
        return new ClientManagedMessageProcessor();
    }

    protected EmptyContentResult createDefaultFailureContent(ApiFailureResource resource, BizResponseStatus status) {
        return new EmptyContentResult();
    }

    // -----------------------------------------------------
    //                                         JSON Response
    //                                         -------------
    protected <CONTENT extends ContentResult> JsonResponse<WholeResult<CONTENT>> asJson(WholeResult<CONTENT> wholeBean) {
        return new JsonResponse<WholeResult<CONTENT>>(wholeBean);
    }

    // -----------------------------------------------------
    //                                        Header Message
    //                                        --------------
    protected String toMessage(ApiFailureResource resource, BizResponseStatus status) {
        return buildBatchedMessage(prepareMessageList(resource, status));
    }

    protected String buildBatchedMessage(List<String> messageList) { // separated by line separator as default
        return messageList.stream().reduce((saved, next) -> saved + "\n" + next).orElse("").trim();
    }

    protected List<String> prepareMessageList(ApiFailureResource resource, BizResponseStatus status) {
        final List<String> messageList = resource.getMessageList(); // embedded in exception
        if (!messageList.isEmpty()) { // e.g. MessagingApplicationException (almost unused in u-next)
            return messageList;
        } else { // mainly here, message key from status
            return findStatusMappingMessageList(resource, status);
        }
    }

    protected List<String> findStatusMappingMessageList(ApiFailureResource resource, BizResponseStatus status) {
        return status.messageKey().map(messageKey -> {
            final RequestManager requestManager = resource.getRequestManager();
            final MessageManager messageManager = requestManager.getMessageManager();
            final Object[] messageParams = status.messageParams();
            return messageManager.getMessage(requestManager.getUserLocale(), messageKey, messageParams);
        }).map(message -> Arrays.asList(message)).orElseGet(() -> Collections.emptyList());
    }

    // -----------------------------------------------------
    //                                            AppVersion
    //                                            ----------
    protected ApplicationVersion getRequestedAppVersion(RequestManager requestManager) { // might be unknown
        return AppVersionHandler.getRequestedAppVersion(requestManager);
    }

    // -----------------------------------------------------
    //                                         Configuration
    //                                         -------------
    protected abstract boolean isDevelopmentHere();
}
