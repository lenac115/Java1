package org.example;

public class day6_Person {

    String name;
    int phoneNumber;
    int money;
    int age;

    public day6_Person(String name, int phoneNumber, int money, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("my name is" + this.name);
    }

    public void teaching(Student student) {
        student.levelUp();
    }

    public void cheating(Student student) {
        student.levelDown();
    }
}
