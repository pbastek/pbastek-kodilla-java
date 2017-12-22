package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
final class Book {
    private final String title;
    private final String author;
    private final LocalDate publicationDate;

    Book(final String title, final String author, final LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
}
