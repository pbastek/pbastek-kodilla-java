package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import java.lang.String;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Sentence has to be decorated", (text) -> "ABC "+text+" ABC");
        poemBeautifier.beautify("Sentence has to be decorated", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Sentence has to be decorated", (text) -> "Sentence has been printed by means of lambda expression: \""+text+"\" !");
        poemBeautifier.beautify("Sentence has to be decorated", (text) -> text.replaceAll("\\s+",""));
    }
}