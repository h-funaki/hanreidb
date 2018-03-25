package tech.law.hanreidb.app.job;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.job.LaCron;
import org.lastaflute.job.LaJobRunner;
import org.lastaflute.job.LaJobRuntime;
import org.lastaflute.job.LaJobScheduler;

import tech.law.hanreidb.app.base.web.context.AccessContextCreator;
import tech.law.hanreidb.app.job.core.JobHookAssist;
import tech.law.hanreidb.app.job.court.judgement.migrate.CourtJudgementMigrateJob;
import tech.law.hanreidb.app.job.court.judgement.put.CourtJudgementPutJob;
import tech.law.hanreidb.app.job.court.judgement.set.CourtJudgementSetJob;

/**
 * @author jflute
 */
public class AllJobScheduler implements LaJobScheduler {

    protected static final String APP_TYPE = "JOB";
    protected static final String USER_TYPE = "M";

    @Resource
    private TimeManager timeManager;
    @Resource
    private JobHookAssist jobHookAssist;

    @Override
    public void schedule(LaCron cron) {
        cron.registerNonCron(CourtJudgementSetJob.class, waitIfConcurrent(), op -> {
            op.uniqueBy("CourtJudgementSet");
        });
        cron.registerNonCron(CourtJudgementMigrateJob.class, waitIfConcurrent(), op -> {
            op.uniqueBy("CourtJudgementMigrate");
        });
        cron.registerNonCron(CourtJudgementPutJob.class, waitIfConcurrent(), op -> {
            op.uniqueBy("CourtJudgementPut");
        });
    }

    @Override
    public LaJobRunner createRunner() {
        return new LaJobRunner() {
            @Override
            protected void hookFinally(LaJobRuntime runtime, OptionalThing<Throwable> cause) {
                jobHookAssist.handleRecordedErrors(runtime, cause);
            }
        }.useAccessContext(resource -> {
            final AccessContextCreator accessContextCreator = new AccessContextCreator(resource, timeManager, OptionalThing.empty());
            return accessContextCreator.create(() -> OptionalThing.of(USER_TYPE), () -> OptionalThing.empty(), () -> APP_TYPE);
        });
    }
}
