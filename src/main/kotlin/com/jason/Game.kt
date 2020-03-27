package com.jason

import java.util.*

fun main() {
    val secret = Random().nextInt(10) + 1;
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret) {
        print("Please enter a number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        println(
            if(number < secret)
                "Higher"
            else if(number > secret)
                "Lower"
            else
                "Great, the number is $secret"
        )
    }
}