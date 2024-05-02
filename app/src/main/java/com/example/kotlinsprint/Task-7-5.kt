package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

const val MIN_LENGTH_PASSWORD = 6

fun main() {
    val char = 'a'..'z'
    val charUpper = 'A'..'Z'
    val numbers = '0'..'9'

    val passwordStr = StringBuilder()
    var passwordLength: Int

    do {
        println("Введите длину пароля. Минимальная длина пароля должна составлять 6 символов")
        passwordLength = readln().toInt()
    } while (passwordLength < MIN_LENGTH_PASSWORD)

    for (i in 0 until passwordLength) {
        val randomChar = char.random()
        val randomCharUpper = charUpper.random()
        val randomNumber = numbers.random()
        when (Random.nextInt(1..3)) {
            1 -> passwordStr.append(randomChar)
            2 -> passwordStr.append(randomCharUpper)
            3 -> passwordStr.append(randomNumber)
        }
    }

    println(passwordStr)
}