package tech.law.hanreidb.app.web.job;

import java.time.LocalDateTime;
import java.util.Map;

import org.lastaflute.core.util.Lato;
import org.lastaflute.web.validation.Required;

public class JobExecuteBody {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 実行日時。 */
    @Required
    public LocalDateTime executionDateTime;

    /** 可変パラメータ。 (NullAllowed) */
    public Map<String, Object> varyingParameter;

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return Lato.string(this);
    }
}
