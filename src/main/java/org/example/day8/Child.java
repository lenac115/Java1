package org.example.day8;

public class Child extends Parent {

    int score;
    String name;

    public Child(int money) {
        super(money);
    }

    public Child(int money, int score) {
        super(money);
        this.score = score;
    }

    public Child(int money, int score, String name) {
        super(money);
        this.score = score;
        this.name = name;
    }


    public void investMoney() {
        this.setMoney(this.getMoney() - 10000);
    }

    public void method2() {
        System.out.println("차일드 메소드 2 호출");
    }

    public void method3() {
        System.out.println("메소드 3 호출");
    }
}
