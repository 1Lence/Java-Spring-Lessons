package org.example.javaspringlessons.dto.exceptionModels;

public record FieldsDto (String field,
                         String fieldMessage,
                         String rejectedValue) {
}
