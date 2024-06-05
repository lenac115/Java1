package org.example;

import java.util.stream.IntStream;

public class day4 {
    public static void main(String[] args) {
        int i = 10;
        int result = 0;
        while (i >= 0) {
            System.out.println("현재 카운트 : " + i);
            if (i == 0) System.out.println("카운트 종료");
            i--;
        }

        func2();
        func1();
        func3();
        func4();
        func5();
        func6();
        func7();
        func8();
        func9();
        quiz1();
        quiz2();
    }

    public static void func2() {
        int i = 100;
        int result = 0;

        while (i >= 0) {
            result += i;
            System.out.println("결과 : " + result);
            i--;
        }
    }

    public static void func1() {
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int i = 0;
        int result = 0;
        while (numbers.length > i) {
            result += numbers[i];
            i++;
        }
        System.out.println((float) (result / numbers.length));
    }

    public static void func3() {
        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int positiveSum = 0;
        int negativeSum = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            } else {
                negativeSum += numbers[i];
            }
            i++;
        }
        System.out.println(positiveSum);
        System.out.println(negativeSum);
    }

    public static void func4() {
        int n = 100;
        int result = 0;
        int res = IntStream.rangeClosed(1, n).filter(i -> (i % 3 == 0) && (i % 5 == 0)).sum();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(res);
        System.out.println(result);
    }

    public static void func5() {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void func6() {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        for (int i = 3; i < 11; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }

    public static void func7() {
        long[] arr = new long[100];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void func8() {
        for (int i = 9; i > 1; i--) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void func9() {
        String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
        for (String str : arr) {
            if (str.length() >= 5) {
                System.out.println(str);
            }
        }
    }

    public static void quiz1() {
        int count = 1;
        while (count < 10000) {
            count++;
        }
        System.out.println(count);
    }

    public static void quiz2() {
        for (int i = 9; i > 1; i--) {
            for (int j = 9; j > 0; j--) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
