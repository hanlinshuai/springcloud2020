package com.hanlin.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:hl.yuan
 * @date：2020-07-18
 */
@Configuration
public class MyConfig {

    /**
     * 获取RestTemplate
     * @LoadBalanced 开启负载均衡，默认是轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
