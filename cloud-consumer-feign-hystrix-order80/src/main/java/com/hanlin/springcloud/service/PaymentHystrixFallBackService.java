package com.hanlin.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author:hl.yuan
 * @date：2020-08-24
 */
@Component
public class PaymentHystrixFallBackService implements PaymentHystrixService  {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentHystrixFallBackService  paymentInfo_OK ";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentHystrixFallBackService  paymentInfo_TimeOut ";
    }
}
