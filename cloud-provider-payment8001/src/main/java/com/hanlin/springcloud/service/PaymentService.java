package com.hanlin.springcloud.service;

import com.hanlin.springcloud.entities.Payment;

/**
 * @author:hl.yuan
 * @date：2020-07-15
 */

public interface PaymentService {


    /**
     * 保存
     * @param payment
     * @return
     */
    int savePayment(Payment payment);

    /**
     * 获取
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);


}
