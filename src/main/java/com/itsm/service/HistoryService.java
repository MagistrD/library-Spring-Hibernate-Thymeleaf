package com.itsm.service;

import com.itsm.entity.History;

import java.util.List;

public interface HistoryService {
    List<History> findByBookId(int id);

    History insert(History history);

    void delete(History history);
}
