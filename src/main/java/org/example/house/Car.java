package org.example.house;

public class Car {
    protected String company = "weniv";
    private int speed;
    private int gear = 1;

    public Car(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        int firstSpeed = 30;
        int minSpeed = 0;
        int secondSpeed = 70;
        int thirdSpeed = 120;

        if (minSpeed > speed) {
            speed = minSpeed;
        }
        if (speed > thirdSpeed) {
            speed = thirdSpeed;
        }

        if (speed > secondSpeed && gear != 3) {
            gear = 3;
        } else if (speed > firstSpeed && gear != 2) {
            gear = 2;
        } else if (speed >= minSpeed && gear != 1) {
            gear = 1;
        }
        this.speed = speed;
    }

    public void checkSpeed() {
        System.out.println(this.speed);
        System.out.println(this.gear);
        System.out.println(this);
    }
}
