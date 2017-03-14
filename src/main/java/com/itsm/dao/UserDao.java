package com.itsm.dao;

import com.itsm.entity.User;

import java.util.List;

public interface UserDao {
    List findAll();

    List<User> findReaders();

    User findById(int id);

    void insert(User user);

    void delete(int id);

    User findByUserName(String username);
}
