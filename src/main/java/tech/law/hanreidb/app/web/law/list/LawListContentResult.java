package tech.law.hanreidb.app.web.law.list;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.lastaflute.web.validation.Required;

import tech.law.hanreidb.app.web.base.paging.PagingPart;

/**
 * @author h-funaki
 */
public class LawListContentResult {

    List<LawPart> law_part_list;

    @Valid
    public PagingPart paging_part;

    public static class LawPart {

        /** 法令種別コード e.g. null */
        @Required
        public String law_type_code;

        /** 法令種別名 e.g. null */
        @Required
        public String law_type_alias;

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
}
