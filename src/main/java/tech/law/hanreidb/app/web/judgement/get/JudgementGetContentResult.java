package tech.law.hanreidb.app.web.judgement.get;

import java.time.LocalDate;

import javax.validation.Valid;

import org.lastaflute.web.validation.Required;

/**
 * @author h-funaki
 */
public class JudgementGetContentResult {

    /** 判決ID e.g. null */
    @Required
    public Long judgement_id;

    /** 判決公開コード e.g. null */
    @Required
    public String judgement_public_code;

    /** 事件名 e.g. null (NullAllowed)*/
    public String case_name;

    /** 裁判年月日 e.g. null (NullAllowed)*/
    public LocalDate judgement_date;

    /** 原審判決公開コード e.g. JIDXXX123456 (NullAllowed)*/
    public String original_judgement_public_code;

    /** 原審判決事件番号 (NullAllowed)*/
    public CaseMarkPart original_judgement_case_mark_part;

    /** 判決公開コード e.g. JIDXXX123456 (NullAllowed)*/
    public String appeal_judgement_public_code;

    /** 原審判決事件番号 (NullAllowed)*/
    public CaseMarkPart appeal_judgement_case_mark_part;

    // TODO h-funaki どうせ原審や控訴審の判決も取得するので、詳細取得はやめて一覧取得にしたい (2018/04/21)

    /** 裁判所ID e.g. 1 */
    @Required
    public Integer court_id;

    /** 裁判所名 e.g. 最高裁判所 */
    @Required
    public String court_name;

    /** 法廷種別コード e.g. FULL (NullAllowed)*/
    public String bench_code;

    /** 法廷種別別名 e.g. 大法廷 (NullAllowed)*/
    public String bench_alias;

    /** 判決結果コード e.g. null (NullAllowed)*/
    public String judgement_result_code;

    /** 判決結果別名 e.g. null (NullAllowed)*/
    public String judgement_result_alias;

    /** 判決種別コード e.g. null (NullAllowed)*/
    public String judgement_type_code;

    /** 判決種別別名 e.g. null (NullAllowed)*/
    public String judgement_type_alias;

    /** 裁判所webURL e.g. http://www.courts.go.jp/app/hanrei_jp/detail2?id=87734 */
    public String court_web_url;

    /** 裁判所PDFファイルURL e.g. http://www.courts.go.jp/app/files/hanrei_jp/315/050315_hanrei.pdf */
    public String court_file_url;

    /** 判決文 e.g. null (NullAllowed)*/
    public String sentence;

    /** バージョン番号 e.g. null */
    @Required
    public Long version_no;

    /** 事件番号part */
    @Required
    @Valid
    public CaseMarkPart case_mark_part;

    /**
     * @author h-funaki
     */
    public static class CaseMarkPart {

        /** 事件符号ID e.g. null */
        public Integer case_mark_id;

        /** 事件符号別名 e.g. null */
        public String case_mark_alias;

        /** 元号コード e.g. null */
        public String case_number_era_code;

        /** 元号別名 e.g. null */
        public String case_number_era_alias;

        /** 事件番号年 e.g. null */
        public Integer case_number_year;

        /** 事件番号連番 e.g. null */
        public Integer case_number_serial_number;
    }
}
