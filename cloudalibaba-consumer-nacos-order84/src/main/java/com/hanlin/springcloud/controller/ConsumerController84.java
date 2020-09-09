package com.hanlin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import com.hanlin.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:hl.yuan
 * @date：2020-09-09
 */
@RestController
public class ConsumerController84 {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/paymentSQL/{id}")
    @SentinelResource(value = "fallback",blockHandler = "blockGetPayment")
    public CommonResult getPayment(@PathVariable("id") Long id){
        CommonResult<Payment> commonResult = consumerService.paymentSQL(id);
        return commonResult;
    }

    public CommonResult blockGetPayment(@PathVariable("id") Long id, BlockException blockException){
        return new CommonResult<Payment>("501","进入sentinel BlockHandler方法",null);
    }

}
