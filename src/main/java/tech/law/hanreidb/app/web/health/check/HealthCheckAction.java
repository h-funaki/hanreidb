package tech.law.hanreidb.app.web.health.check;

import java.net.InetAddress;
import java.net.UnknownHostException;

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
        result.cors_url = env.getCorsUrl();

        try {
            InetAddress addr = InetAddress.getLocalHost();
            result.local_host_name = addr.getHostName();
            result.ip_address = addr.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return asJson(result);
    }

    public static class HealthCheckContentResult {

        public Integer version;

        public String env_title;

        public String db_ip;

        public String cors_url;

        public String local_host_name;

        public String ip_address;
    }
}