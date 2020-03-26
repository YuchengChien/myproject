package com.jason

fun main() {
//    println("Hello kotlin")
    val h = Human(weight = 66.5f, height = 1.7f);
    h.hello()
    println(h.bmi())
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
        val bmi = weight / (height * height);
        return bmi;
    }
    fun hello() {
        println("Hello kotlin")
    }
}