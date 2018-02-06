package tech.law.hanreidb.app.web.health.check;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;

/**
 * @author jflute
 */
@AllowAnyoneAccess
public class HealthCheckAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                             Execute
    //                                                                            =======
    @Execute
    public JsonResponse<HealthCheckContentResult> index() {
        HealthCheckContentResult result = new HealthCheckContentResult();
        result.version = 3;
        return asJson(result);
    }

    public static class HealthCheckContentResult {

        public Integer version;
    }
}