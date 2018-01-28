package tech.law.hanreidb.app.web.judgement.list;

import java.util.List;

import tech.law.hanreidb.app.web.judgement.list.JudgementListContentResult.JudgementPart;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

public class JudgementListActionTest extends UnitHanreidbTestCase {

    public void test_正常に検索されること() throws Exception {

        // ## Arrange ##
        JudgementListAction action = new JudgementListAction();
        inject(action);

        // ## Act ##
        List<JudgementPart> judgement_list = action.index().getJsonResult().judgement_list;

        // ## Assert ##
        judgement_list.forEach(judgement -> {
            log(judgement);
        });
    }
}
