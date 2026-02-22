package com.example.kafkademo.controller;

import com.example.kafkademo.service.Producer;
import com.example.kafkademo.service.SimpleService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class KafkaController {

    @Autowired
    Producer producer;

    @Autowired
    SimpleService simpleService;

    @GetMapping("/producerMsg")
    public String getMessageFromClient(@RequestParam("message") String msg){
        producer.sendMessageToTopic(msg);
        return "message sent to topic..";
    }

    //http://localhost:8080/rest/api/producerMsg?message="Congrats Bro ..."


    //Simple service calling form here
    @GetMapping("/getMessage")
    public String getMessage(){
        simpleService.sendMessage("Hello simple message..");
        return "SUCCESS";
    }
    //http://localhost:8080/rest/api/getMessage

}
