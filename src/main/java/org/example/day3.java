package org.example;

public class day3 {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 3;
        int sum = number1 + number2;
        int diff = number2 - number1;
        int diff2 = number1 - number2;
        int product = number1 * number2;
        int quot = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("덧셈 : " + sum);
        System.out.println("뺄셈 : " + diff);
        System.out.println("곱셈 : " + product);
        System.out.println("나눗셈 : " + quot);
        System.out.println("나머지 : " + remainder);

        //int a = 10;
        //int b = 4;
        //int c = a / b;  // 2
        //double d = a / b;   // 2.0

        int a1 = 10;
        int b1 = 4;
        double c1 = (double)a1 / b1;  // 2.5
        System.out.println(c1);

        String str1 = "안녕하세요";
        String str2 = "만나서 반갑습니다";
        String str3 = str1 + str2;

        System.out.println(str3);  // Hello!Nice to meet you

        int x = 30;
        if ((x % 30 == 0) && ((x % 2 == 0) || (x % 5 == 0))) {
            System.out.println("hello");
        }

        int score = 95;
        String grade = (score == 95 && score % 5 == 0) ? "GOOD" : "BAD";
        System.out.println(grade);


        int a = 3;
        int b = 5;
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        }
        System.out.println(a > b ? "a is greater than b" : (a < b ? "a is less than b" : "b is equal to b"));

        int x1 = 10;
        System.out.println(x > 0 ? "양수" : (x < 0 ? "음수" : "0"));

        int score1 = 75;

        if (score1 >= 90) {
            System.out.println("A");
        } else if (score1 < 90 && score1 >= 80) {
            System.out.println("B");
        } else if (score1 < 80 && score1 >= 70) {
            System.out.println("C");
        } else if (score1 < 70 && score1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("윤년");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }

        int a2 = 10, b2 = 20, c2 = 30;
        System.out.println(a2 > b2 ? (a2 > c2 ? a2 : c2) : (b2 > c2 ? b2 : c2));

        int myScore = 75;
        int passScore = 60;
        System.out.println(myScore > passScore ? "합격" : "불합격");

        boolean x2 = false, y2 = false, z2 = false;
        if (x2 ^ y2) System.out.println("조건 1 충족");
        if (!(y2 ^ z2)) System.out.println("조건 2 충족");
        if (x2 || y2 || z2) System.out.println("조건 3 충족");
        if (!(x2 || y2 || z2)) System.out.println("조건 2 충족");

        String day = "수";

        switch (day) {
            case "월":
                System.out.println("책 읽기");
                break;
            case "화":
                System.out.println("공부하기");
                break;
            case "수":
                System.out.println("잠자기");
                break;
            case "목":
                System.out.println("운동하기");
                break;
            case "금":
                System.out.println("산책하기");
                break;
            case "토":
                System.out.println("달리기");
                break;
            case "일":
                System.out.println("여행가기");
                break;
            default:
                System.out.println("알 수 없는 입력");
        }

        String grade1 = "A";

        switch (grade1) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Below Average");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("알 수 없는 입력");
        }

        int score3 = 89;
        switch (score3/10) {
            case 10, 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

        int num1 = 99, num2 = 88;
        float reuslt = 0;
        char operator1 = '+';

        switch (operator1) {
            case '+':
                reuslt = num1 + num2;
                System.out.println(reuslt);
                break;
            case '-':
                reuslt = num1 - num2;
                System.out.println(reuslt);
                break;
            case '*':
                reuslt = num1 * num2;
                System.out.println(reuslt);
                break;
            case '/' :
                reuslt = num1 / num2;
                System.out.println(reuslt);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        String color = "red";
        switch (color){
            case "red":
                System.out.println("Apple");
                break;
            case "green":
                System.out.println("Grass");
                break;
            case "blue":
                System.out.println("Sky");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        String languages = "python";
        switch (languages){
            case "python":
                System.out.println("파이썬");
                break;
            case "java":
                System.out.println("자바");
                break;
            case "c++":
                System.out.println("C++");
                break;
            case "JavaScript":
                System.out.println("JavaScript");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
