package com.example.kotlinsprint

fun main() {

    println("Введите 5 игредиентов по отдельности")

    val ingredients = mutableSetOf<String>()

    repeat(5) {
        val userIngredients = readln()
        ingredients.add(userIngredients.toLowerCase())
    }

    val sortedIngr = ingredients.sorted().toMutableList()

    sortedIngr.firstOrNull()?.let { ingr ->
        sortedIngr[0] = ingr.capitalize()
    }

    val result = sortedIngr.joinToString(", ")

    println(result)
}