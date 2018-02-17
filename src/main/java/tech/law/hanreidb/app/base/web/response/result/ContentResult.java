/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.result;

import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;

/**
 * @author jflute
 */
public interface ContentResult {

    default void verifyFixedSpec(NxSoftly softly) {
    }
}
