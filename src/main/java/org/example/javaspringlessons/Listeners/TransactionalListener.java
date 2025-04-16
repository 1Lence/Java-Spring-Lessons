package org.example.javaspringlessons.Listeners;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.Listeners.entity.TransactionalEventCommit;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@RequiredArgsConstructor
@Slf4j
public class TransactionalListener {
    @TransactionalEventListener
    public void successUpdate(TransactionalEventCommit transactionalEventCommit) {
        log.info("Transactional init : {}", transactionalEventCommit);
    }
}
