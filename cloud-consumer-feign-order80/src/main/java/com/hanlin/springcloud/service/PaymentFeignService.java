package com.hanlin.springcloud.service;

import com.hanlin.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:hl.yuan
 * @date：2020-08-19
 */
@FeignClient("CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult getPaymentList(@PathVariable("id") Long id);
}
