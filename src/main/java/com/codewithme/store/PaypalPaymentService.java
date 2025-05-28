package com.codewithme.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PaypalPaymentService implements PaymentService{
    @Override
    public void processPayment(Double amount) {
        System.out.println("PayPal");
        System.out.println("Amount " + amount);
    }
}
