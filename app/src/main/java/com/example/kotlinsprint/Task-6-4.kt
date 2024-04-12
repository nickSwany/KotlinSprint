package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var attemp = 5

    println(
        """
        Это небольшая игра, где вам необходимо угадать число в диапозоне от 1 до 9.
        У вас есть только 5 попыток.
    """.trimIndent()
    )

    val number = Random.nextInt(1..9)

    while (attemp > 0) {
        println("Введите ваше число")
        val userNumber = readln().toIntOrNull() ?: 0

        if (userNumber == number) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Увы, неверно!\nОсталось ${--attemp} попыток")
            if (attemp == 0) println("Было загадано число $number")
            continue
        }
    }
}