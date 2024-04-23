package com.example.kotlinsprint

fun main() {

    val char = "abcdefghijklmnopqrstuvwxyz"
    val numbers = "0123456789"

    val passwordLength = 6
    val random = java.util.Random()
    val passwordStrBuiilding = StringBuilder()

    for (i in 0 until passwordLength) {
        if (i % 2 == 0) {
            val randomChar = char[random.nextInt(char.length)]
            passwordStrBuiilding.append(randomChar)
        } else {
            val randomNumber = numbers[random.nextInt(numbers.length)]
            passwordStrBuiilding.append(randomNumber)
        }
    }
    println(passwordStrBuiilding)
}