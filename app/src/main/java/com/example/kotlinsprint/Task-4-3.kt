package com.example.kotlinsprint

const val HUMIDITY_AIR = 20
const val WINTER = "зима"

fun main() {
    val weatherToday = true
    val shadow = true
    val humidity = 20
    val season = "зима"

    val favorableConditions =
        weatherToday && shadow && (humidity == HUMIDITY_AIR) && (season !== WINTER)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}