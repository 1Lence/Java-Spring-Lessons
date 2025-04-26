package org.example.javaspringlessons.services;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.dto.TodoListDto;
import org.example.javaspringlessons.entity.EventEntity;
import org.example.javaspringlessons.entity.TodoListEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MapperService {
    private final NewService newService;

    public void fromDtoToEntity(TodoListDto eventDto){
        TodoListEntity todoList = TodoListEntity.builder()
                .name(eventDto.name())
                .build();

        List<EventEntity> eventList = eventDto.events()
                .stream()
                .map(event -> {
                    return EventEntity.builder()
                            .eventName(event)
                            .todoList(todoList)
                            .build();
                }).toList();

        todoList.setEvents(eventList);
        newService.saveEvent(todoList);
    }

    public List<TodoListDto> fromEntityToDto(){
        var obj = newService.getAll();
        return obj.stream()
                .map(entity -> TodoListDto.builder()
                        .name(entity.getName())
                        .events(entity.getEvents().stream().map(EventEntity::getEventName).toList())
                        .build())
                .toList();
    }
}
