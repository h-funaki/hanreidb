/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit.assertj.order;

/**
 * @author jflute
 */
public class OrderCaseMark {

    protected final int specNo;
    protected boolean caseFound;

    public OrderCaseMark(int specNo) {
        this.specNo = specNo;
    }

    public OrderCaseMark markCase() {
        caseFound = true;
        return this;
    }

    public boolean isCaseFound() {
        return caseFound;
    }
}
