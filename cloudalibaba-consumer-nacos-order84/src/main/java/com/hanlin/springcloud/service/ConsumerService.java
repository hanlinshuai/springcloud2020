package com.hanlin.springcloud.service;

import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:hl.yuan
 * @date：2020-09-09
 */
@FeignClient(value = "nacos-payment-provider",fallback =ConsumerFallBackService.class )
//@FeignClient(value = "nacos-payment-provider" )
public interface ConsumerService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
