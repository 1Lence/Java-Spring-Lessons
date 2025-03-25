package org.example.javaspringlessons.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ResponseDto {
    BigDecimal price;
    Info info;

    @Data
    public static class Info {
        String id = UUID.randomUUID().toString();
        String date;
    }
}
