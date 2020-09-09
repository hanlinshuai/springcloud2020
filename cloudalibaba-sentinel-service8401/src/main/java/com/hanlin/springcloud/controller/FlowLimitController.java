package com.hanlin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author:hl.yuan
 * @date：2020-09-07
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    @SentinelResource(value = "testA",blockHandler = "blockTestA")
    public String testA(@RequestParam("p") String p) {
        log.info("我A进来了~~~~~~~~~~~~~~");
//        int a = 10/0;
        return "------testA";
    }

    public String blockTestA(String p, BlockException exception){

        return "o(╥﹏╥)o";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }


}
