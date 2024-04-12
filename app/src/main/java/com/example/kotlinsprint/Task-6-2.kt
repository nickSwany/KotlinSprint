package com.example.kotlinsprint

fun main() {

    println("Введите количество секунд, которое необходимо засечь")

    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        Thread.sleep(1000)
        if (i == 1) {
            println("Прошло $seconds секунд")
            return
        }
    }
}