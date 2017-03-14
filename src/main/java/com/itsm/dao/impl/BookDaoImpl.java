package com.itsm.dao.impl;

import com.itsm.dao.BookDao;
import com.itsm.entity.Book;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Book> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Book ");
        return query.list();
    }

    @Transactional(readOnly = true)
    public Book findById(int id) {
        return null;
    }

    @Transactional(readOnly = true)
    public List<Book> findByUserId(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Book where user.id =:id");
        query.setParameter("id", id);
        return query.list();
    }

    public List<Book> findAllBooksInHands() {
        Query query = sessionFactory.getCurrentSession().createQuery("from Book where user.id is not null");
        return query.list();
    }

    @Transactional(readOnly = true)
    public Book insert(Book book) {
        sessionFactory.getCurrentSession().saveOrUpdate(book);
        return book;
    }

    @Transactional(readOnly = true)
    public void delete(Book book) {
        sessionFactory.getCurrentSession().delete(book);
    }

    public void update(Book book) {
        Query query = sessionFactory.getCurrentSession().createQuery("update Book set user.id=:userIdParam");
        query.setParameter("userIdParam", book.getUser().getId());
        query.executeUpdate();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
