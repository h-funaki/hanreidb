package tech.law.hanreidb.app.job;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.job.LaCron;
import org.lastaflute.job.LaJobRunner;
import org.lastaflute.job.LaJobScheduler;

import tech.law.hanreidb.app.logic.context.AccessContextLogic;

/**
 * @author jflute
 */
public class AllJobScheduler implements LaJobScheduler {

    protected static final String APP_TYPE = "JOB";

    @Resource
    private TimeManager timeManager;
    @Resource
    private AccessContextLogic accessContextLogic;

    @Override
    public void schedule(LaCron cron) {
        cron.registerNonCron(ScrapeCourtHanreiJob.class, waitIfConcurrent(), op -> {});
    }

    @Override
    public LaJobRunner createRunner() {
        return new LaJobRunner().useAccessContext(resource -> {
            return accessContextLogic.create(resource, () -> OptionalThing.empty(), () -> OptionalThing.empty(), () -> APP_TYPE);
        });
    }
}
