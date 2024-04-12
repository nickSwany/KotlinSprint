package com.example.kotlinsprint

const val THIS_YEAR = 2024
const val MIN_AGE = 18
const val SIXTEEN_AGE = 16
const val SEVENTEEN_AGE = 17

fun main() {
    println("Введите год рождения")

    val ageOfBirth = readln().toIntOrNull()

    if (ageOfBirth == null) println("Вы не ввели год рождения!")
    else {
        val userAge = THIS_YEAR - ageOfBirth

        val resultText =
            when {
                userAge >= MIN_AGE -> "Показать экран со скрытым контентом"
                (userAge == SIXTEEN_AGE) ||
                        (userAge == SEVENTEEN_AGE) -> "Показать экран с ограниченным контентом"
                else -> {
                    "Вернуться на главный экран"
                }
            }
        println(resultText)
    }
}