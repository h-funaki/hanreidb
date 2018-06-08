package tech.law.hanreidb.app.logic;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author h-funaki
 */
public class CodeCreateLogic {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // private static final Logger logger = LoggerFactory.getLogger(FormatLogic.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               Logic
    //                                                                               =====
    public String createLawPublicCode() {
        return createPublicCode("LID");
    }

    public String createJudgementPublicCode() {
        return createPublicCode("JID");
    }

    private String createPublicCode(String prefix) {
        return prefix + RandomStringUtils.random(3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ") + RandomStringUtils.random(6, "0123456789");
    }
}
