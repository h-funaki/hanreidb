package tech.law.hanreidb.app.web.law.list;

import java.time.LocalDate;

/**
 * @author h-funaki
 */
public class LawListBody {

    /** 法令種別コード e.g. null */
    public String law_type_code;

    /** 法令公開コード e.g. null */
    public String law_public_code;

    /** 法令名 e.g. null */
    public String law_name;

    /** 法令番号 e.g. null */
    public String law_number;

    /** 公布日 e.g. null (NullAllowed)*/
    public LocalDate promulgation_date;

    /** 施行日 e.g. null (NullAllowed)*/
    public LocalDate effective_date;

    /** 法令略称 e.g. null */
    public String law_alias;

    /** 法令カテゴリーID e.g. null */
    public Integer law_category_id;

    public Integer page_size;

    public Integer page_number;
}
