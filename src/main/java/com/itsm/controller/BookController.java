package com.itsm.controller;

import com.itsm.entity.Book;
import com.itsm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller(value = "books")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/allBooks", method = RequestMethod.GET)
    public String allBooksList(Model model) {
        List<Book> books = bookService.findAllBooks();
        model.addAttribute("allBooks", books);
        return "all-books";
    }

    @RequestMapping(value = "allBooksInHands", method = RequestMethod.GET)
    public String allBooksInHands(Model model) {
        List<Book> books = bookService.findAllBookInHands();
        model.addAttribute("booksInHands", books);
        return "books_in_hands";
    }

    @RequestMapping(value = "/user-books/{id}", method = RequestMethod.GET)
    public String userBooks(Model model, @PathVariable("id") int id) {
        List<Book> books = bookService.findByUserId(id);
        model.addAttribute("userBooks", books);
        return "user-books";
    }

    @RequestMapping(value = "show-add-book", method = RequestMethod.GET)
    public String showAddBook() {
        return "add-book";
    }

//    @RequestMapping(value = "give-book", method = RequestMethod.POST)
//    public String giveBook(int bookId, int userId) {
//        Book book = bookService.findById(bookId);
//        book.setUser();
//    }

}
