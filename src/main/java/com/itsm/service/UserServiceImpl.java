package com.itsm.service;

import com.itsm.dao.UserDao;
import com.itsm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private UserRoleDao userRoleDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    @Transactional
//    public User insert(User user) {
//        return this.userDao.insert(user);
//    }

//    public void save(User user) {
//        user.setPassword(user.getPassword());
//        Set<Role> roles = new HashSet<Role>();
//        roles.add(roleDao.getOne(1L));
//        user.getRoleSet();
//        userDao.insert(user);
//    }

    @Transactional
    public void delete(User user) {
        this.delete(user);
    }

    @Transactional
    public List<User> findAll() {
        return this.userDao.findAll();
    }

    public User findById(int id) {
        return null;
    }

//    @Transactional
//    public User findById(int id) {
//        return this.userDao.findById(id);
//    }

//    public User findBuUsername(String username) {
//        return userRoleDao.findByUsername(username);
//    }

    public User insert(User user) {
        return null;
    }

    public void save(User user) {

    }
}
