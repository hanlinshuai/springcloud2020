package com.hanlin.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
/**
 * @author:hl.yuan
 * @date：2020-09-13
 */
@Configuration
public class DataSourceProxyConfig {

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DruidDataSource druidDataSource(){
//        return new DruidDataSource();
//    }
//
//    @Primary
//    @Bean
//    public DataSource dataSource(DruidDataSource druidDataSource){
//        return new DataSourceProxy(druidDataSource);
//    }

}
