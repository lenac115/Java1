package org.example.day9;

public class User {

    String email;
    String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void checkPassword(String password) throws UserWrongPasswordException {
        if (password.equals(this.password)) {
            throw new UserWrongPasswordException("패스워드가 틀립니다");
        }
    }
}
