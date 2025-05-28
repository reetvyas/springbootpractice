package com.codewithme.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    private NotificationService notificationService;
    private UserRepository userRepository;

    public UserService(NotificationService notificationService, UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {

        if(null != userRepository.findByEmail(user.getEmail()))
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");

        userRepository.save(user);
        notificationService.send("User registered successfully", user.getEmail());
    }
}
