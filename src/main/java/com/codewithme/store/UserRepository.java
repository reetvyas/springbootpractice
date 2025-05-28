package com.codewithme.store;

public interface UserRepository {

    public void save(User user);
    User findByEmail(String email);
}
