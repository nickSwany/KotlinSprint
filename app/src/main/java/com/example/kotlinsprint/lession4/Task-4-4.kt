package com.example.kotlinsprint

fun main() {

    val dayTraining = 5

    val groupOfExercise = (dayTraining % 2 == 0)

    val handExercise = !groupOfExercise
    val pressExercise = !groupOfExercise

    println(
        """
        Упражнение для рук: $handExercise
        Упражнение для ног: $groupOfExercise
        Упражнение для спины: $groupOfExercise
        Упражнение для пресса: $pressExercise
    """.trimIndent()
    )
}