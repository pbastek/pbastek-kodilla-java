package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import lombok.Getter;

@Getter
public class BookSignature {

    private final String signature;

    public BookSignature(final String signature) {
        this.signature = signature;
    }
}
