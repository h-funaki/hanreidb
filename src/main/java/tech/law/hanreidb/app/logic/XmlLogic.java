package tech.law.hanreidb.app.logic;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;

public class XmlLogic {

    /**
     * xmlオブジェクトをString化する 
     * @param xml xmlオブジェクト (NotNull)
     * @return xmlオブジェクトを表すString (NotNull)
     */
    public String toXmlString(Object xml) {
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(xml.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.marshal(xml, writer);
        } catch (JAXBException e) {
            throw new HanreidbSystemException("XMLのマーシャリングでエラーが発生しました", e);
        }
        return writer.toString();
    }
}
