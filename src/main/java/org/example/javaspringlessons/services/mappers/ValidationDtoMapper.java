package org.example.javaspringlessons.services.mappers;

import org.example.javaspringlessons.dto.ResponseValidationDto;
import org.example.javaspringlessons.dto.ValidationDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
public interface ValidationDtoMapper {
    ResponseValidationDto toDto(ValidationDto validationDto);
}
