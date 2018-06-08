package tech.law.hanreidb.remote.egov;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author h-funaki
 */
public class RemoteEgovLawListResponse {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========

    public String xml;

    public RemoteEgovLawListResponse(RemoteEgovLawListXmlResponse response) {
        // JAXB.unmarshal(xmlLogic.toXmlString(response), RemoteEgovLawListXmlResponse.class);
        // return JAXB.unmarshal(new StringReader(xmlLogic.toXmlString(response)), RemoteEgovLawListXmlResponse.class);
    }

    /**
     * e-gov法令検索
     * @author h-funaki
     */
    @XmlRootElement(name = "DataRoot")
    public static class RemoteEgovLawListXmlResponse {
        // こんなXMLを作成する。
        // <DataRoot>
        // <Result>...</Result>
        // <ApplData>
        //   <LawNum>平成二十六年法律第五十号</LawNum>
        //   <LawFullText>
        //     <Law Era="Heisei" Lang="ja" LawType="Act" Num="50" Year="26">
        //       <LawNum>平成二十六年法律第五十号</LawNum>
        //        <LawBody>
        //          <LawTitle>難病の患者に対する医療等に関する法律</LawTitle>
        //          <TOC>
        //            <TOCLabel>目次</TOCLabel>
        //            <TOCChapter Delete="false" Num="1">
        //              <ChapterTitle>第一章　総則</ChapterTitle>
        //              <ArticleRange>（第一条―第三条）</ArticleRange>
        //            </TOCChapter>
        //            <TOCChapter Delete="false" Num="2">...</TOCChapter>
        //            <TOCChapter Delete="false" Num="3">
        //              <ChapterTitle>第三章　医療</ChapterTitle>
        //              <TOCSection Delete="false" Num="1">
        //                <SectionTitle>第一節　特定医療費の支給</SectionTitle>
        //                <ArticleRange>（第五条―第十三条）</ArticleRange>
        //              </TOCSection>
        //              <TOCSection Delete="false" Num="2">...</TOCSection>
        //            </TOCChapter>
        //            <TOCSupplProvision>
        //              <SupplProvisionLabel>附則</SupplProvisionLabel>
        //            </TOCSupplProvision>
        //          </TOC>
        //          <MainProvision>
        //            <Chapter Delete="false" Hide="false" Num="1">
        //              <ChapterTitle>第一章　総則</ChapterTitle>

        // </ApplData>

        //        @XmlElement(name = "res_result")
        //        public String getResResult() {
        //            return resResult;
        //        }
    }
}
