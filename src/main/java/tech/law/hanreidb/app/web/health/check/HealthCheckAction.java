package tech.law.hanreidb.app.web.health.check;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

/**
 * @author jflute
 */
@AllowAnyoneAccess
public class HealthCheckAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private HanreidbEnv env;

    // ===================================================================================
    //                                                                             Execute
    //                                                                            =======
    @Execute
    public JsonResponse<HealthCheckContentResult> index() {
        HealthCheckContentResult result = new HealthCheckContentResult();
        result.version = 3;
        result.env_title = env.getEnvironmentTitle();
        result.db_ip = env.getJdbcUrl();
        return asJson(result);
    }

    public static class HealthCheckContentResult {

        public Integer version;

        public String env_title;

        public String db_ip;
    }
}