package com.example.kotlinsprint

import kotlin.random.Random

fun main() {
    println("Введите длину пароля")
    val length = readln().toInt()

    println(generatePassword(length))
}

fun generatePassword(length: Int): String {
    val numbers = "0123456789"
    val symbols = "!\"#\$%&'()*+,-./ "

    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            val randomNumber = numbers[Random.nextInt(numbers.length)]
            password.append(randomNumber)
        } else {
            val randomSymbol = symbols[Random.nextInt(symbols.length)]
            password.append(randomSymbol)
        }
    }
    return password.toString()
}