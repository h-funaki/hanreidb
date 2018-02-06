package tech.law.hanreidb.app.web.master.list;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class MasterListActionTest extends UnitHanreidbTestCase {

    public void test_正常に検索されること() throws Exception {
        // ## Arrange ##
        MasterListAction action = new MasterListAction();
        inject(action);

        // ## Act ##
        action.index().getJsonResult();

        // ## Assert ##
        // @Required がついているので特にアサートはしない
    }
}
