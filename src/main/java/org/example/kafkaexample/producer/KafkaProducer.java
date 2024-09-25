package org.example.kafkaexample.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("send message to TOPIC1 :: {}", message);
        kafkaTemplate.send("topic1",message);
    }
}
