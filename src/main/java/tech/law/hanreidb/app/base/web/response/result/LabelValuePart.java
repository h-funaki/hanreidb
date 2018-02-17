package tech.law.hanreidb.app.base.web.response.result;

import org.lastaflute.core.util.Lato;
import org.lastaflute.web.validation.Required;

/**
 * @author h-funaki
 */
public class LabelValuePart {

    /** ラベル e.g. コーヒー */
    @Required
    public String label;

    /** 値 e.g. COFFEE */
    @Required
    public String value;

    /** 整列順 e.g. 1 */
    @Required
    public Integer display_order;

    @Override
    public String toString() {
        return Lato.string(this);
    }
}
