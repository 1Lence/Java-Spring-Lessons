package org.example.javaspringlessons.controllers;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.dto.TodoListDto;
import org.example.javaspringlessons.services.MapperService;
import org.example.javaspringlessons.services.NewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/first")
@RequiredArgsConstructor
public class MyRestController {
    private final MapperService mapperService;


    @PostMapping
    public void save(@RequestBody TodoListDto todoListDto) {
        mapperService.fromDtoToEntity(todoListDto);
    }

    @GetMapping
    public List<TodoListDto> getAll(){
        return mapperService.fromEntityToDto();
    }
}
