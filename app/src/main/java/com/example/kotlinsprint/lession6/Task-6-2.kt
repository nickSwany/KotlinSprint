package com.example.kotlinsprint

fun main() {

    println("Введите количество секунд, которое необходимо засечь")

    val seconds = readln().toIntOrNull() ?: 0

    Thread.sleep((seconds * 1000).toLong())
    println("Прошло $seconds секунд")
}