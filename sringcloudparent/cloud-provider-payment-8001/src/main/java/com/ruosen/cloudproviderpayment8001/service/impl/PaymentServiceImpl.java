package com.ruosen.cloudproviderpayment8001.service.impl;

import com.ruosen.cloudcommon.entity.Payment;
import com.ruosen.cloudproviderpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final static List<Payment> LIST = new ArrayList<>();

    private final static String  string = "【8001】";
    static {
        for (int i = 1; i < 6; i++) {
            LIST.add(new Payment(Long.parseLong(String.valueOf(i)),(i * 1000) + string));
        }
    }

    @Override
    public Payment getOne(Long id) {
        log.info("PaymentServiceImpl getOne ==>{}",id);
        return LIST.get(Integer.parseInt(String.valueOf(id -1)));
    }

    @Override
    public List<Payment> getAll() {

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LIST;
    }

    @Override
    public void save(Payment payment) {
        log.info("PaymentServiceImpl save ==>{}",payment);
        LIST.add(payment);
    }

}
