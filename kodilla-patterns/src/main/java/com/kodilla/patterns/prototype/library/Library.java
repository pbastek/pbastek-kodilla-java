package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@ToString
@Setter
@EqualsAndHashCode
final class Library extends Prototype<Library> {
    private final String name;
    private Set<Book> books = new HashSet<>();

    Library(final String name) {
        this.name = name;
    }
    Set<Book> getBooks() {
        return books;
    }

    Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    Library deepCopy() throws CloneNotSupportedException {
        final Library copyLibrary = super.clone();
        copyLibrary.books = new HashSet<>(books);
        return copyLibrary;
    }
}