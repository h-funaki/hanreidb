/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.dbflute.optional.OptionalThing;
import org.dbflute.utflute.core.binding.BoundResult;
import org.dbflute.utflute.lastaflute.WebContainerTestCase;
import org.dbflute.utflute.lastaflute.mock.TestingJsonData;
import org.dbflute.utflute.mocklet.MockletHttpServletRequest;
import org.dbflute.utflute.mocklet.MockletHttpServletRequestImpl;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfReflectionUtil;
import org.dbflute.util.DfReflectionUtil.ReflectionFailureException;
import org.dbflute.util.DfStringUtil;
import org.lastaflute.core.direction.AccessibleConfig;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.di.naming.NamingConvention;
import org.lastaflute.doc.DocumentGenerator;
import org.lastaflute.doc.SwaggerGenerator;
import org.lastaflute.web.path.ActionAdjustmentProvider;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;
import tech.law.hanreidb.app.base.web.action.NxActionAdjustmentProvider;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.ResponseResultBuilder;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.NxResponseStatus;
import tech.law.hanreidb.app.base.web.swagger.NxSwaggerGenerator;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;
import tech.law.hanreidb.app.base.web.version.SystemApplicationVersion;
import tech.law.hanreidb.unit.plugin.TestPlugin;
import tech.law.hanreidb.unit.plugin.TestPluginAgent;

/**
 * WebのUnitTestのスーパークラス。<br>
 * Webから呼ばれる想定のContainer利用のクラスのほとんどが継承する(ほぼデフォルトのようなもの)。<br>
 * Containerを利用しないのであれば、NxPlainTestCase の方を利用。
 * @author mito
 * @author awaawa
 * @author jflute
 */
