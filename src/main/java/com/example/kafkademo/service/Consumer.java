package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "demo_topic" , groupId = "demo_topic_group")
    public void listenToTopic(String receiveMsg){
        System.out.println("Hello Message : "+ receiveMsg);
    }
}
