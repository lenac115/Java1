package org.example.weeklytest2;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {

    private Stack<Book<T>> books;

    public BookStack() {
        books = new Stack<>();
    }

    public void pushBook(Book<T> book) {
        books.push(book);
    }

    public Book<T> popBook() throws EmptyStackException {
        Book<T> book;
        try {
            book = books.pop();
        } catch (EmptyStackException e) {
            throw new EmptyStackException();
        }
        return book;
    }

    public Book<T> peekBook() throws EmptyStackException {
        Book<T> book;
        try {
            book = books.peek();
        } catch (EmptyStackException e) {
            throw new EmptyStackException();
        }
        return book;
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}
