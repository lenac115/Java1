package org.example.day10;

public class KiaCar implements Car{

    @Override
    public String showEngine() {
        return "이것은 기아엔진입니다.";
    }

    @Override
    public int amountNavi() {
        return 100000;
    }

    @Override
    public String getTire() {
        return "이것은 기아타이어입니다.";
    }
}