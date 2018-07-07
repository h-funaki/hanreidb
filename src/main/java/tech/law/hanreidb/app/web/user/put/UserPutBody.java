package tech.law.hanreidb.app.web.user.put;

import org.lastaflute.web.validation.Required;

/**
 * @author h-funaki
 */
public class UserPutBody {

    /** メールアドレス e.g. null */
    @Required
    public String mail_address;

    /** パスワード e.g. null */
    @Required
    public String password;
}
