package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:hl.yuan
 * @date：2020-08-29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringBootConfigApp3344 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigApp3344.class,args);
    }

}
