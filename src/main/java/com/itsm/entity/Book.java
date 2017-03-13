package com.itsm.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NamedQueries({
        @NamedQuery(name = "findByUserId", query = "select b from Book b where b.user =:id")
})
@Entity
@Table(name = "books")
public class Book {
    private int id;
    private String title;
    private String author;
    private User user;
    private Set<History> historySet = new HashSet<History>();

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String bookName) {
        this.title = bookName;
    }

    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @ManyToOne
    @JoinColumn(name = "users_id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<History> getHistorySet() {
        return this.historySet;
    }

    public void setHistorySet(Set<History> historySet) {
        this.historySet = historySet;
    }

    public void addHistory(History history) {
        history.setBook(this);
        getHistorySet().add(history);
    }

    public void removeHistory(History history) {
        getHistorySet().remove(history);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
