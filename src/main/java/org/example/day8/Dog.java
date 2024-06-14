package org.example.day8;

public class Dog extends Animal {

    int age;
    public void sleep(int times) {
        System.out.println(times + " 초 동안 자는중");
    }

    public Dog (int age, String name, String gender) {
        super(name, gender);
        this.age = age;
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("월월");
    }
}
