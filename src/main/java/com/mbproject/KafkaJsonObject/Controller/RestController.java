package com.mbproject.KafkaJsonObject.Controller;

import com.mbproject.KafkaJsonObject.Config.Producer;
import com.mbproject.KafkaJsonObject.model.UserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/msg")
public class RestController {

    private final Producer producer;

    public RestController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping
    public void messageToTopic(@RequestParam("message") String message){
        UserModel userModel = new UserModel(message, "Dept", 100L);
        this.producer.sendMessage(userModel);
    }
}
