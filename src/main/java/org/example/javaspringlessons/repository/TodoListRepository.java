package org.example.javaspringlessons.repository;

import jdk.jfr.Event;
import org.example.javaspringlessons.entity.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoListEntity, Integer> {
}
