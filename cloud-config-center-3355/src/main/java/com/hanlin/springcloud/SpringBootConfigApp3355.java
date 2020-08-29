package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:hl.yuan
 * @date：2020-08-29
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringBootConfigApp3355 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigApp3355.class,args);
    }

}
