package org.example.javaspringlessons.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record Dto(String name, List<Integer> someData) {

}
