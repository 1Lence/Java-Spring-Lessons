package org.example.javaspringlessons.dto;

import lombok.Data;
import org.example.javaspringlessons.validations.UserCorrectness;

@Data
@UserCorrectness
public class UserDto {
    private String name;
    private int age;
    private String email;
    private String password;
}
