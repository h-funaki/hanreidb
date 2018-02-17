/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import javax.servlet.http.HttpServletRequest;

import org.lastaflute.core.json.JsonManager;
import org.lastaflute.core.time.TimeManager;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.web.response.result.ContentResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.NxResponseStatus;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;

/**
 * NSBO8とかで使っていた伝統的なテストを支援するクラス。<br>
 * もう、要らないかも...!? 様子見て削除していってもいいと思う。
 * @author jflute
 */
public class TraditionalTestSupporter {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(TraditionalTestSupporter.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TimeManager timeManager;
    protected final JsonManager jsonManager;
    protected final ApplicationVersion version;
    protected final HttpServletRequest request;
    protected final TestAssertDelegator delegator;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TraditionalTestSupporter(TimeManager timeManager, JsonManager jsonManager, ApplicationVersion version,
            HttpServletRequest request, TestAssertDelegator delegator) {
        this.timeManager = timeManager;
        this.jsonManager = jsonManager;
        this.version = version;
        this.request = request;
        this.delegator = delegator;
    }

    @FunctionalInterface
    public static interface TestAssertDelegator {

        void delegate_assertTrue(String msg, boolean condition);
    }

    // ===================================================================================
    //                                                                       Assert Result
    //                                                                       =============
    public <CONTENT extends ContentResult> void assertResultSuccess(JsonResponse<WholeResult<CONTENT>> response) {
        assertResultVarious(response, NxResponseStatus.SUCCESS.statusCode(), null, null);
    }

    public <CONTENT extends ContentResult> void assertResultSuccess(JsonResponse<WholeResult<CONTENT>> response, boolean hasCount) {
        assertResultVarious(response, NxResponseStatus.SUCCESS.statusCode(), null, hasCount ? 1 : 0);
    }

    public <CONTENT extends ContentResult> void assertResultFailure(JsonResponse<WholeResult<CONTENT>> response, String msgKeyword) {
        assertResultVarious(response, NxResponseStatus.SERVER_ERROR.statusCode(), msgKeyword, null);
    }

    public <CONTENT extends ContentResult> void assertResultVarious(JsonResponse<WholeResult<CONTENT>> response, Integer status,
            String msgKeyword, Integer count) {
        WholeResult<CONTENT> wholeBean = extractWholeResult(response);
        MetaResultPart result = wholeBean.result;
        delegate_assertEquals(version.getVersion(), result.version);
        delegate_assertEquals(status, result.status);
        String message = result.message;
        if (msgKeyword != null) {
            delegate_assertTrue(message.contains(msgKeyword));
        } else {
            delegate_assertNull(message); // JSONでは空文字になる (JSONICでの拡張により) by jflute (2014/12/14)
        }
        Integer resultCount = result.count;
        if (count != null) {
            // ページングの件数をピンポイントでテストすると、データ追加時の追従が大変なので、０件or単に存在だけをチェックする。
            // (件数はフレームワークが導いているので、ある程度目視で確認するくらいでいいかと)
            delegator.delegate_assertTrue("no result.count", resultCount != null);
            delegate_assertTrue(count == 0 ? resultCount.equals(0) : resultCount >= count);
        } else {
            delegate_assertNull(resultCount); // JSONでは空文字になる (Gsonでの拡張により) by jflute (2014/12/14)
        }
        // テストと同じトランザクション内であれば、getしてもトランザクション日時が戻ってくるはずなので
        delegate_assertNotNull(result.system_date);
        delegate_assertEquals(timeManager.currentHandyDate().toDisp("yyyyMMddHHmmss"), result.system_date);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void delegate_assertTrue(boolean condition) {
        delegator.delegate_assertTrue("expected true but false", condition);
    }

    protected void delegate_assertNull(Object actual) {
        delegator.delegate_assertTrue("expected null but not null: " + actual, actual == null);
    }

    protected void delegate_assertNotNull(Object actual) {
        delegator.delegate_assertTrue("expected not null but null.", actual != null);
    }

    protected void delegate_assertEquals(Object expected, Object actual) {
        delegate_assertNotNull(expected);
        delegate_assertNotNull(actual);
        delegator.delegate_assertTrue("expected: " + expected + " but was: " + actual, expected.equals(actual));
    }

    // ===================================================================================
    //                                                              JSON Response Handling
    //                                                              ======================
    public <BEAN> void showJson(JsonResponse<BEAN> response) {
        logger.debug(ln() + "[JSON DATA]" + ln() + toJson(response));
    }

    public <BEAN> String toJson(JsonResponse<BEAN> response) {
        delegate_assertNotNull(response);
        return jsonManager.toJson(response.getJsonBean());
    }

    public <CONTENT extends ContentResult> CONTENT extractContent(JsonResponse<WholeResult<CONTENT>> response) {
        return (CONTENT) extractWholeResult(response).content;
    }

    public <CONTENT extends ContentResult> WholeResult<CONTENT> extractWholeResult(JsonResponse<WholeResult<CONTENT>> response) {
        return (WholeResult<CONTENT>) response.getJsonBean();
    }

    protected String ln() {
        return "\n";
    }
}
