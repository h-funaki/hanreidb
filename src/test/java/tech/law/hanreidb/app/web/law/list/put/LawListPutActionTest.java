package tech.law.hanreidb.app.web.law.list.put;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import net.sourceforge.plantuml.code.Transcoder;
import net.sourceforge.plantuml.code.TranscoderUtil;
import tech.law.hanreidb.unit.UnitHanreidbTestCase;

/**
 * @author h-funaki
 */
public class LawListPutActionTest extends UnitHanreidbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                               正常系
    //                                                                               =====
    public void test_正常に登録されている()
            throws MalformedURLException, XMLStreamException, IOException, SAXException, ParserConfigurationException {
        // ## Arrange ##
        LawListPutAction action = new LawListPutAction();
        inject(action);

        // ## Act ##
        // LawListPutContentResult result = action.index().getJsonResult();

        Transcoder t = TranscoderUtil.getDefaultTranscoder();
        String s = "Alice->Bob: hello1\nAlice->Bob: hello2\n";
        String url = t.encode(s);

        // ## Assert ##
        log(url);
    }
    // ===================================================================================
    //                                                                               異常系
    //                                                                               =====
}
