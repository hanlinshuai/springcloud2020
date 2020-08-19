package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author:hl.yuan
 * @date：2020-08-19
 */
@SpringBootApplication
@EnableFeignClients
public class SpringBootAppFeign80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppFeign80.class,args);
    }

}
