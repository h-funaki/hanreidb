package tech.law.hanreidb.app.web.judgement.list;

import java.time.LocalDate;

import tech.law.hanreidb.dbflute.allcommon.CDef;

/**
 * @author h-funaki
 */
public class JudgementListBody {

    public String judgement_public_code;

    public String case_name;

    public Integer precedent_reports_kan;

    public Integer precedent_reports_go;

    public Integer precedent_reports_ko;

    public Integer judgement_reports_go;

    public Integer judgement_reports_ko;

    public LocalDate judgement_date_from;

    public LocalDate judgement_date_to;

    public Long original_judgement_id;

    public CDef.Era case_number_era;

    public Integer case_number_year;

    public Integer case_mark_id;

    public Integer case_number_serial_number;

    public Integer court_id;

    public CDef.Bench bench;

    public CDef.JudgementResult judgement_result;

    public CDef.JudgementType judgement_type;
}