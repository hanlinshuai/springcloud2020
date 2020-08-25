package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author:hl.yuan
 * @date：2020-08-25
 */
@SpringBootApplication
// 启动dashboard监控
@EnableHystrixDashboard
public class SpringBootAppHystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppHystrixDashboard9001.class,args);
    }

}
