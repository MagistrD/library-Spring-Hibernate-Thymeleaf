package com.itsm.service.impl;

import com.itsm.dao.HistoryDao;
import com.itsm.entity.History;
import com.itsm.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryDao historyDao;

    public void setHistoryDao(HistoryDao historyDao) {
        this.historyDao = historyDao;
    }

    @Transactional
    public List findByBookId(int id) {
        return historyDao.findByBookId(id);
    }

    @Transactional
    public History insert(History history) {
        return this.historyDao.insert(history);
    }

    @Transactional
    public void delete(History history) {
        historyDao.delete(history);
    }
}
