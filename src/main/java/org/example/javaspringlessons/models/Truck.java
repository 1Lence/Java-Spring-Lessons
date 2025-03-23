package org.example.javaspringlessons.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck extends Car implements CarJob {
    @Autowired
    Engine truckEngine;

    @Override
    public void doSomething() {
        System.out.println(truckEngine.getType() + " in truck");
    }
}