package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var rounds = 0
    var counterOfWins = 0
    do {
        val winners = game()
        if (winners) {
            println("Победило человечество")
            counterOfWins += 1
        } else println("Победила машина")
        rounds += 1
        println("Хотите бросить кости еще раз?")
        val userAnswer = readln()

    } while (userAnswer.equals("да", ignoreCase = true))

    println(
        """
        Количество сыгранных раундом - $rounds
        Количество побед человека - $counterOfWins
    """.trimIndent()
    )
}

fun rollDice(): Int {
    return Random.nextInt(1..6)
}

fun game(): Boolean {
    val humanNumber = rollDice()
    val terminator = rollDice()

    println(
        """
        Ходит человек ... На кубике выпало число - $humanNumber
        Ход переходит компьютеру ... На кубике выпало - $terminator
        """.trimIndent()
    )

    return humanNumber > terminator
}