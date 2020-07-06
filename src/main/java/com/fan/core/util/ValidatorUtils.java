package com.fan.core.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
@Slf4j
public class ValidatorUtils {
    @Autowired(required = false)
    Validator validator;

    public <T>String validateObject(T t) {
        String msg = "";
        Set<ConstraintViolation<T>> violationSet = validator.validate(t);
        for (ConstraintViolation<T> model : violationSet) {

            if (StringUtils.isNotBlank(model.getMessage())){
                msg = I18nUtils.getMessageByI18FullCode(model.getMessage());
                break;
            }
        }
        return msg;
    }

}
