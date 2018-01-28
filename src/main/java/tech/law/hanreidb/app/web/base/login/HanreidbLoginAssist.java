/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package tech.law.hanreidb.app.web.base.login;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.core.magic.async.AsyncManager;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.db.jta.stage.TransactionStage;
import org.lastaflute.web.login.PrimaryLoginManager;
import org.lastaflute.web.login.TypicalLoginAssist;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.login.option.LoginSpecifiedOption;

import tech.law.hanreidb.app.web.signin.SigninAction;
import tech.law.hanreidb.dbflute.cbean.UserCB;
import tech.law.hanreidb.dbflute.exbhv.LoginHistoryBhv;
import tech.law.hanreidb.dbflute.exbhv.UserBhv;
import tech.law.hanreidb.dbflute.exentity.LoginHistory;
import tech.law.hanreidb.dbflute.exentity.User;
import tech.law.hanreidb.mylasta.action.HanreidbUserBean;
import tech.law.hanreidb.mylasta.direction.HanreidbConfig;

/**
 * @author jflute
 */
public class HanreidbLoginAssist extends TypicalLoginAssist<Integer, HanreidbUserBean, User> // #change_it also UserBean
        implements PrimaryLoginManager { // #app_customize

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private TimeManager timeManager;
    @Resource
    private AsyncManager asyncManager;
    @Resource
    private TransactionStage transactionStage;
    @Resource
    private HanreidbConfig config;
    @Resource
    private UserBhv userBhv;
    @Resource
    private LoginHistoryBhv loginHistoryBhv;

    // ===================================================================================
    //                                                                           Find User
    //                                                                           =========
    @Override
    protected void checkCredential(CredentialChecker checker) {
        checker.check(UserPasswordCredential.class, credential -> {
            return userBhv.selectCount(cb -> arrangeLoginByCredential(cb, credential)) > 0;
        });
    }

    @Override
    protected void resolveCredential(CredentialResolver resolver) {
        resolver.resolve(UserPasswordCredential.class, credential -> {
            return userBhv.selectEntity(cb -> arrangeLoginByCredential(cb, credential));
        });
    }

    private void arrangeLoginByCredential(UserCB cb, UserPasswordCredential credential) {
        cb.query().arrangeLogin(credential.getUser(), encryptPassword(credential.getPassword()));
    }

    @Override
    protected OptionalEntity<User> doFindLoginUser(Integer userId) {
        return userBhv.selectEntity(cb -> cb.query().arrangeLoginByIdentity(userId));
    }

    // ===================================================================================
    //                                                                       Login Process
    //                                                                       =============
    @Override
    protected HanreidbUserBean createUserBean(User userEntity) {
        return new HanreidbUserBean(userEntity);
    }

    @Override
    protected OptionalThing<String> getCookieRememberMeKey() {
        return OptionalThing.of(config.getCookieRememberMeHanreidbKey());
    }

    @Override
    protected Integer toTypedUserId(String userKey) {
        return Integer.valueOf(userKey);
    }

    @Override
    protected void saveLoginHistory(User member, HanreidbUserBean userBean, LoginSpecifiedOption option) {
        asyncManager.async(() -> {
            transactionStage.requiresNew(tx -> {
                insertLogin(member);
            });
        });
    }

    protected void insertLogin(User user) {
        LoginHistory login = new LoginHistory();
        login.setUserId(user.getUserId());
        login.setLoginDatetime(timeManager.currentDateTime());
        loginHistoryBhv.insert(login);
    }

    // ===================================================================================
    //                                                                      Login Resource
    //                                                                      ==============
    @Override
    protected Class<HanreidbUserBean> getUserBeanType() {
        return HanreidbUserBean.class;
    }

    @Override
    protected Class<?> getLoginActionType() {
        return SigninAction.class;
    }
}
