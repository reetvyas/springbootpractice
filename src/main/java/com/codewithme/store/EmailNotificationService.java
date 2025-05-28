package com.codewithme.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${email.server-port}")
    private Integer emailPort;

    @Value("${email.server-host}")
    private String serverHost;

    @Override
    public void send(String message, String recepientEmail) {
        System.out.println("Recipient: " + recepientEmail);
        System.out.println("Message: " + message);
        System.out.println("port: " + emailPort);
        System.out.println("host: " + serverHost);
    }
}
