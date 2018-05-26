package tech.law.hanreidb.app.web.law.list;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class LawListActionTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    
    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に登録されている() {
    // ## Arrange ##
    LawListAction action = new LawListAction();
    inject(action);
    
    LawListBody body = new LawListBody();
    
    // ## Act ##
    
    // ## Assert ##
    
    }
    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
}
