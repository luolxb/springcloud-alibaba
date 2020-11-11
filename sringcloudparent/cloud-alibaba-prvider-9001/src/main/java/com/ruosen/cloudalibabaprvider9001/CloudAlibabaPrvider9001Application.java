package com.ruosen.cloudalibabaprvider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaPrvider9001Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudAlibabaPrvider9001Application.class, args);
	}

}
