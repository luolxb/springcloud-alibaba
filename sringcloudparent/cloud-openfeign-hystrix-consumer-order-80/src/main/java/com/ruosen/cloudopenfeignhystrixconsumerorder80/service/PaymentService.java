package com.ruosen.cloudopenfeignhystrixconsumerorder80.service;

import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudopenfeignhystrixconsumerorder80.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "cloud-hystrix-provider-payment",fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping("payment/paymentInfo_ok")
    public CommonResult<Object> paymentInfo_ok() ;

    @GetMapping("payment/paymentInfo_error")
    public CommonResult<Object> paymentInfo_error() ;
}
