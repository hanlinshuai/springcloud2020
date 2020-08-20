package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author:hl.yuan
 * @date：2020-08-20
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class SpringBootAppFeignHystrix80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppFeignHystrix80.class,args);
    }
}
