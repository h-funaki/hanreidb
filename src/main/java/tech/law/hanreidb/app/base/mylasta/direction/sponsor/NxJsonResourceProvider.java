/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.mylasta.direction.sponsor;

import org.lastaflute.core.json.JsonMappingOption;
import org.lastaflute.core.json.JsonResourceProvider;

import tech.law.hanreidb.app.base.core.communication.CommunicationTypeConversionRule;
import tech.law.hanreidb.app.base.core.communication.StandardCommunicationTypeConversionRule;

/**
 * LastaFluteのJsonResourceProviderのU-NEXT実装。<br>
 * アプリのJsonResourceProviderはこれを必ず継承すること。
 * @author mito
 * @author jflute
 */
public class NxJsonResourceProvider implements JsonResourceProvider {

    @Override
    public JsonMappingOption provideMappingOption() { // U-NEXTで必ず使う基本的なオプションのため
        return createConversionRule().prepareJsonMappingOption(); // Eclipse Collections など
    }

    protected CommunicationTypeConversionRule createConversionRule() { // 伝統的なAPIならオーバーライドするべし
        return new StandardCommunicationTypeConversionRule();
    }
}
