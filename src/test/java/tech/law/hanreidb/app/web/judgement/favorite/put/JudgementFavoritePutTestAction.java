package tech.law.hanreidb.app.web.judgement.favorite.put;

import javax.annotation.Resource;

import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementUserFavoriteRelBhv;
import tech.law.hanreidb.dbflute.exentity.Judgement;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class JudgementFavoritePutTestAction extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JudgementUserFavoriteRelBhv favoriteRelBhv;
    @Resource
    private JudgementBhv judgementBhv;

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====

    public void test_正常に登録されている() {
        // ## Arrange ##
        JudgementFavoritePutAction action = new JudgementFavoritePutAction();
        inject(action);
        JudgementFavoritePutBody body = new JudgementFavoritePutBody();
        String publicCode = selectJudgementEntity().getJudgementPublicCode();
        body.judgement_public_code = publicCode;

        // ## Act ##
        action.index(body);

        // ## Assert ##

    }

    public void test_すでに登録されている() {
        // ## Arrange ##
        JudgementFavoritePutAction action = new JudgementFavoritePutAction();
        inject(action);
        JudgementFavoritePutBody body = new JudgementFavoritePutBody();
        String publicCode = selectJudgementEntity().getJudgementPublicCode();
        body.judgement_public_code = publicCode;

        // ## Act ##
        action.index(body);

        // ## Assert ##

    }

    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    private Judgement selectJudgementEntity() {
        return judgementBhv.selectEntity(cb -> {
            cb.specify().everyColumn();
            cb.query().notExistsJudgementUserFavoriteRel(relCB -> {});
            cb.fetchFirst(1);
        }).get();
    }
}
