package com.example.kotlinsprint

import kotlin.math.pow

fun main(){

    val money = 70_000
    val percentStage = 16.7
    val years = 20

    val results = ((1+percentStage/100).pow(years) * money)

    println(String.format("%.3f", results))
}