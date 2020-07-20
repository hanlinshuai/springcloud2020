package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author:hl.yuan
 * @date：2020-07-14
 */
@SpringBootApplication
// 启动eureka客户端
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringBootApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp8001.class,args);
    }
}
