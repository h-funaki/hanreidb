package tech.law.hanreidb.app.web.judgement.get;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class JudgementGetTestAction extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に登録されている() {
        // ## Arrange ##
        JudgementGetAction action = new JudgementGetAction();
        inject(action);

        // ## Act ##

        // ## Assert ##

    }
    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
}
