package org.example.kafkaexample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.example.kafkaexample.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "topic1",groupId = "myGroup")
//    public void consume(String msg) {
//
//      log.info("Consume from Topic1 :: {} " ,msg);
//
//    }
    @KafkaListener(topics = "topic1",groupId = "myGroup")
    public void consumeJson(User user) {

      log.info("Consume from Topic1 :: {} " ,user.toString());

    }
}
