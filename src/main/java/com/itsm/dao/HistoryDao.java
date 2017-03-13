package com.itsm.dao;

import com.itsm.entity.History;

import java.util.List;

public interface HistoryDao {
    List findAll();

    List findByBookId(int id);

    History insert(History history);

    void delete(History history);
}
