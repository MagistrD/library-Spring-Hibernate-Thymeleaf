package com.itsm.service;

import com.itsm.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findById(int id);

    List<Book> findByUserId(int id);

    Book insert(Book book);

    void delete(Book book);

    List<Book> findAllBookInHands();


}
