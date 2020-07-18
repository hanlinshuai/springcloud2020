package com.hanlin.springcloud.controller;

import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者controller
 * @author:hl.yuan
 * @date：2020-07-18
 */
@RestController
@Slf4j
public class OrderController {

    private final static String HTTP_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 模拟消费者save
     * @param payment
     * @return
     */
    @GetMapping("/consumer/payment/save")
    public CommonResult<Payment> savePayment(Payment payment){
        log.info("模拟消费者save");
        return restTemplate.postForObject(HTTP_URL+"/payment/save",payment,CommonResult.class);
    }

    /**
     * 模拟消费者获取
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment (@PathVariable("id") Long id){
        log.info("模拟消费者获取");
        return restTemplate.getForObject(HTTP_URL+"/payment/get/"+id,CommonResult.class);
    }

}
