package com.jason.kotlin

import java.io.FileReader

val menu = HashMap<String, Item>();

fun printMenu() {
    menu.forEach() {
        println(it.value.toString())
    }
}

fun main() {
    val mcdonalds = Mcdonalds()
    printMenu()
}

class Mcdonalds () {
    init {
        val file = FileReader("mcdonalds.txt")
        file.readLines().forEach() {
            val tokens = it.split(",")
            val item = Item(
                tokens[0],
                tokens[1],
                tokens[2].toInt(),
                tokens[3].toInt())
            menu[tokens[0]] = item
        }
    }
}

class Item(val id : String, val name : String, val calorie : Int, val price : Int) {
    override fun toString(): String {
        return "$id\t$name\t$calorie\t$price"
    }
}

