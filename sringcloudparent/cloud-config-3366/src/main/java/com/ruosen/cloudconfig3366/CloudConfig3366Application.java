package com.ruosen.cloudconfig3366;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudConfig3366Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfig3366Application.class, args);
	}

}
