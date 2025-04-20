package org.example.javaspringlessons.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.dto.ResponseUserDto;
import org.example.javaspringlessons.dto.ResponseValidationDto;
import org.example.javaspringlessons.dto.UserDto;
import org.example.javaspringlessons.dto.ValidationDto;
import org.example.javaspringlessons.services.mappers.UserMapper;
import org.example.javaspringlessons.services.mappers.ValidationDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation")
@RequiredArgsConstructor
public class ValidationController {
    private final UserMapper userMapper;
    private final ValidationDtoMapper validationDtoMapper;

    @PostMapping("/forEachParamValid")
    public ResponseValidationDto post(@RequestBody @Valid ValidationDto validationDto) {
        return validationDtoMapper.toDto(validationDto);
    }

    @PostMapping("/fullUserValid")
    public ResponseUserDto post2(@RequestBody @Valid UserDto user) {
        return userMapper.toResponseUserDto(user);
    }



}
