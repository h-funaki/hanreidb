package tech.law.hanreidb.app.web.law.list.put;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isNotBlank;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.apache.commons.lang3.RandomStringUtils;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.app.logic.CodeCreateLogic;
import tech.law.hanreidb.app.logic.FormatLogic;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exentity.Law;
import tech.law.hanreidb.remote.egov.RemoteEgovBhv;

/**
 * @author h-funaki
 */
@AllowAnyoneAccess
public class LawListPutAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(LawListPutAction.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawBhv lawBhv;
    @Resource
    private FormatLogic formatLogic;
    @Resource
    private CodeCreateLogic codeCreateLogic;
    @Resource
    private RemoteEgovBhv remoteEgovBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LawListPutContentResult> index()
            throws XMLStreamException, MalformedURLException, IOException, SAXException, ParserConfigurationException {
        Document document =
                remoteEgovBhv.createDocument("/Users/h-funaki/Documents/hanreidb/dbflute_hanreidb/playsql/data/ut/xml/lawlist.xml");
        Element applData = remoteEgovBhv.getApplDataElement(document);
        NodeList lawInfoNodeList = applData.getElementsByTagName("LawNameListInfo");

        List<Law> lawList = newArrayList();

        for (int j = 0; j < lawInfoNodeList.getLength(); j++) {
            Node lawInfoNode = lawInfoNodeList.item(j);
            if (lawInfoNode.getNodeType() == Node.ELEMENT_NODE) {
                NodeList noNameProNodeList = lawInfoNode.getChildNodes();
                Law law = new Law();
                String lawNo = "";
                // 法令名、法令番号、公布日のリスト
                for (int k = 0; k < noNameProNodeList.getLength(); k++) {
                    Node item = noNameProNodeList.item(k);
                    if (item.getNodeType() == Node.ELEMENT_NODE) {
                        if (item.getNodeName().equals("LawName")) {
                            law.setLawName(formatLogic.trimPrefixSpaces(item.getTextContent()));
                        } else if (item.getNodeName().equals("LawNo")) {
                            lawNo = formatLogic.trimPrefixSpaces(item.getTextContent());
                            law.setLawNumber(lawNo);
                        } else if (item.getNodeName().equals("PromulgationDate")) {
                            law.setPromulgationDate(formatLogic.format8CharsToLocalDate(item.getTextContent()));
                        } else {
                            throw new HanreidbSystemException("LawName, LawNo, PromulgationDate 以外のタグ:" + item.getNodeName());
                        }
                    }
                }
                law.setLawPublicCode(codeCreateLogic.createLawPublicCode());
                if (lawNo.contains("憲法")) {
                    law.setLawTypeCode("CONSTITUTION");
                } else if (lawNo.contains("法律")) {
                    law.setLawTypeCode("ACT");
                } else if (lawNo.contains("政令")) {
                    law.setLawTypeCode("CABINET");
                } else if (lawNo.contains("太政官布告")) {
                    law.setLawTypeCode("DAJOKANFUKOKU");
                } else if (lawNo.contains("太政官達")) {
                    law.setLawTypeCode("DAJOKANTASSHI");
                } else if (lawNo.contains("勅令")) {
                    law.setLawTypeCode("IMPERIAL");
                } else if (lawNo.contains("府令")) {
                    law.setLawTypeCode("CABINETOFFICE");
                } else if (lawNo.contains("省令") || (lawNo.contains("省") && lawNo.contains("令"))) {
                    law.setLawTypeCode("MINISTRY");
                } else if (lawNo.contains("内閣官房令")) {
                    law.setLawTypeCode("CABINETSECRETARIAT");
                } else if (lawNo.contains("庁令")) {
                    law.setLawTypeCode("OFFICE");
                } else if (lawNo.contains("閣令")) {
                    law.setLawTypeCode("RULE");
                } else if (lawNo.contains("規則")) {
                    law.setLawTypeCode("MISC");
                }
                if (isNotBlank(law.getLawTypeCode())) {
                    lawList.add(law);
                }
            }
        }

        logger.debug("{}", lawList.size());

        for (Law law : lawList) {
            if (isBlank(law.getLawPublicCode()) || isBlank(law.getLawName()) || isBlank(law.getLawNumber()) || isBlank(law.getLawTypeCode())
                    || law.getPromulgationDate() == null) {
                logger.debug("publicCode:{}, lawName:{}, lawNo:{}, lawType:{}, proDate:{]", //
                        law.getLawPublicCode(), law.getLawName(), law.getLawNumber(), law.getLawTypeCode(), law.getPromulgationDate());
                return asJson(mappingToContent(1, 2, 3, 4));
            }
        }

        lawBhv.batchInsert(lawList);

        return asJson(mappingToContent(8196, lawList.size(), 0, 0));
    }

    // XML
    // <DataRoot>
    //   <Result>関係ないタグ</Result>
    //   <ApplData>
    //     <Category>関係ないタグ</Category>
    //     <LawNameListInfo>
    //       <LawName>明治五年太政官布告第三百三十七号（改暦ノ布告）</LawName>
    //       <LawNo>明治五年太政官布告第三百三十七号</LawNo>
    //       <PromulgationDate>18721109</PromulgationDate>
    //     </LawNameListInfo>
    //     <LawNameListInfo>このタグがいっぱい
    //     </LawNameListInfo>
    //   </ApplData>
    // </DataRoot>

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private LawListPutContentResult mappingToContent(int planned, int successed, int skipped, int errored) {
        LawListPutContentResult content = new LawListPutContentResult();
        content.planned = planned;
        content.successed = successed;
        content.skipped = skipped;
        content.errored = errored;
        logger.info("planned:{}, successed:{}, skipped:{}, errored:{}", planned, successed, skipped, errored);
        return content;
    }

    // ===================================================================================
    //                                                                        Assist Logic
    //                                                                        ============
    // TODO h-funaki JIDと共通化する (2018/05/07)
    protected String makeNextPublicCode() {
        return "LID" + RandomStringUtils.random(3, "ABCDEFGHIJKLMNOPQRSTUVWXYZ") + RandomStringUtils.random(6, "0123456789");
    }
}
