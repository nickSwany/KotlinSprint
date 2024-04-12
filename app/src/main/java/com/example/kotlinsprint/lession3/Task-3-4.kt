package com.example.kotlinsprint

fun main() {
    var startMotion = "E2"
    var endMotion = "E4"
    var curMotion = 1
    var motion = "$startMotion - $endMotion; $curMotion"

    println(motion)

    startMotion = "D2"
    endMotion = "D4"
    curMotion = 2
    motion = "$startMotion - $endMotion; $curMotion"

    println(motion)
}