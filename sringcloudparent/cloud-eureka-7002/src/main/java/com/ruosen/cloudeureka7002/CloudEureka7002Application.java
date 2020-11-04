package com.ruosen.cloudeureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class CloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka7002Application.class, args);
    }

}