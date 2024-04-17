package com.example.kotlinsprint

fun main() {

    val ingredient = arrayOf("мясо", "лук", "сыр", "яйцо", "помидор")

    for (i in ingredient) println(i)

    println("Введите ингредиент, который хотите заменить")
    val userIngr = readln()

    val indexOfIngr = ingredient.indexOf(userIngr)

    if (indexOfIngr == -1) println("Такого ингредиента нет")
    else {

        println("Введите название нового ингредиента")

        val newIngr = readln()

        val ingrIndex = ingredient.indexOf(userIngr)

        ingredient[ingrIndex] = newIngr

        println(
            """
    Готово! Вы сохранили следующий спискок:
    ${ingredient[0]}
    ${ingredient[1]}
    ${ingredient[2]}
    ${ingredient[3]}
    ${ingredient[4]}
    """.trimIndent()
        )
    }
}