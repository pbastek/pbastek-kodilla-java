package com.kodilla.stream.beautifier;

import java.lang.String;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(text));
    }
}