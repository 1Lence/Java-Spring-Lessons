package org.example.javaspringlessons.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SomeService {
    public String job(int count){
        log.info("== This is for of SomeService ==");
        return "У вас есть доступ к сервису, осталось попыток: " + count;
    }
}