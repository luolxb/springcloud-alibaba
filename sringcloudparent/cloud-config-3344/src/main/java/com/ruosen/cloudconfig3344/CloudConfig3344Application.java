package com.ruosen.cloudconfig3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class CloudConfig3344Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfig3344Application.class, args);
	}

}
