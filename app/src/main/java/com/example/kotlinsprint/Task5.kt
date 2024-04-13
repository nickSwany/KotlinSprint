package com.example.kotlinsprint

const val SECONDS_IN_MINUTES = 60
const val MINUTES_IN_SPACE = 108
const val SECONDS_IN_HOURS = 3600
fun main() {
    val secondsInSpace: Int = MINUTES_IN_SPACE * SECONDS_IN_MINUTES

    val hours = secondsInSpace / SECONDS_IN_HOURS
    val remainingSexonds = secondsInSpace % SECONDS_IN_HOURS

    val minutes = remainingSexonds / SECONDS_IN_MINUTES
    val remainingMinutes = remainingSexonds % SECONDS_IN_MINUTES


    println("Гагарин был в космосе в течение: ${String.format("%02d:%02d:%02d", hours, minutes, remainingMinutes)}")
}