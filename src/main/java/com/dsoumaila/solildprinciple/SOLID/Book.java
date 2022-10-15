package com.dsoumaila.solildprinciple.SOLID;

public class Book {
    private String name;
    private String author;
    private String text;

    public Book() {
    }

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
