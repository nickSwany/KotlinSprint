package com.example.kotlinsprint

fun main() {

    val dayTraining = 5

    val groupOfExercise = (dayTraining % 2 == 1)

    val handExercise = groupOfExercise
    val pressExercise = groupOfExercise
    val legExercise = !groupOfExercise
    val backExercise = !groupOfExercise

    println(
        """
        Упражнение для рук: $handExercise
        Упражнение для ног: $legExercise
        Упражнение для спины: $backExercise
        Упражнение для пресса: $pressExercise
    """.trimIndent()
    )
}