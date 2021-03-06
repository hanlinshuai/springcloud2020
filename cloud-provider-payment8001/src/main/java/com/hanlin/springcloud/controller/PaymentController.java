package com.hanlin.springcloud.controller;

import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import com.hanlin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author:hl.yuan
 * @date：2020-07-15
 */
@RestController
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String ServerPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentList(@PathVariable("id") Long id, HttpServletRequest request){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("获取成功");
        if (paymentById!=null) {
            return new CommonResult("200","获取成功，ServerPort："+ServerPort,paymentById);
        } else {
            return new CommonResult("500","获取失败");
        }
    }

    @PostMapping("/payment/save")
    public CommonResult savePaymentList(@RequestBody Payment payment){
        int savePayment = paymentService.savePayment(payment);
        if (savePayment>0){
            return new CommonResult("200","保存成功，ServerPort："+ServerPort,savePayment);
        } else {
            return new CommonResult("500","保存失败");
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("***** element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
