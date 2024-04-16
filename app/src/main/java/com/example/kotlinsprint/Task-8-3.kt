package com.example.kotlinsprint

fun main() {

    val ingredient = arrayOf("мясо", "лук", "сыр", "яйцо", "помидор")

    println("Введите наименование игредиента, который хотите найти")

    when (val userIngr = readln()) {
        ingredient[0] -> println("Ингредиент $userIngr в рецепте есть")
        ingredient[1] -> println("Ингредиент $userIngr в рецепте есть")
        ingredient[2] -> println("Ингредиент $userIngr в рецепте есть")
        ingredient[3] -> println("Ингредиент $userIngr в рецепте есть")
        ingredient[4] -> println("Ингредиент $userIngr в рецепте есть")
        else -> println("Такого ингредиента в рецепте нет")
    }
}