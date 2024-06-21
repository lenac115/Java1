package org.example.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Kim1");
        MyThread myThread2 = new MyThread("Kim2");
        MyThread myThread3 = new MyThread("Kim3");
        MyThread myThread4 = new MyThread("Kim4");
        MyThread myThread5 = new MyThread("Kim5");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        callList(list);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.removeIf((integer) -> integer % 2 == 0);
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
            System.out.println(numbers);
        }

        for (Integer i : numbers) {
            if (i % 2 == 0) {
                numbers.remove(i);
            }
        }
    }

    private static void callList(List<Integer> list) {

        for (int i : list) {
            System.out.println(i);
        }
    }
}
