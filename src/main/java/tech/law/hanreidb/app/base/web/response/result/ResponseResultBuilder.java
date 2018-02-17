/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.response.result;

import org.lastaflute.core.time.TimeManager;

import tech.law.hanreidb.app.base.util.MyAssertUtil;
import tech.law.hanreidb.app.base.web.response.result.WholeResult.MetaResultPart;
import tech.law.hanreidb.app.base.web.response.status.BizResponseStatus;
import tech.law.hanreidb.app.base.web.version.ApplicationVersion;

/**
 * @author jflute
 */
public class ResponseResultBuilder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TimeManager timeManager;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ResponseResultBuilder(TimeManager timeManager) {
        this.timeManager = timeManager;
    }

    // ===================================================================================
    //                                                                              Result
    //                                                                              ======
    /**
     * result要素のWebBeanを最低限の情報を付与して生成する。
     * @param appVersion リクエストされたアプリバージョン (NotNull: unknown allowed)
     * @param status レスポンスのステータス (NotNull)
     * @param message レスポンスに載っけるメッセージ (NullAllowed)
     * @param count 処理結果の件数 (NullAllowed: ページングとか更新じゃないとき)
     * @return 生成されたWebBean (NotNull)
     */
    public MetaResultPart createResultPart(ApplicationVersion appVersion, BizResponseStatus status, String message, Integer count) {
        MyAssertUtil.assertNotNull("appVersion", appVersion);
        MyAssertUtil.assertNotNull("status", status);
        final MetaResultPart bean = newResultPart();
        bean.version = filterVersion(appVersion);
        bean.status = filterStatus(status);
        bean.count = filterCount(count);
        bean.message = filterMessage(message);
        bean.system_date = getResponseSystemDate();
        return bean;
    }

    protected String filterVersion(ApplicationVersion appVersion) {
        return appVersion.getVersion();
    }

    protected int filterStatus(BizResponseStatus status) {
        return status.statusCode();
    }

    // _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    // CMS全体としてnullはフロントに戻さないポリシーあり
    // ただ、JSONICの拡張でフィルタリングしているのでここではやる必要なし
    // 詳しくは AssistantDirector にて by jflute (2014/12/14)
    // _/_/_/_/_/_/_/_/_/_/
    protected Integer filterCount(Integer count) {
        return count;
    }

    protected String filterMessage(String message) {
        return message;
    }

    /**
     * result要素のJsonPartを生成する。
     * @return 生成されたJsonPart (NotNull)
     */
    protected MetaResultPart newResultPart() {
        return new MetaResultPart();
    }

    /**
     * レスポンス用のシステム日付 (決められた文字列形式) を戻す。
     * @return システム日付を表現する文字列 (NotNull)
     */
    protected String getResponseSystemDate() {
        return timeManager.currentHandyDate().toDisp("yyyyMMddHHmmss"); // e.g. 20141203100000
    }

    // ===================================================================================
    //                                                                               Whole
    //                                                                               =====
    /**
     * すべての要素を含むJsonResultを最低限の情報を付与して生成する。
     * @param result result要素のJsonPart (NotNull)
     * @param content content要素のJsonResult (NotNull)
     * @return 生成されたJsonResult (NotNull)
     */
    public <CONTENT extends ContentResult> WholeResult<CONTENT> createWholeResult(MetaResultPart result, CONTENT content) {
        MyAssertUtil.assertNotNull("result", result);
        MyAssertUtil.assertNotNull("content", content);
        final WholeResult<CONTENT> bean = newWholeResult();
        bean.result = result;
        bean.content = content;
        return bean;
    }

    /**
     * すべての要素を含むのJsonResultを生成する。
     * @return 生成されたJsonResult (NotNull)
     */
    protected <CONTENT extends ContentResult> WholeResult<CONTENT> newWholeResult() {
        return new WholeResult<CONTENT>();
    }
}
