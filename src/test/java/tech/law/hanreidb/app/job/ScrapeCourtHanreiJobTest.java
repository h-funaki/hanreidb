package tech.law.hanreidb.app.job;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.lastaflute.job.LaJob;
import org.lastaflute.job.mock.MockJobRuntime;
import org.lastaflute.job.subsidiary.InitialCronOpCall;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class ScrapeCourtHanreiJobTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_processHanrei() throws IOException {
        // ## Arrange ##
        ScrapeCourtHanreiJob job = prepareHtmlMockJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = createMockJobRuntime(job);
        job.run(runtime);

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                                Mock
    //                                                                                ====
    private ScrapeCourtHanreiJob prepareHtmlMockJob() {
        return new ScrapeCourtHanreiJob() {
            @Override
            protected Document getHtmlDocument(Integer detail, Integer targetId) throws IOException {
                return Jsoup.parse(new File(
                        "/Users/h-funaki/Documents/hanreidb/src/test/resources/job/court_hanrei_detail" + detail.toString() + ".html"),
                        "UTF-8");
            };
        };
    }

    private MockJobRuntime createMockJobRuntime(ScrapeCourtHanreiJob job) {
        return mockRuntime(job, op -> op.params(() -> {
            Map<String, Object> map = newHashMap();
            map.put(ScrapeCourtHanreiJob.BEGIN_ID, 87428);
            map.put(ScrapeCourtHanreiJob.END_ID, 87428);
            return map;
        }));
    }

    // ===================================================================================
    //                                                                     LastaJob Helper
    //                                                                     ===============
    /**
     * Prepare mock of job runtime.
     * @param job The execution job on the runtime. (NotNull)
     * @return The mock instance of job runtime for the job. (NotNull)
     */
    protected MockJobRuntime mockRuntime(LaJob job) {
        if (job == null) {
            throw new IllegalArgumentException("The argument 'job' should not be null.");
        }
        return MockJobRuntime.of(job.getClass());
    }

    /**
     * Prepare mock of job runtime.
     * @param job The execution job on the runtime. (NotNull)
     * @param opLambda The callback for option of initial cron. (NotNull)
     * @return The mock instance of job runtime for the job. (NotNull)
     */
    protected MockJobRuntime mockRuntime(LaJob job, InitialCronOpCall opLambda) {
        if (job == null) {
            throw new IllegalArgumentException("The argument 'job' should not be null.");
        }
        if (opLambda == null) {
            throw new IllegalArgumentException("The argument 'opLambda' should not be null.");
        }
        return MockJobRuntime.of(job.getClass(), opLambda);
    }
}
