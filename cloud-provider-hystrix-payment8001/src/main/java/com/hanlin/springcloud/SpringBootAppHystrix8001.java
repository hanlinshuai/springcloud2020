package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:hl.yuan
 * @date：2020-08-20
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class SpringBootAppHystrix8001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppHystrix8001.class,args);
    }


}
