package com.example.kotlinsprint

fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var surname = "Сидорова"
    val nameAndPatronymic = "$name $patronymic"
    var age = 20

    println("$surname $nameAndPatronymic, $age")

    surname = "Андреева"
    age = 22

    println("$surname $nameAndPatronymic, $age")
}