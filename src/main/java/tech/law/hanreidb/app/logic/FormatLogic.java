package tech.law.hanreidb.app.logic;

import java.time.LocalDate;

import javax.annotation.Resource;

import tech.law.hanreidb.mylasta.direction.HanreidbEnv;

public class FormatLogic {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // private static final Logger logger = LoggerFactory.getLogger(FormatLogic.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private HanreidbEnv env;

    // ===================================================================================
    //                                                                               Logic
    //                                                                               =====
    /**
     * 引数の文字列の先頭の空白文字を消去して返却する。
     * @param string (NotNull)
     * @return 先頭の空白文字を消去した文字列 (NotNull)
     */
    public String trimPrefixSpaces(String string) {
        while (string.startsWith(" ") || string.startsWith("　")) {
            while (string.startsWith(" ")) {
                string = string.replaceFirst(" ", "");
            }
            while (string.startsWith("　")) {
                string = string.replaceFirst("　", "");
            }
        }
        while (string.startsWith(" ")) { // よくわからないが半スペではない。
            string = string.substring(1);
        }
        while (string.startsWith("\n")) {
            string = string.substring(1);
        }
        return string;
    }

    /**
     * 8文字の数字の文字列(e.g. 19940909)を受け取ってLocalDateにして返す
     * @param string (NotNull)
     * @return LocalDate (NotNull)
     */
    public LocalDate format8CharsToLocalDate(String string) {
        if (!string.matches("\\d{8}")) {
            throw new IllegalStateException("8桁の数字でないのでLocalDateに変換できない。引数:" + string);
        }
        return LocalDate.parse(string.substring(0, 4) + "-" + string.substring(4, 6) + "-" + string.substring(6, 8));
    }
}
