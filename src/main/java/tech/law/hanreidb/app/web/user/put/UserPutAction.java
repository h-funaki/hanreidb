package tech.law.hanreidb.app.web.user.put;

import javax.annotation.Resource;

import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.dbflute.allcommon.CDef;
import tech.law.hanreidb.dbflute.allcommon.CDef.UserStatus;
import tech.law.hanreidb.dbflute.exbhv.UserBhv;
import tech.law.hanreidb.dbflute.exentity.User;

/**
 * @author h-funaki
 */
public class UserPutAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(UserPutAction.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private UserBhv userBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<UserPutContentResult> index(UserPutBody body) {
        return asJson(mappingToContent(createNewUser(body)));
    }

    // ===================================================================================
    //                                                                              Create
    //                                                                              ======
    private User createNewUser(UserPutBody body) {
        User user = new User();
        user.setMailAddress(body.mail_address);
        user.setPassword(body.password);
        UserStatus 契約中 = CDef.UserStatus.契約中;
        userBhv.insert(user);
        return user;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private UserPutContentResult mappingToContent(User user) {
        UserPutContentResult content = new UserPutContentResult();
        content.result = true;
        return content;
    }

}
