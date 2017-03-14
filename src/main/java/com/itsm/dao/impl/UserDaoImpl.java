package com.itsm.dao.impl;

import com.itsm.dao.UserDao;
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
    }

    public List<User> findReaders() {
//        Query query = sessionFactory.getCurrentSession().createQuery("select ");
//        return (User) sessionFactory.getCurrentSession().get(User.class, id);
        return null;
    }

    public User findById(int id) {
        return null;
    }

    public void insert(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public void delete(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("delete User where id=:idParam");
        query.setParameter("idParam", id);
        query.executeUpdate();
    }

    public User findByUserName(String username) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User where username=:usernameParam");
        query.setParameter("usernameParam", username);
        query.executeUpdate();
        return (User) query;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
