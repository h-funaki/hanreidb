package tech.law.hanreidb.app.web.job;

import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.lastaflute.job.JobManager;
import org.lastaflute.job.LaJobHistory;
import org.lastaflute.job.LaScheduledJob;
import org.lastaflute.job.key.LaJobUnique;
import org.lastaflute.job.subsidiary.LaunchNowOption;
import org.lastaflute.job.subsidiary.LaunchedProcess;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.servlet.request.ResponseManager;

import tech.law.hanreidb.app.base.HanreidbBaseAction;

/**
 * @author h-funaki
 */
public class JobExecuteAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JobManager jobManager;
    @Resource
    private ResponseManager responseManager;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * JOB実行API。
     * /job/execute/
     * @param jobCode JOBをユニークに特定するコード。AllJobSchedulerにて定義されている。 (NotNull)
     * @param body RequestBody(JSON) (NotNull)
     * @return json result (NotNull)
     */
    @Execute
    public JsonResponse<JobExecuteContentResult> post$index(String jobCode, JobExecuteBody body) {
        LaScheduledJob job = findJob(jobCode);

        LaunchedProcess process = job.launchNow(op -> mappingToParams(body, op));
        LaJobHistory history = process.waitForEnding().get();

        JobExecuteContentResult result = new JobExecuteContentResult(history);
        return asJson(result);
    }

    private LaScheduledJob findJob(String jobCode) {
        return jobManager.findJobByUniqueOf(LaJobUnique.of(jobCode)).orElseTranslatingThrow(cause -> {
            return responseManager.new400("Not found the job: " + jobCode, op -> op.cause(cause));
        });
    }

    private void mappingToParams(JobExecuteBody body, LaunchNowOption op) {
        op.param("executionDateTime", LocalDateTime.now()); // body.executionDateTime);
        if (body.varyingParameter != null) {
            body.varyingParameter.forEach((key, value) -> op.param(key, value));
        }
    }
}
