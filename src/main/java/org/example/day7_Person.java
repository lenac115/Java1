package org.example;

public class day7_Person {

    String name;
    int age;
    int gold = 999999;
    final String GENDER;
    final String NATIONALITY;

    public day7_Person(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.GENDER = gender;
        this.NATIONALITY = nationality;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + this.name);
    }

    public void intorduce() {
        System.out.println("I am " + this.age + " years old.");
    }

    void sayHelloDefault() {
        System.out.println("Hello my name is " + this.name);
    }

    protected void sayHelloProtected() {
        System.out.println("Hello my name is " + this.name);
    }

    private void sayHelloPrivate() {
        System.out.println("Hello my name is " + this.name);
    }


    private String checkAmount(int amount) {
        if (amount > this.gold) {
            return "요청하신 금액이 너무 큽니다.";
        }
        return "정상처리되었습니다.";
    }

    public String deposit(int amount) {
        return checkAmount(amount);

    }

}
