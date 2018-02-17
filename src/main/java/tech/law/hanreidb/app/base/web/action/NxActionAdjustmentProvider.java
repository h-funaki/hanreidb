/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.action;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotEmpty;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newImmutableList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Configuration;
import javax.validation.constraints.Size;
import javax.validation.valueextraction.ValueExtractor;

import org.dbflute.optional.OptionalThing;
import org.dbflute.util.DfTypeUtil;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.utility.ArrayIterate;
import org.hibernate.validator.HibernateValidatorConfiguration;
import org.hibernate.validator.internal.cfg.context.DefaultConstraintMapping;
import org.lastaflute.core.util.ContainerUtil;
import org.lastaflute.web.path.ActionAdjustmentProvider;
import org.lastaflute.web.path.FormMappingOption;
import org.lastaflute.web.response.ActionResponse;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.ruts.inoutlogging.InOutLogOption;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.ruts.process.populate.FormYourCollectionResource;
import org.lastaflute.web.servlet.request.RequestManager;
import org.lastaflute.web.validation.VaConfigSetupper;

import tech.law.hanreidb.app.base.web.action.inoutlogging.InOutLogMaskFilterCreator;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.swagger.NxSwaggerRequestController;
import tech.law.hanreidb.app.base.web.validator.SizeValidatorForImmutableList;
import tech.law.hanreidb.app.base.web.validator.ValueExtractorForImmutableList;
import tech.law.hanreidb.app.base.web.version.AppVersionHandler;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;

/**
 * LastaFluteのActionAdjustmentProviderのU-NEXT実装。<br>
 * アプリのActionAdjustmentProviderはこれを必ず継承すること。<br>
 * Varnish対応やアプリバージョンや Eclipse Collections など、わりと大事なものが入ってる。
 * @author jflute
 * @author nagahori
 */
public abstract class NxActionAdjustmentProvider implements ActionAdjustmentProvider {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // you can adjust your actions by overriding
    // default methods defined at the interface
    // _/_/_/_/_/_/_/_/_/_/

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final FormMappingOption formMappingOption = setupFormMappingOptionYourCollection(new FormMappingOption());

