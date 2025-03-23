package org.example.javaspringlessons.configs;

import org.example.javaspringlessons.models.Engine;
import org.example.javaspringlessons.models.SportCar;
import org.example.javaspringlessons.models.SportEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Engine sportEngine() {
        return new SportEngine();
    }

    @Bean
    public SportCar getSportCar(Engine sportEngine) {
        return new SportCar(sportEngine);
    }
}