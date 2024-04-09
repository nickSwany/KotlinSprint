package com.example.kotlinsprint

const val THIS_YEAR = 2024
const val MIN_AGE = 18

fun main() {
    println("Введите год рождения")

    val ageOfBirth = readLine()!!.toInt()

    val userAge = THIS_YEAR - ageOfBirth

    val resultText = if (userAge >= MIN_AGE) "Показать экран со скрытым контентом"
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}