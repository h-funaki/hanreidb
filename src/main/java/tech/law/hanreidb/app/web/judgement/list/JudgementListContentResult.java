package tech.law.hanreidb.app.web.judgement.list;

import java.time.LocalDate;
import java.util.List;

/**
 * @author h-funaki
 */
public class JudgementListContentResult {

    /**  */
    public List<JudgementPart> judgement_list;

    /**
     * @author h-funaki
     *
     */
    public static class JudgementPart {

        public Long judgement_id;
        public String judgement_public_code;
        public String case_name;
        public Integer precedent_reports_kan;
        public Integer precedent_reports_go;
        public Integer precedent_reports_ko;
        public Integer judgement_reports_go;
        public Integer judgement_reports_ko;
        public LocalDate judgement_date;
        public Long original_judgement_id;
        public String case_number_era_code;
        public String case_number_era_alias;
        public Integer case_number_year;
        public Integer case_mark_id;
        public String case_mark_alias;
        public Integer case_number_serial_number;
        public Integer court_id;
        public String court_name;
        public String court_alias;
        public String bench_code;
        public String bench_alias;
        public String judgement_result_code;
        public String judgement_result_alias;
        public String judgement_type_code;
        public String judgement_type_alias;
    }
}