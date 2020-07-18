package com.hanlin.springcloud.dao;

import com.hanlin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author:hl.yuan
 * @date：2020-07-14
 */
@Mapper
public interface PaymentDao {

    /**
     * 保存
     * @param payment
     * @return
     */
    int savePayment(Payment payment);

    /**
     * 获取
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
