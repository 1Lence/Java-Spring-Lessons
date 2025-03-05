package org.example.javaspringlessons;

import org.springframework.stereotype.Component;

@Component
public class CityCarEngine implements Engine{
    @Override
    public String getType() {
        return "this is a city car engine";
    }
}
