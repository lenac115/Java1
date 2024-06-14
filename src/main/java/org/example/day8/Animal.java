package org.example.day8;

public abstract class Animal {
    private String name;
    private String gender;
    protected String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();

    public void sleep () {
        System.out.println("zzz");
    }

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
