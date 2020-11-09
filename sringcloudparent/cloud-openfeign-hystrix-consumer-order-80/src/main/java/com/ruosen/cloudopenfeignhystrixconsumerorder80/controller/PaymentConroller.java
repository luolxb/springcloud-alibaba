package com.ruosen.cloudopenfeignhystrixconsumerorder80.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudopenfeignhystrixconsumerorder80.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
@Slf4j
//@DefaultProperties(defaultFallback = "payment_gloable_fallbackMethod")
public class PaymentConroller {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("paymentInfo_ok")
    public CommonResult<Object> paymentInfo_ok() {
        log.info("paymentInfo_ok--------------------------");
        return paymentService.paymentInfo_ok();
    }

    @GetMapping("paymentInfo_error")
//    @HystrixCommand(fallbackMethod = "order_paymentInfo_error_fallbackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "6000")
//    })
//    @HystrixCommand
    public CommonResult<Object> paymentInfo_error() {
        log.info("paymentInfo_error--------------------------");
        return paymentService.paymentInfo_error();
    }


    public CommonResult<Object> order_paymentInfo_error_fallbackMethod() {
        return new CommonResult<>(-1, "失败", "paymentInfo_error：链接出【80】，请稍后重试！！！");
    }

    public CommonResult<Object> payment_gloable_fallbackMethod() {
        return new CommonResult<>(-1, "失败", "payment_gloable_fallbackMethod：链接出错【80】，请稍后重试！！！");
    }

}
