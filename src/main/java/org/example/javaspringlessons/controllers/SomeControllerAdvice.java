package org.example.javaspringlessons.controllers;

import org.example.javaspringlessons.dto.exceptionModels.ExceptionHandlerDto;
import org.example.javaspringlessons.dto.exceptionModels.FieldsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class SomeControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionHandlerDto> handleValidationException(MethodArgumentNotValidException e) {
        String code = "VALIDATION_ERROR";
        String message = "Validation failed";

        List<FieldsDto> fields = e.getBindingResult().getFieldErrors().stream()
                .map(error -> new FieldsDto(
                        error.getField(),
                        error.getDefaultMessage(),
                        error.getRejectedValue() != null ? error.getRejectedValue().toString() : null
                ))
                .collect(Collectors.toList());
        if (fields.isEmpty() && !e.getBindingResult().getGlobalErrors().isEmpty()) {
            message = e.getBindingResult().getGlobalErrors().get(0).getDefaultMessage();
        }

        ExceptionHandlerDto response = new ExceptionHandlerDto(code, message, fields);
        return ResponseEntity.badRequest().body(response);
    }
}