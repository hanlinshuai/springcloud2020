package com.hanlin.springcloud.service;

import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author:hl.yuan
 * @date：2020-09-09
 */
@Component
public class ConsumerFallBackService implements ConsumerService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<Payment>("500","进入兜底方法---ConsumerFallBackService",null);
    }
}
