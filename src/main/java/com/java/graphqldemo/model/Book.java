package com.java.graphqldemo.model;

import java.util.Arrays;
import java.util.List;

public record Book(String id, String name, int pageCount, String authorId) {
    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 224, "author-2"),
            new Book("book-3", "Interview with the vampire", 225, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.id().equals(id)).findFirst().orElse(null);
    }
}
