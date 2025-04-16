package org.example.javaspringlessons.service;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.Listeners.entity.TypeOfEvent;
import org.example.javaspringlessons.Listeners.entity.CommonEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeCommonService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void someBusinessLogic(){
        applicationEventPublisher.publishEvent(new CommonEvent(TypeOfEvent.IM_NORMAL_EVENT));
    }
}
