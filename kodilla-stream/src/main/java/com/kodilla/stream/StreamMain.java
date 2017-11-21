package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "ABC "+text+" ABC");
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> toUpperCase(text));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> text.replaceAll("\\s+",""));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "This senstence has been printed with lambda expresion help: \""+text+"\"|^|");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        People.getList().stream()
                .map(s -> s.toUpperCase())
                //.forEach(System.out::println)
                //.filter(s -> s.length() > 11)
                .filter(s->s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(s->System.out.println(s));
    }
}