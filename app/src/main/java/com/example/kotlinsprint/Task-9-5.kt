package com.example.kotlinsprint

fun main() {

    println("Введите 5 игредиентов по отдельности")

    val ingredients = mutableSetOf<String>()

    repeat(5) {
        val userIngredients = readln()
        ingredients.add(userIngredients.toLowerCase())
    }

    val sortedIngr = ingredients.sorted()

    val result = sortedIngr.joinToString(", ").replaceFirstChar { it.uppercase() }

    println(result)
}