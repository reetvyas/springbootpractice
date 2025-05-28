package com.codewithme.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        System.out.println("order service created");
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10.0);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
