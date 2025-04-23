package org.example.javaspringlessons.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.javaspringlessons.dto.MessageDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, MessageDto> kafkaTemplate;

    public CompletableFuture<String> send(MessageDto messageDto) {
        String uuid = UUID.randomUUID().toString();
        CompletableFuture<SendResult<String, MessageDto>> future =
                kafkaTemplate.send("message.topic", messageDto);

        return future.handle((result, throwable) -> {
            if (throwable != null) {
                log.error("Не удалось отправить сообщение {}", throwable.getMessage());
                throw new RuntimeException("Не удалось отправить сообщение в кафку", throwable);
            } else {
                log.info("Сообщение успешно отправлено {}", result.getRecordMetadata());
                return uuid;
            }
        });
    }
}
//Представим что здесь есть обработка ошибок, какая нибудь запись в бд, а айди не генерится, а берется из бд