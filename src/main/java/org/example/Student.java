package org.example;

public class Student {

    int level;

    public Student() {
        this.level = 1;
    }

    public void levelUp() {
        level++;
        System.out.println(level);
    }

    public void levelDown() {
        if(level <= 1) {
            System.out.println("1보다 낮을 수 없습니다.");
            return;
        }
        level--;
        System.out.println(level);
    }
}
