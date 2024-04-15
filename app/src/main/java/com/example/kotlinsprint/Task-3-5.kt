package com.example.kotlinsprint

fun main() {
    val motion = "D2-D4;0"

    val listMotion: List<String> = motion.split('-', ';')

    println(listMotion[0])
    println(listMotion[1])
    println(listMotion[2])
}