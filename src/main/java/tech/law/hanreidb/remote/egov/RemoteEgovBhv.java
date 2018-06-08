/**
 * 
 */
package tech.law.hanreidb.remote.egov;

import java.io.IOException;
import java.io.StringReader;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dbflute.remoteapi.FlutyRemoteApiRule;
import org.dbflute.remoteapi.mapping.FlVacantMappingPolicy;
import org.lastaflute.core.json.JsonMappingOption;
import org.lastaflute.remoteapi.LastaRemoteBehavior;
import org.lastaflute.remoteapi.sender.body.LaJsonSender;
import org.lastaflute.remoteapi.sender.query.LaQuerySender;
import org.lastaflute.web.api.theme.FaicliUnifiedFailureResult;
import org.lastaflute.web.servlet.request.RequestManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.mylasta.direction.HanreidbConfig;
import tech.law.hanreidb.remote.receiver.StringReceiver;

/**
 * e-Gov法令検索のための基底クラス
 * @author h-funaki
 */
public class RemoteEgovBhv extends LastaRemoteBehavior {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private HanreidbConfig config;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // 法令名一覧取得 API http://elaws.e-gov.go.jp/api/{Version}/lawlists/{法令種別}
    // 法令取得 requestLawData() http://elaws.e-gov.go.jp/api/{Version}/lawdata/{法令番号}
    // 条文内容取得 API http://elaws.e-gov.go.jp/api/{Version}/articles;lawNum={法令番号};article={条};paragraph={項};appdxTable={別表}
    public RemoteEgovBhv(RequestManager requestManager) {
        super(requestManager);
    }

    // ===================================================================================
    //                                                                          Initialize
    //                                                                          ==========
    @Override
    protected void yourDefaultRule(FlutyRemoteApiRule rule) {
        rule.sendQueryBy(new LaQuerySender(new FlVacantMappingPolicy()));

        JsonMappingOption jsonMappingOption = new JsonMappingOption();
        rule.sendBodyBy(new LaJsonSender(requestManager, jsonMappingOption));
        rule.receiveBodyBy(new StringReceiver());

        rule.handleFailureResponseAs(FaicliUnifiedFailureResult.class);
    }

    @Override
    protected String getUrlBase() {
        return config.getRemoteApiBaseUrlEgov();
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public String requestRemoteLawDataXml(String lawNumber) {
        return replaceBackEscapeChars(doRequestGet(String.class, "lawdata", moreUrl(lawNumber), noQuery(), rule -> {}));
    }

    public String replaceBackEscapeChars(String string) {
        string = string.replaceAll("&apos;", "'");
        string = string.replaceAll("&quot;", "\"");
        string = string.replaceAll("&amp;", "&");
        string = string.replaceAll("&lt;", "<");
        string = string.replaceAll("&gt;", ">");
        return string;
    }

    //    public RemoteSearchPagingReturn<RemoteProductRowReturn> requestProductList(RemoteProductSearchParam param) {
    //        return doRequestPost(new ParameterizedRef<RemoteSearchPagingReturn<RemoteProductRowReturn>>() {
    //        }.getType(), "/lido/product/list", moreUrl(1), param, rule -> {});
    //    }

    // <Result>...</Result>

    // ===================================================================================
    //                                                                     Document Helper
    //                                                                     ===============
    // <DataRoot>
    // <Result>...</Result>
    // <ApplData>...</ApplData>
    // </DataRoot>
    /**
     * @param document (NotNull)
     * @return ルートタグであるDataRoot直下のResult要素 (NotNull)
     */
    public Element getResultElement(Document document) {
        Element root = document.getDocumentElement();
        Node applDataNode = root.getElementsByTagName("Result").item(0);
        return (Element) applDataNode;
    }

    /**
     * @param document (NotNull)
     * @return ルートタグであるDataRoot直下のApplData要素 (NotNull)
     */
    public Element getApplDataElement(Document document) {
        Element root = document.getDocumentElement();
        Node applDataNode = root.getElementsByTagName("ApplData").item(0);
        return (Element) applDataNode;
    }

    /**
     * @param uri (NotNull)
     * @return 指定したURIから取得したDocument (NotNull)
     */
    public Document createDocument(String uri) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(uri);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new HanreidbSystemException("DocumentLogic createDocument() Documentの生成に失敗");
        }
    }

    /**
     * @param stringReader (NotNull)
     * @return 指定したStringReaderから取得したDocument (NotNull)
     */
    public Document createDocument(StringReader stringReader) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(stringReader));
        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new HanreidbSystemException("DocumentLogic createDocument() Documentの生成に失敗");
        }
    }
}
