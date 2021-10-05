package com.mbproject.KafkaJsonObject.Config;

import com.mbproject.KafkaJsonObject.model.UserModel;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Service
public class Producer {

    private static final String TOPIC = "mytopic4";

    @Autowired
    private KafkaTemplate<String, UserModel> kafkaTemplate;

    public void sendMessage(UserModel userModel){
        kafkaTemplate.send(TOPIC, userModel);
    }
}
