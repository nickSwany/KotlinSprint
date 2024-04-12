package com.example.kotlinsprint

fun main() {

    println("Введите количество секунд которые нужно засечь")

    var seconds = readln().toIntOrNull() ?: 0

    while (seconds > 0) {
        println("Осталось секунд ${seconds--}")
        Thread.sleep(1000)
        if (seconds == 0) println("Время вышло")
    }
}