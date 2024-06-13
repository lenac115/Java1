package org.example.house;

public class Test {
    public static void main(String[] args) {
        HouseKim houseKim = new HouseKim();
        System.out.println(houseKim.myHome);

        Car car = new Car(0, 1);
        car.setSpeed(100);
        car.checkSpeed();
    }
}
