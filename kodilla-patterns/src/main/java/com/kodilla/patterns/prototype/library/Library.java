package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@ToString
@Setter
public class Library extends Prototype {

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library libraryCopy = (Library) super.clone();

        libraryCopy.books = books.stream()
                .map(book -> new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()))
                .collect(Collectors.toCollection(HashSet::new));

        return libraryCopy;
    }
}