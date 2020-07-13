package com.star.service;

import com.star.entites.Payment;

public interface PaymentService {
    /*添加用户*/
    public int create(Payment payment);
    /*查询用户*/
    public Payment getPaymentById(Long id);
}
