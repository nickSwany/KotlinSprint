package com.example.kotlinsprint

fun main() {

    val ingredientForOmlet = listOf(2, 50, 15)

    println("Введите количесво порций")

    val userPortion = readln().toIntOrNull() ?: 0

    val ingredientsForAllPortion = ingredientForOmlet.map { it * userPortion }

    println(
        """
        На $userPortion порций вам понадобится:
        Яиц - ${ingredientsForAllPortion[0]}
        Молока - ${ingredientsForAllPortion[1]}
        Сливочного масла - ${ingredientsForAllPortion[2]}
    """.trimIndent()
    )
}