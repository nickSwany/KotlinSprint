package com.example.kotlinsprint

fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surnameAfterWedding = "Сидорова"
    val surnameBeforeWedding = "Андреева"
    val nameAndPatronymic = "$name $patronymic"
    val yearsBeforeWedding = 20
    val yearsAfterWedding = 22

    println(
        """
        $surnameBeforeWedding $nameAndPatronymic, $yearsBeforeWedding
        $surnameAfterWedding $nameAndPatronymic, $yearsAfterWedding
    """.trimIndent()
    )
}