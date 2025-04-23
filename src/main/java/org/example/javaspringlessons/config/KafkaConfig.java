package org.example.javaspringlessons.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.ssl.SslBundles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
@EnableKafka
@RequiredArgsConstructor
public class KafkaConfig {
    private final KafkaProperties kafkaProperties;
    private final ObjectMapper objectMapper;
    private final ObjectProvider<SslBundles> objectProvider;

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name("message.topic")
                .partitions(1)
                .replicas(1)
                .build();
    }

//    @Bean
//    public DefaultKafkaProducerFactoryCustomizer kafkaProducerFactoryCustomizer() {
//        return producer -> producer.setValueSerializer(new JsonSerializer<>(objectMapper));
//    }
}
