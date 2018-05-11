package tech.law.hanreidb.app.web.judgement.get;

import java.net.URL;
import java.net.URLConnection;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class JudgementGetTestAction extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に登録されている() {
        // ## Arrange ##
        JudgementGetAction action = new JudgementGetAction();
        inject(action);

        // ## Act ##

        // ## Assert ##

    }

    public void test_aa() throws Exception {
        // ## Arrange ##
        XMLInputFactory xmlif = XMLInputFactory.newInstance();

        URLConnection con = new URL("http://weather.livedoor.com/forecast/webservice/rest/v1?city=70&day=tomorrow").openConnection();
        //                Reader r = new InputStreamReader(con.getInputStream(), "UTF-8");
        XMLStreamReader xmlr = xmlif.createXMLStreamReader(con.getInputStream());
        //xmlr.
        //        new XMLStreamReader().run(r);
        //
        //        final StreamFilter filter = new StreamFilter() {
        //            @Override
        //            public boolean accept(XMLStreamReader reader) {
        //                return reader.isStartElement() || reader.isEndElement();
        //            }
        //        };
        //        XMLInputFactory factory = XMLInputFactory.newInstance();
        //        XMLStreamReader reader = factory.createFilteredReader(factory.createXMLStreamReader(r), filter);

        xmlr.close();

        // ## Act ##

        // ## Assert ##
    }
    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
}
