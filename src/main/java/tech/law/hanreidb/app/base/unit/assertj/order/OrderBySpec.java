/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.order;

import java.util.function.Function;

/**
 * @param <BEAN> The type of bean.
 * @author jflute
 */
public class OrderBySpec<BEAN> {

    protected final int specNo;
    protected final Function<BEAN, Comparable<? extends Object>> valueProvider;
    protected final boolean asc;
    protected final boolean nullsFirst;

    public OrderBySpec(int specNo, Function<BEAN, Comparable<? extends Object>> valueProvider, boolean asc, boolean nullsFirst) {
        this.specNo = specNo;
        this.valueProvider = valueProvider;
        this.asc = asc;
        this.nullsFirst = nullsFirst;
    }

    public int getSpecNo() {
        return specNo;
    }

    public Function<BEAN, Comparable<? extends Object>> getValueProvider() {
        return valueProvider;
    }

    public boolean isAsc() {
        return asc;
    }

    public boolean isNullsFirst() {
        return nullsFirst;
    }
}
