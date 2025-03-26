package org.example.javaspringlessons.utils;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class ConnectionManager {
    //Знаю что такую конструкцию
    @Value("${app.db.url}")
    private String url;

    @PostConstruct
    public void loadDriver(){
        log.info("Loading JDBC driver by url: {}", url);
    }
}
