package com.kodilla.testing.library;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@ToString
@Getter
public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
