package com.hanlin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Payment;
import com.hanlin.springcloud.myhandler.CommonBlockHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:hl.yuan
 * @date：2020-09-08
 */
@RestController
@Slf4j
public class HandlerController {


    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CommonBlockHandler.class,
            blockHandler = "handlerException_404")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult("200","按客戶自定义");
    }



}
