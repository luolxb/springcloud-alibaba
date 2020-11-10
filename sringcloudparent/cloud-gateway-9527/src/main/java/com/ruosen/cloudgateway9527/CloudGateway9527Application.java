package com.ruosen.cloudgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudGateway9527Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateway9527Application.class, args);
	}

}
