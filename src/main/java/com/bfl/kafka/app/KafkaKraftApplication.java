package com.bfl.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bfl")
public class KafkaKraftApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaKraftApplication.class, args);
    }

}
