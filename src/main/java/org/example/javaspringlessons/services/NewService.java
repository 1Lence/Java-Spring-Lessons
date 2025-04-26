package org.example.javaspringlessons.services;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.entity.TodoListEntity;
import org.example.javaspringlessons.repository.TodoListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewService {

    private final TodoListRepository todoListRepository;

    @Transactional
    public void saveEvent(TodoListEntity event) {
        todoListRepository.save(event);
    }

    @Transactional
    public List<TodoListEntity> getAll() {
        return todoListRepository.findAll();
    }
}
