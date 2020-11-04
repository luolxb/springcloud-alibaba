package com.ruosen.cloudopenfeignconsumerorder80.service;

import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cloud-provider-payment")
public interface PaymentService {

    @GetMapping("payment/getone/{id}")
    CommonResult getone(@PathVariable("id") Long id);

    @GetMapping("payment/getall")
    CommonResult getall();

    @PostMapping("payment/save")
    CommonResult save(@RequestBody Payment payment);
}
