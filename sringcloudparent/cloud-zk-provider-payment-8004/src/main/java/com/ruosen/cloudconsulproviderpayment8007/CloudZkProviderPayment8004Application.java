package com.ruosen.cloudconsulproviderpayment8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudZkProviderPayment8004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZkProviderPayment8004Application.class, args);
    }

}
