package com.moke.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import com.moke.springcloud.dao.PaymentDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;


public interface PaymentService {


    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
