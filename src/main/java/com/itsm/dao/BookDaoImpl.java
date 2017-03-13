package com.itsm.dao;

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

//        return sessionFactory.getCurrentSession().createQuery("FROM Book ").list();
        return query.list();
    }

    @Transactional(readOnly = true)
    public Book findById(int id) {
        return null;
    }

    @Transactional(readOnly = true)
    public List<Book> findByUserId(int id) {
//        return sessionFactory.getCurrentSession()
//                .getNamedQuery("findByUserId").setParameter("id", id).list();
        Query query = sessionFactory.getCurrentSession().createQuery("from Book where user.id =:id");
        query.setParameter("id", id);
        return query.list();
//        return sessionFactory.getCurrentSession().createQuery("from Book where user = :id").list();
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

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
