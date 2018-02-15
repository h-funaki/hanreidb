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
package tech.law.hanreidb.app.web.signin;

import javax.annotation.Resource;

import org.lastaflute.core.time.TimeManager;

import tech.law.hanreidb.app.web.base.login.HanreidbLoginAssist;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author jflute
 */
public class SigninActionTest extends UnitHanreidbTestCase {

    @Resource
    private TimeManager timeManager;
    @Resource
    private HanreidbLoginAssist loginAssist;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_signin_basic() {
        // ## Arrange ##
        // changeAsyncToNormalSync();
        //        changeRequiresNewToRequired();
        //        SigninAction action = new SigninAction();
        //        inject(action);
        //        SigninForm form = new SigninForm();
        //        form.account = "Pixy";
        //        form.password = "test";
        //
        //        // ## Act ##
        //        HtmlResponse response = action.signin(form);
        //
        //        // ## Assert ##
        //        TestingHtmlData htmlData = validateHtmlData(response);
        //        htmlData.assertRedirect(MypageAction.class);
        //
        //        HanreidbUserBean userBean = loginAssist.getSavedUserBean().get();
        //        log(userBean);
        //        assertEquals(form.account, userBean.getMemberAccount());
        //            assertEquals(1, userLoginBhv.selectCount(cb -> {
        //                cb.query().setLoginDatetime_Equal(timeManager.currentDateTime()); // transaction time
        //            }));
    }
    //
    //    // ===================================================================================
    //    //                                                                          Validation
    //    //                                                                          ==========
    //    public void test_signin_validationError_required() {
    //        // ## Arrange ##
    //        SigninAction action = new SigninAction();
    //        inject(action);
    //        SigninForm form = new SigninForm();
    //
    //        // ## Act ##
    //        // ## Assert ##
    //        assertValidationError(() -> action.signin(form)).handle(data -> {
    //            data.requiredMessageOf("account", Required.class);
    //            data.requiredMessageOf("password", Required.class);
    //            TestingHtmlData htmlData = validateHtmlData(data.hookError());
    //            htmlData.assertHtmlForward(HanreidbHtmlPath.path_Signin_SigninHtml);
    //        });
    //    }
    //
    //    public void test_signin_validationError_loginFailure() {
    //        // ## Arrange ##
    //        SigninAction action = new SigninAction();
    //        inject(action);
    //        SigninForm form = new SigninForm();
    //        form.account = "Pixy";
    //        form.password = "land";
    //
    //        // ## Act ##
    //        // ## Assert ##
    //        assertValidationError(() -> action.signin(form)).handle(data -> {
    //            data.requiredMessageOf("account", HanreidbMessages.ERRORS_LOGIN_FAILURE);
    //            TestingHtmlData htmlData = validateHtmlData(data.hookError());
    //            htmlData.assertHtmlForward(HanreidbHtmlPath.path_Signin_SigninHtml);
    //            assertNull(form.password); // should cleared for security
    //        });
    //    }
}
