package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    while (true) {
        val numberAuthorization = Random.nextInt(1000..9999)

        println("Ваш код авторизации: $numberAuthorization\nВведите код авторизации")

        val userNumber = readln().toIntOrNull() ?: 0

        if (userNumber == numberAuthorization) break
    }
    println("Добпро пожаловать!")
}