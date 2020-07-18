package com.hanlin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果封装类
 * @author:hl.yuan
 * @date：2020-07-14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private String code;

    private String message;

    private T data;

    /**
     * 返回结果封装类，在写一个构造方法，防止不传入data
     * @param code
     * @param message
     */
    public CommonResult (String code,String message){
        this(code,message,null);
    }
}
