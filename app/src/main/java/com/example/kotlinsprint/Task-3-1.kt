package com.example.kotlinsprint

fun main() {
    val nameUsers = "Никита"
    val enterTextDay = "Добрый день!"
    val enterTextNight = "Добрый вечер!"

    println(
        """
        $enterTextDay $nameUsers.
        $enterTextNight $nameUsers.
    """.trimIndent()
    )
}