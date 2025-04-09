package org.example.javaspringlessons;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;


//Так же просто стало интересно как оно будет работать при наследовании абстрактного класса
@Slf4j
public abstract class Car {
    @PostConstruct
    public void info(){
        log.info("Im alive: " + getClass().getName());
    }

    @PreDestroy
    public void destroy(){
        log.info("Dead: " + getClass().getName());
    }
}
