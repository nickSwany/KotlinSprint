package com.example.kotlinsprint

fun main() {

    val ingredient = arrayOf("мясо", "лук", "сыр", "яйцо", "помидор")

    println("Введите наименование игредиента, который хотите найти")

    val userIngr = readln()

    val indexOfIngr = ingredient.indexOf(userIngr)

    if (indexOfIngr == -1) println("Такого ингредиента нет")
    else println("Ингредиент $userIngr в рецепте есть")
}