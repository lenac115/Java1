package org.example.weeklytest2;

import java.util.List;

public interface BookManager<T> {

    void addBook(Book<T> book);
    void removeBook(Book<T> book);
    List<Book<T>> searchByTitle(String title);
    List<Book<T>> searchByAuthor(String author);
}
