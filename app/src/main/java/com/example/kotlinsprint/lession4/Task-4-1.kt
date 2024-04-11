package com.example.kotlinsprint.lession4

const val CURRENT_TABLE = 13

fun main() {
    var reservedTables = 13
    var freeTables = CURRENT_TABLE > reservedTables
    println("Доступность столиков на сегодня: $freeTables")

    reservedTables = 9
    freeTables = CURRENT_TABLE > reservedTables
    println("Доступность столиков на завтра: $freeTables")
}