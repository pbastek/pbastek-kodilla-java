package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    private Library library;

    @Before
    public void beforeTest() {
        library = new Library("Public library");
        IntStream.range(0, 10)
                .forEach(number -> library.getBooks().add(new Book("Book" + number, "Author" + number, LocalDate.now())));
    }

    @Test
    public void should_returnShallowCopy() throws CloneNotSupportedException {
        //Given
        final Library copyLibrary = library.shallowCopy();

        //When
        library.getBooks().remove(new Book("Book0", "Author0", LocalDate.now()));

        //Then
        Assert.assertEquals(copyLibrary, library);
        Assert.assertEquals(9, copyLibrary.getBooks().size());
        Assert.assertEquals(9, library.getBooks().size());
    }

    @Test
    public void should_returnDeepCopy() throws CloneNotSupportedException {
        //Given
        final Library copyLibrary = library.deepCopy();

        //When
        library.getBooks().remove(new Book("Book0", "Author0", LocalDate.now()));

        //Then
        Assert.assertNotEquals(copyLibrary, library);
        Assert.assertEquals(10, copyLibrary.getBooks().size());
        Assert.assertEquals(9, library.getBooks().size());
    }
}