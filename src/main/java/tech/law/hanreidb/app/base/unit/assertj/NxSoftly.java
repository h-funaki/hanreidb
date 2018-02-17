/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj;

import org.assertj.core.api.BDDSoftAssertions;
import org.assertj.core.api.ObjectAssert;
import org.assertj.core.util.CheckReturnValue;
import org.dbflute.optional.OptionalThing;

import tech.law.hanreidb.app.base.unit.assertj.iterable.NxIterableAssert;
import tech.law.hanreidb.app.base.unit.assertj.optional.OptionalThingAssert;
import tech.law.hanreidb.app.base.web.response.status.SwitchableMessageResponseStatus;

/**
 * AssertJ の soft assertions(以下 softlyと表記)の拡張クラスです。
 * 通常の softly では対応していないクラスへの対応と呼び出せるメソッドチェーンに独自メソッドを使用できるようにしています。
 * メソッドチェーンで呼び出せるメソッドを増やしています。
 * 実際にはメソッドチェーンで返されるクラスを変えることで拡張しています。
 *
 * @author jflute
 * @author mito
 */
public class NxSoftly extends BDDSoftAssertions {

    // ===================================================================================
    //                                                                               Then
    //                                                                              ======
    // -----------------------------------------------------
    //                                              Override
    //                                              --------
    /**
     * Iterable の実装に関するメソッドチェーンを拡張します。
     *
     * 具体的には isOrderBy など通常の softly がもっていないメソッドを呼び出せるようにしています。
     * softly.then(actual).isOrderBy のように独自チェーンさせる。
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> NxIterableAssert<T> then(Iterable<? extends T> actual) {
        return proxy(NxIterableAssert.class, Iterable.class, actual);
    }

    /**
     * 通常の then を拡張し、特殊なクラスの場合そのクラスに対してでは無いクラスをチェーンさせるようにしています。
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> ObjectAssert<T> then(T actual) {
        if (actual != null && actual.getClass().equals(SwitchableMessageResponseStatus.class)) {
            // 対象のクラスが SwitchableMessageResponseStatus だった場合、isEqualTo で指定したいのは getStatus の中身なのでそれをデフォルトの挙動に
            return proxy(ObjectAssert.class, Object.class, ((SwitchableMessageResponseStatus) actual).getStatus());
        }

        return proxy(ObjectAssert.class, Object.class, actual);
    }

    // -----------------------------------------------------
    //                                              New Type
    //                                              --------
    /**
     * OptionalThingに対応した then() メソッド。<br>
     * isPresent(), isEmpty(), contains() などが使える。
     * @param actual 検査するOptionalThingの値 (NotNull)
     * @return OptionalThingのためのassertメソッド呼び出しクラス (NotNull)
     */
    @SuppressWarnings("unchecked")
    @CheckReturnValue
    public <VALUE> OptionalThingAssert<VALUE> then(OptionalThing<VALUE> actual) {
        return proxy(OptionalThingAssert.class, OptionalThing.class, actual);
    }
}
