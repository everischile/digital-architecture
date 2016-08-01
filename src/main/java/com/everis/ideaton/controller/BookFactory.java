package com.everis.ideaton.controller;

import java.util.*;

public class BookFactory{

    public static Map<Long,Book> getBookStore(){
        final Map<Long,Book> bookStore = new HashMap<>();
        List<Book> books = createBooks();
        books.forEach(book -> bookStore.put(book.getId(),book));
        return Collections.unmodifiableMap(bookStore);
    }

    private static List<Book> createBooks(){
        Book book1 = Book.createBookInstance(1L,"riding the tiger","julius evola");
        Book book2 = Book.createBookInstance(2L,"the crystal and the way of light","namkhai norbu");
        Book book3 = Book.createBookInstance(3L,"bardo thodol","padma sambawa");
        Book book4 = Book.createBookInstance(4L,"the great god pan","arthur machen");
        Book book5 = Book.createBookInstance(5L,"the history of magic","eliphas levi");
        Book book6 = Book.createBookInstance(6L,"dream yoga","michael katz");
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        return Collections.unmodifiableList(books);
    }
}