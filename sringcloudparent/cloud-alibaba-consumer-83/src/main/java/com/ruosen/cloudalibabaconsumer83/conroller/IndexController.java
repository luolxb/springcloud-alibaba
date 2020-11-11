package com.ruosen.cloudalibabaconsumer83.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Value("${server-url.nacos-user-service}")
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("port")
    public Integer index(){
        return restTemplate.getForObject(serviceUrl + "/port", Integer.class);
    }
}
