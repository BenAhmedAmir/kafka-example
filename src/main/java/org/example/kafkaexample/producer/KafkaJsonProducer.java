package org.example.kafkaexample.producer;

import lombok.RequiredArgsConstructor;
import org.example.kafkaexample.payload.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void send(User user) {

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "topic1")
                .build();

        kafkaTemplate.send(message);
    }
}
