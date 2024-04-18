package com.example.kotlinsprint

fun main() {

    val ingredient = arrayOf("мясо", "лук", "сыр", "яйцо", "помидор")

    println("Введите наименование игредиента, который хотите найти")

    val userIngr = readln()

    for (i in ingredient) {
        if (i == userIngr) {
            println("Ингредиент $userIngr в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}