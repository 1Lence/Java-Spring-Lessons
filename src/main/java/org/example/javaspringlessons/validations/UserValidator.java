package org.example.javaspringlessons.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Valid;
import org.example.javaspringlessons.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.springframework.util.StringUtils.hasText;

@Component
public class UserValidator implements ConstraintValidator<UserCorrectness, UserDto> {
    @Override
    public boolean isValid(UserDto userDto, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile("^.{5,20}$");
        Matcher matcher = pattern.matcher(userDto.getPassword());
        return hasText(userDto.getEmail()) && hasText(userDto.getName()) && matcher.matches() && userDto.getEmail().endsWith("@gmail.com");
    }
}
