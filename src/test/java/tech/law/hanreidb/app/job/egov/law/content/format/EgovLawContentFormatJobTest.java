package tech.law.hanreidb.app.job.egov.law.content.format;

import javax.annotation.Resource;

import org.lastaflute.job.mock.MockJobRuntime;

import tech.law.hanreidb.app.logic.FileLogic;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.unit.NxJobTestCase;

public class EgovLawContentFormatJobTest extends NxJobTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawBhv lawBhv;
    @Resource
    private FileLogic fileLogic;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に実行されること() throws Exception {
        // ## Arrange ##
        EgovLawContentFormatJob job = new EgovLawContentFormatJob();
        inject(job);

        // ## Act ##
        MockJobRuntime runtime = mockRuntime(job);

        // ## Assert ##
    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
    public void test_toSearchText() throws Exception {
        // ## Arrange ##
        EgovLawContentFormatJob job = new EgovLawContentFormatJob();
        inject(job);

        // ## Act ##
        String rawXml = fileLogic.readAll("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/law/content/raw_xml_1.xml");
        String toBeSearchText =
                fileLogic.readAll("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/law/content/search_text_1.txt");
        softly.then(job.toSearchText(rawXml)).as("").isEqualTo(toBeSearchText);
    }

    public void test_toViewXml() throws Exception {
        // ## Arrange ##
        EgovLawContentFormatJob job = new EgovLawContentFormatJob();
        inject(job);

        // ## Act ##
        String rawXml = fileLogic.readAll("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/law/content/raw_xml_1.xml");
        String toBeViewXml = fileLogic.readAll("/Users/h-funaki/Documents/hanreidb/src/test/resources/job/law/content/view_xml_1.xml");
        softly.then(job.toViewXml(rawXml)).as("").isEqualTo(toBeViewXml);
    }
    // ===================================================================================
    //                                                                              Select
    //                                                                              ======

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
