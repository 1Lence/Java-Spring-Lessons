package org.example.javaspringlessons.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


//Так же просто стало интересно как оно будет работать при наследовании абстрактного класса
public abstract class Car {
    @PostConstruct
    public void info(){
        System.out.println("Im alive: " + getClass().getName());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dead: " + getClass().getName());
    }
}
