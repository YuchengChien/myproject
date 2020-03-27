package com.jason.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(7);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(2);
        System.out.println(list.size());
        List<Integer> scores =
                Arrays.asList(68, 88, 77, 99, 50);
        for(int score: scores) {
            System.out.println(score);
        }

//        arrayTest();
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
        int[] scores = {69, 77, 33};
        System.out.println(scores);
        for(int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
        for(int n : scores) {
            System.out.println(n);
        }
    }
}
