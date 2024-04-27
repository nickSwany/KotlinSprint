package com.example.kotlinsprint

import kotlin.random.Random

fun main() {

    val char = 'a'..'z'
    val numbers = '0'..'9'

    val passwordLength = 6
    val passwordStrBuiilding = StringBuilder()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            val randomChar = char.random()
            passwordStrBuiilding.append(randomChar)
        } else {
            val randomNumber = numbers.random()
            passwordStrBuiilding.append(randomNumber)
        }
    }
    println(passwordStrBuiilding)
}