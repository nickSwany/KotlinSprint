package com.example.kotlinsprint

fun main() {
    val nameUssers = "Никита"
    val enterTextDay = "Добрый день!"
    val enterTextNight = "Добрый вечер!"

    println(
        """
        $enterTextDay $nameUssers.
        $enterTextNight $nameUssers.
    """.trimIndent()
    )
}