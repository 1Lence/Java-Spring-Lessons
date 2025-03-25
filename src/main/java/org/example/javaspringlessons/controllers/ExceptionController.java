package org.example.javaspringlessons.controllers;

import org.example.javaspringlessons.exceptions.CustomException;
import org.example.javaspringlessons.models.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseException> handleCustomException(CustomException e) {
        var respException = new ResponseException(e.getMessage(), e.getReason(), e.getDetailMessageCode());
        return new ResponseEntity<>(respException, HttpStatus.BAD_GATEWAY);
    }
}
