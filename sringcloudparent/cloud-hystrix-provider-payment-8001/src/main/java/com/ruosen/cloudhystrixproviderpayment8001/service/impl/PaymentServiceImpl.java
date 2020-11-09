package com.ruosen.cloudhystrixproviderpayment8001.service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.ruosen.cloudhystrixproviderpayment8001.service.PaymentService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_ok() {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_ok";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_error_fallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "6000")
    })
    public String paymentInfo_error() {
        int timeNum = 7;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_error" + timeNum;
//        int i = 10 / 0;
//        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_error";
    }

    public String paymentInfo_error_fallbackMethod() {
        return "paymentInfo_error：链接出【8001】，请稍后重试！！！";
    }

    @Override
    @HystrixCommand(fallbackMethod = "payCircuitBreaker_fallback",commandProperties = {
           @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
           @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),  // 熔断触发的最小个数/10s
           @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 熔断多少秒后去尝试请求
           @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), // 失败率达到多少百分比后熔断
    })
    public String payCircuitBreaker(Integer id){
        if (id < 0) {
            throw new RuntimeException("ID 不能小于0");
        }
        return IdUtil.fastSimpleUUID();
    }

    public String payCircuitBreaker_fallback(Integer id){
        return "发生错误，请稍后重试！！！";
    }
}
