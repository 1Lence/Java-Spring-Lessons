package org.example.javaspringlessons.dto;

public record ResponseValidationDto (String name,
                                     int age,
                                     String email,
                                     String password) {
}
