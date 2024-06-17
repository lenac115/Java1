package org.example.day9;

public class BankApplication {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        try {
            account.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
