package com.example.kotlinsprint

const val NUMBER_ONE = 11
const val NUMBER_TWO = 27

fun main() {

    println("Нужно угадать два числа от 0 до 42\nВведите первое число")
    val userNumberOne = readln().toIntOrNull()

    println("Введите второе число")
    val userNumberTwo = readln().toIntOrNull()

    val result =
        if ((userNumberOne == NUMBER_ONE && userNumberTwo == NUMBER_TWO) ||
            (userNumberOne == NUMBER_TWO && userNumberTwo == NUMBER_ONE)
        )
            "Поздравляем вы выйграли главный приз!"
        else if ((userNumberOne == NUMBER_TWO || userNumberTwo == NUMBER_ONE) ||
            (userNumberOne == NUMBER_ONE || userNumberTwo == NUMBER_TWO)
        )
            "Вы выйграли утешительный приз!"
        else "Неудача!"

    println(result)
    println("Правильные числа для победы были: $NUMBER_ONE и $NUMBER_TWO")
}