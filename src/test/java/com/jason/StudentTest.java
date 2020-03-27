package com.jason;

import com.jason.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestScoreTest() {
        Student student = new Student("Jason", 88, 99);
        Assertions.assertEquals(99, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("JJ", 90, 80);
        Assertions.assertEquals((90+80)/2, student.getAverage());
    }
}
