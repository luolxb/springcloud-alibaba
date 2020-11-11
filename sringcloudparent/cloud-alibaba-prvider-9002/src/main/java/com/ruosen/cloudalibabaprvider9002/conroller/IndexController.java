package com.ruosen.cloudalibabaprvider9002.conroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("port")
    public Integer index(){
        return port;
    }
}
