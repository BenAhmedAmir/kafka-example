package org.example.kafkaexample.controller;

import lombok.RequiredArgsConstructor;
import org.example.kafkaexample.payload.User;
import org.example.kafkaexample.producer.KafkaJsonProducer;
import org.example.kafkaexample.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMsg(@RequestBody String msg) {
        kafkaProducer.send(msg);
        return ResponseEntity.ok("Message queued successfully !");
    }
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMsg(@RequestBody User msg) {
        kafkaJsonProducer.send(msg);
        return ResponseEntity.ok("JSON message queued successfully !");
    }
}
