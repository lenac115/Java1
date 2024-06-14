package org.example.day8;

public class Parent {

    private int money;

    public void save10000Money() {
        money += 10000;
    }

    public void method1() {
        System.out.println("메소드 1 호출");
    }

    public void method2() {
        System.out.println("메소드 2 호출");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public Parent(int money) {
        this.money = money;
    }
}
