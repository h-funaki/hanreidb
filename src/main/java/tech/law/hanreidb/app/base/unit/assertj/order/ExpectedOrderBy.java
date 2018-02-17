/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.order;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @param <BEAN> The type of bean.
 * @author jflute
 */
public class ExpectedOrderBy<BEAN> {

    protected final List<OrderBySpec<BEAN>> orderBySpecList = new ArrayList<>();

    public ExpectedOrderBy<BEAN> asc(Function<BEAN, Comparable<? extends Object>> oneArgInLambda) {
        orderBySpecList.add(createSpec(oneArgInLambda, true, false));
        return this;
    }

    public ExpectedOrderBy<BEAN> desc(Function<BEAN, Comparable<? extends Object>> oneArgInLambda) {
        orderBySpecList.add(createSpec(oneArgInLambda, false, false));
        return this;
    }

    public ExpectedOrderBy<BEAN> nullsFirstAsc(Function<BEAN, Comparable<? extends Object>> oneArgInLambda) {
        orderBySpecList.add(createSpec(oneArgInLambda, true, true));
        return this;
    }

    public ExpectedOrderBy<BEAN> nullsFirstDesc(Function<BEAN, Comparable<? extends Object>> oneArgInLambda) {
        orderBySpecList.add(createSpec(oneArgInLambda, false, true));
        return this;
    }

    protected OrderBySpec<BEAN> createSpec(Function<BEAN, Comparable<? extends Object>> oneArgInLambda, boolean asc,
            boolean nullsFirst) {
        return new OrderBySpec<BEAN>(orderBySpecList.size() + 1, oneArgInLambda, asc, nullsFirst);
    }

    public List<OrderBySpec<BEAN>> getOrderBySpecList() {
        return orderBySpecList;
    }
}
