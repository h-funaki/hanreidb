package tech.law.hanreidb.app.job.court.judgement.set;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.lastaflute.job.mock.MockJobRuntime;

import tech.law.hanreidb.app.base.job.JobRecorder;
import tech.law.hanreidb.app.job.court.judgement.set.CourtJudgementSetJob;
import tech.law.hanreidb.unit.NxJobTestCase;

public class CourtJudgementSetJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Boolean REAL_ACCESS = true;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_processHanrei_mock() throws IOException {
        // ## Arrange ##
        CourtJudgementSetJob job = prepareHtmlMockJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = createMockJobRuntime(job, 100000.0, 100000.0);
        job.run(runtime);

        // ## Assert ##
        showEndTitleRoll(runtime); // end-title-rollの中身を目視するため
        assertPlannedSuccess(runtime); // 計画通りの成功であることをアサート
    }

    public void test_processHanrei_real_access() throws IOException {
        // ## Arrange ##
        if (!REAL_ACCESS) {
            return;
        }
        CourtJudgementSetJob job = new CourtJudgementSetJob();
        inject(job);

        // ## Act ##
        //        MockJobRuntime runtime = createMockJobRuntime(job, 1.0, 2.0);
        //        job.run(runtime);
        Document htmlDocument = job.getHtmlDocument(2, 2);
        log(htmlDocument);

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
    public void test_指定したidのページがない() throws Exception {
        // ## Arrange ##
        CourtJudgementSetJob job = new CourtJudgementSetJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = createMockJobRuntime(job, 100000.0, 100000.0);
        job.run(runtime);

        // ## Assert ##
        JobRecorder recorder = getRecorder(runtime);
        String skipTitle = recorder.getBusinessSkips().getFirst().getSkipTitle();
        softly.then(skipTitle).as("").contains("100000");
        softly.then(skipTitle).as("").contains("HTTP error fetching URL");
        softly.then(recorder.getErrors().size()).as("").isEqualTo(0);
    }

    // ===================================================================================
    //                                                                                Mock
    //                                                                                ====
    private CourtJudgementSetJob prepareHtmlMockJob() {
        return new CourtJudgementSetJob() {
            @Override
            protected Document getHtmlDocument(Integer targetId, Integer detail) throws IOException {
                return Jsoup.parse(new File("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/scrape/court/court_hanrei_detail"
                        + detail.toString() + ".html"), "UTF-8");
            };
        };
    }

    private MockJobRuntime createMockJobRuntime(CourtJudgementSetJob job, Double beginId, Double endId) { // Object -> Double になるので
        return mockRuntime(job, op -> op.params(() -> {
            Map<String, Object> map = newHashMap();
            map.put(CourtJudgementSetJob.BEGIN_ID, beginId);
            map.put(CourtJudgementSetJob.END_ID, endId);
            return map;
        }));
    }

    //===================================================================================
    //                                                                       Small Helper
    //                                                                       ============
    // NxBatchRecorderを取得する
    private JobRecorder getRecorder(MockJobRuntime runtime) {
        return (JobRecorder) runtime.getEndTitleRollMap().get("recorder");
    }
}
