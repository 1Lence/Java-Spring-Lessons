package org.example.javaspringlessons.Service;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.configs.DbConfigProperties;
import org.example.javaspringlessons.dto.Dto;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Mapper {
    private final DbConfigProperties dbConfigProperties;

    public Dto getDto() {
        return Dto.builder().name(dbConfigProperties.getName())
                .someData(dbConfigProperties.getValues()).build();
    }
}
