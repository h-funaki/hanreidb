/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.context;

import java.util.function.Supplier;

import org.dbflute.hook.AccessContext;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.dbflute.accesscontext.AccessContextResource;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.db.commoncolumn.UserTraceRule;
import tech.law.hanreidb.app.base.db.commoncolumn.UserTraceRule.AppTypeSupplier;
import tech.law.hanreidb.app.base.db.commoncolumn.UserTraceRule.ClientInfoSupplier;
import tech.law.hanreidb.app.base.db.commoncolumn.UserTraceRule.UserInfoSupplier;
import tech.law.hanreidb.app.base.db.commoncolumn.UserTraceRule.UserTypeSupplier;

/**
 * @author jflute
 */
public class AccessContextCreator {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AccessContextResource resource; // has module name
    protected final TimeManager timeManager; // for e.g. UPDATE_DATETIME
    protected final OptionalThing<Supplier<Object>> clientInfoSupplier; // for e.g. user-agent

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AccessContextCreator(AccessContextResource resource, TimeManager timeManager, RequestManager requestManager) {
        this.resource = resource;
        this.timeManager = timeManager;
        this.clientInfoSupplier = prepareRearRequestSupplier(requestManager);
    }

    protected OptionalThing<Supplier<Object>> prepareRearRequestSupplier(RequestManager requestManager) {
        // #unext_standard use user-agent as client info of user trace
        return requestManager.getHeaderUserAgent().map(agent -> (Supplier<Object>) () -> agent);
    }

    public AccessContextCreator(AccessContextResource resource, TimeManager timeManager,
            OptionalThing<Supplier<Object>> clientInfoSupplier) { // for e.g. Job
        this.resource = resource;
        this.timeManager = timeManager;
        this.clientInfoSupplier = clientInfoSupplier;
    }

    // ===================================================================================
    //                                                                      Create Context
    //                                                                      ==============
    public AccessContext create(UserTypeSupplier userTypeSupplier, // e.g. M
            UserInfoSupplier userInfoSupplier, // has e.g. user ID
            AppTypeSupplier appTypeSupplier // e.g. EDI
    ) {
        final ClientInfoSupplier clientInfoSupplier = prepareClientInfoSupplier();
        final UserTraceRule rule = createUserTraceRule();
        final AccessContext context = new AccessContext();
        context.setAccessLocalDateTimeProvider(() -> timeManager.currentDateTime());
        context.setAccessUserProvider(() -> {
            return rule.buildUserTrace(userTypeSupplier, userInfoSupplier, appTypeSupplier, clientInfoSupplier);
        });
        return context;
    }

    protected ClientInfoSupplier prepareClientInfoSupplier() {
        return () -> clientInfoSupplier.map(supplier -> supplier.get());
    }

    protected UserTraceRule createUserTraceRule() {
        return new UserTraceRule(resource);
    }
}