    protected static FormMappingOption setupFormMappingOptionYourCollection(FormMappingOption option) {
        return option.yourCollection(new FormYourCollectionResource(ImmutableList.class, mutable -> {
            return Lists.immutable.ofAll(mutable);
        }));
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AppVersionHandler applicationVersionHandler;
    protected final NxSwaggerRequestController swaggerRequestController;
    protected InOutLogOption inOutLogOption;

    /** The cache of request manager, just same as cachedAssistantDirector. (NotNull: after lazy-load) */
    private RequestManager cachedRequestManager;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NxActionAdjustmentProvider(boolean appVersionEnabled) {
        this.applicationVersionHandler = createApplicationVersionHandler(appVersionEnabled);
        this.swaggerRequestController = createSwaggerRequestController();
    }

    // ===================================================================================
    //                                                                             Routing
    //                                                                             =======
    @Override
    public boolean isForced404NotFoundRouting(HttpServletRequest request, String requestPath) {
        if (isSwaggerIllegalAccess(isSwaggerEnabled(), requestPath)) { // e.g. swagger's html, css
            return true; // to suppress direct access to swagger resources at e.g. production
        }
        return ActionAdjustmentProvider.super.isForced404NotFoundRouting(request, requestPath);
    }

    protected boolean isSwaggerEnabled() {
        return false;
    }

    protected boolean isSwaggerIllegalAccess(boolean swaggerEnabled, String requestPath) { // used by e.g. isForced404NotFoundRouting()
        return swaggerRequestController.isSwaggerIllegalAccess(swaggerEnabled, requestPath);
    }

    protected NxSwaggerRequestController createSwaggerRequestController() {
        return new NxSwaggerRequestController();
    }

    // ===================================================================================
    //                                                                      Action Mapping
    //                                                                      ==============
    @Override
    public String customizeActionMappingRequestPath(String requestPath) {
        return applicationVersionHandler.analyzeAppVersionPath(getRequestManager(), requestPath);
    }

    // ===================================================================================
    //                                                                        Form Mapping
    //                                                                        ============
    @Override
    public FormMappingOption adjustFormMapping() {
        return formMappingOption;
    }

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    @Override
    public VaConfigSetupper adjustValidatorConfig() {
        return conf -> prepareImmutableList(conf);
    }

    protected void prepareImmutableList(Configuration<?> conf) {
        ((HibernateValidatorConfiguration) conf).addMapping(createImmutableListConstraintMapping()); // always can cast
        conf.addValueExtractor(createImmutableListValueExtractor());
    }

    protected DefaultConstraintMapping createImmutableListConstraintMapping() {
        DefaultConstraintMapping mapping = new DefaultConstraintMapping();
        mapping.constraintDefinition(Size.class).validatedBy(SizeValidatorForImmutableList.class);
        return mapping;
    }

    protected ValueExtractor<?> createImmutableListValueExtractor() {
        return new ValueExtractorForImmutableList();
    }

    // ===================================================================================
    //                                                                     Action Response
    //                                                                     ===============
    @Override
    public void adjustActionResponseJustBefore(ActionRuntime runtime, ActionResponse response) {
        if (response instanceof JsonResponse) {
            addBizStatusToResponseHeader((JsonResponse<?>) response);
        }
    }

    protected void addBizStatusToResponseHeader(JsonResponse<?> response) {
        // VarnishでAPIの結果が正常かどうかを判断するため。
        // 共通ヘッダーパターンだと、プロキシキャッシュがキャッシュすべきかどうか HTTP Status だと判断できないので、
        // Response Header に業務ステータスを仕込んで判断させる(e.g. 200じゃなければキャッシュしないとか)。
        // reference: http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsondesign.html#jsonerrorexp
        Object result = response.getJsonResult();
        if (result instanceof WholeResult) {
            response.header("X-api-status-code", String.valueOf(((WholeResult<?>) result).result.status));
        }
    }

    // ===================================================================================
    //                                                                       InOut Logging
    //                                                                       =============
    @Override
    public boolean isUseInOutLogging() {
        // 【アーキテクチャ】障害発生時に備えて、ログから原因を追跡できるようにしたい。（パラメータへん）
        // https://unextastb.backlog.jp/view/DFH-263
        // (logback.xmlの方に、inoutのappenderとloggerの設定がされていることが前提)
        return true;
    }

    @Override
    public InOutLogOption adjustInOutLogging() {
        // InOut ログは本番環境でも全て取得しており、そのログは開発者なら誰でも見れる状態にあるため、
        // 個人情報を見れてしまう。ので、個人情報に関するものは見れないようにする。
        // より詳細はこちら、https://wiki.unext-info.jp/pages/viewpage.action?pageId=23055575
        if (inOutLogOption == null && getInOutMaskKey().isPresent()) {
            inOutLogOption = createInOutLogOption();
        }

        return inOutLogOption;
    }

    protected InOutLogOption createInOutLogOption() {
        return ifNotEmpty(getInOutMaskKeyList()).map(keyList -> { // アプリからマスクキーの指定があった場合のみ作る
            InOutLogMaskFilterCreator creator = createIntoutMaskFilterCreator();
            InOutLogOption option = new InOutLogOption();
            option.filterRequestParameter(creator.createParameterFilter(keyList));
            option.filterRequestBody(creator.createJsonFilter(keyList));
            option.filterResponseBody(creator.createResponseFilter(keyList));

            return option;
        }).orElse(null);
    }

    protected InOutLogMaskFilterCreator createIntoutMaskFilterCreator() {
        return new InOutLogMaskFilterCreator();
    }

    /**
     * IN/OUT ログでマスク対象となるキーの一覧を取得します。
     *
     * @return マスク対象のキーの一覧 (NotNull)
     */
    protected ImmutableList<String> getInOutMaskKeyList() {
        return getInOutMaskKey().filter(key -> isNotBlank(key)).map(key -> {
            return ArrayIterate.collect(key.split(","), String::trim).toImmutable();
        }).orElseGet(() -> {
            return newImmutableList();
        });
    }

    /**
     * IN/OUT ログでマスク対象となるキーを取得します。
     *
     * 値はカンマ区切りで複数指定することが可能です。
     * @return マスク対象のキーの値 e.g. "password, tel" (NotNull)
     */
    protected OptionalThing<String> getInOutMaskKey() {
        return OptionalThing.empty();
    }

    // ===================================================================================
    //                                                                 Application Version
    //                                                                 ===================
    protected AppVersionHandler createApplicationVersionHandler(boolean appVersionEnabled) {
        return new AppVersionHandler(version -> versionOf(version), appVersionEnabled);
    }

    // awane https://unextastb.backlog.jp/view/DFH-356 DFH-356 【アーキテクチャ】アプリバージョンのクラス名や利用の整理 (2017/10/06)
    public OptionalThing<Class<? extends ApplicationVersion>> versionClass() { // differs from web application
        return OptionalThing.empty();
    }

    protected OptionalThing<? extends ApplicationVersion> versionOf(String version) { // differs from web application
        return OptionalThing.empty();
    }

    // ===================================================================================
    //                                                                           Component
    //                                                                           =========
    protected RequestManager getRequestManager() {
        if (cachedRequestManager != null) {
            return cachedRequestManager;
        }
        synchronized (this) {
            if (cachedRequestManager != null) {
                return cachedRequestManager;
            }
            cachedRequestManager = ContainerUtil.getComponent(RequestManager.class);
        }
        return cachedRequestManager;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return DfTypeUtil.toClassTitle(this) + ":{}";
    }
}
