package tech.law.hanreidb.app.web.law.get;

import java.time.LocalDate;
import java.util.List;

import org.lastaflute.web.validation.Required;

/**
 * @author h-funaki
 */
public class LawGetContentResult {

    /** 法令公開コード e.g. null */
    @Required
    public String law_public_code;

    /** 法令名 e.g. null */
    @Required
    public String law_name;

    /** 法令番号 e.g. null */
    @Required
    public String law_number;

    /** 公布日 e.g. null (NullAllowed)*/
    public LocalDate promulgation_date;

    /** 施行日 e.g. null (NullAllowed)*/
    public LocalDate effective_date;

    /** 法令略称 e.g. null */
    public List<String> law_alias_list;

    /** 法令種別コード e.g. null */
    @Required
    public String law_type_code;

    /** 法令種別別名 e.g. null */
    @Required
    public String law_type_alias;

    /** 法令改正バージョン e.g. null */
    @Required
    public Integer law_amend_version;

    /** 最新フラグ e.g. null */
    @Required
    public Boolean latest_version_flg;

    /** 法令内容画面用XML e.g. null */
    @Required
    public String law_content_view_xml;

    /** 取得元リスト e.g. null */
    public List<SourcePart> source_part_list;

    public static class SourcePart {

        /** 取得元コード e.g. null */
        public String source_code;

        /** 取得元別名 e.g. null */
        public String source_alias;
    }

    /** 法令カテゴリーリスト e.g. null */
    public List<LawCategoryPart> law_category_part_list;

    public static class LawCategoryPart {

        /** 法令カテゴリーID e.g. null */
        public Integer law_category_id;

        /** 法令カテゴリー別名 e.g. null */
        public String law_category_alias;
    }
}
