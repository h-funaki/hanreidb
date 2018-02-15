package tech.law.hanreidb.app.web.judgement.favorite.put;

import javax.annotation.Resource;

import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.hook.AccessContext;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.dbflute.exbhv.JudgementBhv;
import tech.law.hanreidb.dbflute.exbhv.JudgementUserFavoriteRelBhv;
import tech.law.hanreidb.dbflute.exentity.JudgementUserFavoriteRel;

/**
 * @author h-funaki
 */
public class JudgementFavoritePutAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private JudgementUserFavoriteRelBhv judgementUserFavoriteRelBhv;
    @Resource
    private JudgementBhv judgementBhv;
    @Resource
    private AccessContext accessContext;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<JudgementFavoritePutContentResult> index(JudgementFavoritePutBody body) {
        insert(selectJudgementId(body.judgement_public_code));
        JudgementFavoritePutContentResult result = new JudgementFavoritePutContentResult();
        result.put_result = true;
        return asJson(result);
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    private void insert(Long judgementId) {
        JudgementUserFavoriteRel entity = new JudgementUserFavoriteRel();
        entity.setJudgementId(judgementId);
        entity.setUserId(getUserBean().get().getUserId());
        try {
            judgementUserFavoriteRelBhv.insert(entity);
        } catch (EntityAlreadyExistsException e) { // すでにあるならあってよい
            e.printStackTrace();
        }
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======

    private Long selectJudgementId(String judgementPublicCode) {
        return judgementBhv.selectEntityWithDeletedCheck(cb -> {
            cb.specify().columnJudgementId();
            cb.query().setJudgementPublicCode_Equal(judgementPublicCode);
        }).getJudgementId();
    }
}
