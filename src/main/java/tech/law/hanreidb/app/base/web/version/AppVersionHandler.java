/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.version;

import java.util.function.Function;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.web.response.ActionResponse;
import org.lastaflute.web.servlet.filter.RequestLoggingFilter;
import org.lastaflute.web.servlet.request.RequestManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.web.response.exception.BizApplicationVersionInvalidException;

/**
 * @author awane
 * @author jflute
 */
public class AppVersionHandler {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(AppVersionHandler.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // may not be initialized yet
    //protected final RequestManager requestManager;
    protected final Function<String, OptionalThing<? extends ApplicationVersion>> appVersionProvider;
    protected boolean appVersionEnabled;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AppVersionHandler(Function<String, OptionalThing<? extends ApplicationVersion>> appVersionProvider, boolean appVersionEnabled) {
        this.appVersionProvider = appVersionProvider;
        this.appVersionEnabled = appVersionEnabled;
    }

    // ===================================================================================
    //                                                                             Analyze
    //                                                                             =======
    public String analyzeAppVersionPath(RequestManager requestManager, String requestPath) { // called by ActionAdjustmentProvider
        // 参考: https://unextastb.backlog.jp/wiki/CMS_DEV/アーキテクチャ_アプリバージョン
        if (!appVersionEnabled) { // unused
            saveUnknownVersionToRequest(requestManager);
            return requestPath;
        }
        assertRequestedHasAtLeastOneElement(requestPath);
        final String version = StringUtils.substringBefore(requestPath.substring(1), "/");
        final String actionPath = requestPath.substring(version.length() + 1);
        final OptionalThing<? extends ApplicationVersion> optAppVersion = versionOf(version);
        assertRequestedVersionExists(requestManager, requestPath, version, optAppVersion);
        if (!optAppVersion.isPresent()) { // もういちどチェック、assertが必ずしも例外投げるとは限らないので e.g. GodHandで例外にさせる
            return handleNotFoundVersionAssertionRecovery(requestManager, requestPath, version, actionPath); // そのリカバリ処理
        }
        optAppVersion.alwaysPresent(appVersion -> {
            assertVersionSupported(requestManager, version, appVersion);
            saveVersionToRequest(requestManager, appVersion);
        });
        return actionPath; // version-removed URL
    }

    protected void assertRequestedHasAtLeastOneElement(String requestPath) {
        if (StringUtils.length(requestPath) <= 1) {
            // 要は "localhost:9001/cms/" ってことなので、バージョンとかそういう問題じゃなく普通に404で by jflute (2014/12/23)
            String msg = String.format("At least one element exists in the request path but not found: %s", requestPath);
            throw new RequestLoggingFilter.RequestClientErrorException(msg, "Not Found the Request Path", 404);
        }
    }

    protected OptionalThing<? extends ApplicationVersion> versionOf(String version) {
        return appVersionProvider.apply(version);
    };

    protected void assertRequestedVersionExists(RequestManager requestManager, String requestPath, String version,
            OptionalThing<? extends ApplicationVersion> appVersion) {
        if (!appVersion.isPresent()) {
            throwApplicationVersionNotFoundException(requestManager, requestPath, version);
        }
    }

    protected void throwApplicationVersionNotFoundException(RequestManager requestManager, String requestPath, String version) {
        // めっちゃみんなやりそうだから、ここだけリッチに
        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice("Not found the application version in the request path.");
        br.addItem("Advice");
        br.addElement("You should specify URL like this:");
        br.addElement("  (x): /menu/list/...");
        br.addElement("  (o): /v00001/menu/list/...");
        br.addItem("Request Path");
        br.addElement(requestPath);
        br.addItem("Version?");
        br.addElement(version);
        final String msg = br.buildExceptionMessage();
        // ここはまだActionの世界に入ってないので、throwしてもHTTPステータス500になるだけ。
        // なので、若干強引だがリクエスト属性にのっけて GodHand の方で throw してもらうようにする by jflute (2014/12/23)
        //throw new BizApplicationVersionInvalidException(msg);
        saveVersionInvalidExceptionToRequest(requestManager, msg);
    }

    protected String handleNotFoundVersionAssertionRecovery(RequestManager requestManager, String requestPath, String version,
            String actionPath) {
        // でも結局、そのリクエストパスに対応するActionが見つからなければ、
        // 例外が投げられず404で迷宮入りしてしまうのでwarningログだけは出しておく。
        // また、完全なバージョン抜けのときも同じく404に e.g. /playlist/...
        final String contextPath = requestManager.getRequest().getContextPath();
        final StringBuilder sb = new StringBuilder();
        sb.append("\n_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ *Version Error");
        sb.append("\nNot found the version for the API server.");
        sb.append("\n version?    = ").append(version);
        sb.append("\n requestPath = ").append(requestPath);
        sb.append("\n contextPath = ").append(contextPath);
        sb.append("\n_/_/_/_/_/_/_/_/_/_/");
        logger.warn(sb.toString());
        saveUnknownVersionToRequest(requestManager); // 見つからなければ unknown 入れておく (なにかとわからないときは、そういう風に)

        // Actionが見つからなければ 404 で迷宮入りしてしまうので、できるだけActionが見つかるように
        // (404になってもwarningログは出力されるが、JSON形式の戻りにはならない)
        if (mightBeVersionThoughNotFound(version)) { // 見つからないんだけどバージョンっぽい
            return actionPath; // バージョンじゃないバージョン抜きで探しにいく
        } else {
            return requestPath; // 完全なバージョン抜けかもしれないので
        }
    }

    protected boolean mightBeVersionThoughNotFound(String version) {
        return version.startsWith("v");
    }

    protected void assertVersionSupported(RequestManager requestManager, String version, ApplicationVersion appVersion) {
        if (appVersion != null && !appVersion.isSupported()) {
            String msg = String.format("Unsupported application version: %s", version);
            // VersionNotFoundの方と同じ理由
            //throw new BizApplicationVersionInvalidException(msg);
            saveVersionInvalidExceptionToRequest(requestManager, msg);
        }
    }

    protected void saveVersionToRequest(RequestManager requestManager, ApplicationVersion appVersion) {
        requestManager.setAttribute(ApplicationVersion.KEY, appVersion);
    }

    protected void saveVersionInvalidExceptionToRequest(RequestManager requestManager, String msg) {
        requestManager.setAttribute(ApplicationVersion.INVALID_MESSAGE_KEY, msg);
    }

    protected void saveUnknownVersionToRequest(RequestManager requestManager) {
        saveVersionToRequest(requestManager, SystemApplicationVersion.UNKNOWN);
    }

    // ===================================================================================
    //                                                                       Static Helper
    //                                                                       =============
    public static void verifyApplicationVersion(RequestManager requestManager, ActionResponse response) { // called by ActionHook
        if (response.isUndefined()) {
            // 無効なアプリバージョンだった場合は例外で落とす。すでにチェック済みだが、
            // ActionAdjustmentProviderの時点ではJSONで戻せないので、リクエスト属性経由で引き渡されてここで例外。
            requestManager.getAttribute(ApplicationVersion.INVALID_MESSAGE_KEY, String.class).ifPresent(invalidMessage -> {
                throw new BizApplicationVersionInvalidException(invalidMessage);
            });
        }
    }

    public static ApplicationVersion getRequestedAppVersion(RequestManager requestManager) { // might be unknown
        return requestManager.getAttribute(ApplicationVersion.KEY, ApplicationVersion.class).orElseGet(() -> {
            return SystemApplicationVersion.UNKNOWN;
        });
    }
}
