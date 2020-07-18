package com.hanlin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:hl.yuan
 * @date：2020-07-18
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
