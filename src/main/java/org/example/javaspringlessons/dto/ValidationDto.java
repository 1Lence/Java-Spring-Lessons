package org.example.javaspringlessons.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.example.javaspringlessons.validations.CustomEmailValid;
import org.example.javaspringlessons.validations.NotBlankOrNull;
import org.example.javaspringlessons.validations.PasswordCorrectness;

public record ValidationDto (@NotBlankOrNull String name,
                             @Min(0) @Max(100) int age,
                             @CustomEmailValid String email,
                             @PasswordCorrectness String password) {}