package org.example.javaspringlessons;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.List;

@SpringBootApplication
//Просто стало интересно как работать в конфигурацией
@Import(Config.class)
public class JavaSpringLessonsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaSpringLessonsApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(List<CarJob> carJobs) {
        return args -> {
            carJobs.forEach(CarJob::doSomething);
        };
    }
}
