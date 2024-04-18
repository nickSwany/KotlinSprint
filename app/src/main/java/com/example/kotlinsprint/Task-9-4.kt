package com.example.kotlinsprint

fun main(){
    println("Введите 5 ингредиентов, перечисленных через запятую с пробелом")

    val userIngredients = readln()

    val ingredients = userIngredients.split(", ")

    val sortingIngredients = ingredients.sorted()

    println(sortingIngredients)
}