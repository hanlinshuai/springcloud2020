package com.hanlin.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hanlin.springcloud.entities.CommonResult;

/**
 * @author:hl.yuan
 * @date：2020-09-08
 */
public class CommonBlockHandler {

    public static CommonResult handlerException_444(BlockException exception){
        return new CommonResult("444","系统繁忙，请稍后再试！");
    }

    public static CommonResult handlerException_404(BlockException exception){
        return new CommonResult("404","系统繁忙，请稍后再试！");
    }

}
