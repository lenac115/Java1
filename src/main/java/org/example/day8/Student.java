package org.example.day8;

public class Student extends Person{
    int studenterNo;

    public Student(String name, String ssn, int studenterNo) {
        super(name, ssn);
        this.studenterNo = studenterNo;
    }
}
