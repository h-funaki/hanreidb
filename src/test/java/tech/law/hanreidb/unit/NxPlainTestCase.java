/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import org.dbflute.utflute.core.PlainTestCase;

import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;

/**
 * DI Containerを利用しないでいい UnitTest で使うスーパークラス。<br>
 * 起動が速いので、それでいい場合は積極的に利用したい。
 * @author jflute
 */
public abstract class NxPlainTestCase extends PlainTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** 使い方は、XxxAssertJ をご覧あれー */
    protected NxSoftly softly; // AssertJ object developer uses directly

    // ===================================================================================
    //                                                                    setUp / tearDown
    //                                                                    ================
    @Override
    public void setUp() throws Exception {
        super.setUp();
        softly = new NxSoftly();
    }

    @Override
    public void tearDown() throws Exception {
        try {
            softly.assertAll();
        } finally {
            super.tearDown();
        }
    }
}
