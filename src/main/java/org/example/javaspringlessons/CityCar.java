package org.example.javaspringlessons;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CityCar extends Car implements CarJob {
    private Engine cityCarEngine;

    @Autowired
    public void setEngine(Engine cityCarEngine) {
        this.cityCarEngine = cityCarEngine;
    }

    @Override
    public void doSomething() {
        log.info(cityCarEngine.getType() + " Inside City Car");
    }
}
