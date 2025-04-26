package org.example.javaspringlessons.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record TodoListDto (String name, List<String> events) {
}
