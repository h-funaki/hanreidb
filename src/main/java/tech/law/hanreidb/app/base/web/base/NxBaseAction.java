/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base;

import javax.annotation.Resource;

import org.dbflute.hook.CallbackContext;
import org.lastaflute.core.direction.FwAssistantDirector;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.dbflute.accesscontext.AccessContextArranger;
import org.lastaflute.db.jta.lazytx.LazyTransactionArranger;
import org.lastaflute.web.TypicalAction;
import org.lastaflute.web.response.ActionResponse;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.web.context.AccessContextCreator;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.EmptyContentResult;
import tech.law.hanreidb.app.base.web.response.result.ResponseResultBuilder;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.NxResponseStatus;
import tech.law.hanreidb.app.base.web.version.AppVersionHandler;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;

/**
 * LastaFluteのBaseActionのU-NEXT実装。<br>
 * アプリのBaseActionはこれを必ず継承すること。<br>
 * @author nagahori
 * @author jflute
 */
public abstract class NxBaseAction extends TypicalAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final LazyTransactionArranger lazyTransactionArranger = new LazyTransactionArranger();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private FwAssistantDirector assistantDirector;
    @Resource
    private TimeManager timeManager;
    @Resource
    private RequestManager requestManager;

    // ===================================================================================
    //                                                                               Hook
    //                                                                              ======
    // LastaFluteのActionHookの実装
    // reference: http://dbflute.seasar.org/ja/lastaflute/howto/architecture/actionhook.html
    @Override
    public ActionResponse hookBefore(ActionRuntime runtime) { // アプリバージョンやLazyTransactionのため
        final ActionResponse response = super.hookBefore(runtime);
        AppVersionHandler.verifyApplicationVersion(requestManager, response);
        if (isUseLazyTransaction()) {
            lazyTransactionArranger.readyLazyTransaction(hook -> {
                CallbackContext.setBehaviorCommandHookOnThread(hook);
            });
        }
        transferFromRequestToThreadCacheContext();
        return response;
    }

    @Override
    public void hookFinally(ActionRuntime runtime) { // アプリバージョンやLazyTransactionのため
        if (isUseLazyTransaction()) {
            lazyTransactionArranger.closeLazyTransaction();
        }
        CallbackContext.clearBehaviorCommandHookOnThread(); // 安全のためにLazyTransactionに関わらず必ずclearしておく
        super.hookFinally(runtime);
    }

    /**
     * LazyTransactionを使うかどうか？ <br>
     * LazyTransactionとは、更新時に初めて実際のTransactionを開始する機能で、<br>
     * Transactionかかっていたら問答無用にmasterに割り振る Atlas+Percona 対応。<br>
     * もし、アプリで Atlas+Percona を使うようであれば、オーバーライドしてtrueに。<br>
     * 加えて、jta+transactionManagerAdapter.xml と jta+userTransaction.xml を用意すること。
     * @return trueならLazyTransaction使う
     */
    protected boolean isUseLazyTransaction() {
        return false;
    }

    // ===================================================================================
    //                                                                      Access Context
    //                                                                      ==============
    // DBFluteの共通カラムの自動設定の実装、LastaFluteがいい感じに連携してくれる
    // reference: http://dbflute.seasar.org/ja/manual/function/genbafit/implfit/commoncolumn/
    @Override
    protected AccessContextArranger newAccessContextArranger() { // for framework
        return resource -> {
            final AccessContextCreator creator = new AccessContextCreator(resource, timeManager, requestManager);
            return creator.create(() -> myUserType(), () -> getUserBean().map(bean -> bean.getUserId()), () -> myAppType());
        };
    }

    // ===================================================================================
    //                                                                       JSON Response
    //                                                                       =============
    // #unext_standard wrap content result by whole result with result part
    protected <CONTENT extends ContentResult> WholeResult<CONTENT> toWhole(CONTENT content) {
        final ApplicationVersion appVersion = getRequestedAppVersion();
        final NxResponseStatus status = NxResponseStatus.SUCCESS;
        final ResponseResultBuilder builder = createResponseResultBuilder();
        final MetaResultPart resultPart = builder.createResultPart(appVersion, status, null, null);
        return builder.createWholeResult(resultPart, content);
    }

    protected ResponseResultBuilder createResponseResultBuilder() {
        return new ResponseResultBuilder(timeManager);
    }

    protected EmptyContentResult emptyContent() { // for sub class
        return new EmptyContentResult();
    }

    // ===================================================================================
    //                                                                 Application Version
    //                                                                 ===================
    // #unext_standard use application version as JSON API (you can suppress in your web application)
    /**
     * @return リクエストされたアプリケーションバージョン (NotNull: might be unknown when e.g. not found)
     */
    protected ApplicationVersion getRequestedAppVersion() { // for sub class
        return AppVersionHandler.getRequestedAppVersion(requestManager);
    }

    // とりあえず、古いものを分岐させていくと想定されるのでこれだけ。必要になったら判定パターンを増やすべし by jflute (2014/12/12 02:14)
    /**
     * リクエストされたアプリバージョンが、指定バージョンよりも古いか？ (リクエストバージョン &lt; 指定バージョン) <br>
     * @param appVersion 指定のアプリバージョン (NotNull)
     * @return 古いリクエストならtrue
     */
    protected boolean isRequestedAppVersionOlderThan(ApplicationVersion appVersion) {
        return getRequestedAppVersion().isOlderThan(appVersion);
    }

    // ===================================================================================
    //                                                                Thread Cache Context
    //                                                                ====================
    protected void transferFromRequestToThreadCacheContext() {
        // タイムマシン
        assistantDirector.assistCoreDirection().assistTimeResourceProvider();
    }
}
