package org.example;

public class day6 {
    public static void main(String[] args) throws InterruptedException {
        day6_2 day62 = new day6_2();
        day62.good();
        System.out.println(day62.add(1, 2));
        System.out.println(day62.sub(3, 4));

        day6_Person man1 = new day6_Person("김창섭", 012030233340, 9999999, 27);
        day6_Person man2 = new day6_Person("김창섭2", 012030233340, 9999999, 27);
        day6_Person man3 = new day6_Person("김창섭1", 01320303340, 9999999, 27);
        man1.sayHello();
        man2.sayHello();
        man3.sayHello();
        Student student1 = new Student();
        Student student2 = new Student();
        man1.teaching(student1);
        man2.teaching(student2);

        human me = new human("Kim", 27, "student", "01091736737", "siheung", "guro", "14995");
        me.getPhone().addFriend(new human("Lee",26, "none", "01052256737", "siheung", "gasan", "15555"));
        me.calling(me.searchPhoneName(me.getPhone(), "0102256737"));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static boolean logIn(String email, String password) {

        return false;
    }
}
