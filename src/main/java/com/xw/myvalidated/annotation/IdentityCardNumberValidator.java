package com.xw.myvalidated.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

public class IdentityCardNumberValidator implements ConstraintValidator<IdentityCardNumber, Object> {

    private static final String Identity_18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{4}$";
    private static final String Identity_15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";


    @Override
    public void initialize(IdentityCardNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        //不填写则直接返回
        if (Objects.isNull(o)) {
            return true;
        }
        return validate(o.toString());
    }

    private static boolean validate(String identity) {
        if (Pattern.matches(Identity_18, identity) || Pattern.matches(Identity_15, identity)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String id = "362301199106245342";
        boolean isOk = IdentityCardNumberValidator.validate(id);
        System.out.println(isOk);
    }




}
