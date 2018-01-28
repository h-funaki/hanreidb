package tech.law.hanreidb.app.web.signin;

import org.lastaflute.web.Execute;
import org.lastaflute.web.response.HtmlResponse;

import tech.law.hanreidb.app.base.HanreidbBaseAction;

/**
 * @author masaki.kamachi
 * @author jflute
 */
public class SigninReminderAction extends HanreidbBaseAction {

    // #pending now making...
    @Execute
    public HtmlResponse index() {
        return asHtml(path_Signin_SigninReminderHtml);
    }
}
