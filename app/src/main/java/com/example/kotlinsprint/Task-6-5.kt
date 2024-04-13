package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var attemp = 3

    println("Необходимо пройти регистрацию\n\nПридумайте логин для входа.")

    val userLogin = readln()

    println("Придумайте пароль")

    val userPassword = readln()

    do {
        println("Введите логин")
        val login = readln()
    } while (login != userLogin)

    do {
        println("Введите пароль")
        val password = readln()
    } while (password != userPassword)

    do {
        val number1 = Random.nextInt(1..9)
        val number2 = Random.nextInt(1..9)
        val sumNumbers = number1 + number2
        println(
            """
            Необходимо доказать, что вы не бот, ответьте правильно на следующую математический пример
            У вас осталось $attemp попытки
            Сколько будет $number1 + $number2
        """.trimIndent()
        )
        val userAnswer = readln().toIntOrNull() ?: 0
        if (userAnswer == sumNumbers) break
        else attemp--
    } while (attemp > 0)

    if (attemp == 0) println("Доступ запрещен.")
    else println("Добро пожаловать!")
}