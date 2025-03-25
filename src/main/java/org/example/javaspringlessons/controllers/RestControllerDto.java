package org.example.javaspringlessons.controllers;

import lombok.AllArgsConstructor;
import org.example.javaspringlessons.exceptions.CustomException;
import org.example.javaspringlessons.dto.RequestDto;
import org.example.javaspringlessons.dto.ResponseDto;
import org.example.javaspringlessons.services.ServiceDtoConv;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/JsonConv")
public class RestControllerDto {

    ServiceDtoConv serviceDtoConv;

    @GetMapping
    public void getException() {
        throw new CustomException(HttpStatus.SERVICE_UNAVAILABLE ,"Something went wrong");
    }

    @PostMapping
    public ResponseDto getDto(@RequestBody RequestDto requestDto) {
        return serviceDtoConv.getDto(requestDto);
    }
}