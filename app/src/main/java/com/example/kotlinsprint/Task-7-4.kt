package com.example.kotlinsprint

fun main() {
    println("Введите количество секунд")
    val userSeconds = readln().toIntOrNull() ?: 0

    for (i in userSeconds downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}