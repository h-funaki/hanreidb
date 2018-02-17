/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.order;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @param <BEAN> The type of bean.
 * @author jflute
 */
public class OrderValidator<BEAN> {

    protected final Consumer<ExpectedOrderBy<BEAN>> orderBySpecCall;
    protected boolean orderShortCaseIgnored;

    public OrderValidator(Consumer<ExpectedOrderBy<BEAN>> orderBySpecCall) {
        this.orderBySpecCall = orderBySpecCall;
    }

    public OrderValidator<BEAN> ignoreOrderShortCase() {
        orderShortCaseIgnored = true;
        return this;
    }

    public void validateOrder(Iterable<BEAN> beanList, Consumer<OrderByViolation<BEAN>> violationCall) {
        final ExpectedOrderBy<BEAN> orderBy = new ExpectedOrderBy<BEAN>();
        orderBySpecCall.accept(orderBy);
        final List<OrderBySpec<BEAN>> orderBySpecList = orderBy.getOrderBySpecList();
        final Map<Integer, OrderCaseMark> caseMarkMap = new LinkedHashMap<>();
        BEAN previousBean = null;
        for (BEAN nextBean : beanList) {
            if (previousBean != null) {
                doAssertOrder(previousBean, nextBean, orderBySpecList.iterator(), violationCall, 1, caseMarkMap);
            }
            previousBean = nextBean;
        }
        verifyShortCase(orderBySpecList, caseMarkMap);
    }

    protected void verifyShortCase(List<OrderBySpec<BEAN>> orderBySpecList, Map<Integer, OrderCaseMark> caseMarkMap) {
        if (orderShortCaseIgnored) {
            return;
        }
        for (OrderBySpec<BEAN> spec : orderBySpecList) {
            final int specNo = spec.getSpecNo();
            final OrderCaseMark caseMark = caseMarkMap.get(specNo);
            if (caseMark == null || !caseMark.isCaseFound()) {
                throw new IllegalStateException("Not found the order case for the spec number: " + specNo);
            }
        }
    }

    protected void doAssertOrder(BEAN previousBean, BEAN nextBean, Iterator<OrderBySpec<BEAN>> specIterator,
            Consumer<OrderByViolation<BEAN>> violationCall, int specNo, Map<Integer, OrderCaseMark> caseMarkMap) {
        if (!specIterator.hasNext()) {
            return;
        }
        final OrderBySpec<BEAN> spec = specIterator.next();
        final Function<BEAN, Comparable<? extends Object>> provider = spec.getValueProvider();
        @SuppressWarnings("unchecked")
        final Comparable<Object> previousValue = (Comparable<Object>) provider.apply(previousBean);
        @SuppressWarnings("unchecked")
        final Comparable<Object> nextValue = (Comparable<Object>) provider.apply(nextBean);
        final int compareTo = compareTo(spec, previousValue, nextValue);
        if (spec.isAsc() ? compareTo > 0 : compareTo < 0) {
            violationCall.accept(createOrderByViolation(specNo, previousBean, nextBean, previousValue, nextValue));
        } else if (compareTo == 0) {
            doAssertOrder(previousBean, nextBean, specIterator, violationCall, specNo + 1, caseMarkMap);
        }
        if (compareTo != 0) {
            if (!caseMarkMap.containsKey(specNo)) {
                caseMarkMap.put(specNo, new OrderCaseMark(specNo).markCase());
            }
        }
    }

    protected int compareTo(OrderBySpec<BEAN> spec, Comparable<Object> previousValue, Comparable<Object> nextValue) {
        if (previousValue == null && nextValue == null) {
            return 0;
        } else if (previousValue == null) {
            return (spec.isAsc() ? 1 : -1) * (spec.isNullsFirst() ? -1 : 1); // nulls last as default
        } else if (nextValue == null) {
            return (spec.isAsc() ? 1 : -1) * (spec.isNullsFirst() ? 1 : -1);
        } else {
            return previousValue.compareTo(nextValue);
        }
    }

    protected OrderByViolation<BEAN> createOrderByViolation(int specNo, BEAN previousBean, BEAN nextBean, Comparable<Object> previousValue,
            Comparable<Object> nextValue) {
        return new OrderByViolation<>(specNo, previousBean, nextBean, previousValue, nextValue);
    }
}
