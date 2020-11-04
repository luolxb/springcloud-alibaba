package com.ruosen.cloudopenfeignconsumerorder80.controller;

import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudcommon.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class PaymentConroller {
//    private final static String url = "http://127.0.0.1:8001/payment";
    private final static String url = "http://CLOUD-PROVIDER-PAYMENT/payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getone/{id}")
    public CommonResult getone(@PathVariable("id") Long id) {
        String getoneUrl = url +"/getone/"+id;
        return restTemplate.getForObject(getoneUrl, CommonResult.class);
    }

    @GetMapping("/getall")
    public CommonResult getall() {
        String getoneUrl = url +"/getall/";
        return restTemplate.getForObject(getoneUrl, CommonResult.class);
    }

    @PostMapping("/save")
    public CommonResult save(@RequestBody Payment payment) {
        String saveUrl = url +"/save/";
        return restTemplate.postForObject(saveUrl, payment, CommonResult.class);
    }
}
