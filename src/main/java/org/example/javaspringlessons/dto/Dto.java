package org.example.javaspringlessons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Dto {
    private String name;
    private List<Integer> someData;
}
