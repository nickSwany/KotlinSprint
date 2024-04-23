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
        sortedIngr[0] = ingr
    }

    val result = sortedIngr.joinToString(", ").capitalize() //Правильно ли я понял, что стоит просто перенести в эту часть и все?

    println(result)
}