package org.example.javaspringlessons.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class CustomException extends ResponseStatusException {
    public CustomException(HttpStatusCode status, String reason) {
        super(status, reason);
    }
}
