package org.example.javaspringlessons.Listeners;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.Listeners.entity.CommonEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommonListener {
    @SneakyThrows
    @EventListener
    public void acceptEntity(CommonEvent commonEvent) {
        log.info("Init: {}", commonEvent);
        Thread.sleep(5000);
        log.info("Complete: {}", commonEvent);
    }
}
