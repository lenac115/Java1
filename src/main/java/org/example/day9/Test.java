package org.example.day9;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int i  = scanner.nextInt();
            scanner.nextLine();
            int j = scanner.nextInt();
            if(j == 0)
                throw new ArithmeticException();
            int result = i / j;
            System.out.println(result);
            //divide(10, 0);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("스캐너를 종료합니다");
        }

        System.out.println("정상적으로 종료됐습니다.");

        try {
            int size = scanner.nextInt();
            int[] array = new int[size];
            scanner.nextLine();
            int num = 0;
            int select;
            while (true) {
                System.out.println("1. 배열 주입 2. 주입 종료");
                select = scanner.nextInt();
                scanner.nextLine();
                if (select == 1){
                    array[num] = scanner.nextInt();
                    scanner.nextLine();
                    num += 1;
                } else if(select == 2){
                    break;
                } else {
                    throw new ArithmeticException();
                }

            }
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("에러");
        }




        scanner.close();
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if (a/b == 0){
            throw new ArithmeticException();
        } else {
            throw new NullPointerException();
        }
    }

}
