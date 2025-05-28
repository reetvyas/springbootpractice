package com.codewithme.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(paymentGateway.equals("stripe"))
            return new OrderService(stripe());

        return new OrderService(paypal());
    }
}
