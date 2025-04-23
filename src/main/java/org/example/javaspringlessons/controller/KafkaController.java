package org.example.javaspringlessons.controller;

import lombok.RequiredArgsConstructor;
import org.example.javaspringlessons.dto.MessageDto;
import org.example.javaspringlessons.service.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @PostMapping
    public String get(@RequestBody MessageDto messageDto) {
        return "Message sent" + kafkaProducer.send(messageDto);
    }
}