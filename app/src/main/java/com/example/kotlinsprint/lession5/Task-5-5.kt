package com.example.kotlinsprint

import kotlin.random.Random

fun main() {

    val numberOne = Random.nextInt(42)
    val numberTwo = Random.nextInt(42)
    val numberThree = Random.nextInt(42)
    val luckyTickeet = listOf(numberOne, numberTwo, numberThree)

    println("Нужно угадать два числа от 0 до 42\nВведите первое число")

    val userNumberOne = readLine()!!.toInt()

    println("Введите второе число")

    val userNumberTwo = readLine()!!.toInt()

    println("Введите третье число")

    val userNumberThree = readLine()!!.toInt()

    val userTicket = listOf(userNumberOne, userNumberTwo, userNumberThree)

    val intersectedList = luckyTickeet.intersect(userTicket.toIntArray().toSet())

    val result =
        when (intersectedList.size) {
            3 -> "Поздравляем! Вы выйгралии ДЖЕКПОТ!!!"
            2 -> "Угадно два числа из трех. Вы выйграли крупный приз!"
            1 -> "Угадано только одно число. Вы получаете утешительный приз!"
            else -> "К сожалению, вы не угадали ни одного числа."
        }

    println(result)
    println("Правильные числа для победы были: $luckyTickeet")
}