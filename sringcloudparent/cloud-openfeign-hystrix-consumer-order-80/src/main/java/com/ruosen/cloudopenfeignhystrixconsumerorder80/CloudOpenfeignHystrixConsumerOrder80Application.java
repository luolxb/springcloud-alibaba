package com.ruosen.cloudopenfeignhystrixconsumerorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class CloudOpenfeignHystrixConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudOpenfeignHystrixConsumerOrder80Application.class, args);
    }

}
