package com.tiscon.validator;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PrefectureIDCheckValidator implements ConstraintValidator<PrefectureIDCheck, String> {
    @Override
    public void initialize(PrefectureIDCheck constraintAnnotation) {
    }

    /* (non-Javadoc)
     * @see javax.validation.ConstraintValidator#isValid(java.lang.Object, javax.validation.ConstraintValidatorContext)
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (ObjectUtils.isEmpty(s)) {
            return true;
        }
        return s.matches("(0[1-9] | 1[0-9] | 2[0-9] | 3[0-9] | 4[0-7])");
    }
}
