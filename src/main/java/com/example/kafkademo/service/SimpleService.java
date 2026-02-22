package com.example.kafkademo.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public void sendMessage(String msg){
        System.out.println("Hello :"+ msg);
    }
}

