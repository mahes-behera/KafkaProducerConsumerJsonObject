package com.mbproject.KafkaJsonObject.Resource;

import com.mbproject.KafkaJsonObject.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, UserModel> kafkaTemplate;

    private static final String TOPIC = "mytopic";
    private static final String TOPIC2 = "mytopic2";

    @GetMapping("/{name}")
    public String stringMsg(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC, new UserModel(name, "Technology", 12000L));
        return "String msg Published successfully";
    }

    @GetMapping("/Json/{name}")
    public String jsonMsg(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC2, new UserModel(name, "Technology", 12000L));
        return "Json msg Published successfully";
    }
}
