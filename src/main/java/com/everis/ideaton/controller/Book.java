package com.everis.ideaton.controller;

final public class Book {

    private final Long id;
    private final String tittle;
    private final String author;

    private Book(Long id, String tittle, String author) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
    }

    static Book createBookInstance(Long id, String tittle, String author){
        return new Book(id, tittle, author);
    }

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }
}
