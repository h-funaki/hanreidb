package tech.law.hanreidb.app.web.user.put;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class UserPutActionTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    
    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に登録されている() {
    // ## Arrange ##
    UserPutAction action = new UserPutAction();
    inject(action);
    
    UserPutBody body = new UserPutBody();
    
    // ## Act ##
    
    // ## Assert ##
    
    }
    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
}