public abstract class NxWebTestCase extends WebContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private AccessibleConfig config;
    @Resource
    private NamingConvention namingConvention;
    @Resource
    private RequestManager requestManager;
    @Resource
    private TimeManager timeManager;

    /** 使い方は、XxxAssertJ をご覧あれー */
    protected NxSoftly softly; // AssertJ object developer uses directly

    // 何かの緊急時のために念のため protected で公開しておく
    protected final TestPluginAgent testPluginAgent = new TestPluginAgent();
    protected Set<TestPlugin> testPluginSet;

    // ===================================================================================
    //                                                                    setUp / tearDown
    //                                                                    ================
    @Override
    public void setUp() throws Exception {
        super.setUp();
        softly = new NxSoftly();
        // awane Action内でバージョン番号を利用している場合の考慮。Unitテストだとバージョン番号を明示する必要がある。またSwagger.jsonの生成にも利用している。
        deriveSupportedLatestVersion().ifPresent(supportedLatestVersion -> {
            setMockRequestAttribute(ApplicationVersion.KEY, supportedLatestVersion);
        });
        setUpTestPlugin(); // インスタンス準備という感じの全体setUp (名前変えたいけどもう無理)
        testPluginAgent.setUpBatchly(testPluginSet); // 個々のTestPluginのsetUp
    }

    @Override
    protected void postTest() {
        softly.assertAll();
        super.postTest();
    }

    @Override
    public void tearDown() throws Exception {
        testPluginAgent.tearDownBatchly(testPluginSet);
        super.tearDown();
    }

    // ===================================================================================
    //                                                                             Plug-in
    //                                                                             =======
    protected void setUpTestPlugin() { // サブクラスでオーバーライドされて、その中で addUpTestPlugin() される想定
        testPluginSet = DfCollectionUtil.newLinkedHashSet(); // 初期化順序などを登録順に
    }

    protected <TP extends TestPlugin> void addUpTestPlugin(TP testPlugin) {
        testPluginSet.add(testPlugin);
    }

    @SuppressWarnings("unchecked")
    protected <TP extends TestPlugin> TP findTestPlugin(Class<TP> testPluginClass) {
        return (TP) testPluginAgent.findTestPlugin(testPluginSet, testPluginClass);
    }

    // ===================================================================================
    //                                                             Public for ActionTester
    //                                                             =======================
    @Override
    public BoundResult inject(Object bean) {
        return super.inject(bean);
    }

    @Override
    public void showJson(Object jsonResult) {
        super.showJson(jsonResult);
    }

    @Override
    public <BEAN> TestingJsonData<BEAN> validateJsonData(JsonResponse<BEAN> response) {
        return super.validateJsonData(response);
    }

    // ===================================================================================
    //                                                                            LastaDoc
    //                                                                            ========
    @Override
    protected DocumentGenerator createDocumentGenerator() {
        DocumentGenerator generator = super.createDocumentGenerator();
        final String unextCommonDir = "../../unext-common/unext-common/src/main/java/";
        if (new File(unextCommonDir).exists()) {
            generator.addSrcDir(unextCommonDir);
        }
        // unext-test-commonにて、LastaJob を compileOnly にしているが、
        // buildship上ではライブラリが参照できてしまうので、JobManagerがないぞエラーが出てしまう。
        // なので、suppressJobDoc()をするかどうかを自動的に判別するようにする。
        String[] rootPackageNames = namingConvention.getRootPackageNames();
        for (String rootPackageName : rootPackageNames) {
            String jobRootPackageName = namingConvention.getJobRootPackageName();
            String schedulerName = rootPackageName + "." + jobRootPackageName + ".AllJobScheduler";
            log("...Detecting application type, web or batch? schedulerName={}", schedulerName);
            try {
                Class.forName(schedulerName);
                log("*Detected as batch application here");
                break; // 一個以上見つかったらバッチと言える
            } catch (ClassNotFoundException ignored) { // means web application
                log("*Detected as web application here so suppress job document");
                generator.suppressJobDoc();
            }
        }
        return generator;
    }

    @Override
    protected SwaggerGenerator createSwaggerGenerator() {
        return new NxSwaggerGenerator(requestManager);
    }

    // ===================================================================================
    //                                                                  ApplicationVersion
    //                                                                  ==================
    protected OptionalThing<ApplicationVersion> deriveSupportedLatestVersion() {
        if (!Boolean.parseBoolean(config.get("app.version.enabled"))) {
            return OptionalThing.empty();
        }

        ActionAdjustmentProvider actionAdjustmentProvider = requestManager.getActionAdjustmentProvider();
        if (actionAdjustmentProvider instanceof NxActionAdjustmentProvider) {
            OptionalThing<Class<? extends ApplicationVersion>> versionClass =
                    ((NxActionAdjustmentProvider) actionAdjustmentProvider).versionClass();
            if (versionClass.isPresent()) {
                return versionClass.map(v -> findSupportedLatestVersion(v.getEnumConstants()));
            }
        }

        // TODO awane 全システムのNxActionAdjustmentProvider#versionClass()の移行が終わったら、削除する。 (2017/10/04)
        String packageName = config.getClass().getPackage().getName().replaceAll("mylasta\\.direction", "bizfw.version");
        String className = DfStringUtil.initCap(config.get("domain.name")) + ApplicationVersion.class.getSimpleName();
        try {
            @SuppressWarnings("unchecked")
            Class<? extends ApplicationVersion> applicationVersionClass =
                    (Class<? extends ApplicationVersion>) DfReflectionUtil.forName(packageName + "." + className);
            return OptionalThing.of(findSupportedLatestVersion(applicationVersionClass.getEnumConstants()));
        } catch (ReflectionFailureException ignore) {}
        return OptionalThing.empty();
    }

    protected <VER extends ApplicationVersion> VER findSupportedLatestVersion(VER[] values) {
        List<VER> supportedList = Arrays.asList(values).stream().filter(ver -> ver.isSupported()).collect(Collectors.toList());
        return supportedList.get(supportedList.size() - 1);
    }

    // ===================================================================================
    //                                                                  Remote API Support
    //                                                                  ==================
    protected <CONTENT extends ContentResult> WholeResult<CONTENT> toRemoteWholeSuccess(CONTENT content) {
        final ApplicationVersion appVersion = SystemApplicationVersion.UNKNOWN;
        final NxResponseStatus status = NxResponseStatus.SUCCESS;
        final ResponseResultBuilder builder = createResponseResultBuilder();
        final MetaResultPart resultPart = builder.createResultPart(appVersion, status, null, null);
        return builder.createWholeResult(resultPart, content);
    }

    protected ResponseResultBuilder createResponseResultBuilder() {
        return new ResponseResultBuilder(timeManager);
    }

    // TODO awane utfluteを0.8.6以上に上げたら、削除。(0.8.6でバグ修正済み) (2017/12/01)
    @Override
    protected MockletHttpServletRequest createMockletHttpServletRequest(ServletContext servletContext) {
        return new MockletHttpServletRequestImpl(servletContext, prepareMockServletPath()) {
            @Override
            public String getContextPath() {
                return this.servletContext.getContextPath();
            }
        };
    }
}
