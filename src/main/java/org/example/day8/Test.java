package org.example.day8;

public class Test {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        InheritB inheritB1 = new InheritB();
        inheritB.field1 = 100;
        inheritB.field2 = "공부";
        inheritB.method1();
        inheritB.method2();
        inheritB1.method1();

        Child child = new Child(1000000,33);
        child.save10000Money();
        child.investMoney();
        child.method1();
        child.method2();
        child.method3();

        Dog dog = new Dog(27, "용팔이", "남");
        dog.setName("용팔이");
        dog.sleep(10000);
        dog.sleep();

        Student student = new Student("명섭", "a", 1);

        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studenterNo);

        Computer computer = new Computer();
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));

        computer.say();
        System.out.println("원 면적 : " + computer.areaCircle(r));

        SmartPhone smartPhone = new SmartPhone("김창섭");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();
    }
}
