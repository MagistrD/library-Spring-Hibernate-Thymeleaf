package com.itsm.dao;

import com.itsm.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> findAll();

    Book findById(int id);

    List<Book> findByUserId(int id);

    List<Book> findAllBooksInHands();

    Book insert(Book book);

    void delete(Book book);

    void update(Book book);

}
