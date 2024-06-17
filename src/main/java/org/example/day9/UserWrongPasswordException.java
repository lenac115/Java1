package org.example.day9;

public class UserWrongPasswordException extends Exception {
    public UserWrongPasswordException(String message) {
        super(message);
    }
}
