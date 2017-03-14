package com.itsm.service.impl;

import com.itsm.dao.BookDao;
import com.itsm.entity.Book;
import com.itsm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Transactional
    public List<Book> findAllBooks() {
        return this.bookDao.findAll();
    }

    @Transactional
    public Book findById(int id) {
        return this.bookDao.findById(id);
    }

    @Transactional
    public List<Book> findByUserId(int id) {
        return this.bookDao.findByUserId(id);
    }

    @Transactional
    public Book insert(Book book) {
        return this.bookDao.insert(book);
    }

    @Transactional
    public void delete(Book book) {
        this.bookDao.delete(book);
    }

    @Transactional
    public List<Book> findAllBookInHands() {
        return this.bookDao.findAllBooksInHands();
    }
}
