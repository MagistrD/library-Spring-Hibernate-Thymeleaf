package com.itsm.dao;

import com.itsm.entity.History;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Transactional
@Repository("historyDao")
public class HistoryDaoImpl implements HistoryDao {
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<History> findAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from History ");
        return query.list();
    }

    @Transactional
    public List findByBookId(int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("from History where book.id =:id");
        query.setParameter("id", id);
        return query.list();
    }

    @Transactional(readOnly = true)
    public History insert(History history) {

//        Query query = sessionFactory.getCurrentSession().createQuery("insert into History(dateOfIssue)");

        sessionFactory.getCurrentSession().saveOrUpdate(history);
        return history;
    }

    @Transactional(readOnly = true)
    public void delete(History history) {
        sessionFactory.getCurrentSession().delete(history);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
