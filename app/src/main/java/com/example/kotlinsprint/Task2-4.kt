package com.example.kotlinsprint

const val PERCENT = 100
fun main() {

    val crystal = 7
    val iron = 11
    val buff = 20

    val crystalWithBuff = (crystal * buff / PERCENT).toInt()
    val ironWithBuff = (iron * buff / PERCENT).toInt()

    println("Кристаллическая руда - $crystalWithBuff\nЖелезная руда - $ironWithBuff")
}