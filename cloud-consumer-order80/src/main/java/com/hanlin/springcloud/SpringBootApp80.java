package com.hanlin.springcloud;

import com.hanlin.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author:hl.yuan
 * @date：2020-07-18
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT", configuration = MySelfRule.class)
public class SpringBootApp80 {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp80.class,args);
    }
}
