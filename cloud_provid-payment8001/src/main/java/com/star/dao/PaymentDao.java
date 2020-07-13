package com.star.dao;

import com.star.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    /*添加用户*/
    public int create(Payment payment);
    /*查询用户*/
    public Payment getPaymentById(@Param("id") Long id);
}
