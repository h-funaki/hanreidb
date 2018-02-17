/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.db.commoncolumn;

import org.dbflute.optional.OptionalThing;
import org.lastaflute.db.dbflute.accesscontext.AccessContextResource;

/**
 * 共通カラムの REGISTER_TRACE, UPDATE_TRACE (まとめて UserTrace) のルール。<br>
 * LastaFlute Example の AccessContextLogic に似てる。
 * @author jflute
 */
public class UserTraceRule {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final int TRACE_COLUMN_SIZE = 64; // #unext_standard column size of user trace is fixed

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AccessContextResource resource;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserTraceRule(AccessContextResource resource) {
        this.resource = resource;
    }

    // ===================================================================================
    //                                                                  Resource Interface
    //                                                                  ==================
    /**
     * @author jflute
     */
    @FunctionalInterface
    public interface UserTypeSupplier {

        OptionalThing<String> supply();
    }

    /**
     * @author jflute
     */
    @FunctionalInterface
    public interface UserInfoSupplier {

        OptionalThing<Object> supply();
    }

    /**
     * @author jflute
     */
    @FunctionalInterface
    public interface AppTypeSupplier {

        String supply();
    }

    /**
     * @author jflute
     */
    @FunctionalInterface
    public interface ClientInfoSupplier {

        OptionalThing<Object> supply();
    }

    // ===================================================================================
    //                                                                          User Trace
    //                                                                          ==========
    public String buildUserTrace(UserTypeSupplier userTypeSupplier, UserInfoSupplier userBeanSupplier, AppTypeSupplier appTypeSupplier,
            ClientInfoSupplier clientInfoSupplier) {
        // #unext_standard user trace style e.g. "M:7,HBR,ProductListAction,[e.g. user-agent]" or "_:_,HBR,ProductListAction,_"
        final StringBuilder sb = new StringBuilder();
        sb.append(userTypeSupplier.supply().orElse("_")).append(":");
        sb.append(userBeanSupplier.supply().orElse("_"));
        sb.append(",").append(appTypeSupplier.supply()).append(",").append(resource.getModuleName());
        sb.append(",").append(clientInfoSupplier.supply().orElse("_"));
        final String trace = sb.toString();
        final int columnSize = getTraceColumnSize();
        return trace.length() > columnSize ? trace.substring(0, columnSize) : trace;
    }

    protected int getTraceColumnSize() {
        return TRACE_COLUMN_SIZE;
    }
}
