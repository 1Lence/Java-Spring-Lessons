package org.example.javaspringlessons.services.mappers;

import org.example.javaspringlessons.dto.ResponseUserDto;
import org.example.javaspringlessons.dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ResponseUserDto toResponseUserDto(UserDto user);
}