package com.jason;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person("Jason",66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;*/
    }
}
