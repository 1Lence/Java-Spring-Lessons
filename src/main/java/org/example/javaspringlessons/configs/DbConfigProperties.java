package org.example.javaspringlessons.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("app")
public class DbConfigProperties {
    private String name;
    private List<Integer> values;
}
