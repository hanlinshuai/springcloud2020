package com.hanlin.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * 全局自定义过滤器
 * @author:hl.yuan
 * @date：2020-08-29
 */
@Component
@Slf4j
public class MyGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        URI uri = request.getURI();
        log.info("MyGlobalFilter过滤器：请求：{}进来了！", uri);
        String token = request.getQueryParams().getFirst("token");
        if (token==null){
            // 如果请求参数里面没有包含token，那么这里就过滤请求，不让进入业务逻辑服务里
            log.info("请求：{} token为null，未登录，请求被过滤", uri);
            exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        // 过滤器执行的顺序，数字越小，执行越靠前
        return 1;
    }
}
