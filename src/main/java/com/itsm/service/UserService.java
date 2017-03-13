package com.itsm.service;

import com.itsm.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

//    User findBuUsername(String username);

    User insert(User user);

    void save(User user);

    void delete(User user);
}
