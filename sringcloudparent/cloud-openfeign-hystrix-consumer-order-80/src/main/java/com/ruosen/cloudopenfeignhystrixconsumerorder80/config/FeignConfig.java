package com.ruosen.cloudopenfeignhystrixconsumerorder80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign 日志配置
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.FULL;
    }
}
