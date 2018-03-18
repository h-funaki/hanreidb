package tech.law.hanreidb.app.web.judgement.list;

import java.time.LocalDate;
import java.util.List;

/**
 * @author h-funaki
 */
public class JudgementListContentResult {

    /**  */
    public List<JudgementPart> judgement_list;

    public PagingPart paging_part;

    public static class PagingPart {

        /**  */
        public Integer all_record_count;

        public Integer all_page_count;

        public Integer current_page_number;

        public Integer current_page_size;

        public boolean exists_next_page;

        public Integer next_page_number;

        public boolean exists_previous_page;

        public Integer previous_page_number;
    }

    /**
     * @author h-funaki
     *
     */
    public static class JudgementPart {

        public Long judgement_id;
        public String judgement_public_code;
        public String case_name;
        public List<ReportPart> report_part_list;
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

    /**
     * @author h-funaki
     *
     */
    public static class ReportPart {
        public Integer report_id;
        public String report_name;
        public String report_alias;
        public Integer report_kan;
        public Integer report_go;
        public Integer report_ko;
    }
}