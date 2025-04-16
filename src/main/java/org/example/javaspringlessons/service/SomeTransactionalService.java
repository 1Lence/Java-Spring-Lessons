package org.example.javaspringlessons.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.Listeners.entity.TransactionalEventCommit;
import org.example.javaspringlessons.Listeners.entity.TypeOfEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SomeTransactionalService {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void firstTransact() {
        applicationEventPublisher.publishEvent(new TransactionalEventCommit(TypeOfEvent.IM_TRANSACTIONAL_EVENT));
    }


    @Transactional
    public void secondTransact() {
        try {
            if (true) {
                throw new RuntimeException();
            }
            applicationEventPublisher.publishEvent(new TransactionalEventCommit(TypeOfEvent.IM_TRANSACTIONAL_EVENT));

        } catch (Exception e) {
            log.error("Транзакция не удалась", e);
            throw e;
        }
    }
}
