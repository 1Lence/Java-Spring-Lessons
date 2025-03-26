package org.example.javaspringlessons.configs;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("app")
@RequiredArgsConstructor
public class DbConfigProperties {
    private String name;
    private List<Integer> values;
}
