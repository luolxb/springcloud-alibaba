package com.ruosen.cloudalibabaconsumer83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumer83Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudAlibabaConsumer83Application.class, args);
	}

}
