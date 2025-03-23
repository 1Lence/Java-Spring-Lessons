package org.example.javaspringlessons.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.javaspringlessons.dto.ValidationDto;
import org.springframework.stereotype.Component;

@Component
public class CustomEmailValidator implements ConstraintValidator<CustomEmailValid, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && !s.isEmpty() && s.endsWith("@gmail.com");
    }
}
