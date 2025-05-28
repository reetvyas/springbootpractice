package com.codewithme.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(StoreApplication.class, args);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.registerUser(new User(1L, "randomemail@email.com", "password", "Name "));
    }
}
