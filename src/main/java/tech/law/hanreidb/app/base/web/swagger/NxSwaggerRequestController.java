/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.swagger;

/**
 * @author jflute
 */
public class NxSwaggerRequestController { // https://unextastb.backlog.jp/view/DFH-301

    public boolean isSwaggerIllegalAccess(boolean swaggerEnabled, String requestPath) {
        return !swaggerEnabled && isSwaggerRequest(requestPath); // e.g. swagger's html, css
    }

    public boolean isSwaggerRequest(String requestPath) {
        return requestPath.startsWith("/webjars/swagger-ui") || requestPath.startsWith("/swagger");
    }
}
