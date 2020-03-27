package com.jason.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student student = new Student("Jason", 77, 99);
        student.print();
        System.out.println("High score: " + student.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println("High score: " + student.highest());
    }
}
