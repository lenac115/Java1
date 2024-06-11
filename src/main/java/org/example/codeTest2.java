package org.example;

public class codeTest2 {
    public static void main(String[] args) {
        //System.out.println(printAt("hello", 0));
        System.out.println(speedRace(83, true));
        System.out.println(twoSumOne(6, -2, 8));
        System.out.println(isOrdered(1, 1, 2, true));
        System.out.println(isCool(22));
        System.out.println(isCool(23));
        System.out.println(isCool(24));
        System.out.println(secomDalcom(1));
        System.out.println(secomDalcom(2));
        System.out.println(secomDalcom(3));
        System.out.println(secomDalcom(15));
        System.out.println(secomDalcom(20));
        System.out.println(sumUnique(1, 2, 3)); // 6
        System.out.println(sumUnique(3, 2, 3)); // 2
        System.out.println(sumUnique(3, 3, 3)); // 0

        System.out.println(repeatChar("THE"));
        System.out.println(starSideDel("cd*zq"));
        System.out.println(starSideDel("ab**cd"));
        System.out.println(starSideDel("wac*y*xko"));
    }

    public static String printAt(String str, int i) {
        if (str.length() <= 1)
            return str;
        return str.charAt(i) + "@" + printAt(str.substring(i + 1), i + 1);
    }

    public static String printAtAnswer(String str) {

        if (str.length() <= 1)
            return str;
        return str.charAt(0) + "@" + printAtAnswer(str.substring(1));
    }

    static int speedRace(int speed, boolean isHoliday) {
        if (isHoliday) {
            if (speed >= 86) {
                return 200;
            } else if (speed >= 66) {
                return 100;
            } else {
                return 0;
            }
        } else {
            if (speed >= 81) {
                return 200;
            } else if (speed >= 61) {
                return 100;
            } else {
                return 0;
            }
        }
    }

    static int speedRacerAnswer(int speed, boolean isHoliday) {
        int safeSpeed = 60;
        int dangerSpeed = 80;
        int tax = 0;

        if (isHoliday) {
            safeSpeed += 5;
            dangerSpeed += 5;
        }
        if (speed > dangerSpeed) {
            tax = 200;
        }
        if (speed <= safeSpeed) {
            tax = 0;
        }
        if (speed > safeSpeed && speed <= dangerSpeed) {
            tax = 100;
        }
        return tax;
    }

    public static boolean twoSumOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isOrdered(int first, int second, int third, boolean opt) {
        if (opt) {
            if (third > first && third > second) {
                return true;
            } else {
                return false;
            }
        } else {
            if (third > second && second > first) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isOrderedAnswer(int first, int second, int third, boolean opt) {
        if (opt) {
            return second < third;
        }
        return (first < second) && (second < third);
        //return opt ? second < third : (first < second) && (second < third);
    }

    public static boolean isCool(int n) {
        if (n < 0) return false;
        return n % 11 == 0 || n % 11 == 1;
    }

    public static String secomDalcom(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) return "새콤달콤!";
            return "새콤!";
        } else if (n % 5 == 0) {
            return "달콤!";
        }

        return Integer.toString(n) + "!";
    }

    public static String secomDalcomAnswer(int n) {
        boolean secom = n % 3 == 0;
        boolean dalcom = n % 5 == 0;

        if (secom && dalcom) return "새콤달콤!";
        else if (secom) return "새콤!";
        else if (dalcom) return "달콤!";
        return Integer.toString(n) + "!";
    }

    public static int sumUnique(int a, int b, int c) {
        if (a != b) {
            if (a != c && b != c) {
                return a + b + c;
            } else if (a == c) {
                return b;
            } else if (b == c) {
                return a;
            }
        } else {
            if (a != c) {
                return c;
            }
        }
        return 0;
    }

    public static String repeatChar(String str) {
        if (str.length() == 1)
            return str + str;
        return String.valueOf(str.charAt(0)) + str.charAt(0) + repeatChar(str.substring(1));
        // 맨 앞의 charAt에 valueOf 메소드 제외 시 아스키 코드로 출력됨. 뒤에 나오는 + str.charAt(0)도 무시됨
        // String 자료형에 char 들끼리만 합치게 된다면 유니코드로 변환됨
    }

    public static String starSideDel(String str) {
        int idx = 0;
        String result = str;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '*') {
                idx = i;
                while (true) {
                    if (result.charAt(idx + 1) == '*') {
                        idx++;
                        continue;
                    }
                    break;
                }
                result = result.substring(0, i - 1) + result.substring(idx + 2);
                i = 0;
            }
        }
        return result;
    }

    static String starSideDelAnswer(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            // 현재 문자가 *인 경우
            if (str.charAt(i) == '*') {
                // 두번 건너뛰도록 만들겠습니다.
                i++;
                continue;
            }

            // 현재 문자가 *이 아닌 경우
            if ((i == 0 || str.charAt(i - 1) != '*') && (i == str.length() - 1 || str.charAt(i + 1) != '*')) {
                result += String.valueOf(str.charAt(i));
            }
        }
        return result;
    }
}
