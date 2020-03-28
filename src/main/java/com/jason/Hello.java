package com.jason;


import com.jason.kotlin.Student;

public class Hello {
    public static void main(String[] args) {
        Student student = new Student("Jason", 60, 70);
//        student.h
//        System.out.println("Hello world");
        String  s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Jason",66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score > 80 && score < 90);
        char c = 'A';
        System.out.println(c > 'a');
        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;*/
    }
}
