package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import lombok.Getter;

@Getter
public class Book {

    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Book(final String author, final String title, final int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }
}
