package org.example.javaspringlessons.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@NotBlank(message = "поле не должно быть пустым")
@NotNull(message = "поле не должно быть пустым")
@Pattern(regexp = "^.{5,20}$", message = "Пароль должен содержать от 5 до 20 символов")
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
public @interface PasswordCorrectness {
    String message() default "Invalid password";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
