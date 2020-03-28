package com.jason.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 50;
        Student student = new Student("Jason", 77, 99);
        Student student2 = new Student("Tom", 60, 40);
        Student student3 = new Student("Jane", 30, 55);
        GraduateStudent graduateStudent = new GraduateStudent("Jack",
                55, 66, 60);
        graduateStudent.print();
        student.print();
        student2.print();
        student3.print();
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
