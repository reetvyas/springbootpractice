package com.codewithme.store;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository{
    private final Map<String, User> userMap = new HashMap<>();


    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
        userMap.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return userMap.getOrDefault(email, null);
    }
}
