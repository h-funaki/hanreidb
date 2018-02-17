/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Size;

import org.eclipse.collections.api.list.ImmutableList;

/**
 * @author jflute
 */
public class SizeValidatorForImmutableList implements ConstraintValidator<Size, ImmutableList<?>> {

    protected int min;
    protected int max;

    @Override
    public void initialize(Size constraintAnnotation) {
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(ImmutableList<?> value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        int size = value.size();
        return size >= min && size <= max;
    }
}
