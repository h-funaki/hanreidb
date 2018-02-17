/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.order;

/**
 * @param <BEAN> The type of bean.
 * @author jflute
 */
public class OrderByViolation<BEAN> {

    protected final int specNo;
    protected final BEAN previousBean;
    protected final BEAN nextBean;
    protected final Object previousValue;
    protected final Object nextValue;

    public OrderByViolation(int specNo, BEAN previousBean, BEAN nextBean, Object previousValue, Object nextValue) {
        this.specNo = specNo;
        this.previousBean = previousBean;
        this.nextBean = nextBean;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
    }

    @Override
    public String toString() {
        return "violation:{specNo=" + specNo + ", previous=" + previousValue + ", next=" + nextValue + "}";
    }

    public int getSpecNo() {
        return specNo;
    }

    public BEAN getPreviousBean() {
        return previousBean;
    }

    public BEAN getNextBean() {
        return nextBean;
    }

    public Object getPreviousValue() {
        return previousValue;
    }

    public Object getNextValue() {
        return nextValue;
    }
}
