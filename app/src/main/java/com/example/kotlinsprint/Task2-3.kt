package com.example.kotlinsprint

const val minuteInHours = 60
fun main() {

    val timeInWay = 457
    val hourStart = 9
    val minuteStart = 39

    val sumMinutes = timeInWay + minuteStart
    val minuteToHour = sumMinutes / minuteInHours
    val arrivalHour = hourStart + minuteToHour
    val arrivalMinute = sumMinutes % minuteInHours

    println("$arrivalHour:$arrivalMinute")
}
