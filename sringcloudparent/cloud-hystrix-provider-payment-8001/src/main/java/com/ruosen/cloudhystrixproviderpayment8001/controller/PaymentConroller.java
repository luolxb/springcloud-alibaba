package com.ruosen.cloudhystrixproviderpayment8001.controller;


import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudhystrixproviderpayment8001.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
public class PaymentConroller {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/getone/{id}")
    public CommonResult getone(@PathVariable("id") Long id) {
        Payment payment = paymentService.getOne(id);
        return new CommonResult<>(0, "成功", payment);
    }

    @GetMapping("/getall")
    public CommonResult getall() {
        List<Payment> paymentList = paymentService.getAll();
        return new CommonResult<>(0, "成功", paymentList);
    }

    @PostMapping("/save")
    public CommonResult save(@RequestBody Payment payment) {
        paymentService.save(payment);
        return new CommonResult<>(0, "成功", payment);
    }
}
