package org.example.javaspringlessons;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@RequiredArgsConstructor
public class SportCar extends Car implements CarJob {
    private final Engine sportEngine;

    @Override
    public void doSomething() {
        log.info(sportEngine.getType() + " in sport car");
    }
}
