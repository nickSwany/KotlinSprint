package com.example.kotlinsprint

import kotlin.random.Random

fun main() {

    val char = ('a'.toInt()..'z'.toInt())
    val numbers = ('0'.toInt()..'9'.toInt())

    val passwordLength = 6
    val passwordStrBuiilding = StringBuilder()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            val randomChar = Random.nextInt(char.first, char.last + 1).toChar()
            passwordStrBuiilding.append(randomChar)
        } else {
            val randomNumber = Random.nextInt(numbers.first, numbers.last + 1).toChar()
            passwordStrBuiilding.append(randomNumber)
        }
    }
    println(passwordStrBuiilding)
}