/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.iterable;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.ifNotNull;

import java.util.function.Consumer;

import org.assertj.core.api.SoftAssertionIterableAssert;

import tech.law.hanreidb.app.base.unit.assertj.NxSoftly;
import tech.law.hanreidb.app.base.unit.assertj.order.ExpectedOrderBy;
import tech.law.hanreidb.app.base.unit.assertj.order.OrderValidator;

/**
 * Iterable の実装クラスに対するアサートの拡張。
 * softly.then(Iterable<ELEMENT>) を受け取った時の選択肢。
 *
 * @see NxSoftly
 * @author mito
 */
public class NxIterableAssert<ELEMENT> extends SoftAssertionIterableAssert<ELEMENT> {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public NxIterableAssert(Iterable<? extends ELEMENT> actual) {
        super(actual);
    }

    // ===================================================================================
    //                                                              既存のチェーンへの対応
    //                                                              ======================
    // 既存のチェーンでこの拡張クラスのチェーンにしたい部分はオーバーライドしていく必要がある。
    // しないと親クラスがかえってしまうので。
    @Override
    public NxIterableAssert<ELEMENT> as(String description, Object... args) {
        return (NxIterableAssert<ELEMENT>) super.describedAs(description, args);
    }

    // ===================================================================================
    //                                                                独自アサートメソッド
    //                                                                ====================
    /**
     * 並び順を検証します。
     *
     * @see OrderValidator#validateOrder(Iterable, Consumer)
     * @param oneArgLambda 並び順の期待値
     * @return {@link NxIterableAssert}
     */
    public NxIterableAssert<ELEMENT> isOrderBy(Consumer<ExpectedOrderBy<ELEMENT>> oneArgLambda) {
        return isOrderBy(oneArgLambda, false);
    }

    /**
     * 並び順を検証します。
     *
     * @see OrderValidator#validateOrder(Iterable, Consumer)
     * @param oneArgLambda 並び順の期待値
     * @param orderShortCaseIgnored 期待値に指定されている要素が複数存在しない場合を許容する場合は true
     * @return {@link NxIterableAssert}
     */
    @SuppressWarnings("unchecked")
    public NxIterableAssert<ELEMENT> isOrderBy(Consumer<ExpectedOrderBy<ELEMENT>> oneArgLambda, boolean orderShortCaseIgnored) {
        OrderValidator<ELEMENT> validator = new OrderValidator<ELEMENT>(oneArgLambda);

        if (orderShortCaseIgnored) {
            validator.ignoreOrderShortCase();
        }

        validator.validateOrder((Iterable<ELEMENT>) actual, vio -> {
            String title = ifNotNull(info.descriptionText()).orElse("Order Failure");

            throw new AssertionError(title + "\n" + vio); // for now
        });

        return this;
    }
}
