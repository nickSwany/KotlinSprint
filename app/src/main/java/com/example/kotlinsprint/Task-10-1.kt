package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    winners()
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

fun winners() {
    val winners = game()
    if (winners) println("Победило человечество")
    else println("Победила машина")
}