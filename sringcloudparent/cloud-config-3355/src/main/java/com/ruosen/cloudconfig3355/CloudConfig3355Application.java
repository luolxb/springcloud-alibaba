package com.ruosen.cloudconfig3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudConfig3355Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfig3355Application.class, args);
	}

}
