package org.example.day8;

public abstract class Phone {
    private String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("폰전원을 킵니다.");
    }

    public void turnOff() {
        System.out.println("폰전원을 끕니다.");
    }
}
