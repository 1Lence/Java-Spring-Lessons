package org.example.javaspringlessons.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RequestDto {
    BigDecimal price;
    Info info;

    @Data
    public static class Info {
        String date;
    }
}
