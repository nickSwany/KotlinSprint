package com.example.kotlinsprint

const val MINUTE_IN_HOURS = 60
fun main() {

    val timeInWay = 457
    val hourStart = 9
    val minuteStart = 39

    val sumMinutes = timeInWay + minuteStart
    val minuteToHour = sumMinutes / MINUTE_IN_HOURS
    val arrivalHour = hourStart + minuteToHour
    val arrivalMinute = sumMinutes % MINUTE_IN_HOURS

    println("$arrivalHour:$arrivalMinute")
}
