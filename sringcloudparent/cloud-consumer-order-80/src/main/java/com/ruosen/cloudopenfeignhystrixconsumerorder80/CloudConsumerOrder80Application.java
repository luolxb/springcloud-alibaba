package com.ruosen.cloudopenfeignhystrixconsumerorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ruosen")
public class CloudConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }

}
