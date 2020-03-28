package com.jason

import com.jason.kotlin.Student

fun main() {
    val student = Student("Jason", 50, 50)
    student.grading()
//    println("Hello kotlin")
    var s:String?  =  "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(weight = 66.5f, height = 1.7f)
    h.hello()
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c : Char = 'A'
    println(c.toInt() > 60)
    /*var age = 19
    var name: String = "Jason"
    println("$name:$age")*/
}

class Human(var name : String = "", var weight :  Float, var height : Float){
    init {
        println("test $weight")
    }
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)
    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
}
    fun hello() {
        println("Hello kotlin")
    }
}