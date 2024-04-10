package com.example.kotlinsprint

fun main() {
    val motion = "D2-D4;0"

    val startMotion = motion.substringBefore('-')
    val endMotion = motion.substringAfter('-').substringBefore(';')
    val curMotion = motion.substringAfter(';')

    println(
        """
        $startMotion
        $endMotion
        $curMotion
    """.trimIndent()
    )
}
