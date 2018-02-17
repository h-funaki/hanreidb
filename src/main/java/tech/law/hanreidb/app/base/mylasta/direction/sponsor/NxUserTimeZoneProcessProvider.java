/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mylasta.direction.sponsor;

import java.util.TimeZone;

import org.dbflute.optional.OptionalObject;
import org.dbflute.optional.OptionalThing;
import org.dbflute.util.DfTypeUtil;
import org.lastaflute.web.ruts.process.ActionRuntime;
import org.lastaflute.web.servlet.request.RequestManager;
import org.lastaflute.web.servlet.request.UserTimeZoneProcessProvider;

/**
 * LastaFluteのUserTimeZoneProcessProviderのU-NEXT実装。<br>
 * アプリのUserTimeZoneProcessProviderはこれを必ず継承すること。
 * @author awane
 */
public class NxUserTimeZoneProcessProvider implements UserTimeZoneProcessProvider {

    public static final TimeZone centralTimeZone = TimeZone.getDefault();

    @Override
    public boolean isUseTimeZoneHandling() {
        return false;
    }

    @Override
    public boolean isAcceptCookieTimeZone() {
        return false;
    }

    @Override
    public OptionalThing<TimeZone> findBusinessTimeZone(ActionRuntime runtimeMeta, RequestManager requestManager) {
        return OptionalObject.empty();
    }

    @Override
    public TimeZone getRequestedTimeZone(RequestManager requestManager) { // not null
        return centralTimeZone; // you can change it if you like
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this));
        sb.append(":{useTimeZoneHandling=").append(isUseTimeZoneHandling());
        sb.append(", acceptCookieTimeZone=").append(isAcceptCookieTimeZone());
        sb.append("}@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
}
