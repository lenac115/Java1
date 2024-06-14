package org.example.day8;

public class Cat extends Animal{
    public Cat(String name, String gender) {
        super(name, gender);
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("miumiu");
    }
}
