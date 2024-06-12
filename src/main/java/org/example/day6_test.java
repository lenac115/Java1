package org.example;

public class day6_test {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public day6_test(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 원이 입금되었습니다.");
        } else {
            System.out.println("유효하지 않는 금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0) {
            balance -= amount;
            System.out.println(amount + " 원이 출금되었습니다.");
        } else if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public String printBalance() {
        return "현재 잔액 : " + balance;
    }
}
