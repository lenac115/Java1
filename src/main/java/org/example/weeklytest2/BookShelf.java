package org.example.weeklytest2;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager {

    private List<Book<T>> books;


    public BookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public List<Book<T>> searchByTitle(String title) {
        for(Book book : books) {
            if(book.getTitle().contains(title)) {
                return List.of(book);
            }
        }
        return List.of();
    }

    @Override
    public List<Book<T>> searchByAuthor(String author) {
        for(Book book : books) {
            if(book.getAuthor().contains(author)) {
                return List.of(book);
            }
        }
        return List.of();
    }
}
