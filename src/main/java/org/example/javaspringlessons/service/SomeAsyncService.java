package org.example.javaspringlessons.service;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.Listeners.entity.AsyncEvent;
import org.example.javaspringlessons.Listeners.entity.TypeOfEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeAsyncService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void someBusinessLogic(){
        applicationEventPublisher.publishEvent(new AsyncEvent(TypeOfEvent.IM_ASYNC_EVENT));
    }
}
