package org.example.javaspringlessons.models;

import org.springframework.beans.factory.annotation.Autowired;


public class SportCar extends Car implements CarJob {
    Engine sportEngine;

    @Autowired
    public SportCar(Engine sportEngine) {
        this.sportEngine = sportEngine;
    }

    @Override
    public void doSomething() {
        System.out.println(sportEngine.getType() + " in sport car");
    }
}
