package org.example;

public class day7 {

    public static void main(String[] args) {
        SeongJo seongJo12 = new SeongJo(100, 5000);
        Food food = new Food(50, 30, "사탕");

        seongJo12.buyFood(food); // 4950

        System.out.println(seongJo12.money);
        seongJo12.eatFood(food); // 130
        seongJo12.eatFood(food); // 160
        System.out.println(seongJo12.weight); // 160
        System.out.println(seongJo12.fat); // true

        day7_Person day7Person = new day7_Person("창섭", 27, "남", "대한민국");
        day7Person.intorduce();
        day7Person.sayHello();

        day7_Person okay = new day7_Person("123", 123, "123", "123");
    }
}
