package com.example.kotlinsprint

fun main(){

    val crystal = 7
    val iron = 11
    val buff = 0.2

    val crystalWithBuff = (crystal * buff).toInt()
    val ironWithBuff = (iron * buff).toInt()

    println("Кристаллическая руда - $crystalWithBuff\nЖелезная руда - $ironWithBuff")
}