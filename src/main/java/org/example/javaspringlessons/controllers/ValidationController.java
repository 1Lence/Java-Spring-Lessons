package org.example.javaspringlessons.controllers;

import jakarta.validation.Valid;
import org.example.javaspringlessons.dto.UserDto;
import org.example.javaspringlessons.dto.ValidationDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/valid")
public class ValidationController {

    @PostMapping("/1")
    public Optional<ValidationDto> post(@Valid @RequestBody ValidationDto validationDto) {
        return Optional.of(validationDto);
    }

    @PostMapping("/2")
    public Optional<UserDto> post2(@RequestBody @Validated UserDto user) {
        return Optional.of(user);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException e) {
        Map<String, String> errors = new HashMap<>();
        if (e.getBindingResult().getFieldErrors().isEmpty()) {
            var s = e.getMessage().split(";");
            errors.put(e.getObjectName(), s[s.length -1]);
        }
        e.getBindingResult().getFieldErrors().forEach(error -> {
            String field = error.getField();
            String message = error.getDefaultMessage();
            errors.put(field, message);
        });

        return errors;
    }
}
