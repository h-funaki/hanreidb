/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import java.lang.reflect.Constructor;

import org.dbflute.utflute.core.binding.BoundResult;
import org.dbflute.util.DfReflectionUtil;
import org.lastaflute.web.servlet.request.RequestManager;

import tech.law.hanreidb.app.base.unit.GenericTypeUtil;

/**
 * @author mito
 */
public interface RemoteApiTester<REMOTEBHV> {

    @SuppressWarnings("unchecked")
    default REMOTEBHV prepareRemoteBhv() {
        Class<?> clazz = GenericTypeUtil.getActualTypeClass(this.getClass(), RemoteApiTester.class, 0);
        Constructor<?> constructor = DfReflectionUtil.getConstructor(clazz, new Class<?>[] { RequestManager.class });
        REMOTEBHV bhv = (REMOTEBHV) DfReflectionUtil.newInstance(constructor, new Object[] { getRequestManager() });
        inject(bhv);

        return bhv;
    }

    // ===================================================================================
    //                                                     Override with RemoteApiTestCase
    //                                                     ===============================
    abstract BoundResult inject(Object bean);

    abstract RequestManager getRequestManager();
}
