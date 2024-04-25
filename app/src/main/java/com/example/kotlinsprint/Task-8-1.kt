package com.example.kotlinsprint

fun main() {
    val viewsInMon = (1..100).random()
    val viewsInTue = (1..100).random()
    val viewsInWed = (1..100).random()
    val viewsInThu = (1..100).random()
    val viewsInFri = (1..100).random()
    val viewsInSat = (1..100).random()
    val viewsInSun = (1..100).random()
    var sumViews = 0

    val viewsInWeek = arrayOf(
        viewsInMon, viewsInTue, viewsInWed,
        viewsInThu, viewsInFri, viewsInSat, viewsInSun
    )

    for (i in viewsInWeek) {
        sumViews += i
    }
    println(sumViews)
}