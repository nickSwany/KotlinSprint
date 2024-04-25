package com.example.kotlinsprint

fun main() {

    val basicIngredients = mutableListOf("сыр", "мясо", "помидор")

    println("В рецепте есть базовые ингредиенты:")
    basicIngredients.forEach { println(it) }

    println("Желаете добавить еще? Да или Нет.")

    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент желаете добавить?")
        val userIngredients = readln()

        basicIngredients.add(userIngredients)

        println("Теперь в рецепту есть следующие ингредиенты:")
        basicIngredients.forEach { println(it) }
    } else return
}