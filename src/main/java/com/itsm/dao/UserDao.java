package com.itsm.dao;

import com.itsm.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    List<User> findReaders();

    User findById(int id);

    User insert(User user);

    void delete(User user);

    User findByUserName(String username);
}
