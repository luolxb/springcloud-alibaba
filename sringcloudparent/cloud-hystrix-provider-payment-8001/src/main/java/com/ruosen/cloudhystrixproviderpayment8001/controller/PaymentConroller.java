package com.ruosen.cloudhystrixproviderpayment8001.controller;


import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudhystrixproviderpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentConroller {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("paymentInfo_ok")
    public CommonResult<Object> paymentInfo_ok() {
        log.info("paymentInfo_ok--------------------------");
        return new CommonResult<>(0, "成功", paymentService.paymentInfo_ok());
    }

    @GetMapping("paymentInfo_error")
    public CommonResult<Object> paymentInfo_error() {
        log.info("paymentInfo_error--------------------------");
        return new CommonResult<>(0, "成功", paymentService.paymentInfo_error());
    }

    @GetMapping("/payCircuitBreaker/{id}")
    public CommonResult<Object> payCircuitBreaker(@PathVariable("id") Integer id) {
        return new CommonResult<>(0, "成功", paymentService.payCircuitBreaker(id));
    }

}
