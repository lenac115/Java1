package org.example.day9;

import javax.naming.InsufficientResourcesException;

public class BankAccount {

    public static void main(String[] args) {

        try {
            withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println("에러");
        }
    }

    private static int balance = 0;

    public static void withdraw(int amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("잔액이 부족합니다.");
        }
        balance -= amount;
    }
}
