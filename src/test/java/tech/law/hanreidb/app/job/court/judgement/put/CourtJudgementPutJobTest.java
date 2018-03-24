package tech.law.hanreidb.app.job.court.judgement.put;

import javax.annotation.Resource;

import tech.law.hanreidb.dbflute.exbhv.CaseMarkBhv;
import tech.law.hanreidb.dbflute.exbhv.CourtJudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.unit.NxJobTestCase;

public class CourtJudgementPutJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private CaseMarkBhv caseMarkBhv;
    @Resource
    private CourtJudgementBhv courtJudgementBhv;
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に実行されること() throws Exception {
        // ## Arrange ##
        CourtJudgementPutJob job = new CourtJudgementPutJob();
        inject(job);

        // ## Act ##
        job.putPdf(87586);

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
