/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.validator;

import javax.validation.valueextraction.ExtractedValue;
import javax.validation.valueextraction.ValueExtractor;

import org.eclipse.collections.api.list.ImmutableList;

/**
 * Extension to avoid "sea[].land", to be "sea[0].land" since Hibernate Validator-6.0.x.
 * @author jflute
 */
public class ValueExtractorForImmutableList implements ValueExtractor<ImmutableList<@ExtractedValue ?>> {

    @Override
    public void extractValues(ImmutableList<@ExtractedValue ?> originalValue, ValueReceiver receiver) {
        for (int i = 0; i < originalValue.size(); i++) {
            receiver.indexedValue("<immutablelist element>", i, originalValue.get(i));
        }
    }
}