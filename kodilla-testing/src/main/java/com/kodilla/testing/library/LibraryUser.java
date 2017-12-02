package com.kodilla.testing.library;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@ToString
@Getter
public class LibraryUser {
    String firstname;
    String lastname;
    String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }
}
