package org.example.javaspringlessons.Listeners;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.Listeners.entity.AsyncEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncListener {
    @SneakyThrows
    @EventListener
    @Async
    public void onApplicationEvent(AsyncEvent asyncEvent) {
        log.info("Init: {}", asyncEvent);
        Thread.sleep(5000);
        log.info("Complete: {}", asyncEvent);
    }
}
