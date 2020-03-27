package com.jason.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun highestTest() {
        val student = Student("Jason", 90, 70)
        Assertions.assertEquals(90, student.highest())
    }

    @Test
    fun averageTest() {
        val student = Student("Jason", 90, 70)
        Assertions.assertEquals((70+90)/2, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student("Jason", 90, 70)
        Assertions.assertEquals('B', student.grading())
    }
}
