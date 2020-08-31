package com.hanlin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:hl.yuan
 * @date：2020-08-31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderDemoApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderDemoApplication9001.class, args);
    }

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string;
        }
    }

}
