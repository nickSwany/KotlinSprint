package com.example.kotlinsprint

fun main() {

    println("Введите количество планируемых ингредиентов")
    val curIngr = readln().toIntOrNull() ?: 0

    val ingredients = Array(curIngr) { "" }

    println("Вводите ингредиенты по очереди")

    for (i in ingredients.indices) {
        val userIngr = readln()
        ingredients[i] = userIngr
    }

    println("Ингредиенты, который вы ввели:")
    ingredients.forEach { i -> println(i) }
}