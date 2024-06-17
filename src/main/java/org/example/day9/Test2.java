package org.example.day9;

public class Test2 {
    public static void main(String[] args) {

        try {
            int[] members = {1,2,3};
            System.out.println(members[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("에러");
        }
    }
}
