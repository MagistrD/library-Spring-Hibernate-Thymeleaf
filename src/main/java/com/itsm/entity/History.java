package com.itsm.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "histories")
public class History {
    private int id;
    private Date dateOfIssue;
    private Date dateOfReturn;
    private Book book;

    public History() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "issue_date")
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "return_date")
    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    @ManyToOne
    @JoinColumn(name = "BOOKS_book_id")
    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
