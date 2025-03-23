package org.example.javaspringlessons.models;

import org.springframework.stereotype.Component;

@Component
public class TruckEngine implements Engine {
    @Override
    public String getType() {
        return "this is a truck engine";
    }
}
