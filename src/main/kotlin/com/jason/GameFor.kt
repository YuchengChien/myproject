package com.jason

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1
    println(secret);
    val scanner = Scanner(System.`in`);
    for(i in 1..4) {
        print("Please enter a number: ")
        var number = scanner.nextInt()
        println("your input($i): $number")
        if(number > secret) {
            println("Lower")
        } else if(number  < secret) {
            println("Higher")
        } else {
            println("Great, the number is $secret")
            break;
        }
    }
}