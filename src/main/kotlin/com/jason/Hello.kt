package com.jason

fun main() {
//    println("Hello kotlin")
    val h = Human();
    h.hello()
    var age = 19
    var name: String = "Jason"
    println("$name:$age")
}

class Human{
    fun hello() {
        println("Hello kotlin")
    }
}