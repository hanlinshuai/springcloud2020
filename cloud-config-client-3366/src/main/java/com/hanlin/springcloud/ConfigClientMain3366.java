package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:hl.yuan
 * @date：2020-08-30
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {


    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
