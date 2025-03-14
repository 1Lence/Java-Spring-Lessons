package org.example.javaspringlessons;

//import org.example.javaspringlessons.configs.Config;
import org.example.javaspringlessons.configs.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


//@Import(Config.class)
//Просто стало интересно как работать в конфигурацией
@SpringBootApplication
@Import(Config.class)
public class JavaSpringLessonsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaSpringLessonsApplication.class, args);
    }
}