package tech.law.hanreidb.app.web.judgement.list;

import java.time.LocalDate;
import java.util.List;

import tech.law.hanreidb.dbflute.allcommon.CDef;

/**
 * @author h-funaki
 */
public class JudgementListBody {

    /** 事件名 (NullAllowed)*/
    public String case_name;

    /** 検索ワード (NullAllowed)*/
    public String search_word;

    /** 判例集巻 (NullAllowed)*/
    public Integer report_kan;

    /** 判例集号 (NullAllowed)*/
    public Integer report_go;

    /** 判例集頁 (NullAllowed)*/
    public Integer report_ko;

    /** 判例集ID (NullAllowed)*/
    public Integer report_id;

    /** 判決年月日from (NullAllowed)*/
    public LocalDate judgement_date_from;

    /** 判決年月日to (NullAllowed)*/
    public LocalDate judgement_date_to;

    /** 事件番号元号 (NullAllowed)*/
    public CDef.Era case_number_era;

    /** 事件番号年 (NullAllowed)*/
    public Integer case_number_year;

    /** 事件符号ID (NullAllowed)*/
    public Integer case_mark_id;

    /** 事件番号連番 (NullAllowed)*/
    public Integer case_number_serial_number;

    /** 裁判所ID (NullAllowed)*/
    public List<Integer> court_id_list;

    /** 事件種別 (NullAllowed)*/
    public List<CDef.CaseCategory> case_category_list;

    /** 法廷種別 (NullAllowed)*/
    public List<CDef.Bench> bench_list;

    /** 判決結果 (NullAllowed)*/
    public List<CDef.JudgementResult> judgement_result_list;

    /** 判決種別 (NullAllowed)*/
    public List<CDef.JudgementType> judgement_type_list;

    /** page number */
    public Integer page_number;
}