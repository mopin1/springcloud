package com.example.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService----ok";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbcakService---timeout";
    }
}
