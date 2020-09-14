package com.hanlin.springcloud.controller;

import com.hanlin.springcloud.entities.CommonResult;
import com.hanlin.springcloud.entities.Order;
import com.hanlin.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:hl.yuan
 * @date：2020-09-13
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")

    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult("200", "订单创建成功");
    }

}
