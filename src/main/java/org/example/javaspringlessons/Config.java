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
    public SportCar sportCar(Engine sportEngine) {
        return new SportCar(sportEngine);
    }
}
