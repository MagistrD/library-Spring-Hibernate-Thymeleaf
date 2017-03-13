package com.itsm.dao;

import com.itsm.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();

    Book findById(int id);

    List findByUserId(int id);

    Book insert(Book book);

    void delete(Book book);

}
