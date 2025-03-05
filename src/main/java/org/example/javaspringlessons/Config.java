package org.example.javaspringlessons;

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
