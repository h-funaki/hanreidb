package tech.law.hanreidb.app.job.egov.law.put;

import javax.annotation.Resource;

import org.lastaflute.job.mock.MockJobRuntime;

import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exentity.Law;
import tech.law.hanreidb.dbflute.exentity.LawContent;
import tech.law.hanreidb.dbflute.exentity.LawHistory;
import tech.law.hanreidb.unit.NxJobTestCase;

public class EgovLawPutJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawBhv lawBhv;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に実行されること() throws Exception {
        // ## Arrange ##
        EgovLawPutJob job = new EgovLawPutJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = mockRuntime(job);

        job.run(runtime);

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
    public void test_法令番号がない() throws Exception {
        // ## Arrange ##
        EgovLawPutJob job = new EgovLawPutJob();
        inject(job);

        // ## Act ##
        Law law = selectLawEntity();
        Integer lawId = law.getLawId();
        job.processGetEgovLawDataXml(lawId, law.getLawNumber());

        // ## Assert ##
        Law entity = selectLawEntity(lawId);
        softly.then(entity.getLawId()).as("").isEqualTo(lawId);
        LawHistory lawHistory = entity.getLawHistoryByLawIdList().get(0);
        softly.then(lawHistory.getLatestVersionFlg()).as("").isTrue();
        softly.then(lawHistory.getLawAmendVersion()).as("").isEqualTo(1);
        softly.then(lawHistory.getAmendLawId()).as("").isNull();

        LawContent content = lawHistory.getLawContentAsOne().get();
        //        softly.then(content.getLawContentRawXml()).as("").contains(law.getLawName());
        //        softly.then(content.getLawContentRawXml()).as("").contains(law.getLawNumber());
        softly.then(content.getLawContentRawXml()).as("").startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        softly.then(content.getLawContentRawXml()).as("").endsWith("DataRoot>\n");
        softly.then(content.getLawContentRawXml()).as("").isEqualTo(content.getLawContentSearchText());
        softly.then(content.getLawContentRawXml()).as("").isEqualTo(content.getLawContentViewXml());
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private Law selectLawEntity() {
        return lawBhv.selectEntityWithDeletedCheck(cb -> {
            cb.fetchFirst(1);
        });
    }

    private Law selectLawEntity(Integer lawId) {
        Law law = lawBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setLawId_Equal(lawId);
            cb.fetchFirst(1);
        });
        lawBhv.loadLawHistoryByLawId(law, historyCB -> {
            historyCB.setupSelect_LawContentAsOne();
        });
        return law;
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
