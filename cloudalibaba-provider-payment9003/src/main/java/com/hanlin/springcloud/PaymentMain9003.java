package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:hl.yuan
 * @date：2020-09-08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9003 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9003.class,args);
    }

}
