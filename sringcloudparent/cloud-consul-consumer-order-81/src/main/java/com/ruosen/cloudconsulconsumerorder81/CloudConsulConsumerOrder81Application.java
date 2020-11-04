package com.ruosen.cloudconsulconsumerorder81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsulConsumerOrder81Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulConsumerOrder81Application.class, args);
    }

}
