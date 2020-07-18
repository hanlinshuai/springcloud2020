package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:hl.yuan
 * @date：2020-07-18
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootApp80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp80.class,args);
    }
}
