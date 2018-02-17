/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.db.masterslave;

import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.lastaflute.db.replication.slavedb.SlaveDBAccessorImpl;
import org.lastaflute.db.replication.slavedb.SlaveDBCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * #later まだ誰も使ってないので、実際に使う人が出てきたらしっかり整備する by jflute (2017/05/04)
 * @author jflute
 */
public abstract class SlaveDBBaseAccessor extends SlaveDBAccessorImpl {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(SlaveDBBaseAccessor.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected boolean forcedMasterSuppressed; // 主にテスト時に抑制のため

    // ===================================================================================
    //                                                                        Fixed Master
    //                                                                        ============
    /**
     * masterに固定的にアクセスする。<br>
     * UnitTestなどでメインコードの仕組みとは別に制御したいときのために。
     * @param noArgLambda masterへアクセスする処理のコールバック (NotNull)
     * @return コールバックの処理の戻り値 (NullAllowed: なければない)
     */
    public <RESULT> RESULT masterAccessFixedly(SlaveDBCallback<RESULT> noArgLambda) {
        return doMasterAccessFixedly(noArgLambda);
    }

    // ===================================================================================
    //                                                                       Forced Master
    //                                                                       =============
    @Override
    protected boolean needsForcedMasterCommand(BehaviorCommandMeta meta) {
        final boolean superResult = super.needsForcedMasterCommand(meta);
        if (superResult) { // 元々の判定ロジックで必要なら
            if (isForcedMasterSuppressed()) { // 無効になってたら (テスト時など)
                logger.info("*Not forced master for {}: {}", mySchemaDisp(), toString());
                return false;
            } else { // 通常はこっち
                return true;
            }
        } else { // そもそも必要じゃないなら
            return false;
        }
    }

    public boolean isForcedMasterSuppressed() {
        return forcedMasterSuppressed;
    }

    public void suppressForcedMaster() { // 抑制する
        logger.info("...Suppressing forced master for {}: {}", mySchemaDisp(), toString());
        this.forcedMasterSuppressed = true;
    }

    public void restoreForcedMaster() { // 元に戻す
        logger.info("...Restoring forced master for {}: {}", mySchemaDisp(), toString());
        this.forcedMasterSuppressed = false;
    }

    // ===================================================================================
    //                                                                         Schema Info
    //                                                                         ===========
    @Override
    protected abstract String mySchemaDisp();
}