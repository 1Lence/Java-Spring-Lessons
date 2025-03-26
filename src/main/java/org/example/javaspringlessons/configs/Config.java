package org.example.javaspringlessons.configs;

import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.models.EnvVarBean;
import org.example.javaspringlessons.models.OnlyForTests;
import org.example.javaspringlessons.models.OnlyIfTestBeanExist;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
@EnableConfigurationProperties(DbConfigProperties.class)
public class Config {

    @Bean
    @Profile("test")
    public OnlyForTests onlyForTests() {
        log.info("Creating only for tests bean");
        return new OnlyForTests();
    }

    @Bean
    @ConditionalOnBean(OnlyForTests.class)
    public OnlyIfTestBeanExist onlyIfTestBeanExist() {
        log.info("Creating only if test bean exist");
        return new OnlyIfTestBeanExist();
    }

    @Bean
    @ConditionalOnProperty(prefix = "app", value = "env-value", havingValue = "default")
    public EnvVarBean envVarBean() {
        log.info("Creating env var bean");
        return new EnvVarBean();
    }
}
