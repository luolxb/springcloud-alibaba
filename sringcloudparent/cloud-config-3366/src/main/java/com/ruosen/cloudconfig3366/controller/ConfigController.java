package com.ruosen.cloudconfig3366.controller;

import com.ruosen.cloudcommon.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("configInfo")
    public CommonResult configInfo(){
        return new CommonResult(1,"成功",configInfo);
    }
}
