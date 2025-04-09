package org.example.javaspringlessons;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Truck extends Car implements CarJob {
    @Autowired
    private Engine truckEngine;

    @Override
    public void doSomething() {
        log.info(truckEngine.getType() + " in truck");
    }
}