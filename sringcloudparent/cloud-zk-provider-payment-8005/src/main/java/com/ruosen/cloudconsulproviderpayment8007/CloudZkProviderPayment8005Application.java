package com.ruosen.cloudconsulproviderpayment8007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudZkProviderPayment8005Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZkProviderPayment8005Application.class, args);
    }

}
