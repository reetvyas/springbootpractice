package com.codewithme.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.appUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(Double amount){
        System.out.println(apiUrl);
        System.out.println(enabled);
        System.out.println(timeout);
        System.out.println(supportedCurrencies);
        System.out.println("Stripe");
        System.out.println("Amount " + amount);
    }
}
