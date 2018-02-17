/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.api.failure.climsg;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.util.Srl;
import org.lastaflute.core.json.JsonManager;
import org.lastaflute.web.api.ApiFailureResource;
import org.lastaflute.web.response.JsonResponse;

import tech.law.hanreidb.app.base.web.api.failure.climsg.ClientManagedMessageContentResult.ClientFailureErrorPart;
import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.status.BizResponseStatus;

/**
 * @author jflute
 * @author awaawa
 * @author mito
 */
public class ClientManagedMessageProcessor {

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // [Reference Site]
    // http://dbflute.seasar.org/ja/lastaflute/howto/impldesign/jsonfaicli.html
    // *not unified-failure pattern but client-managed message
    // _/_/_/_/_/_/_/_/_/_/

    public ContentResult createClientManagedMessageContent(ApiFailureResource resource, BizResponseStatus status) {
        // basically only validation error here, u-next has own status in common-header
        final List<ClientFailureErrorPart> errors = toErrors(resource, resource.getPropertyMessageMap());
        return new ClientManagedMessageContentResult(errors);
    }

    protected List<ClientFailureErrorPart> toErrors(ApiFailureResource resource, Map<String, List<String>> propertyMessageMap) {
        return propertyMessageMap.entrySet().stream().flatMap(entry -> {
            return toFailureErrorPart(resource, entry.getKey(), entry.getValue()).stream();
        }).collect(Collectors.toList());
    }

    protected List<ClientFailureErrorPart> toFailureErrorPart(ApiFailureResource resource, String field, List<String> messageList) {
        final String hybridDelimiter = "::"; // 共通ヘッダー方式では使わないのだが、バリデーション系のエラーメッセージは :: つきをデフォルトにしたいので。
        final String dataDelimiter = "|";
        return messageList.stream().map(message -> {
            final String clientManaged = Srl.substringLastFront(message, hybridDelimiter).trim(); // e.g.
            if (clientManaged.contains(dataDelimiter)) { // e.g. LENGTH | min:{min}, max:{max}
                return createJsonistaError(resource, field, clientManaged, dataDelimiter);
            } else { // e.g. REQUIRED
                return createSimpleError(field, clientManaged); // the clientManaged can be directly 'code'
            }
        }).collect(Collectors.toList());
    }

    // -----------------------------------------------------
    //                                        Jsonista Error
    //                                        --------------
    protected ClientFailureErrorPart createJsonistaError(ApiFailureResource resource, String field, String message, String delimiter) {
        final String code = Srl.substringFirstFront(message, delimiter).trim(); // e.g. LENGTH
        final String json = "{" + Srl.substringFirstRear(message, delimiter).trim() + "}"; // e.g. {min:{min}, max:{max}}
        final Map<String, Object> data = parseJsonistaData(resource, field, code, json);
        return new ClientFailureErrorPart(field, code, filterDataParserHeadache(data));
    }

    @SuppressWarnings("unchecked")
    protected Map<String, Object> parseJsonistaData(ApiFailureResource resource, String field, String code, String json) {
        try {
            final JsonManager jsonManager = resource.getRequestManager().getJsonManager();
            return jsonManager.fromJson(json, Map.class);
        } catch (RuntimeException e) {
            final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
            br.addNotice("Failed to parse client-managed message data.");
            br.addItem("Advice");
            br.addElement("Arrange your [app]_message.properties");
            br.addElement("for client-managed message way like this:");
            br.addElement("  constraints.Length.message = LENGTH | min:{min}, max:{max}");
            br.addElement("  constraints.Required.message = REQUIRED");
            br.addElement("  ...");
            br.addItem("Message List");
            br.addElement(resource.getMessageList());
            br.addItem("Target Field");
            br.addElement(field);
            br.addItem("Error Code");
            br.addElement(code);
            br.addItem("Data as JSON");
            br.addElement(json);
            final String msg = br.buildExceptionMessage();
            throw new ClientManagedMessageBrokenDataException(msg, e);
        }
    }

    public static class ClientManagedMessageBrokenDataException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ClientManagedMessageBrokenDataException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    protected Map<String, Object> filterDataParserHeadache(Map<String, Object> data) {
        if (data.isEmpty()) {
            return data;
        }
        final Map<String, Object> filteredMap = new LinkedHashMap<String, Object>(data.size());
        data.entrySet().stream().forEach(entry -> {
            Object value = entry.getValue();
            if (value instanceof Double) { // Gson already parses number as double in map
                final Double dble = (Double) value;
                if (Srl.rtrim(dble.toString(), "0").endsWith(".")) { // might be not decimal
                    value = dble.intValue();
                }
            }
            filteredMap.put(entry.getKey(), value);
        });
        return filteredMap;
    }

    // -----------------------------------------------------
    //                                          Simple Error
    //                                          ------------
    protected ClientFailureErrorPart createSimpleError(String field, String message) {
        return new ClientFailureErrorPart(field, message, Collections.emptyMap());
    }

    // -----------------------------------------------------
    //                                         JSON Response
    //                                         -------------
    protected JsonResponse<ClientManagedMessageContentResult> asJson(ClientManagedMessageContentResult result) {
        return new JsonResponse<ClientManagedMessageContentResult>(result);
    }
}
