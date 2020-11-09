package com.ruosen.cloudopenfeignhystrixconsumerorder80.service.impl;

import com.ruosen.cloudcommon.entity.CommonResult;
import com.ruosen.cloudopenfeignhystrixconsumerorder80.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CommonResult<Object> paymentInfo_ok() {
        return new CommonResult<>(-1,"失败","PaymentServiceImpl -->paymentInfo_ok");
    }

    @Override
    public CommonResult<Object> paymentInfo_error() {
        return new CommonResult<>(-1,"失败","PaymentServiceImpl  -> paymentInfo_error");
    }
}
