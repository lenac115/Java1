package org.example;

public class codeTest {

    public static void main(String[] args) {


    }

    public static String func1(String str) {
        if (str.length() < 3) {
            return str;
        }

        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public static void func2(String str) {
        String[] str1 = str.split(": ");
        int index = 1;
        while (index < str1.length) {
            str1[index] = str1[index].substring(0, str1[index].indexOf(", "));
            System.out.println(str1[index]);
            index++;
        }
    }

    public static void func2Answer(String str) {
        int i = 0;
        while (true) {
            int idx = str.indexOf("category:", i);
            if (idx == -1) {
                break;
            }

            int startIdx = idx + 10;
            int endIdx = str.indexOf(',', startIdx);

            System.out.println(str.substring(startIdx, endIdx));

            i = endIdx + 1;
        }
    }

    public static void func3(String str) {
        String[] arrStr = str.split(" ");

        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length(); j++) {
                System.out.println(arrStr[i].charAt(j));
            }
        }

        for (int i = arrStr.length - 1; i >= 0; i--) {
            for (int j = arrStr[i].length() - 1; j >= 0; j--) {
                System.out.println(arrStr[i].charAt(j));
            }
        }
    }

    public static int func4(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static String barkingDogProblem(boolean bark, int hour) {
        if (bark == true && (hour < 7 || hour > 20)) {
            return "짖으면 안돼!";
        } else {
            return "든든하군!";
        }
    }

    public static int printNumber(int num) {
        if (num == 0) {
            return 0;
        } else {
            System.out.println(num);
            return printNumber(num - 1);
        }
    }


    public class MyClass {
        public static int staticNum = 0;

        public static void staticMethod() {
            System.out.println("this is static method");
        }
    }
}

