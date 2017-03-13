package com.itsm.dao;

import com.itsm.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    public List<User> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from User ");
        return query.list();
//        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public List<User> findReaders() {
//        Query query = sessionFactory.getCurrentSession().createQuery("select ");
//        return (User) sessionFactory.getCurrentSession().get(User.class, id);
        return null;
    }

    public User findById(int id) {
        return null;
    }

    public User insert(User user) {
        return null;
    }

    public void delete(User user) {

    }

    public User findByUserName(String username) {
        return null;
    }
//    public List<User> findAll() {
//        return null;
//    }
//
//    public List<User> findReaders() {
//        return null;
//    }
//
//    public User findById(int id) {
//        return null;
//    }
//
//    public User insert(User user) {
//        return null;
//    }
//
//    public void delete(User user) {
//
//    }

    //    public User findByUserName(String username) {
//        return null;
//    }
////public class UserDaoImpl implements UserDao {
//    private SessionFactory sessionFactory;
//
////
////    @Transactional(readOnly = true)
////    public User findById(int id) {
//////        Query query = sessionFactory.getCurrentSession().createQuery("select ");
////        return (User) sessionFactory.getCurrentSession().get(User.class, id);
////    }
////
////    @Transactional(readOnly = true)
////    public User insert(User user) {
////        sessionFactory.getCurrentSession().saveOrUpdate(user);
////        return user;
////    }
////
////    @Transactional(readOnly = true)
////    public void delete(User user) {
////        sessionFactory.getCurrentSession().delete(user);
////    }
////
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
