package tech.law.hanreidb.remote.receiver;

import java.lang.reflect.Type;

import org.dbflute.optional.OptionalThing;
import org.dbflute.remoteapi.FlutyRemoteApiRule;
import org.dbflute.remoteapi.receiver.ResponseBodyReceiver;

public class StringReceiver implements ResponseBodyReceiver {

    @SuppressWarnings("unchecked")
    @Override
    public <RETURN> RETURN toResponseReturn(OptionalThing<String> body, Type type, FlutyRemoteApiRule rule) {
        final String target = body.orElseThrow(() -> {
            return new IllegalStateException("Not found the response body.");
        });
        return (RETURN) target;
    }
}
