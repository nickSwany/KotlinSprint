package com.example.kotlinsprint

fun main() {
    println("Введите число")
    val userNumber = readln().toIntOrNull() ?: 0

    for (i in 0..userNumber) {
        if (i % 2 == 0) println(i)
    }
}