package com.ruosen.cloudproviderpayment8001.service;



import com.ruosen.cloudcommon.entity.Payment;

import java.util.List;

public interface PaymentService {

    Payment getOne(Long id);
    List<Payment> getAll();
    void save(Payment payment);
}
