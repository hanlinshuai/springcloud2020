package com.hanlin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:hl.yuan
 * @date：2020-09-07
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        log.info("我A进来了~~~~~~~~~~~~~~");
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }


}
