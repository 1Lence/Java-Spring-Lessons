package org.example.javaspringlessons;

import org.springframework.stereotype.Component;

public class SportEngine implements Engine{
    @Override
    public String getType() {
        return "this is a sport engine";
    }
}
