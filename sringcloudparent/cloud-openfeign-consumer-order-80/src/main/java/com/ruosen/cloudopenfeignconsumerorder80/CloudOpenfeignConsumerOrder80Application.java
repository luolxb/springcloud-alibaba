package com.ruosen.cloudopenfeignconsumerorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class CloudOpenfeignConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudOpenfeignConsumerOrder80Application.class, args);
    }

}
