package com.hanlin.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author:hl.yuan
 * @date：2020-08-18
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getIRule(){
        return new MyRandomRule();
    }

}
