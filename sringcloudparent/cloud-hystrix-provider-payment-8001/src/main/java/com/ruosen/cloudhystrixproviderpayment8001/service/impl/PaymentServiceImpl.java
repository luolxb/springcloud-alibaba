package com.ruosen.cloudhystrixproviderpayment8001.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.ruosen.cloudhystrixproviderpayment8001.service.PaymentService;
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
}
