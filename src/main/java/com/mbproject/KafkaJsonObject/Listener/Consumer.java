package com.mbproject.KafkaJsonObject.Listener;

import com.mbproject.KafkaJsonObject.model.UserModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "mytopic4",groupId = "group_id2")
    public void consumeJson(UserModel userMsg){
        System.out.println("Kafka Consumer Json msg :- "+userMsg);
    }
}
