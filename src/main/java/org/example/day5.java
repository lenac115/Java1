package org.example;

import java.util.*;

public class day5 {
    public static void main(String[] args) {
        weeklyTest();
    }

    public static void func1() {
        String[] words = {"apple", "banana", "cherry", "durian"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                System.out.println(words[i] + " " + words[j]);
            }
        }
    }

    public static void func2() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int ranNum = r.nextInt(44) + 1;
            arr.add(ranNum);
            System.out.println(arr);
            for (int j = 0; j < arr.toArray().length - 1; j++) {
                if (arr.get(j) == ranNum) {
                    arr.remove(i);
                    i--;
                    break;
                }
            }
        }
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
    }

    public static void func3() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            boolean quit = false;
            boolean reset = false;
            System.out.println("계절을 맞춰보세요. 1. 봄 2. 여름 3. 가을 4. 겨울 5. 종료");
            int num1 = sc.nextInt();

            switch (num1) {
                case 1:
                    System.out.println("봄");
                    break;
                case 2:
                    System.out.println("여름");
                    break;
                case 3:
                    System.out.println("가을");
                    break;
                case 4:
                    System.out.println("겨울");
                    break;
                case 5:
                    System.out.println("종료합니다");
                    quit = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    reset = true;
            }
            if (reset) {
                continue;
            }
            if (quit) {
                break;
            }
        }
    }

    public static void func4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("영화 제목은?");
        String title = sc.nextLine();

    }

    public static void weeklyTest() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("원하는 기능을 선택하세요.");
            int input;
            while (true) {
                try {
                    System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
                    input = sc.nextInt();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("숫자를 입력해주세요");
                }
            }

            float num1, num2;
            boolean quit = false;

            switch (input) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                            num1 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                            num2 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                            break;
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.out.println("숫자를 입력해주세요");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                            num1 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                            num2 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                            break;
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.out.println("숫자를 입력해주세요");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                            num1 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                            num2 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                            break;
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.out.println("숫자를 입력해주세요");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        try {
                            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
                            num1 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
                            num2 = sc.nextFloat();
                            sc.nextLine();
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                            break;
                        } catch (InputMismatchException e) {
                            sc.nextLine();
                            System.out.println("숫자를 입력해주세요");
                        }
                    }
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    quit = true;
                    break;
                default:
                    System.out.println("올바른 입력이 아닙니다");
                    break;
            }

            if(quit) {
                quit = false;
                break;
            }
        }
    }
}
