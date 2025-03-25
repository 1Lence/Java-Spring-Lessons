package org.example.javaspringlessons.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.example.javaspringlessons.validations.CustomEmailValid;
import org.example.javaspringlessons.validations.NotBlankOrNull;
import org.example.javaspringlessons.validations.PasswordCorrectness;

@Data
public class ValidationDto {
    //Объедененная кастомная валидация
    @NotBlankOrNull
    private String name;
    @Min(0)
    @Max(100)
    private int age;
    //Просто кастомная валидация
    @CustomEmailValid
    private String email;
    @PasswordCorrectness
    private String password;
}
