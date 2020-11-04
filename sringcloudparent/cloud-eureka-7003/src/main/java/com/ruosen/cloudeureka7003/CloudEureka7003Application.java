package com.ruosen.cloudeureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class CloudEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka7003Application.class, args);
    }

}
