package org.example.javaspringlessons.dto;

import org.example.javaspringlessons.validations.UserCorrectness;

@UserCorrectness
public record UserDto (String name, int age, String email, String password){}