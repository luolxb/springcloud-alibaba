package com.ruosen.cloudproviderpayment8003;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@MapperScan(basePackages = {"com.ruosen"})
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderPayment8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8003Application.class, args);
    }

}
