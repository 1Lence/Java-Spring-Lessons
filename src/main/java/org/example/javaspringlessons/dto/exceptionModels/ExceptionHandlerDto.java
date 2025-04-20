package org.example.javaspringlessons.dto.exceptionModels;

import java.util.List;

public record ExceptionHandlerDto (String code,
                                   String message,
                                   List<FieldsDto> fieldsDtoList) {
}
