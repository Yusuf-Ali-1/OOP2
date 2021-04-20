package com.tts;

public class Book {

    // what are some properties of a book
    // author
    // title
    // year published
    // publisher
    // genre

    private String author;
    private String title;
    private Integer yearPublished;
    private String publisher;
    private String genre;

    public Book(String author, String title, Integer yearPublished, String publisher, String genre) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.genre = genre;
    }
}
