package org.example.javaspringlessons.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityCar extends Car implements CarJob {
    Engine cityCarEngine;

    @Autowired
    public void setEngine(Engine cityCarEngine) {
        this.cityCarEngine = cityCarEngine;
    }

    @Override
    public void doSomething() {
        System.out.println(cityCarEngine.getType() + " Inside City Car");
    }
}
