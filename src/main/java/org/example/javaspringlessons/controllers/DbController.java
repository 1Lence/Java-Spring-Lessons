package org.example.javaspringlessons.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.Service.Mapper;
import org.example.javaspringlessons.dto.Dto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DbController {
    private final Mapper mapper;

    @Value("${app.env-value}")
    private Object env;

    @GetMapping("/first")
    public Dto get(){
        log.info("Env is {} now", env);
        return mapper.getDto();
    }
}