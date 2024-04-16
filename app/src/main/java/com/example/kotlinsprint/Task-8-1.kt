package com.example.kotlinsprint

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val viewsInMon = Random.nextInt(1..100)
    val viewsInTue = Random.nextInt(1..100)
    val viewsInWed = Random.nextInt(1..100)
    val viewsInThu = Random.nextInt(1..100)
    val viewsInFri = Random.nextInt(1..100)
    val viewsInSat = Random.nextInt(1..100)
    val viewsInSun = Random.nextInt(1..100) // решил сделать количество просмотров рандомными
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