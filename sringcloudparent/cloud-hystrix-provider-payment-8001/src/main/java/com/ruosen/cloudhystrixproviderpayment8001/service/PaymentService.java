package com.ruosen.cloudhystrixproviderpayment8001.service;


import com.ruosen.cloudcommon.entity.Payment;

import java.util.List;

public interface PaymentService {

    String paymentInfo_ok();

    String paymentInfo_error();

    String payCircuitBreaker(Integer id);

}
