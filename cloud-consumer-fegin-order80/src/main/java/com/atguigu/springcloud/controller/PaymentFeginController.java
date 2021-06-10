package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentFeginController {

    @Autowired
    private PaymentFeginService paymentFeginService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return paymentFeginService.getPaymentById(id);

    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String getPaymentFeginTimeout(){
        //openFegin-ribbon 客户端默认等待1秒钟
        return paymentFeginService.getPaymentFeginTimeout();

    }
}
