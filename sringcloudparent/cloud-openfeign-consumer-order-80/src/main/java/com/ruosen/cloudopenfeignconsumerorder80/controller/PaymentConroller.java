package com.ruosen.cloudopenfeignconsumerorder80.controller;

import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudopenfeignconsumerorder80.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class PaymentConroller {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getone/{id}")
    public CommonResult getone(@PathVariable("id") Long id) {
        return paymentService.getone(id);
    }

    @GetMapping("/getall")
    public CommonResult getall() {
        return paymentService.getall();
    }

    @PostMapping("/save")
    public CommonResult save(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }
}
