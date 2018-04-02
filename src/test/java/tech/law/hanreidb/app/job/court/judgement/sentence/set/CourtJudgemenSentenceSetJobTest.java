package tech.law.hanreidb.app.job.court.judgement.sentence.set;

import tech.law.hanreidb.unit.NxJobTestCase;

public class CourtJudgemenSentenceSetJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    //private static final Boolean REAL_ACCESS = true;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_processSentence() throws Exception {
        // ## Arrange ##
        CourtJudgementSentenceSetJob job = new CourtJudgementSentenceSetJob();
        inject(job);

        // ## Act ##
        job.processSentence(85100);

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
    public void test_指定したidのページがない() throws Exception {
        // ## Arrange ##

        // ## Act ##

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                                Mock
    //                                                                                ====

    //===================================================================================
    //                                                                       Small Helper
    //                                                                       ============
    // NxBatchRecorderを取得する
    //    private JobRecorder getRecorder(MockJobRuntime runtime) {
    //        return (JobRecorder) runtime.getEndTitleRollMap().get("recorder");
    //    }
}
