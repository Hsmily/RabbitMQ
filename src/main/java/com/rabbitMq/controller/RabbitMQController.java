package com.rabbitMq.controller;

import com.rabbitMq.service.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/queues/%2F/example_queue")
public class RabbitMQController
{

        @Autowired
        private RabbitMQProducer producer;

        @PostMapping("/get")
        public String sendMessage(@RequestParam String message) {
            producer.sendMessage(message);
            return "Message sent: Hello, RabbitMQ! " + message;
        }
    }


