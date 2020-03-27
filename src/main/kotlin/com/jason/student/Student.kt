package com.jason.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val student = Student("Jason", 77,  99)
    val student1 = Student("Jane", 44,  68)
    val student2 = Student("Eric", 30,  40)
    student.print()
    student1.print()
    student2.print()
    println("High score: ${student.highest()}")
}

class Student(var name:String?, var english:Int, var math:Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            print("testing")
        }
    }
    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading() = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }
    fun passOrFailed() = if(getAverage() >= pass) "PASS" else "FAILED"

    fun getAverage() = (english + math)/2

    fun highest() = if(english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() {
        println(name?.length)
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = scanner.next();
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt();
    print("Please enter student's math:")
    var math = scanner.nextInt();

    val student = Student(name, english, math)
    student.print()
    student.nameCheck()
}
