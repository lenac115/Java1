package org.example.day10;

public class SamsungPhone implements Phone, Good{
    @Override
    public String call() {
        return "삼성폰이 전화를 겁니다.";
    }

    @Override
    public String answerThePhone() {
        return "삼성폰이 전화를 받습니다.";
    }

    @Override
    public String okay() {
        return "";
    }
}
