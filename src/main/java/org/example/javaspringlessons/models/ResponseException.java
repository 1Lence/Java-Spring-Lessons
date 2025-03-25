package org.example.javaspringlessons.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseException {
    private String message;
    private String reason;
    private String details;
    private Date date = new Date();

    public ResponseException(String message, String reason, String details) {
        this.message = message;
        this.reason = reason;
        this.details = details;
    }
}
