package org.example.house.example;

import org.example.house.Animal;

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "cat";
        cat.gender = "male";

        System.out.println(cat.name);
        System.out.println(cat.gender);
    }
}
