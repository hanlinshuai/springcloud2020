package com.hanlin.springcloud.service.impl;

import com.hanlin.springcloud.dao.PaymentDao;
import com.hanlin.springcloud.entities.Payment;
import com.hanlin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:hl.yuan
 * @date：2020-07-15
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int savePayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
