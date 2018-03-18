package tech.law.hanreidb.app.web.master.list;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.lastaflute.web.validation.Required;

/**
 * @author h-funaki
 */
public class MasterListContentResult {

    @NotNull
    @Valid
    public List<LabelValuePart> era_list;

    @NotNull
    @Valid
    public List<LabelValuePart> bench_list;

    @NotNull
    @Valid
    public List<LabelValuePart> judgement_result_list;

    @NotNull
    @Valid
    public List<LabelValuePart> judgement_type_list;

    @NotNull
    @Valid
    public List<LabelValuePart> case_category_list;

    @NotNull
    @Valid
    public List<LabelValuePart> court_type_list;

    @NotNull
    @Valid
    public List<LabelValuePart> court_list;

    @NotNull
    @Valid
    public List<LabelValuePart> case_mark_list;

    @NotNull
    @Valid
    public List<LabelValuePart> report_list;

    public static class LabelValuePart {

        @Required
        public String label;

        @Required
        public String value;
    }
}
