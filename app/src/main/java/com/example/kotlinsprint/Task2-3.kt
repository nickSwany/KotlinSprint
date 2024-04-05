package com.example.kotlinsprint

fun main() {

    val timeInWay = 457
    val hourStart = 9
    val minuteStart = 39
    val minuteInHours = 60

    val sumMinutes = timeInWay + minuteStart
    val minuteToHour = sumMinutes / minuteInHours
    val arrivalHour = hourStart + minuteToHour
    val arrivalMinute = sumMinutes % minuteInHours

    println("$arrivalHour:$arrivalMinute")
}
