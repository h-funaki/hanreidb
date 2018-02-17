/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.swagger;

import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.util.ContainerUtil;
import org.lastaflute.doc.agent.SwaggerAgent;
import org.lastaflute.web.UrlChain;
import org.lastaflute.web.path.ActionPathResolver;
import org.lastaflute.web.response.HtmlResponse;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.util.MyAssertUtil;
import tech.law.hanreidb.app.base.web.base.NxBaseAction;
import tech.law.hanreidb.app.base.web.version.AppVersionHandler;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;
import tech.law.hanreidb.app.base.web.version.SystemApplicationVersion;

/**
 * @author awane
 * @author jflute
 */
public class NxSwaggerAgent extends SwaggerAgent {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NxSwaggerAgent(RequestManager requestManager) {
        super(requestManager);
    }

    // ===================================================================================
    //                                                                  SwaggerUi Response
    //                                                                  ==================
    public HtmlResponse prepareSwaggerUiResponse(NxBaseAction action) {
        return prepareSwaggerUiResponse(action, null);
    }

    public HtmlResponse prepareSwaggerUiResponse(NxBaseAction action, String apiUrlPrefix) {
        MyAssertUtil.assertNotNull("action", action);
        String swaggerJsonUrl = getApplicationVersion().map(version -> "/" + version).orElse("")
                + getActionPathResolver().toActionUrl(action.getClass(), new UrlChain(action).moreUrl("json"));
        return super.prepareSwaggerUiResponse((apiUrlPrefix == null ? "" : apiUrlPrefix) + swaggerJsonUrl);
    }

    protected OptionalThing<String> getApplicationVersion() {
        ApplicationVersion applicationVersion = getRequestedAppVersion();
        if (applicationVersion == SystemApplicationVersion.UNKNOWN) {
            return OptionalThing.empty();
        }
        return OptionalThing.of(applicationVersion.getVersion());
    }

    protected ApplicationVersion getRequestedAppVersion() { // for sub class
        return AppVersionHandler.getRequestedAppVersion(requestManager);
    }

    protected ActionPathResolver getActionPathResolver() {
        return ContainerUtil.getComponent(ActionPathResolver.class);
    }
}
