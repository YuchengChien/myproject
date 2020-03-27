package com.jason.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum = 0;
        for(int i=0; i<=10; i++) {
            sum = sum +i;
        }
        System.out.println(sum);*/
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i <=4; i++) {
            System.out.println("Please enter a number: (" + i + "/4):");
            int number = scanner.nextInt();
            System.out.println("your input(" + i + "): " + number);
            if(number > secret) {
                System.out.println("Lower");
            } else if(number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great, the number is " + number);
                break;
            }
        }
        System.out.println("end");
    }
}
 